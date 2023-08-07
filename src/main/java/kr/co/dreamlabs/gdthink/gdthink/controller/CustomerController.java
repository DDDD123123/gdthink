package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("")
	public ModelAndView customer(ModelAndView mv) {
		mv.setViewName("customer/customer.html");
		return mv;
	}

}
