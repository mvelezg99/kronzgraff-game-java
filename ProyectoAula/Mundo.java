import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    
    protected int tiempo;
    protected Graffiti1 graffiti;
    protected Graffitero graffitero;
    
    protected int contadorTiempo;
    public static final int INTERVALO_TIEMPO=60;
    
    protected GreenfootSound sonidoDeFondo;
    
    
    /**
     * Crea las instancias de la clase Mundo
     * 
     */
    public Mundo()
    {    
        super(600, 600, 1); 
        inicializarObjetos();
        inicializarSuelo();
        tiempo=30;
        showText("Tiempo: "+tiempo , 45, 20);



    }
    
    /**
     * Detiene el sonido de fondo de los mundos
     */
    public void detenerSonidoDeFondo(){
        sonidoDeFondo.stop();
    }
    
    /**
     * Inicializa los elementos que hacen parte del suelo y que aparecen en el borde inferior del mundo
     */
    private void inicializarSuelo(){
        int y = getHeight();
        Bloque1 suelo = new Bloque1();
        int anchoSuelo = suelo.getImage().getWidth();
        int x = anchoSuelo/2;
        
        while (x<=getWidth()){
            addObject(suelo,x,y);
            x += anchoSuelo;
            suelo = new Bloque1();
        }
    }
    
    /**
     * Reproduce un sonido de fondo
     * 
     * pre: sonidoDeFondo debe ser diferente de null
     */
    protected void reproducirSonidoDeFondo(){
        if (!sonidoDeFondo.isPlaying()){
            sonidoDeFondo.playLoop();
        }
    }
    
    /**
     *  Inicializa los objetos que aparecerán en el escenario
     */
    private void inicializarObjetos(){
        graffitero = new Graffitero();
        
        addObject(graffitero,124,550);
    }
    
    /**
     * Se perderá el juego, mostrando una pantalla de "perdiste" 
     * deteniendo el sonido del Mundo actual y reproduciendo 
     * otro sonido
     */
    protected void perderJuego(){
        Greenfoot.setWorld(new PantallaPerdiste());
        sonidoDeFondo.stop();
    }
    
    public void act() {
        reproducirSonidoDeFondo();
                if (contadorTiempo>=INTERVALO_TIEMPO){
            tiempo--;
            showText("Tiempo: "+tiempo , 45, 20);
            contadorTiempo=0;
        } else {
            contadorTiempo++;
        }
        
        if (tiempo==0){
            perderJuego();
        }
        
    }
}
