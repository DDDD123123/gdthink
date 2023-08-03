package kr.co.dreamlabs.gdthink.gdthink.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String root() {
		return "main/index.html";
	}
	@GetMapping("/index")
	public String index() {
		return "main/index.html";
	}
}
