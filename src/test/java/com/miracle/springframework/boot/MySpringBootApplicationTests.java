package com.miracle.springframework.boot;

import com.miracle.springframework.boot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MySpringBootApplicationTests {

	@Resource
	UserService userService;

	@Test
	void contextLoads() {
		System.out.println(userService);
	}

}
