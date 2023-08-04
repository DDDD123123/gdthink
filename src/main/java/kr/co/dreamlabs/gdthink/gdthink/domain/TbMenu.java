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
public class TbMenu {
	
	@Id
	@Column(length = 30, nullable = false)
	private String menuId;
	
	@Column(length = 50, nullable = false)
	private String menuKorNm;
	
	@Column(length = 50, nullable = false)
	private String menuEnNm;
	
	@Column(length = 200, nullable = false)
	private String url;
	
	@Column(length = 30, nullable = false)
	private String parentId;
	
	@Column(length = 10, nullable = false)
	private String depth;
	
	@Column(length = 10, nullable = false)
	private String ord;
	
	@Column(length = 1, nullable = false)
	private String useYn;
	
	@Builder
	public TbMenu(String menuId, String menuKorNm, String menuEnNm, String url, String parentId, String depth, String ord, String useYn) {
		this.menuId = menuId;
		this.menuKorNm = menuKorNm;
		this.menuEnNm = menuEnNm;
		this.url = url;
		this.parentId = parentId;
		this.depth = depth;
		this.ord = ord;
		this.useYn = useYn;
	}
	
}
