package user;

import PilhaLigada.PilhaChaves;
import ListaLigada.ListaLigada;
import catalogo.jogo;

public class usuario{
	private String name;
	private String user;
	private String pass;
	ListaLigada comprados = new ListaLigada();
	PilhaChaves chavesusuario = new PilhaChaves();
	
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
	
	public boolean AdicionarJogoComprado(jogo jogocomprado, String chave) {
		comprados.add(jogocomprado);
		System.out.println("----------------------------------------------");
		System.out.println("Voce comprou o jogo: "+jogocomprado.getNome()+" Chave de acesso: "+chave);
		System.out.println("----------------------------------------------");
		chavesusuario.add(chave);
		return true;
	}
	
	public boolean MostrarJogosComprados() {
		if(comprados.size() == 0) {
			System.out.println("----------------------------------------------");
			System.out.println("Voce nao tem nenhum jogo!");
			System.out.println("----------------------------------------------");
			return false;
		}
		else {
			System.out.println("----------------------------------------------");
			for(int i=0; i<comprados.size();i++) {
				jogo obj =(jogo)comprados.get(i);
				System.out.println("Nome: "+obj.getNome()+" Chave: "+chavesusuario.get(i));
			}
			System.out.println("----------------------------------------------");
		}
		return true;
	}
	
	public boolean ReembolsarJogo(String nome) {
		jogo obj = (jogo)comprados.get(comprados.size()-1);
		
		if(comprados.size() == 0) {
			System.out.println("----------------------------------------------");
			System.out.println("Voce nao tem nenhum jogo!");
			System.out.println("----------------------------------------------");			
			return false;
		}
		
		if(obj.getNome().compareTo(nome)==0) {
			comprados.remove(comprados.size()-1);
			System.out.println("----------------------------------------------");
			System.out.println("O jogo "+obj.getNome()+" de chave N°: "+chavesusuario.get(comprados.size())+" foi reembolsado!");
			System.out.println("----------------------------------------------");
			chavesusuario.ReembolsarChave();
			return true;
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Voce nao pode reembolsar esse jogo, pois nao foi o ultimo comprado!");
		System.out.println("-------------------------------------------------------------------");
		return false;
	}
	
	
}

