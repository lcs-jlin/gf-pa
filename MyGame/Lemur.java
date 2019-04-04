import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lemur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lemur extends Actor
{
    /**
     * Act - do whatever the lemur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge())
        {
            turn(17);
        }
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        move(4);
        if ( isTouching(Sheep.class) );
        {
            removeTouching(Sheep.class);
        }
    }

}
