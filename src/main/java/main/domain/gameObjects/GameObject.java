package main.domain.gameObjects;

import main.domain.gameSprites.GeneralSprite;

import java.awt.image.BufferedImage;
import java.util.List;

public abstract class GameObject {
    protected GeneralSprite generalSprite;
    private int xDelta = 0;
    private int yDelta = 0;
    protected List<BufferedImage> currentAnimation;

    public GameObject(GeneralSprite generalSprite) {
        this.generalSprite = generalSprite;
    }

    abstract void updatePosition(Integer actions);

    public List<BufferedImage> getCurrentAnimation() {
        return currentAnimation;
    }

    public void setCurrentAnimation(List<BufferedImage> currentAnimation) {
        this.currentAnimation = currentAnimation;
    }

    public int getYDelta() {
        return yDelta;
    }

    public int getXDelta() {
        return xDelta;
    }

    public void changeXDeltaValue(int value) {
        xDelta += value;

    }

    public void changeYDeltaValue(int value) {
        yDelta += value;

    }
}
