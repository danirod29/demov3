package partesPersonaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import plantillas.PlantillaCreacionImagenes;

public abstract class MoverPersonaje extends PlantillaCreacionImagenes{

	//Atributos 
	protected Image imgMovimiento;
	//Almacenara los valores numericos de las imagenes
	protected int numImgMover = 1;
	protected int acumulador = 0;
		
	//Constructor
	public MoverPersonaje() {	
	}
	
	//Inicializa la img del personaje
	public Image getImagenMov() {
			ubicacion = new File("src/partesPersonajeImagenes/"+nombreImg+numImgMover+".png");
			
			try {
				imgMovimiento = ImageIO.read(ubicacion);
			} catch (IOException e) {
				System.out.println("No encontrada "+nombreImg);
			}
		return imgMovimiento;
	} 
			
	//Metodos abstractos posición del personaje
	public abstract void moverDerecha();
	public abstract void moverIzquierda();
	public abstract void moverArriba();
	public abstract void moverAbajo();
	public abstract void dibujarComponente(Graphics g);
}
