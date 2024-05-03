package com.in28minutes.learnspringframework.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamigBasicJava {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3ParameterCall"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person4Qualifier"));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
