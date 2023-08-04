package kr.co.dreamlabs.gdthink.gdthink.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbAdminTest {
	
	@Autowired
	TbAdminRepository tbUserRepository;
	
	@Test
	void save() {
		
		TbAdmin params = TbAdmin.builder()
				.adminId("TEST")
				.adminNm("TEST2")
				.adminPw("TEST3")
				.useYn("TEST4")
				.build();
		
		tbUserRepository.save(params);
		
	}
}
