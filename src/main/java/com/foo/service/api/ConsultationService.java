package com.foo.service.api;
import com.foo.domain.Consultation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ConsultationService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Consultation.class)
public interface ConsultationService extends EntityResolver<Consultation, Long>, ValidatorService<Consultation> {
}
