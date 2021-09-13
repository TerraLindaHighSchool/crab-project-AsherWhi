import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeaHorse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaHorse extends Actor
{
    public void act()
    {
        move(0);
        checkKeyPress();
        onCollision();
    }
    // Checks for user key presses so user can move the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-5);
        }  
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+5);
        }  
    }
    // Checks for collisions with other objects
    
    private void onCollision()
    {
        if(isTouching(Seed.class))
        {
            removeTouching(Seed.class);
            Greenfoot.playSound("slurp.wav");
            
            // Winning the game
            if(getWorld().getObjects(Seed.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Seal.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}    
    