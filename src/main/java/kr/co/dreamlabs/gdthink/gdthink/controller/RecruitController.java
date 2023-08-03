package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecruitController {
	
	@GetMapping("/Recruitment2")
	public String Recruitment2() {
		return "Recruit/Recruitment2.html";
	}
	@GetMapping("/jobPosting")
	public String jobPosting() {
		return "Recruit/jobPosting.html";
	}


}
