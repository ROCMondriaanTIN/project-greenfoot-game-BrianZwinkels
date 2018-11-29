import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startmenu extends World
{

    /**
     * Constructor for objects of class startmenu.
     * 
     */
    public startmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 625, 1); 
        prepare();
    }

    public void act ()
    {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld (new MyWorld());

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        startmenutitel startmenutitel = new startmenutitel();
        addObject(startmenutitel,454,300);
        startmenutitel.setLocation(516,353);
        startmenulevels startmenulevels = new startmenulevels();
        addObject(startmenulevels,516,353);
        startmenutitel.setLocation(470,83);
        startmenutitel.setLocation(500,306);
        startmenutitel startmenutitel2 = new startmenutitel();
        addObject(startmenutitel2,500,306);
    }
}
