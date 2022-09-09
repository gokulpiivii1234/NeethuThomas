package com.norka.scripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.norka.Excelutility.Excelutility;
import com.norka.LoginPage.LoginPage;
import com.norka.LoginPage.LoginPage5;
import com.norka.automationconstants.AutomationConstants;
public class TestClass5 extends TestBase{
	
static LoginPage5 objlogin;
	
	
	@Test(priority=1)
	
	public static void verifyvalidlogin() throws IOException {
		String Inputname=Excelutility.getcelldata(4, 0);
		double EnterPassword=Excelutility.getcelldata1(4, 1);
		objlogin = new LoginPage5(driver);
		objlogin.SubmitButton();
		objlogin.setUsername(Inputname);
		objlogin.SetPassword(EnterPassword);
		objlogin.SubmitButton2();
		
		String ActualTitle= AutomationConstants.HOMEPAGETITLE;
		String ExpectedTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
}

}
