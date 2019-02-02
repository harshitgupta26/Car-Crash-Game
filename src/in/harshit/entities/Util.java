package in.harshit.entities;

//import java.util.Random;

import java.util.Random;

/**
 * Created by cerebro on 05/07/16.
 */
public class Util {
    private static Random random = new Random();

    private Util() {
    }


    public int getX() {
        return x;
    }

//    public void setX(int x) {
//        this.x = x;
//    }

    private int x;
    private int y;

    public static int randomInt(Entity e) {
        e.x = Util.random.nextInt(3);
        return ((e.x) * 150 + 85);

    }

    public static int randomYInt(Entity e){
        e.y=Util.random.nextInt(4);
        return (e.y*(-150)-200);
    }

}
