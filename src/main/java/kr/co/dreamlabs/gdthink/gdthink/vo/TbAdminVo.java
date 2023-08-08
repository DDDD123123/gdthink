package kr.co.dreamlabs.gdthink.gdthink.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TbAdminVo {
	
	@JsonProperty
	private String adminId;
	
	@JsonProperty
	private String adminNm;
	
	@JsonProperty
	private String adminPw;
	
	@JsonProperty
	private String useYn;

	
}
