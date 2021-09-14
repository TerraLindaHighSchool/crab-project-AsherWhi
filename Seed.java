import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seed extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int actN = 0;
    
    
    public void act()
    {
         move(10);
         if(actN%10 == 1)
         turn(Greenfoot.getRandomNumber(360));
         actN++;
    }
}
