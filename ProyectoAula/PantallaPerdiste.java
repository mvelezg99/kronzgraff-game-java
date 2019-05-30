import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaPerdiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaPerdiste extends World
{
    protected GreenfootSound sonidoDeFondo;
    /**
     * Constructor for objects of class PantallaPerdiste.
     * 
     */
    public PantallaPerdiste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        setBackground(new GreenfootImage("fondo_perdiste.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_perdiste.mp3");
        prepare();
    }
    
    /**
     * Detiene el sonido de fondo
     * 
     * pre: sonidoDeFondo debe estar inicializado.
     */
    public void detenerSonidoDeFondo(){
        sonidoDeFondo.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Perdiste perdiste = new Perdiste();
        addObject(perdiste,312,69);
        perdiste.setLocation(312,51);
        perdiste.setLocation(308,53);
        Volver2 volver2 = new Volver2();
        addObject(volver2,120,564);
        volver2.setLocation(113,559);
    }
    
    private void reproducirSonidoDeFondo() {
        sonidoDeFondo.playLoop();
    }
    
    public void act(){
        if(!sonidoDeFondo.isPlaying()){
            reproducirSonidoDeFondo();
        }
    }
}
