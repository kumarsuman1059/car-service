package com.carservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carservice.controller.CarServiceController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private CarServiceController carServiceController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(carServiceController).isNotNull();
	}
}
