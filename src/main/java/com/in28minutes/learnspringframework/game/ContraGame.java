package com.in28minutes.learnspringframework.game;

public class ContraGame implements GamingConsole{

	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("Roll");
	}
	
	public void left() {
		System.out.println("slow down");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}
	
}
