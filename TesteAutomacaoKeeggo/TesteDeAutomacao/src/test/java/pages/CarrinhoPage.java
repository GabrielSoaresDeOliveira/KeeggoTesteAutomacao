package pages;

import org.openqa.selenium.By;

public class CarrinhoPage {

	private static By primeiroItem = By.xpath("//*[@id='shoppingCart']/table/tbody/tr[1]/td[2]");

	public static By getPrimeiroItem() {
		return primeiroItem ;
	}
}
