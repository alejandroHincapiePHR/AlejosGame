package main;

import java.awt.*;
import java.util.Random;

public class RectanguleGameObject {

    private int width, high;
    private int xDir = 1, yDir = 1;
    private Color color;
    private Random random;
    private int xDelta, yDelta ;


    public RectanguleGameObject() {
        random = new Random();
        color = getRndColor();
        width = random.nextInt(10,100);
        high = width;
        xDelta = random.nextInt(0,GameWindow.WINDOW_HEIGHT);
        yDelta = random.nextInt(0,GameWindow.WINDOW_WIDTH);

    }

    public Color getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHigh() {
        return high;
    }

    public int getxDelta() {
        return xDelta;
    }

    public int getyDelta() {
        return yDelta;
    }

    public void changeXDeltaValue(int value) {
        xDelta += value;

    }

    public void changeYDeltaValue(int value) {
        yDelta += value;

    }

    public void setRectPosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;

    }

    public void updateRectangle(Graphics g) {
        if (xDelta > GameWindow.WINDOW_HEIGHT || xDelta < 0) {
            xDir *= -1;

            color = getRndColor();

        }
        xDelta += xDir;

        if (yDelta > GameWindow.WINDOW_WIDTH || yDelta < 0) {
            yDir *= -1;
            color = getRndColor();

        }
        yDelta += yDir;
    }

    private Color getRndColor() {
        int r = random.nextInt(0, 255);
        int g = random.nextInt(0, 255);
        int b = random.nextInt(0, 255);

        return new Color(r, g, b);

    }

}
