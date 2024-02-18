package instaAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class postingpictures_TC004 {
	WebDriver driver;
public void postingpicsmethod(WebDriver driver) throws InterruptedException, AWTException {
	validLogin_TC_002 vl=new validLogin_TC_002();
	vl.validlogin(driver);
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[(text()='Create')]")).click();
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[(text()='Select from computer')]")).click();
	Robot robo=new Robot();
	robo.delay(3000);
	//copying to clipboard
	StringSelection str=new StringSelection("C:\\Users\\HP\\OneDrive\\Desktop\\forinstaautomation\\forinstaautomation 1.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	//pasting in the inputbox
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.delay(3000);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.delay(3000);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3);
    driver.findElement(By.xpath("//*[(text()='Next')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[(text()='Next')]")).click();
    Thread.sleep(2000);
    //Share
    driver.findElement(By.xpath("//*[(text()='Share')]")).click();
    
    
}
}
