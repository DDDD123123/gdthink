package kr.co.dreamlabs.gdthink.gdthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	@GetMapping("/HrProject")
	public String HrProject() {
		return "project/hrProject.html";
	}
	@GetMapping("/SiProject")
	public String SiProject() {
		return "project/siProject.html";
	}
	@GetMapping("/SolInProject")
	public String SolInProject() {
		return "project/solInProject.html";
	}

}
