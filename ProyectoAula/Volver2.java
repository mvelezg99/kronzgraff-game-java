import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Volver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Volver2 extends Actor
{
    
     /**
     * Regresa a la pantalla de Inicio
     * 
     * pre: Se debe haber dado clic en el botón volver
     */
    public void volverInicio(){
        if(seDioClicEnVolver()){
            PantallaPerdiste pantalla = getWorldOfType(PantallaPerdiste.class);
            pantalla.detenerSonidoDeFondo();
            
            cargarPantallaDeInicio();
        }
    }
    
    /**
     * Carga la pantalla de inicio
     */
    private void cargarPantallaDeInicio(){
       Greenfoot.setWorld(new PantallaDeInicio());
    }
    
    /**
     * Verifica si se dio clic sobre el botón Volver
     * 
     * @return TRUE si se dio clic, FALSE en caso contrario
     */
    private boolean seDioClicEnVolver(){
        return Greenfoot.mouseClicked(this);
    }
    
    /**
     * Act - do whatever the MenuInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        volverInicio();
    }    
} 

