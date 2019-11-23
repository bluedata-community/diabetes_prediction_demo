package com.foo.service.impl;
import com.foo.domain.Consultation;
import com.foo.service.api.ConsultationService;
import java.math.BigDecimal;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * = ConsultationServiceImpl
 *
 * TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = ConsultationService.class)
public class ConsultationServiceImpl implements ConsultationService {
	
	
	@Value("${bluedata.mlops.uri}")
	private String mlopsUri;
	
	@Value("${bluedata.mlops.xauthtoken}")
	private String mlopsXauthToken;

	/**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Consultation
     */
    @Transactional
    public Consultation save(Consultation consultation) {
    	
    	consultation.setPrediction(getScore(consultation));
        return getConsultationRepository().save(consultation);
    }
    
    private java.math.BigDecimal getScore(Consultation consultation)
    {
    	try {
	        RestTemplate restTemplate = new RestTemplate();
	        restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        headers.add("X-Auth-Token", mlopsXauthToken);
	        
	        String data = "{\"use_scoring\": true, \"scoring_args\": {"
	        		+ "\"NumPreg\":1.0,"
	        		+ "\"Glucose\": 85.0,"
	        		+ "\"BloodPressure\": 66.0,"
	        		+ "\"SkinThick\": 29.0,"
	        		+ "\"Insulin\": 0.0,"
	        		+ "\"BMI\": 26.6,"
	        		+ "\"DiabetesPedFunc\": 0.351,"
	        		+ "\"Age\": 35.0}"
	        		+ "}";
	        
	        HttpEntity<String> entity = new HttpEntity<String>(data, headers);
	         
	        ResponseEntity<String> result = restTemplate.exchange(mlopsUri, HttpMethod.POST, entity, String.class);
	       
	        return BigDecimal.valueOf(1);
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    		return BigDecimal.valueOf(-1);
    	}
    }

}
