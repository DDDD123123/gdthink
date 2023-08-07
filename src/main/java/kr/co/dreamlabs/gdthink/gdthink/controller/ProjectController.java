package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.ProjectService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("")
	public String customer(ModelAndView mv) {
		return "redirect:/project/hr-project";
	}
	@GetMapping("/hr-project")
	public ModelAndView hrProject(ModelAndView mv) {
		List<TbNoticeVo> list = projectService.getHrNoticeList();
		mv.addObject("list", list);
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
	@GetMapping("/writHrProject")
	public ModelAndView writHrProject(ModelAndView mv) {
		mv.setViewName("project/writHrProject.html");
		return mv;
	}

}
