# language: pt

@Logout @Advantage
Funcionalidade: Fazer_Logout

	Contexto:
  	Eu como cliente já cadastrado
  	Quero acessar o site advantageonlineshopping.com
  	Para fazer logout da minha conta
  	
  Cenário: Fazer_Logout
    Dado que vou para a home page do site
    Quando clico no ícone 'USER'
    E entro com meu usuário e senha para efetuar o login
    E clico novamente no ícone 'USER'
    E clico em 'sign out'
    Então valido que sai da minha conta