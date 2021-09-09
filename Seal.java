import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
    }

    // Moves the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }  
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
        }  
    }
    // Turns the crab
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(0);
        }
    }
}