package org.geunskoo;

import java.util.Random;

public class RandomMovable implements Movable{

    private static final int MIN_NUMBER_TO_MOVE = 4;
    private static final int MAX_NUMBER_TO_MOVE = 9;

    @Override
    public boolean isMovable() {
        return getRandomInt() > MIN_NUMBER_TO_MOVE;
    }

    private static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER_TO_MOVE);
    }
}
