package com.test.Project;

import org.testng.annotations.Test;



import junit.framework.Assert;

public class TestPage {

	BasePage bp;
	HomePageObject hp;
	DressPageObject dp;
	public TestPage()
	{
		bp=new BasePage();
		hp=new HomePageObject();
		dp=new DressPageObject();
	}
	@Test
	public void verifyWomen()
	{
		Assert.assertTrue(hp.getWomen().isDisplayed());
		
	}
	@Test
	public void verifyDresses()
	{
		Assert.assertTrue(hp.getDresses().isDisplayed());
	}
	@Test
	public void verifyTshirt()
	{
		Assert.assertTrue(hp.getTShirt().isDisplayed());
	}
	@Test
	public void verifyWomenclick()
	{
		hp.ClickWomen();
		String Title=bp.getTitle1();
	 	Assert.assertTrue(Title.contains("Women - My Store"));
		
		
	}
	
	@Test
	public void verifyDressClick()
	{
		hp.ClickDress();
		String Title=bp.getTitle1();
		Assert.assertTrue(Title.contains("Dresses - My Store"));
	}
	@Test
	public void verifyTshirtClick()
	{
		hp.ClickTshirt();
		String Title=bp.getTitle1();
		Assert.assertTrue(Title.contains("T-shirts - My Store"));
	}
	
	@Test
	public void verifySize()
	{
		hp.ClickDress();
		Assert.assertTrue(dp.getSmall().isDisplayed());
		Assert.assertTrue(dp.getMedium().isDisplayed());
		Assert.assertTrue(dp.getLarge().isDisplayed());
	}
	@Test
	public void verifypProductCount()
	{
		hp.ClickDress();
		Assert.assertTrue("Failed:Count Mismatch",dp.getProductNumberHeader()==dp.productCount());
	}

}
