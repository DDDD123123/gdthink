package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dreamlabs.gdthink.gdthink.dao.ProjectDAO;
import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Service
public class ProjectService {
	
	@Autowired
	ProjectDAO projectDao;
	
	public List<TbNoticeVo> getNoticeList(String ntcType) {
		return projectDao.getNoticeList(ntcType);
	}
	
	public void insertHrProNotice(TbNoticeVo tbNoticeVo) {
		projectDao.insertHrProNotice(tbNoticeVo);
	}
	
	public TbNoticeVo getDetailNotice(Map<String, Object> paramMap) {
		projectDao.updateViews(paramMap);
		return projectDao.getDetailNotice(paramMap);
	}
}
