import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UI_Handling_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Date= "16";
		String Month= "7";
		String Year="2027";
		
		WebDriver cDriver= new ChromeDriver();
		cDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
				cDriver.manage().window().maximize();
				cDriver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).click();
				cDriver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
				cDriver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
				
				cDriver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
				cDriver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(Month)-1).click();
				cDriver.findElements(By.xpath("//abbr[text()='"+Date+"']")).click();
				
		Fo

	}

}
