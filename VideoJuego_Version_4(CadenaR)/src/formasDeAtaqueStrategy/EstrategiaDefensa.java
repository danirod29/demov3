package formasDeAtaqueStrategy;

import java.awt.Graphics;

public class EstrategiaDefensa extends EstrategiaVillano {
	
	

	public EstrategiaDefensa(String nombreImg) {
		super(nombreImg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarAccion() {
		if(acumulador == 0) {
			numImgMover = 1;
			acumulador ++;
		}else {
			numImgMover = 0;
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
