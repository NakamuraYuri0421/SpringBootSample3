package com.example.confiig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}
}