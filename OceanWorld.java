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
        SeaHorse SeaHorse = new SeaHorse();
        addObject(SeaHorse,107,113);
        Seal Seal = new Seal();
        addObject(Seal,321,458);
        Seed Seed = new Seed();
        addObject(Seed,458,251);
        Seed Seed2 = new Seed();
        addObject(Seed2,64,405);
        Seed Seed3 = new Seed();
        addObject(Seed3,171,279);
        Seed Seed4 = new Seed();
        addObject(Seed4,358,97);
        Seed Seed5 = new Seed();
        addObject(Seed5,441,474);
        Seed Seed6 = new Seed();
        addObject(Seed6,148,506);
        Seed Seed7 = new Seed();
        addObject(Seed7,309,288);
        Seed Seed8 = new Seed();
        addObject(Seed8,175,32);
        Seed Seed9 = new Seed();
        addObject(Seed9,43,216);
        Seed Seed10 = new Seed();
        addObject(Seed10,514,95);
    }
}
