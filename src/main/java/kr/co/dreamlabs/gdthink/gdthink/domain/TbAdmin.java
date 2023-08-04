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
public class TbAdmin {
	
	@Id
	@Column(length = 100, nullable = false)
	private String adminId;
	
	@Column(length = 30)
	private String adminNm;
	
	@Column(length = 100, nullable = false)
	private String adminPw;
	
	@Column(length = 1)
	private String useYn;
	
	@Builder
	public TbAdmin(String adminId, String adminNm, String adminPw, String useYn) {
		this.adminId = adminId;
		this.adminNm = adminNm;
		this.adminPw = adminPw;
		this.useYn = useYn;
	}
	
}
