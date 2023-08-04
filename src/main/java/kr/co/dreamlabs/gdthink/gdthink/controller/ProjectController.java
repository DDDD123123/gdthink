package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	@GetMapping("/HrProject")
	public String hrProject() {
		return "project/hrProject.html";
	}
	@GetMapping("/SiProject")
	public String siProject() {
		return "project/siProject.html";
	}
	@GetMapping("/SolInProject")
	public String solInProject() {
		return "project/solInProject.html";
	}

}
