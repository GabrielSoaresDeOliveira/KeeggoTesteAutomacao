package pages;

import org.openqa.selenium.By;

public class ProdutoPage {

	private static By addBtn = By.xpath("//*[@name='save_to_cart']");

	public static By getAddBtn() {
		return addBtn ;
	}


}
