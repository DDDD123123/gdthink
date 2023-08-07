package kr.co.dreamlabs.gdthink.gdthink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.dreamlabs.gdthink.gdthink.vo.TbMenuVo;

@SpringBootTest
public class MenuServiceTest {
	
	@Autowired
	MenuService menuService;
	
	void selectAllTest() {
		List<TbMenuVo> menuList = menuService.getAllMenu();
	}
	
}
