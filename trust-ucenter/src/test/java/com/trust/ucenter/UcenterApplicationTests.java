package com.trust.ucenter;

import com.trust.oss.service.SmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UcenterApplicationTests {

	@Autowired
	private SmsService smsService;

	@Test
	public void contextLoads() {


	}

}
