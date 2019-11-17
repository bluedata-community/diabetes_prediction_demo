// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.foo.domain;

import com.foo.domain.Consultation;
import com.foo.domain.Patient;
import java.util.Objects;
import java.util.Set;

privileged aspect Patient_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Patient.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Patient
     */
    public Patient Patient.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Patient.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Patient
     */
    public Patient Patient.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets firstName value
     * 
     * @return String
     */
    public String Patient.getFirstName() {
        return this.firstName;
    }
    
    /**
     * Sets firstName value
     * 
     * @param firstName
     * @return Patient
     */
    public Patient Patient.setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    /**
     * Gets lastName value
     * 
     * @return String
     */
    public String Patient.getLastName() {
        return this.lastName;
    }
    
    /**
     * Sets lastName value
     * 
     * @param lastName
     * @return Patient
     */
    public Patient Patient.setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    /**
     * Gets consultations value
     * 
     * @return Set
     */
    public Set<Consultation> Patient.getConsultations() {
        return this.consultations;
    }
    
    /**
     * Sets consultations value
     * 
     * @param consultations
     * @return Patient
     */
    public Patient Patient.setConsultations(Set<Consultation> consultations) {
        this.consultations = consultations;
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
    public boolean Patient.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Patient)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Patient) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Patient.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Patient.toString() {
        return "Patient {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", firstName='" + firstName + '\'' + 
                ", lastName='" + lastName + '\'' + "}" + super.toString();
    }
    
}
