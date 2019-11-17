package com.foo.web;
import com.foo.domain.Consultation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ConsultationsCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Consultation.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ConsultationsCollectionJsonController {
}
