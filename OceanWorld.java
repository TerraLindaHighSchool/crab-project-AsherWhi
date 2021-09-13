import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OceanWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OceanWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public OceanWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for (int i = 0; i < 1; i++) { 
            SeaHorse seaHorse = new SeaHorse();
            int imgWidth = seaHorse.getImage().getWidth();
            int imgHeight = seaHorse.getImage().getHeight();
            int posx = Greenfoot.getRandomNumber(getWidth() - imgWidth) + imgWidth/2;
            int posy = Greenfoot.getRandomNumber(getHeight() - imgHeight) + imgWidth/2;
            addObject(seaHorse,posx,posy);
        }
        for(int i = 0; i < 1; i++) {
            Seal seal = new Seal();
            int imgWidth = seal.getImage().getWidth();
            int imgHeight = seal.getImage().getHeight();
            int posx = Greenfoot.getRandomNumber(getWidth() - imgWidth) + imgWidth/2;
            int posy = Greenfoot.getRandomNumber(getHeight() - imgHeight) + imgWidth/2;
            addObject(seal,posx,posy);
        }
        for(int i = 0; i < 9; i++) {
            Seed seed = new Seed();
            int imgWidth = seed.getImage().getWidth();
            int imgHeight = seed.getImage().getHeight();
            int posx = Greenfoot.getRandomNumber(getWidth() - imgWidth) + imgWidth/2;
            int posy = Greenfoot.getRandomNumber(getHeight() - imgHeight) + imgWidth/2;
            addObject(seed,posx,posy);  
        }
    }
}
