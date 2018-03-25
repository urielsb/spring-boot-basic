/**
 * 
 */
package com.uriel.demos.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * @author Uriel Santoyo
 *
 */
@Service
public class SimpleService {

	@PostConstruct
	public void init(){
		System.out.println("************************************");
		System.out.println("Initializing my sample service");
		System.out.println("************************************");
	}
	
	public void printMessage(){
		System.out.println("************************************");
		System.out.println("Message from my service.");
		System.out.println("************************************");
	}
}
