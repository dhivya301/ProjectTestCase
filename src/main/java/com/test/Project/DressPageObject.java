package com.test.Project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends BasePage {
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']")
	private WebElement small;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']")
	private WebElement medium;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']")
	private WebElement large;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement productHeader;
	
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']/li"))
	private List<WebElement> productList;
	
	public DressPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSmall()
	{
		return small;
	}
	public WebElement getMedium()
	{
		return medium;
		
	}
	public WebElement getLarge()
	{
		return large;
	}
	public int getProductNumberHeader()
	{
		String s=productHeader.getText();
		String[] arr=s.split(" ");
		String value=arr[2];
		int count=Integer.parseInt(value);
		return count;
		
	}
	public int productCount()
	{
		return productList.size();
	}
	

}
