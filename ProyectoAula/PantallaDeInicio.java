import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaDeInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaDeInicio extends World
{

    private GreenfootSound sonidoDeFondo;
    private MenuInicio inicio;
    private Titulo titulo;
    private Instrucciones instrucciones;
    private Creditos creditos;
    /**
     * Crea los objetos de la clase PantallaDeInicio
     */
    public PantallaDeInicio()
    {    
        super(600,600, 1); 
        setBackground(new GreenfootImage("fondo_inicio.jpg"));
        sonidoDeFondo = new GreenfootSound("sonido_inicio.mp3");
        titulo = new Titulo();
        inicio = new MenuInicio();
        instrucciones = new Instrucciones();
        creditos=new Creditos();
        addObject (titulo, 300,50);
        addObject(inicio,135,166);
        addObject(instrucciones,249,252);
        addObject(creditos,169,337);
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


