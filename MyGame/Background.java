import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private boolean gameOn;
    private int score;
    
    

    /**
     * Constructor for objects of class background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        
        
        gameOn = false;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sheep sheep = new Sheep();
        addObject(sheep,300,300);
        Lemur lemur = new Lemur();
        addObject(lemur,500,100);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,100,100);
        strawberry.setLocation(186,113);
        Lemur lemur2 = new Lemur();
        addObject(lemur2,90,100);
        Lemur lemur3 = new Lemur();
        addObject(lemur3,500,500);
        Lemur lemur4 = new Lemur();
        addObject(lemur4,90,500);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,296,116);
        Strawberry strawberry3 = new Strawberry();
        addObject(strawberry3,394,117);
        Strawberry strawberry4 = new Strawberry();
        addObject(strawberry4,497,210);
        Strawberry strawberry5 = new Strawberry();
        addObject(strawberry5,494,303);
        Strawberry strawberry6 = new Strawberry();
        addObject(strawberry6,490,406);
        Strawberry strawberry7 = new Strawberry();
        addObject(strawberry7,84,199);
        Strawberry strawberry8 = new Strawberry();
        addObject(strawberry8,81,303);
        Strawberry strawberry9 = new Strawberry();
        addObject(strawberry9,80,405);
        Strawberry strawberry10 = new Strawberry();
        addObject(strawberry10,194,498);
        Strawberry strawberry11 = new Strawberry();
        addObject(strawberry11,293,499);
        Strawberry strawberry12 = new Strawberry();
        addObject(strawberry12,386,499);
        strawberry12.setLocation(408,504);
        strawberry11.setLocation(301,497);
        strawberry10.setLocation(185,499);
        Strawberry strawberry13 = new Strawberry();
        addObject(strawberry13,188,205);
        Strawberry strawberry14 = new Strawberry();
        addObject(strawberry14,292,206);
        Strawberry strawberry15 = new Strawberry();
        addObject(strawberry15,393,208);
        Strawberry strawberry16 = new Strawberry();
        addObject(strawberry16,185,405);
        Strawberry strawberry17 = new Strawberry();
        addObject(strawberry17,294,406);
        Strawberry strawberry18 = new Strawberry();
        addObject(strawberry18,394,405);
        Strawberry strawberry19 = new Strawberry();
        addObject(strawberry19,394,299);
        Strawberry strawberry20 = new Strawberry();
        addObject(strawberry20,186,306);
        strawberry19.setLocation(400,312);
        sheep.setLocation(291,301);
    }

    /**
     * Displays the score on the screen
     */
    private void showScore()
    {
        showText("Score: " + score, 100, 100);
    }

    private void startGame()
    {
        gameOn = true;
        score = 0;
        
        
    }

    private void showResults()
    {
        showText("GAME OVER", 300, 300);
    }
    public boolean isGameOn()
    {
        return gameOn;
    }
    public void changeScoreBy(int thisMuch)
    {
        score += thisMuch;
        showScore();
    }
}

