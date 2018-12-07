
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {
    private final double gravity;
    private final double acc;
    private final double drag;
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    public static boolean enemyWon = false;

    public Enemy() {
        super();
        setImage("p3_stand.png");
        getImage().mirrorHorizontally();
        walkRange = 170;
        firstAct = true;
        speed = 5;
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        
    }

    @Override
    public void act() {
        velocityY += acc;
        if (velocityY > gravity){
            velocityY = gravity;
        }
        if(isTouching(star.class)){
            enemyWon = true;
        }
        
        
        
        
    
    }
}