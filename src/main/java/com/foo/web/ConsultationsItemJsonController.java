package com.foo.web;
import com.foo.domain.Consultation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ConsultationsItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Consultation.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ConsultationsItemJsonController {
}
