package com.foo.web;
import com.foo.domain.Consultation;
import com.foo.service.api.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ConsultationDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Consultation.class)
public class ConsultationDeserializer extends JsonObjectDeserializer<Consultation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConsultationService consultationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param consultationService
     * @param conversionService
     */
    @Autowired
    public ConsultationDeserializer(@Lazy ConsultationService consultationService, ConversionService conversionService) {
        this.consultationService = consultationService;
        this.conversionService = conversionService;
    }
}
