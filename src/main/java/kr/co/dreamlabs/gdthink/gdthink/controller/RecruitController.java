package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("recruit")
public class RecruitController {

	@GetMapping("/recruitment")
	public ModelAndView recruitment(ModelAndView mv) {
		mv.setViewName("recruit/recruitment.html");
		return mv;
	}
	@GetMapping("/job-posting")
	public ModelAndView jobPosting(ModelAndView mv) {
		mv.setViewName("recruit/jobPosting.html");
		return mv;
	}


}
