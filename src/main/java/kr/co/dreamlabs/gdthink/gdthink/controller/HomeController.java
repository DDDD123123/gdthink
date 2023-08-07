package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.MenuService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Controller
public class HomeController {

	@Autowired
	MenuService menuService;
		
	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) {
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("main/index.html");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("main/login.html");
		return mv;
	}
}
