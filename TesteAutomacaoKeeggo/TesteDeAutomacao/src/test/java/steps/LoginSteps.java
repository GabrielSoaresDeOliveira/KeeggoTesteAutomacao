package steps;

import io.cucumber.java.pt.E;
import logic.LoginLogic;

public class LoginSteps {
	
	@E("^entro com meu usuário e senha para efetuar o login$")
	public void efetuarlogin() {
		LoginLogic.entrarDadosLogin();
	}
	
}
