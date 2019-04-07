
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    /**
     * Act - do whatever the sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
        move(5);
        if ( isTouching(Strawberry.class) );
        {
            removeTouching(Strawberry.class);
        }

    }    

    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left"))
        { 
            setRotation(180);
            move(2);

        }
       if (Greenfoot.isKeyDown("right"))
        { 
            setRotation(0);
            move(2);

        }
        if (Greenfoot.isKeyDown("up"))
        { 
            setRotation(270);
            move(2);

        }
        if (Greenfoot.isKeyDown("down"))
        { 
            setRotation(90);
            move(2);

        }
        
    }
}
