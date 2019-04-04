import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sheep sheep = new Sheep();
        addObject(sheep,284,286);
        Lemur lemur = new Lemur();
        addObject(lemur,487,104);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,108,110);
        strawberry.setLocation(186,113);
        Lemur lemur2 = new Lemur();
        addObject(lemur2,91,103);
        Lemur lemur3 = new Lemur();
        addObject(lemur3,478,475);
        Lemur lemur4 = new Lemur();
        addObject(lemur4,84,483);
    }
}
