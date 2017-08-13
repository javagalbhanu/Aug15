package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void testA() throws MalformedURLException{
		URL sys=new URL("http://127.0.0.1:4444/wd/hub");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(sys,browser);
		driver.get("http://www.google.com");
		driver.close();
	}
}
