import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Bruce Gustin
 * @version 12/20/2020
 */
public class Crab extends Actor
{
    private int numOfWorms = 8;
    
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
        
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
    
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms--;
            
            // *** Winning the gmae ****************
            if(numOfWorms == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    
    }
}



