import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuintoMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuintoMundo extends Mundo
{

    /**
     * Constructor for objects of class QuintoMundo.
     * 
     */
    public QuintoMundo()
    {
        super();
        setBackground(new GreenfootImage("fondo_5.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_mundo_5.mp3");
        prepare();
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Graffiti5 graffiti5 = new Graffiti5();
        addObject(graffiti5,503,48);
        graffiti5.setLocation(507,33);

        Bloque1 bloque1 = new Bloque1();
        addObject(bloque1,72,455);
        bloque1.setLocation(66,471);
        Bloque1 bloque12 = new Bloque1();
        addObject(bloque12,133,398);
        Bloque1 bloque13 = new Bloque1();
        addObject(bloque13,68,291);
        bloque1.setLocation(38,469);
        bloque13.setLocation(26,280);
        Bloque1 bloque14 = new Bloque1();
        addObject(bloque14,123,164);
        Bloque1 bloque15 = new Bloque1();
        addObject(bloque15,181,211);
        bloque15.setLocation(174,203);
        Bloque1 bloque16 = new Bloque1();
        addObject(bloque16,247,310);
        bloque16.setLocation(300,299);
        bloque15.setLocation(186,219);
        bloque12.setLocation(129,367);
        Bloque1 bloque17 = new Bloque1();
        addObject(bloque17,391,396);
        Bloque1 bloque18 = new Bloque1();
        addObject(bloque18,513,311);
        bloque18.setLocation(494,310);
        bloque18.setLocation(508,302);
        Bloque1 bloque19 = new Bloque1();
        addObject(bloque19,583,214);
        bloque19.setLocation(576,216);
        bloque15.setLocation(202,217);
        bloque13.setLocation(26,277);
        bloque14.setLocation(139,224);
        bloque17.setLocation(401,381);
        bloque14.setLocation(128,176);
        Bloque1 bloque110 = new Bloque1();
        addObject(bloque110,523,152);
        bloque110.setLocation(471,155);
        bloque19.setLocation(433,234);
        bloque110.setLocation(365,167);
        bloque19.setLocation(449,196);
        bloque19.setLocation(418,190);
        bloque110.setLocation(345,128);
        bloque19.setLocation(396,186);
        bloque110.setLocation(459,123);
        bloque19.setLocation(570,198);
        bloque110.setLocation(502,83);
    }
}
