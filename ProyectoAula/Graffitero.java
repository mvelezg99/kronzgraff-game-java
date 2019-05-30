import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graffitero extends Actor
{
    private int contadorIteracionesAnimacion;
    private int indiceAnimacionDerecha;
    private int indiceAnimacionIzquierda;
    
    public int velocidadY;
    
    private static final int VELOCIDAD_X = 2;
    private static final int CANTIDAD_IMAGENES_ANIMACION=8;
    private static final int INTERVALO_ANIMACION=10;
    
    
    private static final int FUERZA_SALTO_NORMAL = 16;
    private static final int ACELERACION = 1;
    
    private static final int VELOCIDAD_DESPUES_DE_CHOQUE = 5;
    
    
    
    private boolean estabaMoviendoADerecha;
    
    private GreenfootImage[] imagenesAnimacionDerecha;
    private GreenfootImage[] imagenesAnimacionIzquierda;
    private GreenfootImage imagenParadoDerecha;
    private GreenfootImage imagenParadoIzquierda;
    
    public Graffitero() {
        inicializarImagenes();
        estabaMoviendoADerecha=true;
    }
    
    /**
     * Inicializa las imágenes para la animación de movimiento.
     * 
     * post: Los arreglos de las imágenes quedan inicializados
     */
    private void inicializarImagenes(){
        imagenesAnimacionDerecha = new GreenfootImage[CANTIDAD_IMAGENES_ANIMACION];
        imagenesAnimacionIzquierda = new GreenfootImage[CANTIDAD_IMAGENES_ANIMACION];
        
        for(int i=0; i < CANTIDAD_IMAGENES_ANIMACION; i++){
            imagenesAnimacionDerecha[i] = new GreenfootImage("run_" + i + ".png");
            imagenesAnimacionIzquierda[i] = new GreenfootImage("run_" + i + ".png");
            imagenesAnimacionIzquierda[i].mirrorHorizontally();
            
        }
        
        imagenParadoDerecha = new GreenfootImage("Perso.png");
        imagenParadoIzquierda = new GreenfootImage("Perso.png");
        imagenParadoIzquierda.mirrorHorizontally();
        
    }
    
    /**
     * Implementa el requisito R02 - Mover al personaje
     */
    public void mover(){
        if(estaPresionadaLaTeclaLeft() && !estaAlBordeIzquierdo()){
            moverAIzquierda();
            estabaMoviendoADerecha = false;
        }else if(estaPresionadaLaTeclaRight() && !estaAlBordeDerecho()){
            moverADerecha();
            estabaMoviendoADerecha = true;
        }else {
            if (estabaMoviendoADerecha){
                setImage(imagenParadoDerecha);
            } else {
                setImage(imagenParadoIzquierda);
            }
            
            contadorIteracionesAnimacion=0;
            indiceAnimacionDerecha=0;
            indiceAnimacionIzquierda=0;
            
    
        }
    }
    
     /**
     * Implementacion del requisito R03 - Hacer saltar al personaje
     */
    public void saltar(){
        if ((estaPresionadaLaTeclaUp()) && (estaSobrePlataforma())){
            hacerSalto();
        }
    }
    
     /**
     * Hace que el personaje se eleve con una fuerza de salto normal
     */
    public void hacerSalto(){
        velocidadY = -FUERZA_SALTO_NORMAL;
        setLocation(getX(), getY() + velocidadY);
    }
    
    /**
     * Corrige la posición vertical del personaje cuando colisiona con una plataforma tanto arriba como abajo
     * 
     * @param plataformaAbajo cuando es TRUE, indica que la correción se debe hacer con base en una plataforma que se encuentra abajo del personaje. Cuando es FALSE es porque la 
     *                        plataforma se encuentra arriba
     */
    private void corregirPosicionVertical(boolean plataformaAbajo){
        int dy =  getImage().getHeight()/2 +1;
        dy = plataformaAbajo ? dy : -dy;
        
        Actor objeto = getOneObjectAtOffset(0, dy, Plataforma.class);
        if (objeto != null) {
            int h1 = getImage().getHeight();
            int h2 = objeto.getImage().getHeight();
            int nuevoY = plataformaAbajo ? objeto.getY() - ((h1+h2)/2) : objeto.getY() + ((h1+h2)/2);
            setLocation (getX(),nuevoY);
            
        }

        
    }
    
    /**
     * Hace que el personaje caiga verticalmente
     */
    public void caer(){
        if (estaSobrePlataforma()){
            velocidadY = 0;
            corregirPosicionVertical(true);
        }else {
            if (tienePlataformaArriba()){
                velocidadY=VELOCIDAD_DESPUES_DE_CHOQUE;
                corregirPosicionVertical(false);
            }
            velocidadY += ACELERACION;
            setLocation(getX(), getY() + velocidadY);
            
        }
    }
    
    /**
     * Verifica si la tecla up está presionada
     * 
     * @return TRUE si la tecla up está presionada, FALSE de lo contrario
     */
    private boolean estaPresionadaLaTeclaUp(){
        return Greenfoot.isKeyDown("up");
    }
    
    /**
     * Verifica si el personaje tiene una plataforma arriba
     * 
     * @return TRUE si hay una plataforma arriba del personaje, FALSE en caso contrario
     */
    public boolean tienePlataformaArriba(){
        int dx=getImage().getWidth()/2-7;
        int dy = getImage().getHeight()/2+1;
    
        Actor objeto;
        objeto = getOneObjectAtOffset(0,-dy,Plataforma.class);
        
        if (objeto !=null){
            return true;
        } else {
            objeto = getOneObjectAtOffset(dx,-dy,Plataforma.class);
            if (objeto != null){
                return true;
            } else {
                objeto = getOneObjectAtOffset (-dx,-dy, Plataforma.class);
                if (objeto != null){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Verifica si el personaje se encuentra parado sobre una plataforma
     * 
     * @return TRUE si se encuentra sobre plataforma, FALSE en caso contrario
     */
    private boolean estaSobrePlataforma(){
        int dx = getImage().getWidth()/2 - 7;
        int dy = getImage().getHeight()/2 + 1;
        
        Actor objeto;
        objeto = getOneObjectAtOffset(0, dy, Plataforma.class);
        if (objeto != null) {
            return true;
        } else {
            objeto = getOneObjectAtOffset(dx, dy, Plataforma.class);
            if (objeto != null){
                return true;
            } else {
                objeto = getOneObjectAtOffset(-dx, dy, Plataforma.class);
                if (objeto != null){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Verifica si el usuario presionó la tecla left
     * 
     * @return true si la tecla left está presionada, false en caso contrario
     */
    private boolean estaPresionadaLaTeclaLeft(){
        return Greenfoot.isKeyDown("left");
    }
    
     /**
     * Verifica si el personaje se encuentra en el borde izquierdo del mundo
     * 
     * @return true si el personaje está en el borde izquierdo, false en caso contrario
     */
    private boolean estaAlBordeIzquierdo(){
        int x = getX();
        int ancho = getImage().getWidth();
        return x <= ancho/2;
    }
    
    /**
     * Mueve al personaje hacia la izquierda, disminuyendo su posición en X
     */
    private void moverAIzquierda(){
        if(!tienePlataformaAIzquierda()){
        setLocation(getX() - VELOCIDAD_X, getY());
        animarMovimientoAIzquierda();
       }
    }
    
    /**
     * Verifica si el personaje tiene una plataforma a su lado Izquierdo
     * 
     * @return Retorna TRUE si tiene una plataforma a la izquierda, FALSE de lo contrario
     */
    private boolean tienePlataformaAIzquierda(){
        int dx=getImage().getWidth()/2+1;
        int dy = getImage().getHeight()/2 - 7;
        
        Actor objeto;
        
        objeto = getOneObjectAtOffset(-dx,0,Plataforma.class);
        
        if (objeto !=null){
            return true;
        } else {
            objeto = getOneObjectAtOffset(-dx,dy,Plataforma.class);
            if (objeto != null){
                return true;
            } else {
                objeto = getOneObjectAtOffset (-dx,-dy, Plataforma.class);
                if (objeto != null){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Verifica si el personaje tiene una plataforma a su lado derecho
     * 
     * @return Retorna TRUE si tiene una plataforma a la derecha, FALSE de lo contrario
     */
    private boolean tienePlataformaADerecha(){
        int dx=getImage().getWidth()/2+1;
        int dy = getImage().getHeight()/2-7;
        
        Actor objeto;
        
        objeto = getOneObjectAtOffset(dx,0,Plataforma.class);
        
        if (objeto !=null){
            return true;
        } else {
            objeto = getOneObjectAtOffset(dx,dy,Plataforma.class);
            if (objeto != null){
                return true;
            } else {
                objeto = getOneObjectAtOffset (dx,-dy, Plataforma.class);
                if (objeto != null){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Verifica si el usuario presionó la tecla right
     * 
     * @return true si la tecla right está presionada, false en caso contrario
     */
    private boolean estaPresionadaLaTeclaRight(){
        return Greenfoot.isKeyDown("right");
    }
    
     /**
     * Verifica si el personaje se encuentra en el borde derecho del mundo
     * 
     * @return true si el personaje está en el borde derecho, false en caso contrario
     */
    private boolean estaAlBordeDerecho(){
        int x = getX();
        int ancho = getImage().getWidth();
        int anchoMundo = getWorld().getWidth();
        return x >= anchoMundo - ancho/2;
    }
    
    /**
     * Mueve al personaje hacia la derecha, aumentando su posición en X
     */
    private void moverADerecha(){
        if(!tienePlataformaADerecha()){
        setLocation(getX() + VELOCIDAD_X, getY());
        animarMovimientoADerecha();
        }
    }
    
     /**
     * Anima el movimiento del personaje a la derecha con una secuencia de imágenes
     */
    private void animarMovimientoADerecha(){
        if (contadorIteracionesAnimacion >= INTERVALO_ANIMACION) {
            setImage(imagenesAnimacionDerecha[indiceAnimacionDerecha]);
            indiceAnimacionDerecha++;
            
            if(indiceAnimacionDerecha == CANTIDAD_IMAGENES_ANIMACION){
                indiceAnimacionDerecha = 0;
            }
            
            contadorIteracionesAnimacion=0;
            
        } else{
            contadorIteracionesAnimacion++;
        }
    }
    
    /**
     * Anima el movimiento del personaje a la izquierda con una secuencia de imágenes
     */
    private void animarMovimientoAIzquierda(){
          if (contadorIteracionesAnimacion >= INTERVALO_ANIMACION) {
            setImage(imagenesAnimacionIzquierda[indiceAnimacionIzquierda]);
            indiceAnimacionIzquierda++;
            
            if(indiceAnimacionIzquierda == CANTIDAD_IMAGENES_ANIMACION){
                indiceAnimacionIzquierda = 0;
            }
            
            contadorIteracionesAnimacion=0;
            
        } else{
            contadorIteracionesAnimacion++;
        }
    }

        public void act() 
    {
        // Add your action code here.
        mover();
        saltar();
        caer();
    }   
    
}