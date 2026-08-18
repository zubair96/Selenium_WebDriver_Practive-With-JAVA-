import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class UI_Handling_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Date= "16";
		String Month= "7";
		String Year="2027";
		String[] expectedDate = {Month,Date,Year};
		
		WebDriver cDriver= new ChromeDriver();
		cDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
				cDriver.manage().window().maximize();
				cDriver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).click();
				cDriver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
				cDriver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
				
				cDriver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
				cDriver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(Month)-1).click();
				cDriver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
				cDriver.findElements(By.cssSelector(".react-date-picker__inputGroup"));
			List<WebElement> actualDate= cDriver.findElements(By.cssSelector(".react-date-picker__inputGroup"));
				
		for(int i =1 ;i< actualDate.size();i++){
	Assert.assertEquals(actualDate.get(i).getAttribute("value"),expectedDate[i]);
			
			
		}

	}

}
