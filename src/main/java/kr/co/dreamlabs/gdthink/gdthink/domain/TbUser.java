package kr.co.dreamlabs.gdthink.gdthink.domain;

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
public class TbUser {
	
	@Id
	@Column(length = 100, nullable = false)
	private String userId;
	
	@Column(length = 30, nullable = false)
	private String sCodeNm;
	
	@Column(length = 30)
	private String userNm;
	
	@Column(length = 100, nullable = false)
	private String userPw;
	
	@Column(length = 1)
	private String useYn;
	
	@Builder
	public TbUser(String userId, String sCodeNm, String userNm, String userPw, String useYn) {
		this.userId = userId;
		this.sCodeNm = sCodeNm;
		this.userNm = userNm;
		this.userPw = userPw;
		this.useYn = useYn;
	}
	
}
