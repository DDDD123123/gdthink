package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.MenuService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Controller
@RequestMapping("recruit")
public class RecruitController {
	@Autowired
	MenuService menuService;
	@GetMapping("/recruitment")
	public ModelAndView recruitment(ModelAndView mv,HttpSession session) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		String id = (String) session.getAttribute("id");
		mv.addObject("id", id);
		mv.setViewName("recruit/recruitment.html");
		return mv;
	}
	@GetMapping("/job-posting")
	public ModelAndView jobPosting(ModelAndView mv,HttpSession session) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		String id = (String) session.getAttribute("id");
		mv.addObject("id", id);
		mv.setViewName("recruit/jobPosting.html");
		return mv;
	}


}
