import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-gener WebDriver cDriver = new ChromeDriver();
		WebDriver cDriver = new ChromeDriver();

		cDriver.get("https://rahulshettyacademy.com/loginpagePractise/");
		cDriver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(cDriver, Duration.ofSeconds(5));
		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/a[1]")));
		cDriver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();

		Set<String> windows = cDriver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String Parenttab = it.next();
		String Childtab = it.next();
		cDriver.switchTo().window(Childtab);

		System.out.println(cDriver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId = cDriver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		
		cDriver.switchTo().window(Parenttab);
		
		  cDriver.findElement(By.id("username")).sendKeys(emailId);
	}

}
