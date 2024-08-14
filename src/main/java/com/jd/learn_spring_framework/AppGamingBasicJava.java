package com.jd.learn_spring_framework;

import com.jd.learn_spring_framework.game.GameRunner;
import com.jd.learn_spring_framework.game.MarioGame;
import com.jd.learn_spring_framework.game.PacmanGame;
import com.jd.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main (String[] args) {
        // var game = new MarioGame();        
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}