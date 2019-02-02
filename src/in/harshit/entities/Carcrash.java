package in.harshit.entities;

import in.harshit.resources.Resources;

public class Carcrash extends Entity {

    public Carcrash(int x, int y) {
        super(x, y);

        this.image=Resources.carCrash1;

        this.width=30;
        this.height=50;

        this.yVel=12;
    }

    public void update(){
        super.update();
        if(Entity.score >30){
        this.yVel = 15;
        }
    }
}
