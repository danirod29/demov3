package elementosEscenario_Composite;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import plantillas.PlantillaCreacionImagenes;

/**
 *
 * @author Cristian
 */
public abstract class DibujoEspecifico extends PlantillaCreacionImagenes implements DibujoComponente{
    //Atributos
     protected DibujoEspecifico miDibujoCopia;
    
     //Constructor
     public DibujoEspecifico() {	
     }
     
//Metodos heredados(PlantillaCreacionDeImagenes)
     
    //InicializaLaCreaCionDeImagenes--------------------------------------------------------
    public Image getImagenMov(){
        //Asigna la ruta de la imagen
        ubicacion = new File("src/elementosEscenarioImagen/"+nombreImg+".png");
        //Crea la imagen con las especificaciones necesarias
        try {
            imgDibujo = ImageIO.read(ubicacion);
        } catch (IOException ex) {
            System.out.println(nombreImg+" NO ENCONTRADA");
        }
        return imgDibujo;
    }  
    
    //DibujaLaImagen-------------------------------------------------------------------------
    @Override
	public void dibujarComponente(Graphics g) {
		g.drawImage(this.getImagenMov(), posicionX, posicionY, ancho, alto, null);
	}
    
    
    //----------------------------------------------------------------------------------------
    //Metodos heredados
    
    @Override
    public  abstract DibujoEspecifico copiarDibujoComponente();

    @Override
    public void agregarElementoDibujo(DibujoComponente dc) {
    }
}
