package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

	@GetMapping("/Business")
	public String Business() {
		return "Business/Business.html";
	}
}
