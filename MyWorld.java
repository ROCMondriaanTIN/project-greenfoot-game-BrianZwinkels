
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends World {

    private CollisionEngine ce;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 625, 1, false);
        this.setBackground("komop.jpg");

        int[][] map = {
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,82,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,-1,-1,293,71,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,-1,-1,-1,79},
{-1,-1,-1,206,-1,-1,-1,206,-1,14,-1,-1,-1,-1,-1,206,-1,-1,-1,130,206,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,79,79,79,71,-1,-1,71,79,79,79,79,79},
{8,8,8,8,8,8,8,8,8,9,265,-1,265,7,8,9,265,-1,265,8,8,8,30,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,206,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,79,-1,-1,-1,-1,71,-1,-1,-1,79,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,24,30,-1,-1,-1,-1,-1,-1,-1,206,-1,-1,-1,18,8,8,11,11,11,8,8,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,24,8,8,265,-1,265,8,8,8,9,265,-1,265,6,6,10,10,10,6,6,-1,265,96,91,-1,-1,-1,-1,292,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,6,6,6,6,-1,-1,-1,79,92,91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,92,265,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,293,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,86,88,-1,265,96,173,173,173,96,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,79,79,79,-1,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,265,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,292,-1,-1,-1,-1,96,96,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,293,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79},
{91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,-1,-1,-1,-1,-1,-1,-1,-1,89,86,87,88,-1,-1,-1,-1,79},
{79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,89,97,175,175,175,96,91,-1,-1,89,90,175,175,175,175,95,97,175,79},
{79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,96,90,173,173,173,173,79,92,265,265,90,79,173,173,173,173,173,173,173,79},
{79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,-1,-1,-1,20,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,173,173,173,173,173,173,173,79,79,79,79,173,173,173,173,173,173,173,245,79},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,265,265,79,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,79},
{268,-1,13,-1,-1,-1,-1,-1,-1,-1,265,265,265,265,-1,-1,265,265,-1,-1,-1,-1,-1,-1,-1,-1,20,22,-1,-1,-1,-1,-1,-1,130,-1,23,8,8,8,8,245,79,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,245,79},
{79,79,8,8,8,30,-1,-1,-1,-1,8,8,8,8,-1,-1,8,8,11,11,11,11,11,11,11,11,11,11,11,11,8,8,265,265,8,8,29,6,79,8,79,79,79,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,245,79},
{79,79,6,6,6,24,30,-1,-1,-1,-1,6,6,-1,-1,-1,6,8,10,10,10,10,10,10,10,10,10,10,10,10,6,218,265,265,6,8,8,6,6,79,79,79,79,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,173,79,79},
{79,6,8,6,6,6,24,30,-1,-1,-1,-1,-1,-1,-1,-1,6,6,10,10,10,10,10,10,10,10,10,10,10,10,6,8,265,265,6,6,6,79,79,6,79,79,79,79,79,173,173,79,173,173,173,79,173,173,173,173,173,173,79,173,173,79,79,79},
{6,6,6,8,8,6,6,24,30,-1,-1,-1,-1,-1,-1,23,6,6,6,10,10,10,10,10,10,10,10,10,10,10,6,6,265,265,6,6,6,6,6,79,79,79,79,79,79,79,79,79,79,173,79,79,173,173,173,79,173,173,79,79,79,79,79,79},
{8,6,6,6,6,6,8,8,24,30,-1,-1,-1,-1,23,29,6,6,6,6,10,10,10,10,10,16,10,10,10,16,8,6,265,265,6,8,6,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79},
{6,6,8,8,6,6,6,6,6,24,8,8,8,8,29,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,79,6,6,6,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79},
        };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero,100, 192);
       
   
        
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
