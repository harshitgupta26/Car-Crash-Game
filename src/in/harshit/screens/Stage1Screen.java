package in.harshit.screens;

import in.harshit.entities.*;
import in.harshit.main.Game;
import in.harshit.main.GamePanel;
import in.harshit.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class Stage1Screen extends Screen {


    private java.util.List<Carcrash> carCrash = new ArrayList<>();

    private Car car;

    private java.util.List<Lane> lanes=new ArrayList<>();

    private Bang bang;


    public Stage1Screen(GamePanel panel) {
        super(panel);

        this.lanes.add(new Lane(178,630));
        this.lanes.add(new Lane(328,630));
        this.lanes.add(new Lane(178,490));
        this.lanes.add(new Lane(328,490));
        this.lanes.add(new Lane(178,350));
        this.lanes.add(new Lane(328,350));
        this.lanes.add(new Lane(178,210));
        this.lanes.add(new Lane(328,210));
        this.lanes.add(new Lane(178,70));
        this.lanes.add(new Lane(328,70));
        this.lanes.add(new Lane(178,-70));
        this.lanes.add(new Lane(328,-70));
        this.lanes.add(new Lane(178,-210));
        this.lanes.add(new Lane(328,-210));

        this.carCrash.add(new Carcrash(85, -70));
        this.carCrash.add(new Carcrash(235, -150));
        this.carCrash.add(new Carcrash(385, -500));
        this.carCrash.add(new Carcrash(85,-750));
        this.carCrash.add(new Carcrash(235,-300));

        this.car=(new Car(235,315));
        this.bang=new Bang(this.car.x,this.car.y);

        this.entities.addAll(this.lanes);
        this.entities.addAll(this.carCrash);
        this.entities.add(this.car);
        this.entities.add(this.bang);
        Resources.backgroundAudio.loop();
        Entity.score=0;

    }

    @Override
    public void update() {
        super.update();


        for (Carcrash c : carCrash) {
            if (c.y > 750) {
                c.y = Util.randomYInt(c);
                c.x=Util.randomInt(c);
                c.isVisible = true;
                Entity.score++;

            }

            if (c.isColliding(this.car)) {
                Resources.hitAudio.play();
                Entity.crash++;
                this.bang.x=c.x;
                this.bang.y=c.y;
                this.bang.isVisible=true;

                c.isVisible = false;

                c.y=Util.randomYInt(c);
                c.x=Util.randomInt(c);
            }
        }


        for(Lane l:lanes){
            if(l.y>870){
                l.y=-70;
            }
        }

        if(Entity.crash>5){
            this.gPanel.currentScreen=new GameOverScreen(this.gPanel);
        }

    }



    public void draw(Graphics g) {
        g.setColor(Resources.roadColor);
        g.fillRect(0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT);
        g.setColor(Color.WHITE);
        for(Lane l:lanes){
            g.fillRect(l.x,l.y,l.width,l.height);
        }
        g.setColor(Color.black);
        g.fillRect(0,0,50,700);
        g.fillRect(450,0,50,700);

        super.draw(g);
        g.setColor(new Color(0,0,0));
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("CRASH: "+Entity.crash,70,20);
        g.drawString("SCORE: "+Entity.score,340,20);
        if(Entity.score>30){
            g.drawString("Speed Increased",100,300);
        }

    }

    @Override
    public void onKeyPress(int keyCode) {

        if(keyCode==KeyEvent.VK_LEFT&&car.x>=235){
            car.x-=150;
        }
        if(keyCode==KeyEvent.VK_RIGHT&&car.x<=235){
            car.x+=150;
        }


    }
    }
