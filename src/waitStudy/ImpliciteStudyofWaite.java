package waitStudy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteStudyofWaite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
		

	}

}
