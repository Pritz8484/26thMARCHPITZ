package getSizeSetPosition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class GetSizeTest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		

		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		Point p= new Point(100,200);
		driver.manage().window().setPosition(p);

	}

}
