import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInicio extends Actor
{
    /**
     * Requisito R01: Iniciar juego
     */
    public void iniciarJuego(){
        if(seDioClicEnIniciar()){
            PantallaDeInicio pantalla = getWorldOfType(PantallaDeInicio.class);
            pantalla.detenerSonidoDeFondo();
            
            cargarPrimerMundo();
        }
    }
    
    /**
     * Carga el primer mundo del juego
     */
    private void cargarPrimerMundo(){
       Greenfoot.setWorld(new PrimerMundo());
    }
    
    /**
     * Verifica si se dio clic sobre el menu inicio
     * 
     * @return TRUE si se dio clic, FALSE en caso contrario
     */
    private boolean seDioClicEnIniciar(){
        return Greenfoot.mouseClicked(this);
    }
    
    /**
     * Act - do whatever the MenuInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        iniciarJuego();
    }    
}
