import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TercerMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TercerMundo extends Mundo
{

    /**
     * Constructor for objects of class TercerMundo.
     * 
     */
    public TercerMundo()
    {
        super();
        setBackground(new GreenfootImage("fondo_3.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_mundo_3.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Graffiti3 graffiti3 = new Graffiti3();
        addObject(graffiti3,341,47);
        graffiti3.setLocation(331,38);
        Bloque1 bloque121 = new Bloque1();
        addObject(bloque121,27,485);
        bloque121.setLocation(20,485);
        Bloque1 bloque122 = new Bloque1();
        addObject(bloque122,582,485);
        bloque122.setLocation(582,485);
        Bloque1 bloque13 = new Bloque1();
        addObject(bloque13,284,485);
        Bloque1 bloque14 = new Bloque1();
        addObject(bloque14,132,411);
        bloque14.setLocation(107,388);
        Bloque1 bloque15 = new Bloque1();
        addObject(bloque15,155,394);
        bloque15.setLocation(147,387);
        bloque15.setLocation(147,388);
        Bloque1 bloque16 = new Bloque1();
        addObject(bloque16,203,390);
        bloque16.setLocation(187,388);
        Bloque1 bloque17 = new Bloque1();
        addObject(bloque17,511,392);
        bloque17.setLocation(504,385);
        Bloque1 bloque18 = new Bloque1();
        addObject(bloque18,468,395);
        bloque18.setLocation(463,385);
        Bloque1 bloque19 = new Bloque1();
        addObject(bloque19,216,86);
        bloque19.setLocation(209,76);
        Bloque1 bloque110 = new Bloque1();
        addObject(bloque110,261,74);
        bloque110.setLocation(250,76);
        Bloque1 bloque111 = new Bloque1();
        addObject(bloque111,301,92);
        bloque111.setLocation(293,75);
        bloque111.setLocation(290,76);
        Bloque1 bloque112 = new Bloque1();
        addObject(bloque112,340,79);
        bloque112.setLocation(331,75);
        bloque112.setLocation(331,76);
        Bloque1 bloque113 = new Bloque1();
        addObject(bloque113,379,81);
        bloque113.setLocation(372,76);
        bloque19.setLocation(413,74);
        bloque110.setLocation(246,76);
        bloque111.setLocation(287,76);
        bloque112.setLocation(327,76);
        bloque113.setLocation(368,76);
        bloque19.setLocation(409,76);
        Bloque1 bloque114 = new Bloque1();
        addObject(bloque114,402,302);
        bloque114.setLocation(394,297);
        Bloque1 bloque115 = new Bloque1();
        addObject(bloque115,28,323);
        bloque115.setLocation(20,317);
        Bloque1 bloque116 = new Bloque1();
        addObject(bloque116,287,307);
        bloque116.setLocation(268,309);
        Bloque1 bloque117 = new Bloque1();
        addObject(bloque117,485,242);
        bloque117.setLocation(476,218);
        Bloque1 bloque118 = new Bloque1();
        addObject(bloque118,102,234);
        bloque118.setLocation(97,217);
        bloque118.setLocation(116,231);
        Bloque1 bloque119 = new Bloque1();
        addObject(bloque119,547,128);
        bloque119.setLocation(539,122);
    }
}
