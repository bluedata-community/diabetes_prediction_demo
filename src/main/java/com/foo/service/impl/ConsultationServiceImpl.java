package com.foo.service.impl;
import com.foo.domain.Consultation;
import com.foo.service.api.ConsultationService;
import com.foo.service.impl.RequestResponseLoggingInterceptor;

import com.jayway.jsonpath.JsonPath;

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
    
    private double doubleValue(Integer v) {
    	try {
    		return v.doubleValue();		
    	} catch (Exception e) {
    		return 0;
    	}
    }
    
    private double doubleValue(BigDecimal v) {
    	try {
    		return v.doubleValue();		
    	} catch (Exception e) {
    		return 0;
    	}
    }
    
    private java.math.BigDecimal getScore(Consultation c)
    {
    	
    	try {
	        RestTemplate restTemplate = new RestTemplate();
	        
	        // uncomment to debug request/response
	        //restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        headers.add("X-Auth-Token", mlopsXauthToken);
	        
	        String data = "{\"use_scoring\": true, \"scoring_args\": {"
	        		+ "\"NumPreg\": "         + doubleValue(c.getPregnancies()) + ","
	        		+ "\"Glucose\": "         + doubleValue(c.getGlucose()) + ","
	        		+ "\"BloodPressure\": "   + doubleValue(c.getBloodPressure()) + ","
	        		+ "\"SkinThick\": "       + doubleValue(c.getSkinThickness()) + ","
	        		+ "\"Insulin\": "         + doubleValue(c.getInsulin()) + ","
	        		+ "\"BMI\": "             + doubleValue(c.getBmi()) + ","
	        		+ "\"DiabetesPedFunc\": " + doubleValue(c.getDiabetesPedigreeFunction()) + ","
	        		+ "\"Age\": "             + doubleValue(c.getAge()) + "}"
	        		+ "}";
	        
	        //System.out.println(data);
	        
	        HttpEntity<String> entity = new HttpEntity<String>(data, headers);
	         
	        ResponseEntity<String> result = restTemplate.exchange(mlopsUri, HttpMethod.POST, entity, String.class);
	        
	        //System.out.println(result.getBody());
	        
	        try {
	        	String output = JsonPath.parse(result.getBody()).read("output");
			output = output.replaceAll("Chances of having diabetes: ", "");
			output = output.replaceAll("%", "");
			output = output.replaceAll("\\s+","");
	        	return new BigDecimal(output);
	        } catch (Exception e) {
	    		e.printStackTrace();
	    		return BigDecimal.valueOf(-1);
	    	}
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    		return BigDecimal.valueOf(-1);
    	}
    }

}
