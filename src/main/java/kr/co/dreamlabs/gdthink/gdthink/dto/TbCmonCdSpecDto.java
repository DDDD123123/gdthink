package kr.co.dreamlabs.gdthink.gdthink.dto;

import kr.co.dreamlabs.gdthink.gdthink.domain.TbCmonCdSpec;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TbCmonCdSpecDto {
	
	private String sCodeNm;
	private String mCodeNm;
	private String sCodeDesc;
	private String sCodeYn;
	
	public TbCmonCdSpec toEntity() {
		TbCmonCdSpec build = TbCmonCdSpec.builder()
				.sCodeNm(sCodeNm)
				.mCodeNm(mCodeNm)
				.sCodeDesc(sCodeDesc)
				.sCodeYn(sCodeYn)
				.build();
		return build;
	}
	
	public TbCmonCdSpecDto(String sCodeNm, String mCodeNm, String sCodeDesc, String sCodeYn) {
		this.sCodeNm = sCodeNm;
		this.mCodeNm = mCodeNm;
		this.sCodeDesc = sCodeDesc;
		this.sCodeYn = sCodeYn;
	}
}
