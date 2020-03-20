package personajeCompleto;

import java.awt.Graphics;

import javax.swing.text.Position;

import partesPersonaje.*;

public abstract class PersonajeAnimado {
	//Atributos
	protected int posicionX, posicionY;
	//Partes del personajeAnimado
    protected MoverPersonaje miMovPersonaje;
    protected GolpePersonaje miGolPersonaje;
    protected MuertePersonaje miMuertePersonaje;
    protected String tecla = "";
    protected String tipoPersonaje;
    
    //Constructor
    public PersonajeAnimado() {

    }
    //Metodos
    public void asignarPosicion(int posicionX, int posicionY) {
    	this.posicionX = posicionX;
    	this.posicionY = posicionY;
    	miMovPersonaje.asignarUbicacion(posicionX, posicionY);
    	miGolPersonaje.asignarUbicacion(posicionX, posicionY);
    	miMuertePersonaje.asignarUbicacion(posicionX, posicionY);
    }
    //.................................................. 
    //Se instancian las partes del personaje
    
    public void asigMovPer(MoverPersonaje miMovPersonaje){
        this.miMovPersonaje = miMovPersonaje;
    }
    
    public void asigGolPer(GolpePersonaje miGolPersonaje){
        this.miGolPersonaje = miGolPersonaje;
    }
    
    public void mosMuertePer(MuertePersonaje miMuertePersonaje){
        this.miMuertePersonaje = miMuertePersonaje;
    }
    
    //....................................................
    //Se asigna una acci�n dependiendo pa tecla pulsada
    
    public void asigNumImgAnimacion(String tecla){
    	this.tecla = tecla;
        switch(tecla){
                //Asignacion de golpe
            case "w":
            	miGolPersonaje.golpeConArmaEspalda();
                break;
            case "z":
            	miGolPersonaje.golpeConArmaFrontal();
                break;
            case "a":
            	miGolPersonaje.golpeConArmaIz();
                break;
            case "s":
                miGolPersonaje.golpeConArmaDe();
                break;
                //Asignacion de desplazamiento
            case "8":
            	miMovPersonaje.moverArriba();
                break;
            case "2":
            	miMovPersonaje.moverAbajo();
                break;
            case "4":
            	miMovPersonaje.moverIzquierda();
                break;
            case "6":
                miMovPersonaje.moverDerecha();
                break;
                //Asignacion de muerte
            case "m" :
            	miMuertePersonaje.aniMuertePer();
                break;
            default:
                System.out.println("No puedo entrar ;(");
                break; 
        }  
    }
    //...................................................
    //Retorna la imagen necesarias dependiendo de la acci�n
    
    public void moverPersonaje(Graphics g) {
    	miMovPersonaje.dibujarComponente(g);	
    	asignarPosicion(miMovPersonaje.getPosicionX(), miMovPersonaje.getPosicionY());;
    }
    
    public void atacarPersonaje(Graphics g) {
    	miGolPersonaje.dibujarComponente(g);
    	asignarPosicion(miGolPersonaje.getPosicionX(),miGolPersonaje.getPosicionY());    	
    }
    
    public void morirPersonaje(Graphics g) {
    	miMuertePersonaje.dibujarComponente(g);
    	asignarPosicion(miMuertePersonaje.getPosicionX(),miMuertePersonaje.getPosicionY());
    }
    //..............................................
    //Metodo abstracto
	public abstract PersonajeAnimado clonarPer();
	//...............................................
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	
	
}
