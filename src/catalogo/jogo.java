package catalogo;

import FilaLigada.FilaLigada;

public class jogo {
	private String nome;
	private int ano;
	private String genero; 
	FilaLigada chaves = new FilaLigada();
	private int qtde;
	private int qtdeTotal; 
	
	public jogo(String nome, int ano, String genero) {
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean GerarChaves(int NumChaves) {
		for(int i=0; i<NumChaves;i++) {
			chaves.enqueue(this.nome+this.ano+i);
		}
		this.qtdeTotal = NumChaves;
		return true;
	}
	
	public String ObterChave() {
		String chave = chaves.PegarChave(this.qtde);
		this.qtde++;
		return chave;
	}
	
	public int qtdeRest() {
		return this.qtdeTotal-this.qtde;
	}
}
