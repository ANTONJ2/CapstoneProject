package instaAutomation;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maincallingmethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		//InvalidLogin_TC_001 il=new InvalidLogin_TC_001();
		//il.invalidlogin(driver,"instagram");
		//validLogin_TC_002 vl=new validLogin_TC_002();
		//vl.validlogin(driver);
		//followingFriends_TC_003 lp=new followingFriends_TC_003();
		//lp.likingPostsmethod(driver);
		postingpictures_TC004 pp=new postingpictures_TC004();
		pp.postingpicsmethod(driver);

	}

}
