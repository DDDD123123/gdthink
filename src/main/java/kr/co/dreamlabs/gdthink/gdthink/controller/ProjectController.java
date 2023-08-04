package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@GetMapping("/hr-project")
	public String hrProject() {
		return "project/hrProject.html";
	}
	@GetMapping("/si-project")
	public String siProject() {
		return "project/siProject.html";
	}
	@GetMapping("/sol-project")
	public String solInProject() {
		return "project/solInProject.html";
	}

}
