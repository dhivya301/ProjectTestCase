package com.test.Project;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartObject extends BasePage {
	@FindBy(xpath = "//div[@class='button-container']/a[@data-id-product='3']")
	private WebElement addCart;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]/div/div/div/a/img")
	private WebElement mousePoint;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement proceed;

	@FindBy(xpath = "//tr[@id='product_3_13_0_0']")
	private WebElement addedProduct;

	public CartObject() {
		PageFactory.initElements(driver, this);
	}

	public void Click(WebElement element)
	{
		element.click();
	}
	
	public void externalPointImage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Actions a = new Actions(driver);
		a.moveToElement(mousePoint).perform();
	}
	
	public WebElement getAddedProduct() {
		return addedProduct;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public void proceedWindow() {
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String name : windows) {
			driver.switchTo().window(name);
			proceed.click();

		}

	}

}
