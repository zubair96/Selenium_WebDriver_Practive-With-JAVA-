import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_Scoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver = new ChromeDriver();

		cDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

		cDriver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) cDriver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,500)");

// Getting All links Count
		System.out.println("Links Whole Page:");
		System.out.println(cDriver.findElements(By.tagName("a")).size());

		WebElement footerDriver = cDriver.findElement(By.id("gf-BIG"));

//Getting Footer All links Count
		System.out.println("Links in the footer section:");
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		WebElement Col = footerDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println("Links in the 1st coloumn of the section:");
		System.out.println(Col.findElements(By.tagName("a")).size());

//Opening links in New Tab

		String newTabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

		for (int i = 1; i < Col.findElements(By.tagName("a")).size(); i++) {

			Col.findElements(By.tagName("a")).get(i).sendKeys(newTabs);
		}

		// Getting the Page title of Open Pages
		Set<String> windows = cDriver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		System.out.println("Pages Titles:");
		while (it.hasNext()) {
			cDriver.switchTo().window(it.next());
			System.out.println(cDriver.getTitle());

		}

	}

}
