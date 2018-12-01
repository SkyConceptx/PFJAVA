package catalogo;

import ListaLigada.ListaLigada;

public class catalogo {
	
	ListaLigada catalogo = new ListaLigada();
		
	public boolean NovoJogo(String nome, int ano, String genero) {
		jogo obj = new jogo(nome, ano, genero);
		catalogo.add(obj);
		return true;
	}
	
	public boolean DeletarJogo(String nome) {
		for(int i = 0; i<catalogo.size(); i++) {
			jogo obj = (jogo) catalogo.get(i);
			if(obj.getNome().compareTo(nome)==0) {
				catalogo.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean ListarJogos() {
		for(int i = 0; i<catalogo.size(); i++) {
			jogo obj = (jogo) catalogo.get(i);
			System.out.println(obj.getNome());
			System.out.println(obj.getAno());
			System.out.println(obj.getGenero());
		}
		return true;
	}
}	
