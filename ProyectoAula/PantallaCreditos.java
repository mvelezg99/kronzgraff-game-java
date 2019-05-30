import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaCreditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaCreditos extends World
{

    /**
     * Constructor for objects of class PantallaCreditos.
     * 
     */
    public PantallaCreditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        setBackground(new GreenfootImage("fondo_extra.jpg"));
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Creditos creditos = new Creditos();
        addObject(creditos,315,46);
        Volver volver2 = new Volver();
        addObject(volver2,492,572);
        volver2.setLocation(491,559);
        TextoCreditos textocreditos = new TextoCreditos();
        addObject(textocreditos,306,288);
    }
}
