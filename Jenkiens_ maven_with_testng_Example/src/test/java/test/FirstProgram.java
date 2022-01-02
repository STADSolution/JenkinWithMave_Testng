package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	@Test
	void method1()
	{
		System.out.println("inside method 1");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("after drive setup");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");;
		driver.findElement(By.name("btnK")).submit();
	}
@Test
void method2()
{
System.out.println("hello 2");
}
@Test
void show()
{
System.out.println("in show");
}
}
