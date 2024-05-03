package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.ContraGame;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;

public class App01GamigBasicJava {

	public static void main(String[] args) {
		
//		var game = new PacManGame();
//		var game = new MarioGame();
		var game = new ContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}
	
}
