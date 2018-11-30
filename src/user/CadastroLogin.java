package user;
import ListaLigada.Celula;
import user.usuario;


public class CadastroLogin {
	private Celula inicio;
	private Celula fim;
	private int qtde;
	
	
	public boolean DeletarUsuario(String username) {
		for (int i=0; i < this.qtde; i++) {
			usuario obj = (usuario)get(i);
			if(obj.getUser().compareTo(username) == 0) {
				remove(i);
				System.out.println("Usuario " + obj.getUser() + " Deletado!" );
				return true;				
			}
		}
		System.out.println("Usuario NAO existente!");
		return false;
	}
	
	
	public boolean ListarUsuarios() {				
			for (int i=1; i < this.qtde; i++) {
				usuario obj = (usuario)get(i);
				System.out.println("---------------");
				System.out.println(obj.getName());
				System.out.println(obj.getUser());
				System.out.println(obj.getPass());
			}
			return true;
	}
	
	public boolean adm(String username, String password) {
		admin adm = new admin("admin",username,password);
		add(adm);
		return true;
	}
	
	public boolean cadastrar(String name, String username, String password) {
		usuario obj = new usuario(name, username, password);
		for (int i=0; i < this.qtde; i++) {
			usuario obj2 = (usuario)get(i);
			if(obj2.getUser().compareTo(obj.getUser()) == 0) {
				System.out.println("Nome de Usuario ja existente! Tente Novamente.");
				return false;				
			}
		}
		add(obj);		
		return true;	
	}
		
	public int logar(String username, String password) {
		for(int i=0; i<this.qtde; i++) {
			usuario conta = (usuario)get(i);
			if(((String)conta.getUser()).compareTo((String)username) == 0 && ((String)conta.getPass()).compareTo((String)password) == 0) {
				if((String)conta.getUser() == "admin" && (String)conta.getPass() == "admin"){
					System.out.println("Bem Vindo "+conta.getName());
					return 2;
				}
				System.out.println("Bem Vindo "+conta.getName());
				return 1;
			}
		}
		System.out.println("Permissão Negada!");
		return 0;
	}
	
	public boolean add(Object obj) {
		Celula novo = new Celula(obj);
		
		if(this.qtde==0) {
			this.inicio = novo;
			this.fim = novo;
		}
		else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
		this.qtde++;
		return true;
	}
	
	public Object get(int pos) {
		if (pos > this.qtde) 
			return null;
			
		Celula atual = this.inicio;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		
		return atual.getElemento();
	}
	
	public Object remove(int pos) {
		Celula removido;
		
		if (pos == 0) {
			removido = this.inicio;
			this.inicio.setProximo(this.inicio.getProximo());
			
			if (this.qtde == 1)
				this.fim = null;
		}
		else if (pos <= this.qtde - 1) {
			Celula atual = this.inicio;
			for (int i = 0; i < pos - 1; i++) {
				atual = atual.getProximo();
			}
			
			removido = atual.getProximo();
			atual.setProximo(removido.getProximo());
			
			if (pos == this.qtde - 1)
				this.fim = atual;
		}
		else {
			return null;
		}
		
		
		this.qtde--;
		return removido.getElemento();
	}	
}
