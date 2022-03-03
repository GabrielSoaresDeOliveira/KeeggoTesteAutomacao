package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Planilha {

	private static String filePath = "./Massa de Dados\\Massa.xlsx";
	private static String sheetName = "Dados";

	public static XSSFWorkbook workbook;
	public static XSSFSheet planilha;
	public static String testName;
	public static String testNames;
	
	private static String colunaUsername = "USERNAME";
	private static String colunaEmail = "EMAIL";
	private static String colunaSenha = "SENHA";
	private static String colunaNome = "NOME";
	private static String colunaSobrenome = "SOBRENOME";
	private static String colunaTelefone = "TELEFONE";
	private static String colunaCidade = "CIDADE";
	private static String colunaEndereco = "ENDERECO";
	private static String colunaEstado = "ESTADO";
	private static String colunaCep = "CEP";
	
	private static String username;	
	private static String email;	
	private static String senha;	
	private static String nome;	
	private static String sobrenome;	
	private static String telefone;	
	private static String cidade;	
	private static String estado;	
	private static String endereco;	
	private static String cep;
	
	private static int userRow;
	
	private static File file;
	private static FileInputStream fileInputStream;
	
	
	public static void lerPlanilha() throws Exception {
			file = new File(filePath);
			fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
			planilha = workbook.getSheet(sheetName);
		
	}
	
	private static int getColumnByName(String nomeColuna) {
		int coluna = -1;
		String cellString;
		Row row = planilha.getRow(0);
		do {
			coluna++;
			Cell cell = row.getCell(coluna);
			cellString = cell.getStringCellValue();
		} while (!cellString.equals(nomeColuna));

		return coluna;
	}

	//LER DADOS	
	public static String getUsername() {
		username = getStringCellValue(Configuracoes.getUserRow(), getColumnByName(colunaUsername));
		return username;
	}

	public static String getSenha() {
		senha = getStringCellValue(Configuracoes.getUserRow(), getColumnByName(colunaSenha));
		return senha;
	}

	private static String getStringCellValue(int row, int cell) {
		return planilha.getRow(row).getCell(cell).toString().trim();
	}
	
	//ESCREVER DADOS
	public static void escreverDadosCadastrados(String username, String email, String senha, String nome, String sobrenome, String telefone, String cidade, String endereco, String estado, String cep) throws IOException {
		try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
			int linha = getEmptyRow();
			Row row = planilha.createRow(linha);
			
			//UserName
			row.createCell(getColumnByName(colunaUsername)).setCellValue(username);
			
			//Email
			row.createCell(getColumnByName(colunaEmail)).setCellValue(email);
			
			//Senha
			row.createCell(getColumnByName(colunaSenha)).setCellValue(senha);
			
			//Nome
			row.createCell(getColumnByName(colunaNome)).setCellValue(nome);
			
			//Sobrenome
			row.createCell(getColumnByName(colunaSobrenome)).setCellValue(sobrenome);
			
			//Telefone
			row.createCell(getColumnByName(colunaTelefone)).setCellValue(telefone);
			
			//Cidade
			row.createCell(getColumnByName(colunaCidade)).setCellValue(cidade);
			
			//Endereço
			row.createCell(getColumnByName(colunaEndereco)).setCellValue(endereco);
			
			//Estado
			row.createCell(getColumnByName(colunaEstado)).setCellValue(estado);
			
			//CEP
			row.createCell(getColumnByName(colunaCep)).setCellValue(cep);

			workbook.write(fileOutputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		fecharPlanilha();
	}
	
	private static int getEmptyRow(){
		int emptyRow = 0;
		XSSFCell cell;
		
		do {
			emptyRow++;
			try {
			cell = planilha.getRow(emptyRow).getCell(0);
			}catch(NullPointerException e) {
				cell = null;
			}
		}while(!(cell == null || cell.getCellType() == CellType.BLANK));
		
		return emptyRow;
	}
	
	private static void fecharPlanilha() {
		try {
			fileInputStream.close();
			planilha = null;
			workbook = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
