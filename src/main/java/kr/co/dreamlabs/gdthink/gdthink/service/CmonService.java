package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.CmonDAO;

@Service
public class CmonService {
	
	@Autowired
	CmonDAO cmonDao;

	public Map<String, Object> getMenuNm(Map<String, Object> paramMap){
		return cmonDao.getMenuNm(paramMap);
	}
}
