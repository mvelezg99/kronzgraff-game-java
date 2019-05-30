import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Volver extends Actor
{
    /**
     * Regresa a la pantalla de Inicio
     * 
     * pre: Se debe haber dado clic en el botón volver
     */
    public void abrirPantallaDeInicio(){
        if(seDioClicEnVolver()){
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
     * Verifica si se dio clic sobre el botón volver
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
        abrirPantallaDeInicio();
    }    
}


