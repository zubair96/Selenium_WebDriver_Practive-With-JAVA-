import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Waits_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver cDriver = new ChromeDriver();
		  int j=0;

	        cDriver.get("https://rahulshettyacademy.com/loginpagePractise/");
	        cDriver.manage().window().maximize();
	        
	       WebDriverWait wait= new WebDriverWait(cDriver,Duration.ofSeconds(5));
	       cDriver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	       cDriver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
	       cDriver.findElement(By.xpath("//label[2]")).click();
	       
	     WebElement ok=  wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
	     ok.click();
	 

	//cDriver.findElement(By.cssSelector("select[class='form-control']")).click();
	       	       
	       WebElement Type= cDriver.findElement((By.cssSelector("select[class='form-control']")));
	       
	       Select options= new Select(Type);
	       options.selectByIndex(0);
	       
	       cDriver.findElement(By.id("terms")).click();
	       cDriver.findElement(By.id("signInBtn")).click();
	       
	       wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
	       
	       
	 

	       
	       List<WebElement> productCount= cDriver.findElements(By.cssSelector("button[class='btn btn-info']"));
	       
	       for(int i = 0;i<productCount.size();i++) {
	    	   j++;
	    	   
	    	   cDriver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
	    	   
	    	   if(j==productCount.size()) {
	    		   cDriver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	    		   
	    		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success']")));
	    		   
	    	   }
	       }
	       
		     
	       
	       
		     

	}

}
