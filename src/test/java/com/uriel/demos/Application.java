/**
 * 
 */
package com.uriel.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uriel.demos.config.BasicConfig;
import com.uriel.demos.service.SimpleService;

/**
 * @author Uriel Santoyo
 *
 */
public class Application {

	public static void main(String args[]){
		ConfigurableApplicationContext ctx = SpringApplication.run(BasicConfig.class, args);
		SimpleService ss = (SimpleService)ctx.getBean("simpleService");
		ss.printMessage();
	}
}
