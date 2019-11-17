package com.foo.web;
import com.foo.domain.Patient;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PatientsItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Patient.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PatientsItemJsonController {
}
