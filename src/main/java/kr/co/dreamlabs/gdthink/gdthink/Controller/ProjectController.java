package kr.co.dreamlabs.gdthink.gdthink.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	@GetMapping("/HrProject")
	public String HrProject() {
		return "Project/HrProject.html";
	}
	@GetMapping("/SiProject")
	public String SiProject() {
		return "Project/SiProject.html";
	}
	@GetMapping("/SolInProject")
	public String SolInProject() {
		return "Project/SolInProject.html";
	}

}
