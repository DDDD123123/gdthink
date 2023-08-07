package kr.co.dreamlabs.gdthink.gdthink.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmonDAO {
	public Map<String, Object> getMenuNm(Map<String, Object> paramMap);
}
