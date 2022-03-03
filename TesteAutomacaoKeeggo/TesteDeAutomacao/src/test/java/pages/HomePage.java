package pages;

import org.openqa.selenium.By;

public class HomePage 
{
	private static By speakers = By.xpath("//*[@id='speakersImg']");
	private static By tablets = By.xpath("//*[@id='tabletsImg']");
	private static By laptops = By.xpath("//*[@id='laptopsImg']");
	private static By mice = By.xpath("//*[@id='miceImg']");
	private static By headphones = By.xpath("//*[@id='headphonesImg']");
	private static By btnUser = By.xpath("//*[@id='menuUser']");
	private static By homeBtn = By.xpath("//*[@id='Layer_1']");
	private static By cartBtn = By.xpath("//*[@id='menuCart']");
	private static By produto = By.xpath("//*[@id='details_10']");
	private static By btnSignOut = By.xpath("//*[@id='loginMiniTitle']/label[3]");
	private static By username = By.xpath("//*[@id='menuUserLink']/span");

	public static By getBtnUser() {
		return btnUser ;
	}
	
	public static By getSpeakers() {
		return speakers;
	}
	
	public static By getTablets() {
		return tablets;
	}
	
	public static By getLaptops() {
		return laptops;
	}
	
	public static By getMice() {
		return mice;
	}
	
	public static By getHeadphones() {
		return headphones;
	}
	
	public static By getHomeBtn() {
		return homeBtn;
	}

	public static By getCartBtn() {
		return cartBtn;
	}

	public static By getProduto() {
		return produto ;
	}
	
	public static By getBtnSignOut() {
		return btnSignOut;
	}

	public static By getUserName() {
		return username ;
	}
}
