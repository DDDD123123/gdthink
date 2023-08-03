package kr.co.dreamlabs.gdthink.gdthink.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbUserTest {
	
	@Autowired
	TbUserRepository tbUserRepository;
	
	@Test
	void save() {
		
		TbUser params = TbUser.builder()
				.userId("test")
				.sCodeNm("TEST2")
				.userNm("test4")
				.userPw("1111")
				.useYn("n")
				.build();
		
		tbUserRepository.save(params);
		
	}
}
