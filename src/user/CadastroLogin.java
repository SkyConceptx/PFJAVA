package user;

import ListaLigada.ListaLigada;
import user.usuario;


public class CadastroLogin {
	ListaLigada usuarios = new ListaLigada();
	
	public boolean cadastrar(String name, String username, String password) {
		usuario obj = new usuario(name, username, password);
		usuarios.add(obj);		
		return true;	
	}
	
	public boolean logar(String username, String password) {
		for(int i=0; i<usuarios.size(); i++) {
			usuario conta = (usuario)usuarios.get(i);
			if(((String)conta.getUser()).compareTo((String)username) == 0 && ((String)conta.getPass()).compareTo((String)password) == 0) {
				return true;
			}	
		}
		return false;
	}
}
