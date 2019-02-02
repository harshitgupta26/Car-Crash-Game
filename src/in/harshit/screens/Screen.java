package in.harshit.screens;

import in.harshit.entities.Entity;
import in.harshit.entities.Lane;
import in.harshit.main.GamePanel;

import java.awt.*;
import java.util.*;

abstract public class Screen {

    protected GamePanel gPanel;
    protected java.util.List<Entity> entities = new ArrayList<>();

    public Screen(GamePanel p) {
        super();
        this.gPanel = p;
    }

    public void update() {
        for(Entity e: this.entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for(Entity e: entities) {
            if(e.isVisible) {
                g.drawImage(e.image, e.x, e.y,e.width,e.height, null);

            }

        }
    }

    public void onMousePress(int xCord, int yCord) {

    }

    public void onMouseEntered(int xCord, int yCord){

    }

    public void onKeyPress(int keyCode) {

    }
}