package Automation;

    import java.time.Duration;
	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class explicitwaits {

		    @Test
		    public void explicitTest() {
			System.setProperty("webdriver.edge.driver","C:\\Testing Tool\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
			driver.findElement(By.id("alert")).click();
			
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(1000));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("populate-text")).click();
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Selenium Webdriver']"))));
		    wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("h2")),"Selenium Webdriver"));
			boolean t=driver.findElement(By.xpath("//*[text()='Selenium Webdriver']")).isDisplayed();
		    System.out.println(t);
		
		
		    driver.findElement(By.id("display-other-button")).click();
		    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hidden"))));
		    driver.findElement(By.id("hidden")).click();
	}
  }
