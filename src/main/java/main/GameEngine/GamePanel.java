package main.GameEngine;

import inputs.KeyboardInputs;
import inputs.MouseInpunts;
import main.domain.gameObjects.Player;
import main.domain.gameSprites.GeneralSprite;
import main.domain.gameSprites.NormalGuySprite;
import main.domain.gameSprites.PirateSprite;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class GamePanel extends JPanel {
    private KeyboardInputs keyboardInputs;
    private MouseInpunts mouseInpunts;
    public static int GAME_WIDTH = 1280;
    public static int GAME_HEIGHT = 800;

    private Player player;

    public GamePanel() {
        keyboardInputs = new KeyboardInputs(this);
        mouseInpunts = new MouseInpunts(this);
        createGameObject();
        setGameWindowSize();
        addKeyListener(keyboardInputs);
        addMouseListener(mouseInpunts);
        addMouseMotionListener(mouseInpunts);

    }


    private void setGameWindowSize() {
        Dimension dimension = new Dimension(GAME_WIDTH, GAME_HEIGHT);
        setPreferredSize(dimension);
    }

    public void createGameObject() {
        GeneralSprite normalGuySprite = new NormalGuySprite(460, 600, "/normal_guy.png");
        GeneralSprite pirateSprite = new PirateSprite(64, 40, "/player_sprites.png");
        this.player = new Player(normalGuySprite);
    }


    public Player getPlayer() {
        return player;
    }


    public void update() {


    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawImage(player.updateFrame(), player.getXDelta(), player.getYDelta(), 115, 150, null);

    }


}

