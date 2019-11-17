package com.foo.web;
import com.foo.domain.Patient;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PatientsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Patient.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class PatientsCollectionThymeleafController {
}
