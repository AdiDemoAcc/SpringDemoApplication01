package com.in28minutes.learnspringframework.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Aditya";
	}

	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		var Person = new Person("Radha",59,new Address("Baker Street","London"));
		return Person;
	}

	@Bean
	public Person person2MethodCall() {
		var Person = new Person(name(),age(),address());
		return Person;
	}

	@Bean
	public Person person3ParameterCall(String name,int age,Address address2) {
		var Person = new Person(name,age,address2);
		return Person;
	}

	@Bean
	public Person person4Qualifier(String name,int age,@Qualifier("address2Qualifier") Address address2) {
		var Person = new Person(name,age,address2);
		return Person;
	}
	
	@Bean(name = "address")
	@Primary
	public Address address() {
		var address = new Address("Domlur","Bangalore");
		return address;
	}


	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address2() { 
		var address = new Address("Vishrantwadi","Pune"); return address; 
	}

}
