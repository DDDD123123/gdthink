package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.MenuService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Controller
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	MenuService menuService;
	@GetMapping("")
	public ModelAndView customer(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/hrProject.html");
		return mv;
	}
	@GetMapping("/writHrProject")
	public ModelAndView writHrProject(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/writHrProject.html");
		return mv;
	}
	@GetMapping("/hr-project")
	public ModelAndView hrProject(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/hrProject.html");
		return mv;
	}

	@GetMapping("/si-project")
	public ModelAndView siProject(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/siProject.html");
		return mv;
	}

	@GetMapping("/sol-project")
	public ModelAndView solInProject(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/solInProject.html");
		return mv;
	}

}
