package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.AdminService;
import kr.co.dreamlabs.gdthink.gdthink.service.MenuService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbAdminVo;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Controller
public class HomeController {

	@Autowired
	MenuService menuService;
	@Autowired
	AdminService adminService;
		
	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) throws Exception {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		mv.setViewName("main/index.html");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView login(ModelAndView mv,HttpSession session) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		String id = (String) session.getAttribute("id");
		mv.addObject("listMenu", listMenu);
		mv.addObject("id", id);
		mv.setViewName("main/login.html");
		return mv;
	}
	@PostMapping("/loginAction")
	public String login(@RequestParam String adminId,@RequestParam String adminPw, HttpSession session) throws Exception{
		String id = adminService.getSelectOne(adminId, adminPw);
		if(id == null) {//로그인 실패
			return "redirect:/login";
		}
		session.setAttribute("id", id);
		return "redirect:/login";
	}
	@PostMapping("/logout")
	public String logout( HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/";
	}
}
