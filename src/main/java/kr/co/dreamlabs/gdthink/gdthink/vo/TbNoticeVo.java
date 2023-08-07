package kr.co.dreamlabs.gdthink.gdthink.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TbNoticeVo {
	
	@JsonProperty
	private String noticeId;
	
	@JsonProperty
	private String sCodeNm;
	
	@JsonProperty
	private String title;
	
	@JsonProperty
	private String contents;
	
	@JsonProperty
	private String userId;
	
	@JsonProperty
	private Date regDt;
	
	@JsonProperty
	private Date upDt;
	
	@JsonProperty
	private String topYn;
	
	@JsonProperty
	private String showYn;
	
	@JsonProperty
	private int views;
	
}
