package com.foo.web;
import com.foo.domain.Consultation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ConsultationsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Consultation.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class ConsultationsCollectionThymeleafController {
}
