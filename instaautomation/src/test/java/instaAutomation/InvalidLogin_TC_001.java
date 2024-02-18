package instaAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin_TC_001 {
	WebDriver driver;
public void invalidlogin(WebDriver driver,String inputtogoogle) throws InterruptedException {
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.com");
	Thread.sleep(3);
	driver.findElement(By.name("q")).sendKeys(inputtogoogle+Keys.ENTER);
	Thread.sleep(3);
	driver.findElement(By.xpath("/html/body/div[5]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
	Thread.sleep(5);
	//sending invalid credentials
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("vw.82sdf82"+Keys.TAB);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys("Jo@8848954307"+Keys.ENTER);
}

}
