import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver cdriver = new ChromeDriver();

		cdriver.manage().window().maximize();
		cdriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		cdriver.findElement(By.id("autosuggest")).sendKeys("Pa");
		Thread.sleep(3000);

		List<WebElement> items = cdriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement item : items) {

			if (item.getText().equalsIgnoreCase("Pakistan")) {
				item.click();
				break;
			}

		}

	}

}
