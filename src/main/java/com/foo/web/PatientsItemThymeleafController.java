package com.foo.web;
import com.foo.domain.Patient;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PatientsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Patient.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PatientsItemThymeleafController implements ConcurrencyManager<Patient> {
}
