import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll_Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver= new ChromeDriver();
		cDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
				cDriver.manage().window().maximize();
				
				JavascriptExecutor js = (JavascriptExecutor) cDriver;
				
				js.executeScript("window.scrollBy(0,500)");
				
				js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
				
		List<WebElement>value	=cDriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			int sum=0;
			
			for(int i= 0;i<value.size();i++){
			
			sum=sum+ Integer.parseInt(value.get(i).getText());
					
					
				
	}
	int actualValue=Integer.parseInt(cDriver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			Assert.assertEquals(sum, actualValue);
			
			List<WebElement>product	=cDriver.findElements(By.cssSelector(".table-display td:nth-child(3)"));

			int sum2=0;
			
			for(int i= 0;i<product.size();i++){
			
			sum2=sum2+ Integer.parseInt(product.get(i).getText());
			

					
					
				
	}

			System.out.println(sum2);
			
	}
}
