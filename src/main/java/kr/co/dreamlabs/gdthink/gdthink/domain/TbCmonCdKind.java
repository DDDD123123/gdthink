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
public class TbCmonCdKind {
	
	@Id
	@Column(length = 30, nullable = false)
	private String mCodeNm;
	
	@Column(length = 100, nullable = false)
	private String mCodeDesc;
	
	@Column(length = 100, nullable = false)
	private String useYn;
	
	@Builder
	public TbCmonCdKind(String mCodeNm, String mCodeDesc, String useYn) {
		this.mCodeNm = mCodeNm; 
		this.mCodeDesc = mCodeDesc; 
		this.useYn = useYn; 
	}

}
