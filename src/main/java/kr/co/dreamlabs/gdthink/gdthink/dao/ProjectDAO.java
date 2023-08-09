package kr.co.dreamlabs.gdthink.gdthink.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Mapper
public interface ProjectDAO {
	public List<TbNoticeVo> getNoticeList(String sCodeNm);
	
	public void insertNotice(TbNoticeVo tbNoticeVo);
	
	public void updateNotice(TbNoticeVo tbNoticeVo);
	
	public TbNoticeVo getDetailNotice(Map<String, Object> paramMap);

	public void updateViews(Map<String, Object> paramMap);
}
