package partesPersonaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;

import plantillas.PlantillaCreacionImagenes;

public abstract class GolpePersonaje extends PlantillaCreacionImagenes{
	
	//Atributos 
	protected Image imgGolpe;
	//Almacenara los valores numericos de las imagenes
	protected int numImgMover = 1;
	protected int acumulador = 0;

	//Constructor		
	public GolpePersonaje() {
		
	}
	
	//Inicializa la img del personaje
	public Image getImagenMov() {
		ubicacion = new File("src/partesPersonajeImagenes/"
							+nombreImg+numImgMover+".png");		
			try {
				imgGolpe = ImageIO.read(ubicacion);
			} catch (IOException e) {
				System.out.println("No encontrada "+nombreImg);
			}
		return imgGolpe;
	} 

	//Metodos abstractos posición-golpe del personaje
	public abstract void golpeConArmaIz();
    public abstract void golpeConArmaDe();
    public abstract void golpeConArmaEspalda();
    public abstract void golpeConArmaFrontal();
    public abstract void dibujarComponente(Graphics g);

}
