package com.foo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

@Controller
public class PatientPredictionHistoryChart {

    @Autowired
    private ApplicationContext appContext;

    //@Autowired
    //private ICarService carService;

    @RequestMapping(path = "/patient_history", method = RequestMethod.GET)
    public ModelAndView report() {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:report2.jrxml");
        view.setApplicationContext(appContext);

        Map<String, Object> params = new HashMap<String, Object>();
        //params.put("datasource", carService.findAll());

        return new ModelAndView(view, params);
    }
}