package main.GameEngine;

public class Game implements Runnable {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private final double FPS_SET = 120;
    private final double UPS_SET = 200;
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
        double timePerUpdate = 1_000_000_000/ UPS_SET;
        long lastTime = System.nanoTime();
        long currentTime;
        double deltaU = 0;
        double deltaF = 0;
        int frames= 0;
        int updates = 0;
        long lastCheck = 0;

        while (true){
            currentTime = System.nanoTime();

            deltaF += (currentTime - lastTime)/ timePerFrame ;
            deltaU += (currentTime - lastTime)/ timePerUpdate ;
            lastTime = currentTime;

            if(deltaU>=1){
                gamePanel.update();
                updates++;
                deltaU--;
            }

            if(deltaF>=1){
                gamePanel.repaint();
                frames++;
                deltaF--;
            }

            if(System.currentTimeMillis()- lastCheck >= 1000){
                System.out.println("FPS : " + frames + " | " + "UPS : "+ updates);

                lastCheck = System.currentTimeMillis();
                frames =0;
                updates = 0;
            }

        }

    }
}
