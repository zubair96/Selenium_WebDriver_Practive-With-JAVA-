import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIAssigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cdriver = new ChromeDriver();
		
		
		cdriver.manage().window().maximize();
		cdriver.get("https://rahulshettyacademy.com/angularpractice/");
		cdriver.findElement(By.cssSelector("form input[name='name']")).sendKeys("Zubair Ahmed");
		cdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("Zubairahmed7073@gmail.com");
		cdriver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
		cdriver.findElement(By.id("exampleCheck1")).click();
		WebElement drop = cdriver.findElement(By.id("exampleFormControlSelect1"));

		Select gen = new Select(drop);
		gen.selectByIndex(0);

		cdriver.findElement(By.id("inlineRadio1")).click();
		cdriver.findElement(By.xpath("//input[@type='date']")).sendKeys("18/03/1998");
		cdriver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		Thread.sleep(2000);

		String msg = cdriver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div")).getText();
		msg = msg.replace("×", "").trim();
		System.out.println(msg);

	}

}
