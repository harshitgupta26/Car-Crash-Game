package in.harshit.entities;

import in.harshit.resources.Resources;

public class Car extends Entity {
    public Car(int x, int y) {
        super(x, y);

        this.height = 50;
        this.width = 30;
        this.image = Resources.carImage;
    }
}