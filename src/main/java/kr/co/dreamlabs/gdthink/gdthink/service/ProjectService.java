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
	
	public List<TbNoticeVo> getNoticeList(String sCodeNm) {
		return projectDao.getNoticeList(sCodeNm);
	}
	
	public void insertNotice(TbNoticeVo tbNoticeVo) {
		projectDao.insertNotice(tbNoticeVo);
	}
	
	public void updateNotice(TbNoticeVo tbNoticeVo) {
		projectDao.updateNotice(tbNoticeVo);
	}
	
	public TbNoticeVo getDetailNotice(Map<String, Object> paramMap) {
		return projectDao.getDetailNotice(paramMap);
	}
	public void updateViews(Map<String, Object> paramMap) {
		projectDao.updateViews(paramMap);
	}
}
