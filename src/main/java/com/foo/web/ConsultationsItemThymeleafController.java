package com.foo.web;
import com.foo.domain.Consultation;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ConsultationsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Consultation.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ConsultationsItemThymeleafController implements ConcurrencyManager<Consultation> {
}
