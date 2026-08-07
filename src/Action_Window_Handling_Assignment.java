import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_Window_Handling_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver cDriver = new ChromeDriver();
	        cDriver.get("https://the-internet.herokuapp.com/");
	        cDriver.manage().window().maximize();
	        
	        Actions a = new Actions(cDriver);
	        
	        a.moveToElement(cDriver.findElement(By.cssSelector("a[href='/windows']"))).click().build().perform();	        
	        cDriver.findElement(By.cssSelector("a[href='/windows/new']")).click();
	        
	        WebDriverWait wait= new WebDriverWait(cDriver,Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("div[class='example'] h3"))));
	        
	        Set<String> windows = cDriver.getWindowHandles();     
            Iterator<String> it = windows.iterator();
	        
	        String parenttab= it.next();
	        String childtab=it.next();
	        
	        
	    
	        
	        cDriver.switchTo().window(childtab);
	        
	        System.out.println(cDriver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	        cDriver.close();
	        
	        cDriver.switchTo().window(parenttab);    
	       System.out.println(cDriver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
