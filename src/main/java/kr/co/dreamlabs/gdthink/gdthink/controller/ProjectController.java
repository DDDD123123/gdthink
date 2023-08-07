package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@GetMapping("")
	public ModelAndView customer(ModelAndView mv) {
		mv.setViewName("project/hrProject.html");
		return mv;
	}
	@GetMapping("/hr-project")
	public ModelAndView hrProject(ModelAndView mv) {
		mv.setViewName("project/hrProject.html");
		return mv;
	}

	@GetMapping("/si-project")
	public ModelAndView siProject(ModelAndView mv) {
		mv.setViewName("project/siProject.html");
		return mv;
	}

	@GetMapping("/sol-project")
	public ModelAndView solInProject(ModelAndView mv) {
		mv.setViewName("project/solInProject.html");
		return mv;
	}

}
