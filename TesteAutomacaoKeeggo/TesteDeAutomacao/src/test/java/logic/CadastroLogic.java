package logic;


import java.io.IOException;

import core.Acoes;
import core.Planilha;
import pages.CadastroPage;
import pages.UserPage;

public class CadastroLogic {

	public static void clicarCreateNewAccount() {
		Acoes.esperar(5000);
		Acoes.clicar(UserPage.getCreateNewAccountBtn());
	}

	public static void preencherDadosDeCadastro() {
		Acoes.escrever(CadastroPage.getUsername(), GeradorLogic.getUsername());
		Acoes.escrever(CadastroPage.getEmail(), GeradorLogic.getEmail());
		Acoes.escrever(CadastroPage.getSenha(), GeradorLogic.getSenha());
		Acoes.escrever(CadastroPage.getCornfirmarSenha(), GeradorLogic.getSenha());
		Acoes.escrever(CadastroPage.getNome(), GeradorLogic.getNome());
		Acoes.escrever(CadastroPage.getSobrenome(), GeradorLogic.getSobrenome());
		Acoes.escrever(CadastroPage.getTelefone(), GeradorLogic.getTelefone());
		Acoes.selecionarPorTexto(CadastroPage.getPais(), "Brazil");
		Acoes.escrever(CadastroPage.getCidade(), GeradorLogic.getCidade());
		Acoes.escrever(CadastroPage.getEndereco(), GeradorLogic.getEndereco());
		Acoes.escrever(CadastroPage.getEstado(), GeradorLogic.getEstado());
		Acoes.escrever(CadastroPage.getCEP(), GeradorLogic.getCEP());
		Acoes.clicar(CadastroPage.getCheckTermo());
		Acoes.clicar(CadastroPage.btnCadastro());
	}
	
	public static void escreverDaodsNaPlanilha(){
		try {
			
			Planilha.escreverDadosCadastrados(
					GeradorLogic.getUsername(), 
					GeradorLogic.getEmail(), 
					GeradorLogic.getSenha(), 
					GeradorLogic.getNome(), 
					GeradorLogic.getSobrenome(), 
					GeradorLogic.getTelefone(), 
					GeradorLogic.getCidade(), 
					GeradorLogic.getEndereco(), 
					GeradorLogic.getEstado(), 
					GeradorLogic.getCEP());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
