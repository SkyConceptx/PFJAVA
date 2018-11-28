package ListaLigada;



public class ListaLigada implements IListaLinear {
	
	private Celula inicio;
	private Celula fim;
	private int qtde;
	
	public ListaLigada() {
		this.qtde = 0;
	}

	@Override
	public int size() {
		return this.qtde;
	}

	@Override
	public boolean isEmpty() {
		return (this.qtde == 0);
	}

	@Override
	public boolean add(Object obj) {
		Celula novo = new Celula(obj);
		
		if(this.isEmpty()) {
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

	@Override
	public boolean add(int pos, Object obj) {
		Celula novo = new Celula(obj);
		
		if (pos == 0) {
			novo.setProximo(this.inicio);
			this.inicio = novo;
			
			if (this.isEmpty())
				this.fim = novo;
		}
		else if (pos == this.qtde - 1 || pos > this.qtde) {
			this.add(obj);
		}
		else {
			Celula atual = this.inicio;
			
			for (int i = 0; i < pos - 1; i++) {
				atual = atual.getProximo();
			}
			
			novo.setProximo(atual.getProximo());
			atual.setProximo(novo);
		}
		
		this.qtde++;
		return true;
	}

	@Override
	public Object get(int pos) {
		if (pos > this.qtde) 
			return null;
			
		Celula atual = this.inicio;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		
		return atual.getElemento();
	}

	@Override
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

	@Override
	public int indexOf(Object obj) {
		for (int i = 0; i < this.qtde; i++) 
			if (inicio.getElemento() == obj) {
				return i;
			}
		return 0;
		}

	@Override
	public boolean contains(Object obj) {
		return false;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

}
