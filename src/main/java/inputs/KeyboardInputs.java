package inputs;

import main.GameEngine.GamePanel;
import main.domain.gameObjects.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> {
                gamePanel.getPlayer().updatePosition(Player.PLAYER_ACTION_UP);
            }
            case KeyEvent.VK_S -> {
                gamePanel.getPlayer().updatePosition(Player.PLAYER_ACTION_DOWN);
            }
            case KeyEvent.VK_A -> {
                gamePanel.getPlayer().updatePosition(Player.PLAYER_ACTION_LEFT);
            }
            case KeyEvent.VK_D -> {
                gamePanel.getPlayer().updatePosition(Player.PLAYER_ACTION_RIGHT);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //gamePanel.getPirate().setCurrentAnimation(PirateObject.ANIMATION_STANDING);
        gamePanel.getPlayer().updatePosition(Player.PLAYER_ACTION_STANDING);


    }
}
