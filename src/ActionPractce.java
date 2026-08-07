import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionPractce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver = new ChromeDriver();
		
        cDriver.get("https://www.amazon.in/");
        cDriver.manage().window().maximize();
        
        Actions a = new Actions(cDriver);
         WebDriverWait w = new WebDriverWait(cDriver, Duration.ofSeconds(5));
         
         w.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        
        a.moveToElement(cDriver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
        
        a.moveToElement(cDriver.findElement(By.id("nav-search-submit-button"))).keyUp(Keys.SHIFT).click().build().perform();
  cDriver.navigate().back();
        
        a.moveToElement(cDriver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
       
        
	}

}
