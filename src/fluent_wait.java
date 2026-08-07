import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class fluent_wait {

	public static void main(String[] args) {
		 
		WebDriver cDriver = new ChromeDriver();
		
	        cDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	        cDriver.manage().window().maximize();
	        
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(cDriver)
	        	      .withTimeout(Duration.ofSeconds(30L))
	        	      .pollingEvery(Duration.ofSeconds(5L))
	        	      .ignoring(NoSuchElementException.class);

	        	  WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        	    public WebElement apply(WebDriver driver) {	        	   
	            	if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())       
	            	{                
	            	
	            		return driver.findElement(By.cssSelector("[id='finish'] h4"));              
	            		
	            	}else 
	            		
	            		return null;          
	            	
	            }        })  ;
	}}
	        	  
	
