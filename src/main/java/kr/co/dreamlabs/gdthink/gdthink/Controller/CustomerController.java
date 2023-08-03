package kr.co.dreamlabs.gdthink.gdthink.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/Customer")
	public String Customer() {
		return "Customer/Customer.html";
	}

}
