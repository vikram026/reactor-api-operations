package com.nisum.webflux.service.impl;

import com.nisum.webflux.repository.EmployeeRepo;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;

@TestConfiguration
public class TestConfig {
	
	@MockBean
    EmployeeRepo empRepo;
	
//	@Bean
//	@Primary
//	public EmployeeRepo empRepo() {
//		return empRepo;
//	}

}
