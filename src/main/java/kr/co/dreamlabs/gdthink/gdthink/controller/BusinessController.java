package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/business")
public class BusinessController {

	@GetMapping("")
	public ModelAndView business(ModelAndView mv) {
		mv.setViewName("business/business.html");
		return mv;
	}
}
