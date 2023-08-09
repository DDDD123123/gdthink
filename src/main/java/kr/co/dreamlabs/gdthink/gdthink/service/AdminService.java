package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.TbAdminDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbAdminVo;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Service
public class AdminService {

	@Autowired
	TbAdminDAO tbAdminDAO;
	
	
	public List<TbAdminVo> getSelect(){
		return tbAdminDAO.getSelect();
	}
	
	public String getSelectOne(String adminId,String adminPw) throws Exception {
		TbAdminVo tbAdminVo= tbAdminDAO.getSelectOne(adminId);
		if(tbAdminVo.getAdminPw().equals(adminPw))
			return tbAdminVo.getAdminId();
		return null;
	}
	
	
}
