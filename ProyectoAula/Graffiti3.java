import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Graffiti3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graffiti3 extends Actor
{
    private int contadorEspera;
    public static final int INTERVALO_ESPERA=10;
    
    public boolean tienePersonajeAlCentro(){
        Actor objeto;
        objeto = getOneObjectAtOffset(0,0,Graffitero.class);
        if (objeto !=null){
            return true;
        }else {
            return false;
        }
    }    
    
    public void pintarGraffiti(){
        setImage("graffiti3Pintado.png");
        
    }
    
    public void pasarMundo3(){
        Greenfoot.setWorld(new CuartoMundo());
        TercerMundo mundo = getWorldOfType(TercerMundo.class);
        mundo.detenerSonidoDeFondo();
    }
    
    public void esperar(){
        if (contadorEspera>=INTERVALO_ESPERA){
            pasarMundo3();
        } else {
            contadorEspera++;
        }
    }
    
    
    
    /**
     * Act - do whatever the Graffiti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (tienePersonajeAlCentro()){
            pintarGraffiti();
            esperar();
        }
    }  
}
