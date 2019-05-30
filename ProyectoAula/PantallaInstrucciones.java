import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInstrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInstrucciones extends World
{
    private Instrucciones instrucciones;


    public PantallaInstrucciones()
    {    
        super(600,600, 1); 
        setBackground(new GreenfootImage("fondo_extra.jpg"));
        instrucciones = new Instrucciones();
        addObject(instrucciones,323,39);
        prepare();
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextoInstrucciones textoinstrucciones = new TextoInstrucciones();
        addObject(textoinstrucciones,337,304);
        Volver volver = new Volver();
        addObject(volver,494,563);
    }
}

