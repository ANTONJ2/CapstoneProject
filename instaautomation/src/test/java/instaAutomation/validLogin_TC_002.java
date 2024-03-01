package instaAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validLogin_TC_002 {
	WebDriver driver;
	public void validlogin(WebDriver driver) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.google.com");
		Thread.sleep(3);
		driver.findElement(By.name("q")).sendKeys("instagram"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement instalink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")));
		instalink.click();
		Thread.sleep(5);
		
		//sending valid credentials
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("vw828276"+Keys.TAB);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys("Jo@884895430
																						"+Keys.ENTER);
	}

}
