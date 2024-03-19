package inputs;

import main.Game;
import main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInpunts implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;

    public MouseInpunts(GamePanel gamePanel) {
        this.gamePanel = gamePanel;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("mouse cliecked");
        gamePanel.createGameObject();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
       //gamePanel.setRectPosition(e.getX(), e.getY());

    }
}
