import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        if(Greenfoot.isKeyDown("l")){
            System.out.println(getX() + " " + getY());
            Greenfoot.delay(10);
        }
    }  
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }



    public void handleInput() {
        if (Greenfoot.isKeyDown("w")&&(onGround() == true)) {
            velocityY = -12
          ;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -7;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 7;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}