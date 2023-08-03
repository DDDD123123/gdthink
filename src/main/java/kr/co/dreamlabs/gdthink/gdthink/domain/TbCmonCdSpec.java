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
public class TbCmonCdSpec {
	
	@Id
	@Column(length = 30, nullable = false)
	private String sCodeNm;
	
	@Column(length = 30, nullable = false)
	private String mCodeNm;
	
	@Column(length = 100, nullable = false)
	private String sCodeDesc;
	
	@Column(length = 1, nullable = false)
	private String sCodeYn;
	
	@Builder
	public TbCmonCdSpec(String sCodeNm, String mCodeNm, String sCodeDesc, String sCodeYn) {
		this.sCodeNm = sCodeNm; 
		this.mCodeNm = mCodeNm; 
		this.sCodeDesc = sCodeDesc; 
		this.sCodeYn = sCodeYn;
	}
}
