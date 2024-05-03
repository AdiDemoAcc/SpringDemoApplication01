package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3GamingSpringBeans {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
		}
		
	}
	
}

