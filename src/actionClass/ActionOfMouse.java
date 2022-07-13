package actionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOfMouse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Hii I modified pritam repo");

		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

	}

}
