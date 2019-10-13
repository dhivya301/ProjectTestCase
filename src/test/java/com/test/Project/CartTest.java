package com.test.Project;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CartTest {
	
	BasePage bp;
	CartObject obj;
	HomePageObject hp;
	
	public CartTest()
	{
		bp=new BasePage();
		obj=new CartObject();
		hp=new HomePageObject();
		
		
	}
	
	@Test
	public void verifyCart()
	{
		hp.ClickDress();
		obj.externalPointImage();
		bp.Click(obj.getAddCart());
		obj.proceedWindow();
		Assert.assertTrue(obj.getAddedProduct().isDisplayed());
		
	}


}
