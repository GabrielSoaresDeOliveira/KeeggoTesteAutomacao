package logic;

import static org.junit.Assert.assertTrue;

import core.Acoes;
import core.Configuracoes;
import core.Planilha;
import pages.HomePage;
import pages.UserPage;

public class LogoutLogic {

	public static void entrarDadosLogin() {
		Acoes.esperar(5000);
		Acoes.escrever(UserPage.getUsername(), Planilha.getUsername());
		Acoes.escrever(UserPage.getSenha(), Planilha.getSenha());
		Acoes.clicar(UserPage.getBtnLogin());
	}

	public static void clicarUser() {
		Acoes.esperar(3000);
		Acoes.clicar(HomePage.getBtnUser());
	}

	public static void clicarSignOut() {
		Acoes.esperar(3000);
		Acoes.clicar(HomePage.getBtnSignOut());
	}

	public static void validarLogout() {
		Acoes.esperar(3000);
		Boolean condition = Acoes.getElementText(HomePage.getUserName()).equals("");
		Configuracoes.setResult(condition);
		assertTrue(condition);
	}
	
	
	
}
