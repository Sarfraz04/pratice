package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Program2Test {
	@Test(groups="smoke")
	public void test() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("open browser");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		System.out.println("hi");
		System.out.println("hi hello");
		}


}
