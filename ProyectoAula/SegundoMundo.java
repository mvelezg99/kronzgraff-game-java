import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SegundoMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SegundoMundo extends Mundo
{

    /**
     * Constructor for objects of class SegundoMundo.
     * 
     */
    public SegundoMundo()
    {
        super();
        setBackground(new GreenfootImage("fondo_2.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_mundo_2.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Graffiti2 graffiti2 = new Graffiti2();
        addObject(graffiti2,137,67);
        graffiti2.setLocation(124,68);
        Bloque1 bloque1 = new Bloque1();
        addObject(bloque1,186,523);
        bloque1.setLocation(181,513);
        Bloque1 bloque12 = new Bloque1();
        addObject(bloque12,228,520);
        bloque12.setLocation(222,513);
        Bloque1 bloque13 = new Bloque1();
        addObject(bloque13,272,480);
        bloque13.setLocation(265,471);
        Bloque1 bloque14 = new Bloque1();
        addObject(bloque14,314,440);
        bloque14.setLocation(308,432);
        Bloque1 bloque15 = new Bloque1();
        addObject(bloque15,394,495);
        bloque15.setLocation(389,496);
        bloque15.setLocation(385,493);
        bloque15.setLocation(351,392);
        bloque15.setLocation(350,432);
        Bloque1 bloque16 = new Bloque1();
        addObject(bloque16,425,438);
        bloque16.setLocation(429,431);
        bloque1.setLocation(180,492);
        bloque12.setLocation(222,491);
        bloque13.setLocation(264,451);
        bloque14.setLocation(305,410);
        bloque15.setLocation(347,410);
        Bloque1 bloque17 = new Bloque1();
        addObject(bloque17,521,384);
        bloque17.setLocation(513,376);
        Bloque1 bloque18 = new Bloque1();
        addObject(bloque18,564,383);
        bloque18.setLocation(580,375);
        Bloque1 bloque19 = new Bloque1();
        addObject(bloque19,551,383);
        bloque19.setLocation(540,375);
        bloque17.setLocation(498,375);
        Bloque1 bloque110 = new Bloque1();
        addObject(bloque110,585,289);
        bloque110.setLocation(579,287);
        Bloque1 bloque111 = new Bloque1();
        addObject(bloque111,521,217);
        bloque111.setLocation(520,219);
        bloque111.setLocation(500,214);
        Bloque1 bloque112 = new Bloque1();
        addObject(bloque112,461,220);
        bloque112.setLocation(441,219);
        bloque111.setLocation(497,219);
        bloque112.setLocation(455,218);
        bloque112.setLocation(455,220);
        bloque112.setLocation(455,217);
        bloque112.setLocation(454,220);
        bloque112.setLocation(456,219);
        Bloque1 bloque113 = new Bloque1();
        addObject(bloque113,27,115);
        bloque113.setLocation(20,104);
        Bloque1 bloque114 = new Bloque1();
        addObject(bloque114,74,105);
        bloque114.setLocation(60,104);
        Bloque1 bloque115 = new Bloque1();
        addObject(bloque115,107,111);
        bloque115.setLocation(99,105);
        bloque115.setLocation(101,103);
        bloque115.setLocation(101,104);
        Bloque1 bloque116 = new Bloque1();
        addObject(bloque116,152,108);
        bloque116.setLocation(141,103);
        bloque116.setLocation(141,103);
        Bloque1 bloque117 = new Bloque1();
        addObject(bloque117,189,115);
        bloque117.setLocation(181,103);
        Bloque1 bloque118 = new Bloque1();
        addObject(bloque118,218,112);
        bloque118.setLocation(222,102);
        graffiti2.setLocation(124,59);
        graffiti2.setLocation(121,59);
        bloque116.setLocation(143,104);
        bloque117.setLocation(186,104);
        bloque116.setLocation(140,104);
        bloque116.setLocation(142,104);
        bloque117.setLocation(183,104);
        bloque118.setLocation(224,103);
        bloque118.setLocation(224,104);
        Bloque1 bloque119 = new Bloque1();
        addObject(bloque119,377,220);
        bloque119.setLocation(377,217);
        Bloque1 bloque120 = new Bloque1();
        addObject(bloque120,307,172);
        bloque120.setLocation(296,161);
    }
}
