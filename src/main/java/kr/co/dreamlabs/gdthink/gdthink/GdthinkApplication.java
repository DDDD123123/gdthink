package kr.co.dreamlabs.gdthink.gdthink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class GdthinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdthinkApplication.class, args);
	}
	
	@GetMapping("/test")
	public String index() {
		return "test/test.html";
	}

}
