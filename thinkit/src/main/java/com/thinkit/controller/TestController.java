package com.thinkit.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thinkit.service.TestService;

@Controller
@RequestMapping("/test/*")
public class TestController {

	@Autowired
	private TestService service;
	
    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public void memberList(Model model) throws Exception{
        
        model.addAttribute("memberList", service.selectList());
        
    }	
}
