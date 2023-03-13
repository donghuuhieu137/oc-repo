package com.tom.bhxhsqa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HomePageController {
    @RequestMapping(value="/homepage-personal", method = RequestMethod.GET)
    public String showHomePage(ModelMap model){
        return "homepage-personal";
    }
    
    @RequestMapping(value="/update-info-personal", method = RequestMethod.GET)
    public String updateInfoPersonal(ModelMap model){
        return "update-info-personal";
    }

    @RequestMapping(value="/homepage-company", method = RequestMethod.GET)
    public String showPersonalInsurance(ModelMap model){
        return "homepage-company";
    }
}
