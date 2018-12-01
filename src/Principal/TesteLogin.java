package Principal;
import java.util.Scanner;
import user.*;

public class TesteLogin {

	private static Scanner sc;

	public static void main(String[] args) {
		CadastroLogin cadastros = new CadastroLogin();
		sc = new Scanner(System.in);
		int op=0;
		cadastros.adm("admin", "admin");
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
				cadastros.cadastrar(name, username, password);
				cadastros.ListarUsuarios();
			} 
			else if(op == 2) {
				sc.nextLine();
				System.out.println("Nome Usuario: ");
				String user_login = sc.nextLine();
				System.out.println("Senha: ");
				String pass_login = sc.nextLine();
				int permissao = (cadastros.logar(user_login, pass_login));
				if (permissao == 2) { 
					do{
						System.out.println("1 - Adicionar Jogo");
							System.out.println("Quantas chaves de acesso?");
						System.out.println("2 - Deletar Jogo");
						System.out.println("3 - Listar Usuarios");
						System.out.println("4 - Deletar Usuario");
						System.out.println("5 - Sair");
						int opcaoadm = sc.nextInt();
						
						if(opcaoadm == 3) {
							cadastros.ListarUsuarios();
						}
						else if(opcaoadm == 4) {
							sc.nextLine();
							System.out.println("Digite o Username: ");
							String DelUser = sc.nextLine();
							cadastros.DeletarUsuario(DelUser);
						}
						else if (opcaoadm == 5) {
							op=4;
						}
					}while(op!=4);
				}		
				else if(permissao == 1) {
					System.out.println("Catalogo de Jogos");
					System.out.println("Jogos Comprados");
					System.out.println("Reembolsar ultimo jogo");
					System.out.println("Sair");
				}
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
