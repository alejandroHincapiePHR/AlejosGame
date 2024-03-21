package main.domain.gameObjects;

import main.domain.gameSprites.GeneralSprite;

import static main.domain.utils.SpritesAnimationsConstants.*;

import java.awt.image.BufferedImage;

public class Player extends GameObject {
    public static final Integer PLAYER_ACTION_UP = 0;
    public static final Integer PLAYER_ACTION_DOWN = 1;
    public static final Integer PLAYER_ACTION_LEFT = 2;
    public static final Integer PLAYER_ACTION_RIGHT = 3;
    public static final Integer PLAYER_ACTION_STANDING = 4;
    private int deltaFPS = 0;
    private int i = 0;


    public Player(GeneralSprite generalSprite) {
        super(generalSprite);
        currentAnimation = generalSprite.getAnimationsList(ANIMATION_STANDING);
    }

    @Override
    public void updatePosition(Integer action) {
        switch (action) {
            case 0 -> {
                changeYDeltaValue(-5);

            }
            case 1 -> {
                changeYDeltaValue(5);

            }
            case 2 -> {
                changeXDeltaValue(-5);

            }
            case 3 -> {
                changeXDeltaValue(5);

            }
            case 4 -> {

            }

        }

        updateAnimations();
    }


    int previousXDelta = getXDelta();
    int previousYDelta = getYDelta();
    int currentXDelta;
    int currentYDelta;

    public void updateAnimations() {
        currentXDelta = getXDelta();
        currentYDelta = getYDelta();

        if (previousXDelta < currentXDelta) {
            currentAnimation = generalSprite.getAnimationsList(ANIMATION_WALKING_RIGHT);
        }

        if (previousXDelta > currentXDelta) {
            currentAnimation = generalSprite.getAnimationsList(ANIMATION_WALKING_LEFT);
        }

        if (previousYDelta > currentYDelta) {
            currentAnimation = generalSprite.getAnimationsList(ANIMATION_WALKING_UP);
        }

        if (previousYDelta < currentYDelta) {
            currentAnimation = generalSprite.getAnimationsList(ANIMATION_WALKING_DOWN);
        }

        if (previousXDelta == currentXDelta && previousYDelta == currentYDelta) {
            currentAnimation = generalSprite.getAnimationsList(ANIMATION_STANDING);
        }
        previousXDelta = currentXDelta;
        previousYDelta = currentYDelta;
    }


    public BufferedImage updateFrame() {
        deltaFPS++;
        if (deltaFPS >= 15) {
            i++;
            deltaFPS = 0;
        }
        if (i + 1 >= currentAnimation.size()) {
            i = 0;
        }
        return currentAnimation.get(i);
    }

}
