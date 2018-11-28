package PilhaLigada;


public interface IStack {
	
	/**
	 * Determina se a pilha est� vazia
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Determina o tamanho da pilha
	 * @return
	 */
	public int size();
	
	/**
	 * Remove um objeto da pilha
	 * @return
	 */
	public Object pop();
	
	/**
	 * Insere um elemento na pilha
	 * @param item
	 */
	public void push(Object item);
	
	/**
	 * Retorna um vetor contendo uma c�pia dos elementos da pilha
	 * @return
	 */
	public Object toArray();

}