package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalaiselvi.j\\eclipse-workspace\\Frames\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
	//	WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
    //		driver.switchTo().frame(frame);
		WebElement lgn = driver.findElement(By.xpath("//input[@type='text']"));
        lgn.sendKeys("thilip1123");
        driver.quit();
	}

}
