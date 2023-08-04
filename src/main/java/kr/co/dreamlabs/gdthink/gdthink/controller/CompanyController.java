package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@GetMapping("/greetings")
	public String greetings() {
		return "company/greetings.html";
	}
	@GetMapping("/history")
	public String history() {
		return "company/history.html";
	}
	@GetMapping("/diagram")
	public String diagram() {
		return "company/diagram.html";
	}
	@GetMapping("/contact")
	public String contact() {
		return "company/contact.html";
	}
}
