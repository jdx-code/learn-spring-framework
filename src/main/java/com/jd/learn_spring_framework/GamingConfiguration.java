package com.jd.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jd.learn_spring_framework.game.GameRunner;
import com.jd.learn_spring_framework.game.GamingConsole;
import com.jd.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
    
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    // var game = new MarioGame();        
    // var game = new SuperContraGame();
    // var game = new PacmanGame(); // 1. new Object created for Pacman class
    // var gameRunner = new GameRunner(game);  // new Object created for GameRunner class + Wiring od dependencies (game is taken as a dependency of Gamerunner)
    // gameRunner.run();
    
}
