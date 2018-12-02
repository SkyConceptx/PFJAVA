package FilaLigada;

public class Celula {
	
	private String elemento;
	private Celula proximo;
	
	public Celula(String elemento) {
		this.elemento = elemento;
	}
	
	public Celula(String elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}
	
	

}
