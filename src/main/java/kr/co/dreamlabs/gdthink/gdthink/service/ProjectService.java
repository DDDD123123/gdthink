package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.ProjectDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Service
public class ProjectService {
	
	@Autowired
	ProjectDAO projectDao;
	
	public List<TbNoticeVo> getHrNoticeList(){
		return projectDao.getHrNoticeList();
	}

}
