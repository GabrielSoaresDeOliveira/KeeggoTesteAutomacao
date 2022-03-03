# language: pt

@Carrinho @Advantage
Funcionalidade: Adicionar_Ao_Carrinho

	Contexto:
  	Eu como cliente da loja
  	Quero acessar o site advantageonlineshopping.com
  	Para adicionar um produto ao meu carrinho
  	
  Cenário: Adicionar_Ao_Carrinho
    Dado que vou para a home page do site
    Quando quero consultar um produto da loja
    E adiciono ao meu carrinho
    E visualizo meu carrinho
    Então verifico se o item foi adicionado 