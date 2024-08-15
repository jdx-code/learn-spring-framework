package com.jd.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jd.learn_spring_framework.game.GameRunner;
import com.jd.learn_spring_framework.game.GamingConsole;
// import com.jd.learn_spring_framework.game.MarioGame;
// import com.jd.learn_spring_framework.game.PacmanGame;
// import com.jd.learn_spring_framework.game.SuperContraGame;

public class AppGamingSpringBeans {
    public static void main (String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }        

        // var game = new MarioGame();        
        // var game = new SuperContraGame();
        // var game = new PacmanGame(); // 1. new Object created for Pacman class
        // var gameRunner = new GameRunner(game);  // new Object created for GameRunner class + Wiring od dependencies (game is taken as a dependency of Gamerunner)
        // gameRunner.run();
    }
}