// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.foo.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.foo.domain.Patient;
import com.foo.web.ConsultationJsonMixin;
import com.foo.web.PatientDeserializer;

privileged aspect ConsultationJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = PatientDeserializer.class)
    private Patient ConsultationJsonMixin.patient;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Patient
     */
    public Patient ConsultationJsonMixin.getPatient() {
        return patient;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param patient
     */
    public void ConsultationJsonMixin.setPatient(Patient patient) {
        this.patient = patient;
    }
    
}
