package catalogo;

import ListaLigada.Celula;

public class catalogo {
	
	private Celula inicio;
	private Celula fim;
	private int qtde;
		
	public boolean NovoJogo(String nome, int ano, String genero) {
		jogo obj = new jogo(nome, ano, genero);
		Celula novo = new Celula(obj);
		
		if(this.qtde == 0) {
			this.inicio = novo;
			this.fim = novo;
		}
		else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
		this.qtde++;
		return true;
	}
	
	
	public Object get(int pos) {
		if (pos > this.qtde) 
			return null;
			
		Celula atual = this.inicio;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		
		return atual.getElemento();
	}

	public Object remove(int pos) {
		Celula removido;
		if (pos == 0) {
			removido = this.inicio;
			this.inicio.setProximo(this.inicio.getProximo());
			
			if (this.qtde == 1)
				this.fim = null;
		}
		else if (pos <= this.qtde - 1) {
			Celula atual = this.inicio;
			for (int i = 0; i < pos - 1; i++) {
				atual = atual.getProximo();
			}
			
			removido = atual.getProximo();
			atual.setProximo(removido.getProximo());
			
			if (pos == this.qtde - 1)
				this.fim = atual;
		}
		else {
			return null;
		}
		
		this.qtde--;
		return removido.getElemento();
	}
}	
