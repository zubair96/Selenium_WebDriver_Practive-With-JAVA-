import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) {
		WebDriver cdriver = new ChromeDriver();
		// WebDriver friver = new FirefoxDriver();
		// WebDriver edriver = new EdgeDriver();

		cdriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		cdriver.manage().window().maximize();

		// By ID
		cdriver.findElement(By.id("openwindow")).click();
		// By class
		cdriver.findElement(By.className("btn-style")).click();
		// By Name
		cdriver.findElement(By.name("show-hide")).click();
		// By tagName
		cdriver.findElement(By.tagName("input")).sendKeys("Practing");
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// By LinkText
		cdriver.findElement(By.linkText("Home")).click();
		cdriver.navigate().back();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// By PartiallinkText
		System.out.println(cdriver.findElement(By.partialLinkText("Open")).getText());
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// By CSS ID
		cdriver.findElement(By.cssSelector("#alertbtn")).click();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cdriver.switchTo().alert().accept();
		// By CSS ID
		cdriver.findElement(By.cssSelector("input#alertbtn")).click();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cdriver.switchTo().alert().accept();

		// By CSS Class
		// cdriver.findElement(By.cssSelector(".class2")).click();

		// or By CSS Class ()
		// cdriver.findElement(By.cssSelector("button.btn-primary")).click();

		// By CSS Attribute
		cdriver.findElement(By.cssSelector("input[id='hide-textbox']")).click();

		// By parent child CSS
		cdriver.findElement(By.cssSelector("label input[value='radio1']")).click();

		// By nth-child
		// cdriver.findElement(By.cssSelector("label input[value='radio1']")).click();
		// (can't be done on this side as doesn't have form)

		// By Xpth attribute
		cdriver.findElement(By.xpath("//input[@id='show-textbox']")).click();

		// By Xpth contains
		cdriver.findElement(By.xpath("//input[contains(@id,'hide-textbox')]")).click();

		// By Xpth text
		System.out.println(cdriver.findElement(By.xpath("//legend[text()='Element Displayed Example']")).getText());

		// By Xpth parent child and index
		System.out.println(cdriver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]")).getText());

		// By Xpth following sibiling
		System.out.println(cdriver
				.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label/following-sibling::label[2]"))
				.getText());
		// By Xpth following parent
		System.out.println(
				cdriver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label/parent::fieldset/legend"))
						.getText());
		// Xpath absolute
		System.out.println(cdriver.findElement(By.xpath("/html/body/header/a[@class='blinkingText']")).getText());

		cdriver.close();
		cdriver.quit();
	}

}
