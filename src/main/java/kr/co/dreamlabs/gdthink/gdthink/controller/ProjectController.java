package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.service.CmonService;
import kr.co.dreamlabs.gdthink.gdthink.service.MenuService;
import kr.co.dreamlabs.gdthink.gdthink.service.ProjectService;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	CmonService cmonService;
	
	@Autowired
	MenuService menuService;
	
	@GetMapping("")
	public String customer(ModelAndView mv) {
		return "redirect:/project/hr-project";
	}
	
	/**
	 * HR사업실적목록 화면 이동
	 * @param mv
	 * @return
	 */
	@GetMapping("/hr-project")
	public ModelAndView hrProject(ModelAndView mv) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		mv.addObject("listMenu", listMenu);
		
		List<TbNoticeVo> list = projectService.getHrNoticeList();
		mv.addObject("list", list);
		mv.setViewName("project/hrProject.html");
		return mv;
	}

	/**
	 * SI사업실적 목록 화면 이동
	 * @param mv
	 * @return
	 */
	@GetMapping("/si-project")
	public ModelAndView siProject(ModelAndView mv) {
		mv.setViewName("project/siProject.html");
		return mv;
	}
	
	/**
	 * Solution/Infra사업실적 목록 화면 이동
	 * @param mv
	 * @return
	 */
	@GetMapping("/sol-project")
	public ModelAndView solInProject(ModelAndView mv) {
		mv.setViewName("project/solInProject.html");
		return mv;
	}
	
	/**
	 * 글쓰기 폼 이동
	 * @param mv
	 * @param noticeGb
	 * @return
	 */
	@GetMapping("/regNotice")
	public ModelAndView writHrProject(ModelAndView mv, @RequestParam String noticeGb) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		Map<String, Object> map = cmonService.getMenuNm(paramMap); // 공통코드로 화면 구분
		
		mv.addObject("noticeGb", map);
		mv.setViewName("project/regNotice.html");
		return mv;
	}
	
	/**
	 * 글 작성
	 * @param tbNotiveVo
	 * @return
	 */
	@PostMapping("/inputNotice")
	@ResponseBody
	public Map<String, Object> inputNotice(@RequestBody TbNoticeVo tbNotiveVo) {
		projectService.insertHrProNotice(tbNotiveVo);
		Map<String, Object> map = new HashMap<>();
		map.put("result", "success");
		return map;
	}
	
	/**
	 * 게시글 상세보기
	 * @param mv
	 * @param noticeGb
	 * @param noticeId
	 * @return
	 */
	@GetMapping("/detailNotice")
	public ModelAndView detailNotice(ModelAndView mv, @RequestParam String noticeGb, @RequestParam String noticeId) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		paramMap.put("noticeId", noticeId);
		Map<String, Object> map = cmonService.getMenuNm(paramMap); // 공통코드로 화면 구분
		TbNoticeVo tbNoticeVo = projectService.getDetailNotice(paramMap); // 상세 게시판 내용 조회
		
		mv.addObject("noticeGb", map);
		mv.addObject("dtlNotice", tbNoticeVo);
		mv.setViewName("project/detailNotice.html");
		return mv;
	}

}
