package instaAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class followingFriends_TC_003 {
	WebDriver driver;
public void likingPostsmethod(WebDriver driver) throws InterruptedException {
	Actions action=new Actions(driver);
	validLogin_TC_002 vl=new validLogin_TC_002();
	vl.validlogin(driver);
	Thread.sleep(5);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement searchbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[1]/div/div[2]/div[2]/span/div")));
	searchbutton.click();
	Thread.sleep(1);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("naslen");
	Thread.sleep(4);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/a[1]/div[1]")).click();
	Thread.sleep(2);
	try {
driver.findElement(By.xpath("//*[(text()='Follow')]")).click();
	}catch(Exception e) {
		System.out.println("error");
	}
	
}
}
