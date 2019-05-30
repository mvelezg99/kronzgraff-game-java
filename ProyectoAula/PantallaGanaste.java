import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaGanaste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaGanaste extends World
{

    protected GreenfootSound sonidoDeFondo;
    /**
     * Constructor for objects of class PantallaPerdiste.
     * 
     */
    public PantallaGanaste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        setBackground(new GreenfootImage("fondo_ganaste.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_ganaste.mp3");
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
        Ganaste ganaste = new Ganaste();
        addObject(ganaste,312,69);
        ganaste.setLocation(308,53);
        Volver3 volver3 = new Volver3();
        addObject(volver3,120,564);
        volver3.setLocation(113,559);
    }
    
     /**
     * Reproduce un sonido de fondo que se escuchará mientras la pantalla de inicio esté activa
     * 
     * pre: sonidoDeFondo debe estar inicializado !=null; <>null
     */
    private void reproducirSonidoDeFondo() {
        sonidoDeFondo.playLoop();
    }
    
    public void act(){
        if(!sonidoDeFondo.isPlaying()){
            reproducirSonidoDeFondo();
        }
    }
}
