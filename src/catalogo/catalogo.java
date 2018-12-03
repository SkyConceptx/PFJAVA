package catalogo;

import ListaLigada.ListaLigada;

public class catalogo {
	
	ListaLigada catalogo = new ListaLigada();
		
	public Object NovoJogo(String nome, int ano, String genero) {
		jogo obj = new jogo(nome, ano, genero);
		catalogo.add(obj);
		return obj;
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
	
	public boolean DeletarJogoPos(int i) {
			catalogo.remove(i);
			return true;
	}
	
	public boolean ListarJogos() {
		System.out.println("----------------------------------------------");
		for(int i = 0; i<catalogo.size(); i++) {
			jogo obj = (jogo) catalogo.get(i);
			System.out.println("ID:"+i+" - Nome:"+obj.getNome()+"|Ano:"+obj.getAno()+"|Genero:"+obj.getGenero()+"|Restante:"+obj.qtdeRest());
			System.out.println("");
		}
		System.out.println("----------------------------------------------");
		return true;
	}
	
	public jogo JogoSelecionado(int id) {
		jogo obj = (jogo) catalogo.get(id);
		return obj;
	}
	
}	
