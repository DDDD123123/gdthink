package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recruit")
public class RecruitController {

	@GetMapping("/recruitment")
	public String recruitment() {
		return "recruit/recruitment.html";
	}
	@GetMapping("/job-posting")
	public String jobPosting() {
		return "recruit/jobPosting.html";
	}


}
