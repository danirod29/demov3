package Main;

import vistas.VentanaBosque;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

import elementosEscenario_Composite.DibujoEspecificoArbol;
import reproductorMusicaCadenaRes.Reproductor;
import reproductorMusicaCadenaRes.ReproductorMp3;
import reproductorMusicaCadenaRes.ReproductorWav;
import reproductorMusicaCadenaRes.Reproductordefault;

import javax.swing.JComponent;


/**
 *
 * @author Cristian
 */
public class InicioJuego {
    public static void main(String[] args) {
    	Reproductor rep[] = new Reproductor[3];

		rep[0] = new ReproductorMp3();
		rep[1] = new ReproductorWav();
		rep[2] = new Reproductordefault();

		VentanaBosque jfInicio = new VentanaBosque();
		jfInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfInicio.setVisible(true);

		for (int i = 0; i < rep.length - 1; i++) {
			rep[i].setSiguiente(rep[i + 1]);
		}

		long cont = System.nanoTime();
		while (true) {

			
			if (System.nanoTime() >= cont) {
				rep[0].reproducir(1);
				cont=System.nanoTime()+cont;
				
			}
			else {
				rep[0].reproducir(2);
				cont=System.nanoTime();
			}

		}       
    }
}