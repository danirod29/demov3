package formasDeAtaqueStrategy;

import java.awt.Graphics;

import personajeCompleto.PersonajeAnimado;

public class EstrategiaAtaque extends EstrategiaVillano{

	public EstrategiaAtaque(String nombreImg) {
		super(nombreImg);
	}

	@Override
	public void realizarAccion() {
		if(acumulador == 0) {
			numImgMover = 2;
			acumulador ++;
		}else {
			numImgMover = 3;
			acumulador=0;
		}	
		
	}
	 @Override
		public void dibujarComponente(Graphics g) {
	    	realizarAccion();
	    	asignarUbicacion(-20, 0);
			g.drawImage(getImagenMov(), posicionX, posicionY, ancho, alto, null);
			
		}
}
