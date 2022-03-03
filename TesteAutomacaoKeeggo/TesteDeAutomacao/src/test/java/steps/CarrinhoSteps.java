package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import logic.CarrinhoLogic;

public class CarrinhoSteps {
	
	@Quando("^quero consultar um produto da loja$")
	public void consultarProduto() {
		CarrinhoLogic.clicarProduto();
	}

	@E("^adiciono ao meu carrinho$")
	public void adicionarCarrinho() {
		CarrinhoLogic.clicaradicionarAoCarrinho();
	}

	@E("^visualizo meu carrinho$")
	public void visualizarCarrinho() {
		CarrinhoLogic.clicarIconeCarrinho();
	}

	@Então("^verifico se o item foi adicionado$")
	public void validarAdicao() {
		CarrinhoLogic.validarAdicao();
	}
}