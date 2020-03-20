package plantillas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import elementosEscenario_Composite.DibujoComponente;
import elementosEscenario_Composite.DibujoEspecifico;

public abstract class PlantillaCreacionImagenes {
	//Clases(Que heredan)
	/*DibujoEspecifico (elementosEscenario_Composite)
	 * GolperPersonaje (partesPersonaje)
	 * MoverMago (partesPersonaje)
	 * MuertePersonaje (partesPersonaje)
	 */
	
	//Atributos
    protected int posicionX;
    protected int posicionY;
    protected int ancho;
    protected int alto;
    protected File ubicacion;
    protected Image imgDibujo;
    protected String nombreImg;
   
    //Sobrecarga de constructores
    public PlantillaCreacionImagenes() {	
    }
    
    public PlantillaCreacionImagenes(String nombreImg, int ancho, int alto){
   	this.nombreImg = nombreImg;
   	this.ancho = ancho;
   	this.alto = alto;   
   }
    
   
   //Permite asignar el tamaño de la img
   public void asignarUbicacion(int posicionX, int posicionY) {
       this.posicionX = posicionX;
       this.posicionY = posicionY;
   }
   
   public abstract Image getImagenMov();
   
   public abstract void dibujarComponente(Graphics g);
   
   
   //------------------------------------------------------------------------
   //Metodos getter
	public int getPosicionX() {
		return posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}


	public Image getImgDibujo() {
		return imgDibujo;
	}
	//------------------------------------------------------------------------
	//Metodos getter

}
