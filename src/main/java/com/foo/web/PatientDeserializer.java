package com.foo.web;
import com.foo.domain.Patient;
import com.foo.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PatientDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Patient.class)
public class PatientDeserializer extends JsonObjectDeserializer<Patient> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PatientService patientService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param patientService
     * @param conversionService
     */
    @Autowired
    public PatientDeserializer(@Lazy PatientService patientService, ConversionService conversionService) {
        this.patientService = patientService;
        this.conversionService = conversionService;
    }
}
