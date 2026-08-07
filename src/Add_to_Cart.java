
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_to_Cart {

	public static void main(String[] args) {

		String[] product = { "Cauliflower", "Carrot", "Tomato" };
		int[] quantity = { 2, 3, 4 };

		WebDriver cDriver = new ChromeDriver();

		cDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		cDriver.manage().window().maximize();
		// cDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(cDriver, Duration.ofSeconds(5));
		addProduct(cDriver, product, quantity);
		addPromoCode(cDriver, wait);

	}

	public static WebDriver addProduct(WebDriver cDriver, String[] product, int[] quantity) {

		List<WebElement> productItem = cDriver.findElements(By.xpath("//h4[@class='product-name']"));
		List<String> itemSearch = Arrays.asList(product);

		for (int i = 0; i < productItem.size(); i++) {
			String[] getProdName = productItem.get(i).getText().split("-");
			String splitedProdName = getProdName[0].trim();

			if (itemSearch.contains(splitedProdName)) {

				int index = itemSearch.indexOf(splitedProdName); // matches product[] & quantity[]
				int clicksNeeded = quantity[index] - 1; // counter already starts at 1

				List<WebElement> incrementButtons = cDriver.findElements(By.xpath("//a[@class='increment']"));

				for (int k = 0; k < clicksNeeded; k++) {
					incrementButtons.get(i).click();
				}

				cDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}

		}
		return cDriver;
	}

	public static void addPromoCode(WebDriver cDriver, WebDriverWait wait) {
		cDriver.findElement(By.cssSelector("a[class='cart-icon']")).click();
		cDriver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		cDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		cDriver.findElement(By.cssSelector("button.promoBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(cDriver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
}
