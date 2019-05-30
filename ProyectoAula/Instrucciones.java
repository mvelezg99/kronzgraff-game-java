import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends Actor
{
    /**
     * Abre la pantalla de Instrucciones del juego
     * 
     * pre: Se debe haber dado clic en el botón Instrucciones
     */
    public void abrirInstrucciones(){
        if(seDioClicEnInstrucciones()){
            PantallaDeInicio pantalla = getWorldOfType(PantallaDeInicio.class);
            pantalla.detenerSonidoDeFondo();
            cargarPantallaInstrucciones();
        }
    }
    
    /**
     * Carga la pantalla Instrucciones
     */
    private void cargarPantallaInstrucciones(){
       Greenfoot.setWorld(new PantallaInstrucciones());
    }
    
    /**
     * Verifica si se dio clic sobre el botón Instrucciones
     * 
     * @return TRUE si se dio clic, FALSE en caso contrario
     */
    private boolean seDioClicEnInstrucciones(){
        return Greenfoot.mouseClicked(this);
    }
    
    /**
     * Act - do whatever the MenuInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        abrirInstrucciones();
    }    
}
