package logic;

import core.Acoes;
import core.Planilha;
import pages.UserPage;

public class LoginLogic {

	public static void entrarDadosLogin() {
		Acoes.esperar(5000);
		Acoes.escrever(UserPage.getUsername(), Planilha.getUsername());
		Acoes.escrever(UserPage.getSenha(), Planilha.getSenha());
		Acoes.clicar(UserPage.getBtnLogin());
	}
	
	
	
}
