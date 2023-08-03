package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

	@GetMapping("/history2")
	public String history() {
		return "Business/history2.html";
	}
}
