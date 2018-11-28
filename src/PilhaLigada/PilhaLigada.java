package PilhaLigada;


public class PilhaLigada implements IStack {

	private Celula topo;
	private int qtde;
	
	@Override
	public boolean isEmpty() {
		return this.qtde == 0;
	}

	@Override
	public int size() {
		return this.qtde;
	}

	@Override
	public Object pop() {
		Celula retirado = this.topo;
		if ( this.topo != null ) {
			this.topo = this.topo.getProximo();
			this.qtde--;
		}

		return retirado;
	}

	@Override
	public void push(Object item) {
		Celula novo = new Celula(item);
		novo.setProximo(this.topo);
		this.topo = novo;
		this.qtde++;

	}
	@Override
	public Object[] toArray() {
		Object[] elementos = new Object[this.qtde];
		Celula atual = this.topo;
		
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
