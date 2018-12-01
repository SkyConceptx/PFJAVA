package user;

import ListaLigada.ListaLigada;
import catalogo.jogo;

public class usuario{
	private String name;
	private String user;
	private String pass;
	ListaLigada comprados = new ListaLigada();
	
	public usuario(String name, String user, String pass) {
		this.name = name;
		this.user = user;
		this.pass = pass;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	
	public boolean AdicionarJogo(jogo jogocomprado) {
		comprados.add(jogocomprado);
		System.out.println("Voce comprou o jogo: "+jogocomprado.getNome());
		return true;
	}
	
	public boolean MostrarJogosComprados() {
		if(comprados.size() == 0) {
			System.out.println("Voce nao tem nenhum jogo!");
			return false;
		}
		else {
			for(int i=0; i<comprados.size();i++) {
				jogo obj =(jogo)comprados.get(i);
				System.out.println(obj.getNome());
			}
		}
		return true;
	}
	
	public boolean ReembolsarJogo(String nome) {
		jogo obj = (jogo)comprados.get(comprados.size());
		if(comprados.size() == 0) {
			System.out.println("Voce nao tem nenhum jogo!");
			return false;
		}
		
		else if(obj.getNome().compareTo(nome)==0) {
			comprados.remove(comprados.size());
			System.out.println("O jogo "+obj.getNome()+" foi reembolsado!");
			return true;
		}
		System.out.println("Voce nao pode reembolsar esse jogo, pois nao foi o ultimo comprado!");
		return false;
	}
	
	
}

