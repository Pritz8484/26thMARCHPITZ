package kiteLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogInByUserValue {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		// for finding locatores
		WebElement uid = driver.findElement(By.id("userid"));
		WebElement upass = driver.findElement(By.id("password"));
		WebElement loginb = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		// for execution
		uid.sendKeys("AXR612");
		Thread.sleep(500);
		upass.sendKeys("Pvb@8484");
		Thread.sleep(500);
		loginb.click();
		Thread.sleep(1000);
		//for pin
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
	
		//for execution
		pin.sendKeys("848400");
		Thread.sleep(500);
		log.click();
		Thread.sleep(500);
				
		WebElement actualid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String realid = actualid.getText();
		System.out.println(realid);
		String expectedid = "AXR612";
		
		if(realid.equals(expectedid))
		{
			System.out.println("User id is Valid");
		}
		else
		{
			System.out.println("Please enter Valid Id");
		}
		 actualid.click();
		 Thread.sleep(1000);
		 
		//for log out account
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		

	}

}
