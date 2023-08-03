package kr.co.dreamlabs.gdthink.gdthink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class GdthinkApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GdthinkApplication.class, args);
	}

}
