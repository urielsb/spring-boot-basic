/**
 * 
 */
package com.uriel.demos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uriel.demos.service.SimpleService;

/**
 * @author Uriel Santoyo
 *
 */
@Configuration
public class BasicConfig {

	@Bean("simpleService")
	public SimpleService getSimpleService(){
		return new SimpleService();
	}
}
