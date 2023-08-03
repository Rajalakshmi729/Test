package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testflow {
	
	WebDriver driver;
	
	@Test
	public void launch() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 driver.get("http://170.187.239.121:8081/");
	 driver.findElement(By.xpath("//a[text()='Login']")).click();

	}
	

}
