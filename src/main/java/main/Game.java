package main;

public class Game implements Runnable {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private final double FPS_SET = 120;
    private Thread gameLoopThread;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        startGameLoop();
    }


    private void startGameLoop(){
        gameLoopThread = new Thread(this);
        gameLoopThread.start();
    }

    @Override
    public void run() {
        double timePerFrame = 1_000_000_000/ FPS_SET;
        long lastFrame = System.nanoTime();
        long now;
        int frames= 0;
        long lastCheck = 0;

        while (true){
            now = System.nanoTime();
            if(now-lastFrame>=timePerFrame){
                gamePanel.repaint();
                frames++;
                lastFrame = now;
            }

            if(System.currentTimeMillis()- lastCheck >= 1000){
                System.out.println("FPS : " + frames);
                lastCheck = System.currentTimeMillis();
                frames =0;
            }

        }

    }
}
