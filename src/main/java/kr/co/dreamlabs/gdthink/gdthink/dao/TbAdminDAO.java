package kr.co.dreamlabs.gdthink.gdthink.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dreamlabs.gdthink.gdthink.vo.TbAdminVo;

@Mapper
public interface TbAdminDAO {
	
	public List<TbAdminVo> getSelect();
	public TbAdminVo getSelectOne(String adminId)throws Exception;
}
