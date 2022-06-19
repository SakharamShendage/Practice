package Automation;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

	public class implicitlywaits {
		@Test
		public void alertTest() {
			
		System.setProperty("webdriver.edge.driver","C:\\Jars\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("alert")).click();
		driver.switchTo().alert().accept();
		
		
		}
	}


