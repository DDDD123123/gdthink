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
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	MenuService menuService;
	@GetMapping("")
	public ModelAndView business(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("business/business.html");
		return mv;
	}
}
