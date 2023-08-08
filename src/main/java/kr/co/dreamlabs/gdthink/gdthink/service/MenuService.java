package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.TbMenuDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Service
public class MenuService {

	@Autowired
	TbMenuDAO tbMenuDao;
	
	public List<TbMenuVo> getAllMenu(){
		return tbMenuDao.getAllMenu();
	}
	
}
