package kr.co.dreamlabs.gdthink.gdthink.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbCmonCdKindTest {
	
	@Autowired
	TbCmonCdKindRepository tbCmonCdKindRepository;
	
	@Test
	void save() {
		TbCmonCdKind params = TbCmonCdKind.builder()
				.mCodeDesc("TEST")
				.mCodeNm("TEST")
				.useYn("Y")
				.build();
		
		tbCmonCdKindRepository.save(params);
	}
	
	@Test
	void findAll() {
		
	}
	
	
}
