import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Graffiti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graffiti1 extends Actor
{
    private int contadorEspera;
    public static final int INTERVALO_ESPERA=10;
    
    /**
     * Verifica si tiene un Actor en su centro
     * 
     * @return TRUE si tiene algún actor en su centro, FALSE en caso contrario
     */
    public boolean tienePersonajeAlCentro(){
        Actor objeto;
        objeto = getOneObjectAtOffset(0,0,Graffitero.class);
        if (objeto !=null){
            return true;
        }else {
            return false;
        }
    }    
    
    /**
     * Pinta el graffiti del mundo cuando el Personaje llega al centro
     * 
     * pre: El personaje debe estar en el centro del graffiti
     */
    public void pintarGraffiti(){
        setImage("graffitiPintado.png");
        
    }
    
    /**
     * Pasa al mundo siguiente
     */
    public void pasarMundo1(){
        Greenfoot.setWorld(new SegundoMundo());
        PrimerMundo mundo = getWorldOfType(PrimerMundo.class);
        mundo.detenerSonidoDeFondo();
    }
    
    /**
     * Espera un momento para que se aprecie el graffiti pintado antes de pasar de mundo
     */
    public void esperar(){
        if (contadorEspera>=INTERVALO_ESPERA){
            pasarMundo1();
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
