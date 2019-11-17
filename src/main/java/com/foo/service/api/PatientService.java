package com.foo.service.api;
import com.foo.domain.Patient;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PatientService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Patient.class)
public interface PatientService extends EntityResolver<Patient, Long>, ValidatorService<Patient> {
}
