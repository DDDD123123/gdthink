package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.CmonService;
import kr.co.dreamlabs.gdthink.gdthink.service.ProjectService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	CmonService cmonService;
	
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
	@GetMapping("/regNotice")
	public ModelAndView writHrProject(ModelAndView mv, @RequestParam String noticeGb) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		
		Map<String, Object> map = cmonService.getMenuNm(paramMap);
		mv.addObject("noticeGb", map);
		mv.setViewName("project/regNotice.html");
		return mv;
	}

}
