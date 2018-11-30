package catalogo;

public class jogo {
	private String nome;
	private int ano;
	private String genero;
	private String acesso;
	
	public jogo(String nome, int ano, String genero, String acesso) {
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
		this.acesso = acesso;
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

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}	
}
