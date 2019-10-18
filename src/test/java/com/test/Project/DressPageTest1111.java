package com.test.Project;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DressPageTest {

	BasePage bp;
	HomePageObject hp;
	DressPageObject dp;
	
	 public DressPageTest() {
		// TODO Auto-generated constructor stub
		bp=new BasePage();
		hp=new HomePageObject();
		dp=new DressPageObject();
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
