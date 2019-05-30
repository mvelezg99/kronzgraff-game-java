import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrimerMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimerMundo extends Mundo
{

    /**
     * Constructor for objects of class PrimerMundo.
     * 
     */
    public PrimerMundo()
    {
        super();
        setBackground(new GreenfootImage("fondo_1.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_mundo_1.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Graffiti1 graffiti = new Graffiti1();
        addObject(graffiti,507,59);
        graffiti.setLocation(500,43);
        Bloque1 bloque12 = new Bloque1();
        addObject(bloque12,69,496);
        bloque12.setLocation(60,489);
        Bloque1 bloque13 = new Bloque1();
        addObject(bloque13,170,420);
        Bloque1 bloque14 = new Bloque1();
        addObject(bloque14,219,428);
        bloque14.setLocation(212,420);
        Bloque1 bloque15 = new Bloque1();
        addObject(bloque15,260,427);
        bloque15.setLocation(253,420);
        Bloque1 bloque16 = new Bloque1();
        addObject(bloque16,344,351);
        Bloque1 bloque17 = new Bloque1();
        addObject(bloque17,394,357);
        bloque17.setLocation(385,351);
        Bloque1 bloque18 = new Bloque1();
        addObject(bloque18,435,358);
        bloque18.setLocation(426,351);
        bloque18.setLocation(474,415);
        Bloque1 bloque19 = new Bloque1();
        addObject(bloque19,552,318);
        bloque19.setLocation(545,313);
        Bloque1 bloque110 = new Bloque1();
        addObject(bloque110,592,320);
        bloque110.setLocation(579,247);
        Bloque1 bloque111 = new Bloque1();
        addObject(bloque111,516,208);
        bloque110.setLocation(577,251);
        bloque111.setLocation(503,214);
        bloque111.setLocation(469,250);
        bloque110.setLocation(425,250);
        bloque111.setLocation(462,172);
        bloque110.setLocation(422,172);
        bloque111.setLocation(470,248);
        bloque110.setLocation(428,207);
        bloque110.setLocation(522,190);
        bloque110.setLocation(396,190);
        bloque110.setLocation(394,192);
        bloque111.setLocation(468,247);
        bloque110.setLocation(387,213);
        bloque110.setLocation(386,215);
        bloque110.setLocation(379,215);
        bloque110.setLocation(373,216);
        bloque111.setLocation(464,249);
        bloque111.setLocation(482,231);
        bloque110.setLocation(421,180);
        bloque111.setLocation(473,233);
        bloque110.setLocation(403,182);
        bloque111.setLocation(174,285);
        bloque111.setLocation(273,249);
        bloque110.setLocation(232,248);
        bloque110.setLocation(232,249);
        Bloque1 bloque112 = new Bloque1();
        addObject(bloque112,586,319);
        bloque112.setLocation(578,313);
        bloque19.setLocation(536,313);
        bloque111.setLocation(379,247);
        bloque110.setLocation(300,187);
        bloque111.setLocation(344,239);
        bloque110.setLocation(301,198);
        bloque110.setLocation(340,195);
        bloque110.setLocation(310,155);
        bloque111.setLocation(410,237);
        bloque110.setLocation(452,237);
        bloque110.setLocation(451,237);
        bloque18.setLocation(328,163);
        bloque18.setLocation(314,236);
        bloque18.setLocation(579,97);
        Bloque1 bloque113 = new Bloque1();
        addObject(bloque113,545,105);
        bloque113.setLocation(538,97);
        Bloque1 bloque114 = new Bloque1();
        addObject(bloque114,503,103);
        bloque114.setLocation(496,97);
        Bloque1 bloque115 = new Bloque1();
        addObject(bloque115,460,101);
        bloque115.setLocation(455,97);
        Bloque1 bloque116 = new Bloque1();
        addObject(bloque116,421,102);
        bloque116.setLocation(413,97);
        Bloque1 bloque117 = new Bloque1();
        addObject(bloque117,376,105);
        bloque117.setLocation(372,97);
        bloque117.setLocation(294,202);
        bloque117.setLocation(174,216);
        bloque110.setLocation(298,232);
        bloque117.setLocation(255,232);
        bloque111.setLocation(213,232);
        bloque117.setLocation(214,156);
        bloque110.setLocation(260,172);
        bloque110.setLocation(290,224);
        bloque111.setLocation(121,177);
        bloque110.setLocation(237,278);
        bloque111.setLocation(324,137);
        Bloque1 bloque118 = new Bloque1();
        addObject(bloque118,459,226);
        bloque12.setLocation(73,486);
    }
}
