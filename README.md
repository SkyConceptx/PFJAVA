**INSTRUÇÕES SOBRE O PROJETO**  

  * O presente projeto tem por finalidade exemplificar a maneira como uma loja de jogos controlaria seus jogos vendidos e a entrega das chaves de acesso dos jogos, com um catálogo com limite de chaves para acesso o usuário tem a opção de login e cadastro, bem como as opções de ver catálogo de jogos, comprar jogo, ver jogos já comprados e reembolsar o último jogo que foi comprado;  
	
  * As classes auxiliares ocupam posição de total importância no projeto uma vez que nenhuma biblioteca nativa do JAVA (List, ArrayList, Queue, etc) foi utilizada, sendo assim as classes auxiliares como PilhaLigada, ListaLigada, FilaLigada, catalogo e user possuem os métodos básicos de manipulação de variáveis e as estruturas para manipulação de resultados;  
	
  * O usuário administrador (nome: admin, senha: admin) pode ser utilizado para cadastrar novos jogos, deletar jogos, visualizar jogos, visualizar usuários e deletar usuários, mesmo que a base inicial esteja vazia;  
	
  * Cada jogo cadastrado pelo usuário administrador deverá conter: nome do jogo, ano do jogo e gênero do jogo;  
	
  *	O pacote Principal possui a classe Main onde se encontra o programa que será utilizado para retornar resultados, sua implementação ocorreu com alguns jogos pré-carregados e uma quantidade de chaves que sempre será finita, nesse programa se encontram os menus e estruturas de repetição para que o programa possa ser testado e aperfeiçoado.

**OBJETIVO DO SOFTWARE**  

  *	Mostrar o funcionamento básico da venda eletrônica de um jogo com chave eletrônica de acesso utilizando estruturas básicas do JAVA e bibliotecas criadas pelos desenvolvedores.  

**DEPENDÊNCIAS DO PROJETO**
  *	É imprescindível que para utilização do projeto ao menos 1 jogo seja carregado no programa principal;  
	
  *	Para troca ou modificação de qualquer método os pacotes auxiliares contêm as classes com os métodos de adicionar, remover, mostrar e manipular variáveis;  
	
  *	A qualquer momento o programa deverá ser reiniciado para que haja um reinicio dos dados que forem acrescentados como login, nomes e senhas de usuários;  
	
  *	Para utilizar o usuário de administrador o nome de usuário admin e a senha admin devem ser utilizadas;  

**UTILIZAÇÃO INICIAL DO SOFTWARE**  

  * Antes de iniciar o software pela primeira vez o usuário terá duas escolhas  
  *	1 – Iniciar com jogos pré-carregados;
  *	2 – Iniciar o programa e acrescentar os jogos através do usuário padrão (admin).  
	
  *	Para poder visualizar o catálogo de jogos antes o usuário precisa ter um login no sistema e com isso ele precisa primeiro se cadastrar informando um nome, um nome de usuário e uma senha;  
	
  *	O usuário poderá visualizar o catálogo de jogos ao selecionar a opção 1 do menu e escolher se deseja ou não comprar um novo jogo, se o usuário escolher sim deverá, então, informar o id do jogo a ser comprado e teclar enter;  
	
  *	O usuário poderá visualizar os jogos já comprados e a chave de acesso gerada no momento da compra ao escolher a opção 2 do menu;
  *	O usuário poderá, ainda, reembolsar o valor do último jogo comprado ao selecionar a opção 3 do menu;  
	
  *	O usuário administrador poderá visualizar jogos e usuários cadastrados bem como deletar cada um deles utilizando o menu e indicando o id do jogo ou usuário a ser deletado;  
	
  *	O usuário administrador poderá cadastrar um novo jogo informando o nome do jogo, o ano de lançamento do jogo, o gênero do jogo e informando a quantidade de chaves disponíveis para o jogo;  
	
  *	O usuário administrador poderá deletar um jogo ou usuário do sistema ao utilizar a opção em questão e informar o id do jogo ou usuário a ser deletado.  

**CONSIDERAÇÕES FINAIS**  
  * O presente projeto foi criado a partir de uma ideia coletiva e não possui intenção de imitar a realidade, mas sim, simplificar e exemplificar a utilização de métodos básicos da linguagem JAVA na criação de modelos que são utilizados na realidade do mercado de trabalho.
