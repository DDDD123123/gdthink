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
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	MenuService menuService;
	@GetMapping("/greetings")
	public ModelAndView greetings(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("company/greetings.html");
		return mv;
	}
	@GetMapping("/history")
	public ModelAndView history(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("company/history.html");
		return mv;
	}
	@GetMapping("/diagram")
	public ModelAndView diagram(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("company/diagram.html");
		return mv;
	}
	@GetMapping("/contact")
	public ModelAndView contact(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("company/contact.html");
		return mv;
	}

}
