package kr.co.dreamlabs.gdthink.gdthink.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbMenuTest {
	
	@Autowired
	TbMenuRepository tbMenuRepository;
	
	@Test
	void save() {
		TbMenu params = TbMenu.builder()
				.menuId("TEST1")
				.menuKorNm("TEST2")
				.menuEnNm("TEST3")
				.url("TEST3")
				.parentId("TEST4")
				.depth("TEST5")
				.ord("TEST6")
				.useYn("Y")
				.build();
		
		tbMenuRepository.save(params);
	}
}
