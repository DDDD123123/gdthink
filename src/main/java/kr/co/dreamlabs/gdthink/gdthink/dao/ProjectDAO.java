package kr.co.dreamlabs.gdthink.gdthink.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dreamlabs.gdthink.gdthink.vo.TbNoticeVo;

@Mapper
public interface ProjectDAO {
	public List<TbNoticeVo> getHrNoticeList();
}
