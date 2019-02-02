package in.harshit.entities;

import in.harshit.resources.Resources;

public class Bang extends Entity{
    public Bang(int x, int y) {
        super(x, y);

        this.width=50;
        this.height=50;
        this.image=Resources.bangImage;
        this.isVisible=false;
    }

    @Override
    public void update() {
        super.update();
        if(this.isVisible){
            this.isVisible=false;
        }
    }
}
