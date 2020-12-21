import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author: Bruce Gustin
 * @version: 12/20/2020
 */
public class Crab extends Actor
{
    // This method repeats the following actions
    public void act()
    {
       move(3);
       turnAtEdge();
       checkKeyPress();
       onCollision();
    }
    
    // Moves the Crab
    
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
    
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
    
    }
}



