package kr.co.dreamlabs.gdthink.gdthink.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class TbNotice {
	
	@Id
	@Column(length = 30, nullable = false)
	private String noticeId;
	
	@Column(length = 30, nullable = false)
	private String sCodeNm;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(length = 4000, nullable = false)
	private String contents;
	
	@Column(length = 100, nullable = false)
	private String userId;
	
	@Column(nullable = false)
	private String topYn;
	
	@Column(nullable = false)
	private String showYn;
	
	@Column(nullable = false)
	private Date regDt;
	
	private Date upDt;
	
	@Builder
	public TbNotice(String noticeId, String sCodeNm, String title, String contents, String userId, String topYn, String showYn, Date regDt, Date upDt) {
		this.noticeId = noticeId;
		this.sCodeNm = sCodeNm;
		this.title = title;
		this.contents = contents;
		this.userId = userId;
		this.topYn = topYn;
		this.showYn = showYn;
		this.regDt = regDt;
		this.upDt = upDt;
	}

}
