package testasser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ass1 {
	
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
		SoftAssert s=new SoftAssert();
		s.assertEquals(ob.getTitle(), "yahoo");
		s.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		s.assertAll();


	}
}
