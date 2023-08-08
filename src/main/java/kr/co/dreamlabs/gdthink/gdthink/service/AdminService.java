package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.TbAdminDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbAdminVo;

@Service
public class AdminService {

	@Autowired
	TbAdminDAO tbAdminDAO;
	
	public List<TbAdminVo> getAllAdmin(){
		return tbAdminDAO.getAllAdmin();
	}
	
}
