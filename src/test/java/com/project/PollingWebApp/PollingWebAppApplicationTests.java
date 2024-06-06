package com.project.PollingWebApp;

import com.project.PollingWebApp.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PollingWebAppApplicationTests {

	@Autowired
	UserRepository userRepository;



	@Test
	public String sampleTest(){
		return "sample";
	}

}
