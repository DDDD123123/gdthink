package kr.co.dreamlabs.gdthink.gdthink.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TbMenuVo {
	
	@JsonProperty
	private String menuId;
	
	@JsonProperty
	private String menuKorNm;
	
	@JsonProperty
	private String menuEnNm;
	
	@JsonProperty
	private String url;
	
	@JsonProperty
	private String parentId;
	
	@JsonProperty
	private String depth;
	
	@JsonProperty
	private String ord;
	
	@JsonProperty
	private String useYn;
	
}
