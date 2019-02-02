package in.harshit.main;

import javax.swing.*;

public class Game {

    public static final int GAME_HEIGHT = 700;
    public static final int GAME_WIDTH = 500;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
