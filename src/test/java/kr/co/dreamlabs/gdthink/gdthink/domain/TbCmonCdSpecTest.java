package kr.co.dreamlabs.gdthink.gdthink.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbCmonCdSpecTest {

	@Autowired
	TbCmonCdSpecRepository tbCmonCdSpecRepository;
	
	@Test
	void save() {
		TbCmonCdSpec params = TbCmonCdSpec.builder()
				.sCodeNm("TEST2")
				.mCodeNm("TEST")
				.sCodeDesc("TEST3")
				.useYn("Y")
				.build();
		
		tbCmonCdSpecRepository.save(params);
	}
}
