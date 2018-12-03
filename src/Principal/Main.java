package Principal;
import java.util.Scanner;

import catalogo.catalogo;
import catalogo.jogo;
import user.*;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		CadastroLogin cadastros = new CadastroLogin();
		catalogo listacatalogo = new catalogo();
		sc = new Scanner(System.in);
		int op=0;
		cadastros.adm("admin", "admin");
		jogo obj0 = (jogo)listacatalogo.NovoJogo("BF1", 2018, "Ação");
		obj0.GerarChaves(100);
		jogo obj1 = (jogo)listacatalogo.NovoJogo("Call of Duty", 2015, "Ação");
		obj1.GerarChaves(100);
		jogo obj2 = (jogo)listacatalogo.NovoJogo("Mario Bros", 1983, "Arcade");
		obj2.GerarChaves(1);
		cadastros.cadastrar("Lucas", "123", "123");
		
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
						System.out.println("2 - Deletar Jogo");
						System.out.println("3 - Listar Jogos Catalogo");
						System.out.println("4 - Listar Usuarios");
						System.out.println("5 - Deletar Usuario");
						System.out.println("6 - Sair");
						int opcaoadm = sc.nextInt();
						if(opcaoadm == 1) {
							sc.nextLine();
							System.out.println("Digite o nome do jogo: ");
							String nomejogo = sc.nextLine();
							System.out.println("Digite o ano de lancamento do jogo: ");
							int anojogo = sc.nextInt();
							sc.nextLine();
							System.out.println("Digite o genero do jogo: ");
							String generojogo = sc.nextLine();
							System.out.println("Quantas chaves de acesso?");
							int chavesjogo = sc.nextInt();
							jogo obj = (jogo)listacatalogo.NovoJogo(nomejogo, anojogo, generojogo);
							obj.GerarChaves(chavesjogo);
						}
						else if(opcaoadm == 2) {
							sc.nextLine();
							System.out.println("Digite o Nome do Jogo: ");
							String nomejogo = sc.nextLine();
							listacatalogo.DeletarJogo(nomejogo);
						}
						
						else if(opcaoadm == 3) {
							listacatalogo.ListarJogos();
						}
						
						else if(opcaoadm == 4) {
							cadastros.ListarUsuarios();
						}
						else if(opcaoadm == 5) {
							sc.nextLine();
							System.out.println("Digite o Username: ");
							String DelUser = sc.nextLine();
							cadastros.DeletarUsuario(DelUser);
						}
						else if (opcaoadm == 6) {
							op=4;
						}
					}while(op!=4);
				}
				
					else if(permissao == 1) {
						usuario usuariologado = (usuario) cadastros.ObjetoUsuarioLogado(user_login);
						do {
							System.out.println("1 - Catalogo de Jogos");
							System.out.println("2 - Jogos Comprados");
							System.out.println("3 - Reembolsar Jogo");
							System.out.println("4 - Sair");
							int opcaousu = sc.nextInt();
							if(opcaousu == 1){
								listacatalogo.ListarJogos();
								sc.nextLine();
								System.out.println("Deseja comprar algum jogo?(s/n)");
								char altern = sc.next().charAt(0);;
								if(altern == 's' || altern == 'S') {
									System.out.println("Digite o ID do jogo: ");
									int idjogo = sc.nextInt();
									jogo jogocomprado = listacatalogo.JogoSelecionado(idjogo);
									String chavecomprada = jogocomprado.ObterChave();
									usuariologado.AdicionarJogoComprado(jogocomprado, chavecomprada);
									if(jogocomprado.qtdeRest() == 0) {
										listacatalogo.DeletarJogoPos(idjogo);
									}
								}
							}
							else if(opcaousu == 2){
								usuariologado.MostrarJogosComprados();
							}
							
							else if(opcaousu == 3){
								sc.nextLine();
								System.out.println("Digite o nome do jogo que voce deseja reembolsar: ");
								String nomejogo = sc.nextLine();
								usuariologado.ReembolsarJogo(nomejogo);
							}
							
							else if (opcaousu == 4) {
								op=5;
							}
						}while(op != 5);		
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
