package kr.co.dreamlabs.gdthink.gdthink.domain;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbNoticeTest {
	
	@Autowired
	TbNoticeRepository tbNoticeRepository;
	
	@Test
	void save() {
		
		Date date = new Date(System.currentTimeMillis());
		
		TbNotice params = TbNotice.builder()
				.noticeId("TEST")
				.sCodeNm("TEST2")
				.title("TEST3")
				.contents("TEST4")
				.userId("test")
				.regDt(date)
				.upDt(date)
				.topYn("Y")
				.showYn("Y")
				.build();
		
		tbNoticeRepository.save(params);
		
	}
}
