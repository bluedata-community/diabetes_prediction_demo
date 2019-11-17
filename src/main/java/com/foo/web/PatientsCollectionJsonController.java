package com.foo.web;
import com.foo.domain.Patient;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PatientsCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Patient.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PatientsCollectionJsonController {
}
