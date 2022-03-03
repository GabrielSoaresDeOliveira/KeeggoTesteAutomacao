# language: pt

@Consultar @Advantage
Funcionalidade: Consultar_produtos

	Contexto:
  	Eu como possivel cliente da loja
  	Quero acessar o site advantageonlineshopping.com
  	Para consultar os produtos disponiveis
  	
  Cenário: Consultar_Produtos
    Dado que vou para a home page do site
    Quando quero consultar as caixas de som
    E rolo a pagina para visualizar todos os produtos
    E volto para a pagina inicial
    Quando quero consultar os tablets
    E rolo a pagina para visualizar todos os produtos
    E volto para a pagina inicial
    Quando quero consultar os laptops
    E rolo a pagina para visualizar todos os produtos
    E volto para a pagina inicial
   	Quando quero consultar os mouses
    E rolo a pagina para visualizar todos os produtos
    E volto para a pagina inicial
    Quando quero consultar os fones de ouvido
    E rolo a pagina para visualizar todos os produtos
    E volto para a pagina inicial
    Então termino de consultar os produtos