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
	public ModelAndView index(ModelAndView mv,HttpSession session) throws Exception {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		String id = (String) session.getAttribute("id");
		mv.addObject("id", id);
		mv.setViewName("main/index.html");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView login(ModelAndView mv,HttpSession session) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		String id = (String) session.getAttribute("id");
		mv.addObject("id", id);
		mv.setViewName("main/login.html");
		return mv;
	}
	@PostMapping("/loginAction")
	public String login(@RequestParam String adminId,@RequestParam String adminPw, HttpSession session) throws Exception{
		Boolean result = adminService.getSelectOne(adminId, adminPw, session);
		if(!result) {//로그인 실패
			return "redirect:/login";
		}
		return "redirect:/";
	}
	@PostMapping("/logout")
	public String logout( HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/";
	}
}
