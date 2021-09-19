package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.SpecificMethods;

public class MyHome extends SpecificMethods
{
	public  MyHome(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyLeads clickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);

	}

}
