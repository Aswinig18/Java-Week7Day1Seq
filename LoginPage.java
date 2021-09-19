package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.SpecificMethods;

public class LoginPage extends SpecificMethods {

	public  LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
		
		
	}
	public LoginPage enterUsername() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(5000);
		return this;

	}
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	public HomePage clickOnLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		HomePage hp=new HomePage(driver);
		return hp;
		

	}

}
