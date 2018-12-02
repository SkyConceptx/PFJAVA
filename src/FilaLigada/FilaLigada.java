package FilaLigada;

public class FilaLigada{	
	
	private Celula fim;
	private int qtde;
	private Celula inicio;
	


	public int size() {
		return this.qtde;
	}


	public Object dequeue() {
		Celula retirado = this.fim;
		Celula atual = this.inicio;
		if (qtde > 0) {	
		this.inicio = atual.getProximo();
		this.qtde--;
		return retirado;
		}
		else {
			return null;
		}
	}	


	public void enqueue(String chave) {
		Celula novo = new Celula(chave);
		if(this.qtde==0) {
			this.inicio = novo;
			this.fim = novo;
		}
		else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
		this.qtde++;
	}
	
	public String PegarChave(int numero) {
		Celula atual = this.inicio;
		String chave = (String)atual.getElemento();
		
		for(int i=0; i<=numero;i++) {
		if (i > this.qtde) {
			return null;
		}
		chave = (String)atual.getElemento();
		atual = atual.getProximo();	
		}
		return chave;
	}

	
	public Object[] toArray() {
		Object[] elementos = new Object[this.qtde];
		Celula atual = this.inicio;
		
		for(int i=0; i<this.qtde;i++) {
		if (i > this.qtde) {
			return null;
		}
		elementos[i] = atual.getElemento();
		atual = atual.getProximo();	
		}
		return elementos;
	}
}
