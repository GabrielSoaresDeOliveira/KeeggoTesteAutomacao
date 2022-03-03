package logic;


import static org.junit.Assert.assertTrue;

import core.Acoes;
import core.Configuracoes;
import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;

public class CarrinhoLogic {

	public static void clicarProduto() {
		Acoes.clicar(HomePage.getProduto());		
	}

	public static void clicaradicionarAoCarrinho() {
		Acoes.clicar(ProdutoPage.getAddBtn());		
	}

	public static void clicarIconeCarrinho() {
		Acoes.clicar(HomePage.getCartBtn());
	}

	public static void validarAdicao() {
		Acoes.esperar(2000);
		boolean testCondition = Acoes.verificarVisibilidade(CarrinhoPage.getPrimeiroItem());
		Configuracoes.setResult(testCondition);
		assertTrue(testCondition);
	}

}
