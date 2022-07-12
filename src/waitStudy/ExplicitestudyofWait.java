package waitStudy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitestudyofWait {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/");
		WebDriverWait ww= new WebDriverWait(driver, Duration.ofNanos(1000));
		
		WebElement locator = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		ww.until(ExpectedConditions.visibilityOf(locator));
		locator.click();
		
		
	}

	
}
