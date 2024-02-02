package mav;

import org.openqa.selenium.chrome.ChromeDriver;

public class m1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//step2: create an object for chromedriver class
		ChromeDriver ob= new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.mycontactform.com");
		

	}

}
