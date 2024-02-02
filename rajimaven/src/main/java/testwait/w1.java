package testwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5s
		System.out.println(ob.getCurrentUrl());//5s
		ob.findElementByLinkText("Im");//5s
		ob.quit();//5s
		
		
	

}
}
