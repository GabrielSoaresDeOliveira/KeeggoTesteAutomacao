package steps;

import io.cucumber.java.pt.E;
import logic.LoginLogic;
import logic.LogoutLogic;

public class LogoutSteps {
	
	@E("^clico novamente no ícone 'USER'$")
	public void clicarUser() {
		LogoutLogic.clicarUser();
	}
	
	@E("^clico em 'sign out'$")
	public void fazerLogout() {
		LogoutLogic.clicarSignOut();
	}
	
	@E("^valido que sai da minha conta$")
	public void validarLogout() {
		LogoutLogic.validarLogout();
	}
}
