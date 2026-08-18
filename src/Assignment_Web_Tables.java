

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Web_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver= new ChromeDriver();
		cDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		cDriver.manage().window().maximize();
		
	WebElement table=cDriver.findElement(By.cssSelector(".table-display"));
	
System.out.println("Row Count:"+ table.findElements(By.tagName("tr")).size());
	
System.out.println("Column Count:"+table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());	
	

List<WebElement> rowText =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

	System.out.println(rowText.get(0).getText());
	System.out.println(rowText.get(1).getText());
	System.out.println(rowText.get(2).getText());

	}

}
