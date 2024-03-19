package main;

import inputs.KeyboardInputs;
import inputs.MouseInpunts;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamePanel extends JPanel {
    private KeyboardInputs keyboardInputs;
    private MouseInpunts mouseInpunts;
    private List<RectanguleGameObject> rectanguleList = new ArrayList<>();

    public GamePanel() {
        keyboardInputs = new KeyboardInputs(this);
        mouseInpunts = new MouseInpunts(this);
        addKeyListener(keyboardInputs);
        addMouseListener(mouseInpunts);
        addMouseMotionListener(mouseInpunts);
    }

    public void createGameObject() {
        rectanguleList.add(new RectanguleGameObject());
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rectanguleList.forEach(x -> {
            g.setColor(x.getColor());
            x.updateRectangle(g);
            g.fillRect(x.getxDelta(), x.getyDelta(), x.getHigh(), x.getWidth());
        });
    }

}

