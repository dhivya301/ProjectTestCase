package com.test.Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTestPage {
	
	BasePage bp;
	HomePageObject hp;
	DressPageObject dp;
	CartObject co;
	ProductObjectPage po;
	public ProductTestPage() {
		// TODO Auto-generated constructor stub
		bp=new BasePage();
		hp=new HomePageObject();
		dp=new DressPageObject();
		co=new CartObject();
		po=new ProductObjectPage();
		
	}
	
	@Test
	public void verifyTweetAndShare()
	{
		hp.ClickDress();
		co.externalPointImage();
		bp.Click(co.getAddCart());
		co.proceedWindow();
		bp.Click(co.getAddedProduct());
		Assert.assertTrue(po.getTwitter().isDisplayed());
		Assert.assertTrue(po.getShare().isDisplayed());
		Assert.assertTrue(po.getProductDescription().isDisplayed());
		
	}
	
	

}
