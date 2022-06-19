package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class select {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	WebElement drpdown=driver.findElement(By.id("oldSelectMenu"));
	Select coloursList=new Select(drpdown);
	
	//visible text
	
	coloursList.selectByVisibleText("Black"); 
	Thread.sleep(3000);
	
     //by value
	
	coloursList.selectByValue("7"); 
	Thread.sleep(3000);
	
	
	//by index
	
	coloursList.selectByIndex(3);  
	Thread.sleep(5000);
	
	List<WebElement>Multiclor=coloursList.getOptions();
	
	for(WebElement colour:Multiclor) {
	
	System.out.println(colour.getText());
					
	}
	Thread.sleep(4000);
	driver.close();
	}
 }


