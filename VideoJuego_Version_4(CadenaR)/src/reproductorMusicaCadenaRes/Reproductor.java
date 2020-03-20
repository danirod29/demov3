package reproductorMusicaCadenaRes;



public abstract class Reproductor {
	Reproductor siguiente;
	
	public Reproductor getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Reproductor siguiente) {
		this.siguiente = siguiente;
	}

	public abstract void reproducir(int op);

}

