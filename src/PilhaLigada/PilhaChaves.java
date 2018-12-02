package PilhaLigada;

import ListaLigada.Celula;

public class PilhaChaves {
	private Celula topo;
	private int qtde;
	
	public PilhaChaves() {
		this.qtde = 0;
	}


	public boolean isEmpty() {
		return this.qtde == 0;
	}

	public int size() {
		return this.qtde;
	}

	public Object ReembolsarChave() {
		Celula retirado = this.topo;
		
		if ( this.topo != null ) {
			this.topo = this.topo.getProximo();
			this.qtde--;
		}

		return retirado;
	}

	public void add(String chave) {
		Celula novo = new Celula(chave);
		novo.setProximo(this.topo);
		this.topo = novo;
		this.qtde++;
	}
	
	public Object get(int pos) {
		Object[] elementos = new Object[this.qtde];
		Celula atual = this.topo;
		
		for(int i=0; i<this.qtde;i++) {
		if (i > this.qtde) {
			return null;
		}
		elementos[i] = atual.getElemento();
		atual = atual.getProximo();	
		}
		return elementos[size()-1-pos];
			
	}
	

}
