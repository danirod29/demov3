package formasDeAtaqueStrategy;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import personajeCompleto.PersonajeAnimado;
import plantillas.PlantillaCreacionImagenes;

public abstract class EstrategiaVillano extends PlantillaCreacionImagenes{
	//Atributos
	protected String tipoPersonaje;	
	public int numImgMover = 1;
	protected int acumulador = 0;
	protected static final int ancho = 350 , alto =350;	
	
	public EstrategiaVillano(String nombreImg) {
		this.nombreImg = nombreImg;	
	}
	
	//Metodos los cuales realizan las acciones---------------------------------
	public abstract void realizarAccion();
	
	
	//InicializaLaCreaCionDeImagenes--------------------------------------------
    public Image getImagenMov(){
        //Asigna la ruta de la imagen
        ubicacion = new File("src/partesPersonajeImagenes/"+nombreImg+numImgMover+".png");
        //Crea la imagen con las especificaciones necesarias
        try {
            imgDibujo = ImageIO.read(ubicacion);
        } catch (IOException ex) {
            System.out.println("NO ENCONTRADA StrategiaVillano");
        }
        return imgDibujo;
    } 
    
    @Override
	public abstract void dibujarComponente(Graphics g);
    

}
