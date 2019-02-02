package in.harshit.resources;

import in.harshit.entities.Entity;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Resources {
    public static Image carImage;
    public static Image carCrash1;
//    public static Image carCrash2;
//    public static Image carCrash3;
    public static Image bangImage;
    public static AudioClip hitAudio;
    public static AudioClip backgroundAudio;
    public static Color roadColor;
    public static Image backgroundCarImage;



    public static void load() {
        roadColor = new Color(136, 139, 142);

        try {
            carImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/ferrari.png"));
            carCrash1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/bmw1.png"));
            bangImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/bang.png"));
//            carCrash2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/bmw1.png"));
//            carCrash3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/bmw1.png"));
            backgroundCarImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/resources/images/car.jpg"));
            //playerImage3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/in/harshit/resources/images/run_anim3.png"));
            //playerImage4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/in/harshit/resources/images/run_anim4.png"));
            //erJumpImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/harshit/in/harshit/resources/images/jump.png"));
            //bangAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/harshit/in/harshit/resources/audios/onjump.wav"));
            hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/harshit/resources/audios/hit.wav"));
            backgroundAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/harshit/resources/audios/carsound.wav"));
        } catch (IOException e) {

        }
    }
}