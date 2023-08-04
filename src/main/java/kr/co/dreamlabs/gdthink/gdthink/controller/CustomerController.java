package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/customer")
	public String customer() {
		return "customer/customer.html";
	}

}
