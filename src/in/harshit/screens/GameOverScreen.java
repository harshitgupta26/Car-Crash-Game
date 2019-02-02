package in.harshit.screens;

import in.harshit.entities.Entity;
import in.harshit.main.Game;
import in.harshit.main.GamePanel;
import in.harshit.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameOverScreen extends Screen {


    public GameOverScreen(GamePanel panel) {
        super(panel);
        Resources.backgroundAudio.stop();
    }

    public void draw(Graphics g) {
        g.setColor(new Color(251, 192, 91));
        g.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Over ", 140, 300);
        g.drawString("SCORE: "+ Entity.score, 140, 350);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Press SPACE key to Restart",50,600);
    }
    public void update() {
        Entity.crash=0;
    }

    @Override
    public void onKeyPress(int keyCode) {

        if(keyCode==KeyEvent.VK_SPACE) {
            this.gPanel.currentScreen = new Stage1Screen(this.gPanel);
        }
    }
}