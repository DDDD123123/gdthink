package kr.co.dreamlabs.gdthink.gdthink.vo;

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
	private String regDt;
	
	@JsonProperty
	private String upDt;
	
	@JsonProperty
	private String topYn;
	
	@JsonProperty
	private String showYn;
	
	@JsonProperty
	private int views;
	
	@JsonProperty
	private String regNm;
	
	@JsonProperty
	private String noticeCd;
	
	@JsonProperty
	private String rNum;
}
