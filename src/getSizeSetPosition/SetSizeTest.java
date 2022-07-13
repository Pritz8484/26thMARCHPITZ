package getSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d= new Dimension(1800,1100);
		
		driver.manage().window().setSize(d);
		
		System.out.println("2 time modified");
		

	}

}
