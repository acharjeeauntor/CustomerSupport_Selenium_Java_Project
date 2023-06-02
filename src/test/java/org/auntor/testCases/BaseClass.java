package org.auntor.testCases;

import org.auntor.utilities.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.*;

public class BaseClass {

	public static Config config = new Config();
	public static String baseUrl = config.getBaseUrl();
	public static String userEmail = config.getUserEmail();
	public static String userPassword = config.getUserPassword();
	
	
	public static WebDriver driver;

	@Parameters({"browser"})
	@BeforeClass
	public void appSetUp(String br) throws InterruptedException {

		if (br.equals("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				//options.setHeadless(true)
				driver = new ChromeDriver(options);
				driver.get(baseUrl);
			Thread.sleep(3000);
		} else if (br.equals("firefox")) {
				FirefoxOptions options = new FirefoxOptions();
				//options.setHeadless(true);
				driver = new FirefoxDriver(options);
			driver.get(baseUrl);
			Thread.sleep(3000);
		}else if(br.equals("safari")) {
			SafariOptions options = new SafariOptions();
			 driver = new SafariDriver(options);
			driver.get(baseUrl);
			Thread.sleep(3000);
		}
		driver.manage().window().maximize();
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
