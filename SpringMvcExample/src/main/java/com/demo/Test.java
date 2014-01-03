package com.demo;

import org.apache.log4j.Logger;

public class Test {
	
	static Logger log = Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		System.out.println("ok");
		log.info("in main)))");
	}

}
