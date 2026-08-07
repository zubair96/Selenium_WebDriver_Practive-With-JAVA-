import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cdriver = new ChromeDriver();

		cdriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		cdriver.manage().window().maximize();

		cdriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(cdriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(2000);
		cdriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(cdriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		Assert.assertEquals(cdriver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);
	}

}
