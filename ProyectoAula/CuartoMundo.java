import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoMundo extends Mundo
{

    /**
     * Constructor for objects of class CuartoMundo.
     * 
     */
    public CuartoMundo()
    {
        super();
        setBackground(new GreenfootImage("fondo_4.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_mundo_4.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Graffiti4 graffiti4 = new Graffiti4();
        addObject(graffiti4,535,35);
        graffiti4.setLocation(528,28);
        Bloque1 bloque1 = new Bloque1();
        addObject(bloque1,195,487);
        Bloque1 bloque12 = new Bloque1();
        addObject(bloque12,262,483);
        Bloque1 bloque13 = new Bloque1();
        addObject(bloque13,329,483);
        bloque12.setLocation(236,487);
        bloque13.setLocation(277,487);
        Bloque1 bloque14 = new Bloque1();
        addObject(bloque14,160,452);
        bloque14.setLocation(154,447);
        Bloque1 bloque15 = new Bloque1();
        addObject(bloque15,118,416);
        bloque15.setLocation(111,408);
        bloque15.setLocation(112,445);
        bloque15.setLocation(113,446);
        bloque15.setLocation(112,447);
        Bloque1 bloque16 = new Bloque1();
        addObject(bloque16,53,380);
        Bloque1 bloque17 = new Bloque1();
        addObject(bloque17,144,297);
        bloque17.setLocation(136,305);
        Bloque1 bloque18 = new Bloque1();
        addObject(bloque18,45,258);
        bloque16.setLocation(63,379);
        Bloque1 bloque19 = new Bloque1();
        addObject(bloque19,24,194);
        bloque19.setLocation(119,185);
        bloque19.setLocation(98,196);
        bloque19.setLocation(210,246);
        Bloque1 bloque110 = new Bloque1();
        addObject(bloque110,289,316);
        bloque110.setLocation(274,303);
        Bloque1 bloque111 = new Bloque1();
        addObject(bloque111,303,353);
        bloque111.setLocation(296,344);
        Bloque1 bloque112 = new Bloque1();
        addObject(bloque112,402,350);
        bloque112.setLocation(384,345);
        Bloque1 bloque113 = new Bloque1();
        addObject(bloque113,451,276);
        bloque113.setLocation(444,273);
        Bloque1 bloque114 = new Bloque1();
        addObject(bloque114,520,200);
        bloque114.setLocation(511,207);
        Bloque1 bloque115 = new Bloque1();
        addObject(bloque115,581,151);
        bloque115.setLocation(570,147);
        bloque110.setLocation(252,286);
        bloque111.setLocation(294,327);
        Bloque1 bloque116 = new Bloque1();
        addObject(bloque116,476,81);
        bloque116.setLocation(470,76);
        graffiti4.setLocation(95,66);
        Bloque1 bloque117 = new Bloque1();
        addObject(bloque117,438,78);
        bloque117.setLocation(429,76);
        Bloque1 bloque118 = new Bloque1();
        addObject(bloque118,395,126);
        bloque118.setLocation(342,129);
        bloque118.setLocation(348,129);
        Bloque1 bloque119 = new Bloque1();
        addObject(bloque119,268,69);
        bloque119.setLocation(268,65);
        Bloque1 bloque120 = new Bloque1();
        addObject(bloque120,212,130);
        bloque120.setLocation(209,126);
        bloque120.setLocation(181,109);
        graffiti4.setLocation(76,44);
        Bloque1 bloque121 = new Bloque1();
        addObject(bloque121,86,91);
        bloque121.setLocation(73,90);
        bloque17.setLocation(149,305);
        bloque18.setLocation(23,256);
        bloque120.setLocation(181,95);
        bloque118.setLocation(346,117);
        Bloque1 bloque122 = new Bloque1();
        addObject(bloque122,36,94);
        bloque122.setLocation(21,89);
        bloque122.setLocation(20,89);
        bloque121.setLocation(60,89);
        Bloque1 bloque123 = new Bloque1();
        addObject(bloque123,107,96);
        bloque123.setLocation(102,89);
        graffiti4.setLocation(62,44);
        bloque118.setLocation(348,74);
    }
}
