package com.test.Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	
	@FindBy(xpath="//a[contains(text(),'Women')and @class='sf-with-ul']")
	private WebElement women;
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[contains(text(),'Dresses')]")
	private WebElement dresses;
	
	
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[contains(text(),'T-shirts')]")
	private WebElement tshirt;
	
	public HomePageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomen()
	{
		return women; 
	}
	public WebElement getDresses()
	{
		return dresses;
		
	}
	public WebElement getTShirt()
	{
		return tshirt;
	}
	
	public void ClickWomen()
	{
		women.click();
	}
	public void ClickDress()
	{
		dresses.click();
	}
	public void ClickTshirt()
	{
		tshirt.click();
	}
	


}
