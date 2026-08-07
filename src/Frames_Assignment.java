import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver = new ChromeDriver();
        cDriver.get("https://the-internet.herokuapp.com/");
        cDriver.manage().window().maximize();
        
        Actions a = new Actions(cDriver);
       
        a.moveToElement(cDriver.findElement(By.cssSelector("a[href='/nested_frames']"))).click().build().perform();	     
        

      
      cDriver.switchTo().frame(cDriver.findElement(By.name("frame-top")));
      cDriver.switchTo().frame(cDriver.findElement(By.name("frame-middle")));
      
      
    System.out.println(cDriver.findElement(By.xpath("//div[@id='content']")).getText());

	}

}
