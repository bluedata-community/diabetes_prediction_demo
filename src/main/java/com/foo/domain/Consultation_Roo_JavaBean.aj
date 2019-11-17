// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.foo.domain;

import com.foo.domain.Consultation;
import com.foo.domain.Patient;
import java.util.Calendar;
import java.util.Objects;

privileged aspect Consultation_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Consultation.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Consultation
     */
    public Consultation Consultation.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Consultation.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Consultation
     */
    public Consultation Consultation.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets patient value
     * 
     * @return Patient
     */
    public Patient Consultation.getPatient() {
        return this.patient;
    }
    
    /**
     * Sets patient value
     * 
     * @param patient
     * @return Consultation
     */
    public Consultation Consultation.setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }
    
    /**
     * Gets consultationDate value
     * 
     * @return Calendar
     */
    public Calendar Consultation.getConsultationDate() {
        return this.consultationDate;
    }
    
    /**
     * Sets consultationDate value
     * 
     * @param consultationDate
     * @return Consultation
     */
    public Consultation Consultation.setConsultationDate(Calendar consultationDate) {
        this.consultationDate = consultationDate;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Consultation.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Consultation)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Consultation) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Consultation.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Consultation.toString() {
        return "Consultation {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", consultationDate='" + consultationDate == null ? null : java.text.DateFormat.getDateTimeInstance().format(consultationDate.getTime()) + '\'' + "}" + super.toString();
    }
    
}
