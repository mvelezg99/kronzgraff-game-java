import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Actor
{
     /**
     * Abre la pantalla de Creditos del juego
     * 
     * pre: Se debe haber dado clic en el botón Creditos
     */
    public void abrirCreditos(){
        if(seDioClicEnCreditos()){
            PantallaDeInicio pantalla = getWorldOfType(PantallaDeInicio.class);
            pantalla.detenerSonidoDeFondo();
            cargarPantallaCreditos();
        }
    }
    
    /**
     * Carga el primer mundo del juego
     */
    private void cargarPantallaCreditos(){
       Greenfoot.setWorld(new PantallaCreditos());
    }
    
    /**
     * Verifica si se dio clic sobre el menu inicio
     * 
     * @return TRUE si se dio clic, FALSE en caso contrario
     */
    private boolean seDioClicEnCreditos(){
        return Greenfoot.mouseClicked(this);
    }
    
    /**
     * Act - do whatever the MenuInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        abrirCreditos();
    }    
}

