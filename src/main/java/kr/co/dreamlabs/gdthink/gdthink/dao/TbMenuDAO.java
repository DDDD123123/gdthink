package kr.co.dreamlabs.gdthink.gdthink.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@Mapper
public interface TbMenuDAO {
	public List<TbMenuVo> getAllMenu();
}
