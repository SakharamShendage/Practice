package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandle {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://about.google/intl/en-GB/products/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@rel=\"noopener\"]")).click();
	
	Set<String>ids=driver.getWindowHandles();
	System.out.println(driver.getWindowHandles());
	
	
	Iterator<String>itr=ids.iterator();
	
	String parentids=itr.next();
	String childids=itr.next();
	String grandchildids=itr.next();
	
	driver.switchTo().window(grandchildids);
//	System.out.println(driver.getPageSource());
	driver.getTitle();
	System.out.println(driver.getTitle());

	
	driver.switchTo().window(parentids);
	driver.getTitle();
	System.out.println(driver.getTitle());
	}

}
