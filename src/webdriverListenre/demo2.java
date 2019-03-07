package webdriverListenre;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(d);
		driver.register(new demo1());
		//Assert.fail();
		driver.get("htdftps://www.google.com");
		//driver.close();
		
	}

}
