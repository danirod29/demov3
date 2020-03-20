package personajeCompleto;

import java.awt.Graphics;

import elementosEscenario_Composite.DibujoEspecifico;
import elementosEscenario_Composite.DibujoEspecificoArbol;
import formasDeAtaqueStrategy.EstrategiaAtaque;
import formasDeAtaqueStrategy.EstrategiaDefensa;
import formasDeAtaqueStrategy.EstrategiaPoderOculto;
import formasDeAtaqueStrategy.EstrategiaVillano;

public class PersonajeOgro extends PersonajeAnimado{
	protected EstrategiaVillano ataquePersonaje = null;
	protected static final int ANCHO = 80;
	protected static final int ALTO = 80;
	
	public PersonajeOgro() {
		this.tipoPersonaje = "Ogro";
		
	}
	
	public void atacar(Graphics g) {	
		//ataquePersonaje.numImgMover = ataquePersonaje.numImgMover +1;
		ataquePersonaje.dibujarComponente(g);
		//ataquePersonaje.numImgMover = ataquePersonaje.numImgMover -1;
			
	}
	
	public void estadoPersonaje(PersonajeAnimado enemigo) {
		if(enemigo.posicionX<-65 && enemigo.posicionX>-90) {
			ataquePersonaje = new EstrategiaAtaque(tipoPersonaje);
		}else if(enemigo.posicionX<-90) {
			ataquePersonaje = new EstrategiaPoderOculto(tipoPersonaje);
		}else{
		ataquePersonaje = new EstrategiaDefensa(tipoPersonaje);
		}
	}
	
	

	
	@Override
	public PersonajeAnimado clonarPer() {
		PersonajeAnimado miClonMago = new PersonajeOgro();
	        return  miClonMago;
	}

}
