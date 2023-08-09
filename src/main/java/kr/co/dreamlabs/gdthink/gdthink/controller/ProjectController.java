package kr.co.dreamlabs.gdthink.gdthink.controller;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dreamlabs.gdthink.gdthink.Message;
import kr.co.dreamlabs.gdthink.gdthink.StatusEnum;
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
		// 상단 매뉴 출력
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		
		mv.addObject("listMenu", listMenu);
		mv.setViewName("project/hrProject.html");
		return mv;
	}
	
	@GetMapping("/hrNtcList")
	@ResponseBody
	public ResponseEntity<Message> hrNtcList(@RequestParam String sCodeNm) {
		List<TbNoticeVo> list = projectService.getNoticeList(sCodeNm);
		Message message = new Message();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("success");
        message.setData(list);
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
	}

	/**
	 * SI사업실적 목록 화면 이동
	 * @param mv
	 * @return
	 */
	@GetMapping("/si-project")
	public ModelAndView siProject(ModelAndView mv) {
		String sCodeNm = "NT0002";
		
		// 상단 매뉴 출력
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		// 게시판 리스트 출력
		List<TbNoticeVo> list = projectService.getNoticeList(sCodeNm);
		
		mv.addObject("listMenu", listMenu);
		mv.addObject("list", list);
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
		String sCodeNm = "NT0003";
		
		// 상단 매뉴 출력
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		// 게시판 리스트 출력
		List<TbNoticeVo> list = projectService.getNoticeList(sCodeNm);
		
		mv.addObject("listMenu", listMenu);
		mv.addObject("list", list);
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
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		Map<String, Object> resultMap = cmonService.getMenuNm(paramMap); // 공통코드로 화면 구분
		
		mv.addObject("listMenu", listMenu);
		mv.addObject("noticeGb", resultMap);
		mv.setViewName("project/regNotice.html");
		return mv;
	}
	
	@GetMapping("/upForm")
	public ModelAndView upForm(ModelAndView mv, @RequestParam String noticeGb, @RequestParam String noticeId) {
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		paramMap.put("noticeId", noticeId);
		Map<String, Object> resultMap = cmonService.getMenuNm(paramMap); // 공통코드로 화면 구분
		TbNoticeVo tbNoticeVo = projectService.getDetailNotice(paramMap); // 상세 게시판 내용 조회
		
		mv.addObject("listMenu", listMenu);
		mv.addObject("noticeGb", resultMap);
		mv.addObject("dtlNotice", tbNoticeVo);
		mv.setViewName("project/upFormNotice.html");
		return mv;
	}
	
	/**
	 * 글 작성
	 * @param tbNotiveVo
	 * @return
	 */
	@PostMapping("/inputNotice")
	@ResponseBody
	public ResponseEntity<Message> inputNotice(@RequestBody TbNoticeVo tbNotiveVo) {
		projectService.insertNotice(tbNotiveVo);
		
		Message message = new Message();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("success");
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
	}
	
	/**
	 * 수정하기
	 * @param tbNotiveVo
	 * @return
	 */
	@ResponseBody
	@PostMapping("/updateNotice")
	public ResponseEntity<Message> updateNotice(@RequestBody TbNoticeVo tbNotiveVo) {
		projectService.updateNotice(tbNotiveVo);
		Message message = new Message();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		message.setStatus(StatusEnum.OK);
        message.setMessage("success");
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
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
		//상단 매뉴
		List<TbMenuVo> listMenu = menuService.getAllMenu();
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("noticeGb", noticeGb);
		paramMap.put("noticeId", noticeId);
		
		Map<String, Object> resultMap = cmonService.getMenuNm(paramMap); // 공통코드로 화면 구분
		projectService.updateViews(paramMap); // 조회수 증가
		TbNoticeVo tbNoticeVo = projectService.getDetailNotice(paramMap); // 상세 게시판 내용 조회
		
		mv.addObject("listMenu", listMenu);
		mv.addObject("noticeGb", resultMap);
		mv.addObject("dtlNotice", tbNoticeVo);
		mv.setViewName("project/detailNotice.html");
		return mv;
	}
	
	@ResponseBody
	@DeleteMapping("/deleteNotice")
	public Map<String, Object> deleteNotice(@RequestBody TbNoticeVo noticeVo) {
		projectService.deleteNotice(noticeVo);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", "success");
		return null;
	}

}
