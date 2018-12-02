package user;
import ListaLigada.ListaLigada;
import user.usuario;


public class CadastroLogin {
	ListaLigada listausuarios = new ListaLigada();
	
	public boolean DeletarUsuario(String username) {
		for (int i=0; i < listausuarios.size(); i++) {
			usuario obj = (usuario)listausuarios.get(i);
			if(obj.getUser().compareTo(username) == 0) {
				listausuarios.remove(i);
				System.out.println("----------------------------------------------");
				System.out.println("Usuario " + obj.getUser() + " Deletado!" );
				System.out.println("----------------------------------------------");
				return true;				
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("Usuario NAO existente!");
		System.out.println("----------------------------------------------");
		return false;
	}
	
	
	public boolean ListarUsuarios() {				
			for (int i=1; i < listausuarios.size(); i++) {
				usuario obj = (usuario)listausuarios.get(i);
				System.out.println("----------------------------------------------");
				System.out.println(obj.getName());
				System.out.println(obj.getUser());
				System.out.println(obj.getPass());
				System.out.println("----------------------------------------------");
			}
			return true;
	}
	
	public boolean adm(String username, String password) {
		admin adm = new admin("admin",username,password);
		listausuarios.add(adm);
		return true;
	}
	
	public boolean cadastrar(String name, String username, String password) {
		usuario obj = new usuario(name, username, password);
		for (int i=0; i < listausuarios.size(); i++) {
			usuario obj2 = (usuario)listausuarios.get(i);
			if(obj2.getUser().compareTo(obj.getUser()) == 0) {
				System.out.println("----------------------------------------------");
				System.out.println("Nome de Usuario ja existente! Tente Novamente.");
				System.out.println("----------------------------------------------");
				return false;				
			}
		}
		listausuarios.add(obj);		
		return true;	
	}
		
	public int logar(String username, String password) {
		for(int i=0; i<listausuarios.size(); i++) {
			usuario conta = (usuario)listausuarios.get(i);
			if(((String)conta.getUser()).compareTo((String)username) == 0 && ((String)conta.getPass()).compareTo((String)password) == 0) {
				if((String)conta.getName() == "admin"){
					System.out.println("----------------------------------------------");
					System.out.println("Bem Vindo "+conta.getName());
					System.out.println("----------------------------------------------");
					return 2;
				}
				System.out.println("----------------------------------------------");
				System.out.println("Bem Vindo "+conta.getName());
				System.out.println("----------------------------------------------");
				return 1;
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("Permissao Negada!");
		System.out.println("----------------------------------------------");
		return 0;
	}
	
	
	public Object ObjetoUsuarioLogado(String user) {
		for (int i=0; i < listausuarios.size(); i++) {
			usuario obj = (usuario)listausuarios.get(i);
			if(obj.getUser().compareTo(user)==0) {
				return obj;
			}
		}
		return null;
	}
		
}
