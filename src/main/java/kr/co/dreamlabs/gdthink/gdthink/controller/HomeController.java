package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("main/index.html");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("main/login.html");
		return mv;
	}
}
