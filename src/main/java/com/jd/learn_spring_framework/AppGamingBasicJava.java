package com.jd.learn_spring_framework;

import com.jd.learn_spring_framework.game.GameRunner;
// import com.jd.learn_spring_framework.game.MarioGame;
import com.jd.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main (String[] args) {
        // var marioGame = new MarioGame();
        // var gameRunner = new GameRunner(marioGame);
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}