import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster is the enemy
 * 
 * @author Bruce Gustin
 * @version 12/22/2020
 */

public class Lobster extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }    
}
