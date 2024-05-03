package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole console() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole console) {
		var gameRunner = new GameRunner(console);
		return gameRunner;
	}
}
