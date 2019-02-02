package in.harshit.screens;

import in.harshit.main.Game;
import in.harshit.main.GamePanel;
import in.harshit.resources.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen {

    private static Color playButtonColor=new Color(152, 255, 30);

    public WelcomeScreen(GamePanel panel) {
        super(panel);
    }

    private int counter = 0;
    private static final int CIRCLE_SIZE = 100;
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 60;
    private static final int PLAY_BUTTON_Y_CORD = 200;
    private static final int PLAY_BUTTON_X_CORD = 200;
    private static final int SETTINGS_BUTTON_Y_CORD = 260;
    private static final int SETTINGS_BUTTON_X_CORD = 160;

    public void update() {

    }

    public void draw(Graphics g) {
        g.drawImage(Resources.backgroundCarImage,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
        g.setColor(playButtonColor);
        g.setFont(new Font("Algerian",Font.BOLD,50));
        g.drawString("PLAY",PLAY_BUTTON_X_CORD,PLAY_BUTTON_Y_CORD);
//        g.drawString("SETTINGS",SETTINGS_BUTTON_X_CORD,SETTINGS_BUTTON_Y_CORD);

    }

    @Override
    public void onMousePress(int xCord, int yCord) {

        if(xCord > PLAY_BUTTON_X_CORD && xCord < PLAY_BUTTON_X_CORD+100
                && yCord > PLAY_BUTTON_Y_CORD-30
                && yCord < PLAY_BUTTON_Y_CORD ) {

            this.gPanel.currentScreen = new Stage1Screen(this.gPanel);

        }
//        else if(xCord > SETTINGS_BUTTON_X_CORD && xCord < SETTINGS_BUTTON_X_CORD+130
//                && yCord > SETTINGS_BUTTON_Y_CORD
//                && yCord < SETTINGS_BUTTON_Y_CORD + 60) {
//            this.gPanel.currentScreen = new SettingsScreen(this.gPanel);
//        }

    }
}