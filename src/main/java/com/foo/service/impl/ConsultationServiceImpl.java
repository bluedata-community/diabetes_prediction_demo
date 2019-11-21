package com.foo.service.impl;
import com.foo.domain.Consultation;
import com.foo.service.api.ConsultationService;
import java.math.BigDecimal;

import java.util.Arrays;

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
        final String uri = "http://localhost:8080/springrestexample/employees";
        final String tok = "X-Auth-Token";
     
//        RestTemplate restTemplate = new RestTemplate();
//        
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.add("X-Auth-Token", tok);
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//         
//        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        
        return BigDecimal.valueOf(1);
    }

}
