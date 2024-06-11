package org.geunskoo;

public class Main {
    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame(new RandomMovable());
        racingGame.start();
    }
}