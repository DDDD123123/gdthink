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
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	MenuService menuService;
	@GetMapping("")
	public ModelAndView customer(ModelAndView mv,HttpSession session) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		String id = (String) session.getAttribute("id");
		mv.addObject("id", id);
		mv.setViewName("customer/customer.html");
		return mv;
	}

}
