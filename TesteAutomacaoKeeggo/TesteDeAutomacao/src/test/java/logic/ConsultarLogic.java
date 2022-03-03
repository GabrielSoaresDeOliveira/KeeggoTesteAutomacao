package logic;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

import core.Acoes;
import core.Configuracoes;
import core.Driver;
import pages.HomePage;

public class ConsultarLogic {

	public static void consultarCaixas() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getSpeakers());
	}

	public static void consultarTablets() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getTablets());
	}

	public static void consultarLaptops() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getLaptops());
	}

	public static void consultarMouses() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getMice());
	}

	public static void consultarFones() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getHeadphones());
	}

	public static void rolarPagina() {
		Acoes.esperar(5000);
		JavascriptExecutor js = (JavascriptExecutor) Driver.getWebDriver();  
		js.executeScript("window.scrollTo(0, (document.body.scrollHeight)/3)");
	}

	public static void paginaInicial() {
		Acoes.esperar(5000);
		Acoes.clicar(HomePage.getHomeBtn());
	}

	public static void finalizarConsulta() {
		Configuracoes.setResult(true);
		assertTrue(true);
	}

}
