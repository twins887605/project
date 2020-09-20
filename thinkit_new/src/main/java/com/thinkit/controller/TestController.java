package com.thinkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkit.service.TestService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
// TestController는 TestService에 대해 의존적이므로 @AllArgsConstructor를 이용해서
// 생성자를 만들고 자동으로 주입하도록 처리, 생성자를 만들지 않을 경우에는
// @Setter(onMethod_ = { @Autowired } )를 이용해서 처리한다.

@RequestMapping("/test/*")
public class TestController {

	private TestService service;
	
	@RequestMapping("/list")
	public void list(Model model) {
		
		log.info("list......");
		
		model.addAttribute("list",service.getList());
	}
}
