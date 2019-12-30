import greenfoot.*;

public class Fountain extends Actor {
    private int lifespan = 75;
    private int startDelay = 100;
    private GreenfootImage img;

    public Fountain() {
    	img = new GreenfootImage(20,20);
    	img.setColor(Color.BLUE);
    	img.setTransparency(100);
    	img.fill();
    	setImage(img);
    }

    public void act() {
        if( --startDelay == 0 ) wipeView();
        if( startDelay < 0 ) createRedBallShower();
    }    

    private void wipeView() {
    	img.clear();
    }
    
    private void createRedBallShower() {
    }
}
