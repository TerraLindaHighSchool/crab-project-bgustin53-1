import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
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
        Crab crab = new Crab();
        addObject(crab,198,211);
        Worm worm = new Worm();
        addObject(worm,49,61);
        Worm worm2 = new Worm();
        addObject(worm2,369,106);
        Worm worm3 = new Worm();
        addObject(worm3,197,297);
        Worm worm4 = new Worm();
        addObject(worm4,422,385);
        Worm worm5 = new Worm();
        addObject(worm5,73,396);
        Worm worm6 = new Worm();
        addObject(worm6,192,382);
        Worm worm7 = new Worm();
        addObject(worm7,232,498);
        Worm worm8 = new Worm();
        addObject(worm8,124,492);
        Lobster lobster = new Lobster();
        addObject(lobster,478,57);
    }
}
