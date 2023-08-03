package kr.co.dreamlabs.gdthink.gdthink.dto;

import kr.co.dreamlabs.gdthink.gdthink.domain.TbCmonCdKind;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TbCmonCdKindDto {
	
	private String mCodeNm;
	private String mCodeDesc;
	private String useYn;
	
	public TbCmonCdKind toEntity() {
		TbCmonCdKind build = TbCmonCdKind.builder()
				.mCodeNm(mCodeNm)
				.mCodeDesc(mCodeDesc)
				.useYn(useYn)
				.build();
		return build;
	}
	
	public TbCmonCdKindDto(String mCodeNm, String mCodeDesc, String useYn) {
		this.mCodeNm = mCodeNm; 
		this.mCodeDesc = mCodeDesc; 
		this.useYn = useYn; 
	}

}
