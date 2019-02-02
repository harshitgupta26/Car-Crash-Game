package in.harshit.entities;

import java.awt.*;

public class Lane extends Entity {

    public static boolean laneVisible=true;


    public Lane(int x, int y) {
        super(x, y);
        this.width=10;
        this.height=70;

    }

    @Override
    public void update() {
        super.update();
        this.yVel=10;
    }
}
