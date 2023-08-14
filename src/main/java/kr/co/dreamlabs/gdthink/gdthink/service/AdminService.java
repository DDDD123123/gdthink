package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.TbAdminDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbAdminVo;

@Service
public class AdminService {

	@Autowired
	TbAdminDAO tbAdminDAO;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public List<TbAdminVo> getSelect(){
		return tbAdminDAO.getSelect();
	}
	
	public Boolean getSelectOne(String adminId,String adminPw, HttpSession session) throws Exception {
		TbAdminVo tbAdminVo= tbAdminDAO.getSelectOne(adminId);
		
		Boolean result = false;
		
		if (passwordEncoder.matches(adminPw, tbAdminVo.getAdminPw()) == true) {
			result = true;
			session.setAttribute("id", tbAdminVo.getAdminId());
		}
		
		return result;
	}
	
	
}
