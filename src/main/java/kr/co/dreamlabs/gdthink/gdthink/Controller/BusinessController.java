package kr.co.dreamlabs.gdthink.gdthink.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

	@GetMapping("/test2")
	public String test2() {
		return "Business/test2.html";
	}
	@GetMapping("/history2")
	public String history() {
		return "Business/history2.html";
	}
}
