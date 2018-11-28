package user;

public class usuario extends admin{
	private String nome;
	public usuario(String nome, String user, String pass) {
		super(user, pass);
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}

