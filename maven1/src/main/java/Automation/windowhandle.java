package Automation;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.get("https://demoqa.com/browser-windows");
    driver.manage().window().maximize();
    driver.findElement(By.id("windowButton")).click();
    
  // System.out.println( driver.getWindowHandle());  window id
     Set<String>allwindidSet=driver.getWindowHandles();
    
     
     Iterator<String>itr=allwindidSet.iterator();
     String parentWindow=itr.next();
     String childWindow=itr.next();
     
     System.out.println(parentWindow);
     System.out.println(childWindow);
     
     driver.switchTo().window(childWindow);
     System.out.println(driver.getPageSource());
     
     System.out.println(driver.getTitle());
     Thread.sleep(4000);
     driver.quit();
    
    }

}
