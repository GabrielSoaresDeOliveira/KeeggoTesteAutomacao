package steps;


import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import logic.ConsultarLogic;

public class ConsultarSteps {
	
	@Quando("^quero consultar as caixas de som$")
	public void consultaCaixaDeSom() {
		ConsultarLogic.consultarCaixas();
	}
	
	@Quando("^quero consultar os tablets$")
	public void consultaTablets() {
		ConsultarLogic.consultarTablets();
	}
	
	@Quando("^quero consultar os laptops$")
	public void consultaLaptops() {
		ConsultarLogic.consultarLaptops();
	}
	
	@Quando("^quero consultar os mouses$")
	public void consultaMouses() {
		ConsultarLogic.consultarMouses();
	}
	
	@Quando("^quero consultar os fones de ouvido$")
	public void consultaFones() {
		ConsultarLogic.consultarFones();
	}
	
	@E("^rolo a pagina para visualizar todos os produtos$")
	public void rolarPagina() {
		ConsultarLogic.rolarPagina();
	}
	
	@E("^volto para a pagina inicial$")
	public void paginaInicial() {
		ConsultarLogic.paginaInicial();
	}
	
	@Então("^termino de consultar os produtos$")
	public void finalizarConsulta() {
		ConsultarLogic.finalizarConsulta();
	}
}
