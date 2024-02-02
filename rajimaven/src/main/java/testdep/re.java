package testdep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testlist.lis.class)
public class re {
	
	ChromeDriver ob;
	@Test(priority=0, description="visiting google",groups="Raji")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximisinggoogle",groups="Raji")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing google",groups="Raji",invocationCount=2)
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking on images",dependsOnGroups="Raji")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing google",dependsOnGroups="Raji",timeOut=4000)
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
