package Principal;
import java.util.Scanner;
import user.*;

public class TesteLogin {

	public static void main(String[] args) {
		CadastroLogin cad = new CadastroLogin();
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Logar");
			System.out.println("3 - Sair");
			op = sc.nextInt();
			
			if(op == 1) {
				sc.nextLine();
				System.out.println("Seu Nome: ");
				String name = sc.nextLine();
				System.out.println("Nome Usuario: ");
				String username = sc.nextLine();
				System.out.println("Senha: ");
				String password = sc.nextLine();
				System.out.println(cad.cadastrar(name, username, password));
			} 
			else if(op == 2) {
				sc.nextLine();
				System.out.println("Nome Usuario: ");
				String user_login = sc.nextLine();
				System.out.println("Senha: ");
				String pass_login = sc.nextLine();
				System.out.println(cad.logar(user_login, pass_login));
			}
		}while(op!=3);	
	}
	
	
	
	public static String vetorToString(Object[] e) {
		String txt = "";
		
		for (int i=0; i < e.length; i++)
			txt += e[i] + ", ";
		
		return txt;
	}
}
