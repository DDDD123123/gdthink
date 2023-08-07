package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@GetMapping("/greetings")
	public ModelAndView greetings(ModelAndView mv) {
		mv.setViewName("company/greetings.html");
		return mv;
	}
	@GetMapping("/history")
	public ModelAndView history(ModelAndView mv) {
		mv.setViewName("company/history.html");
		return mv;
	}
	@GetMapping("/diagram")
	public ModelAndView diagram(ModelAndView mv) {
		mv.setViewName("company/diagram.html");
		return mv;
	}
	@GetMapping("/contact")
	public ModelAndView contact(ModelAndView mv) {
		mv.setViewName("company/contact.html");
		return mv;
	}
}
