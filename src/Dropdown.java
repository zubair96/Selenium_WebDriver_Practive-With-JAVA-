import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cdriver = new ChromeDriver();
		int i = 1;
		cdriver.manage().window().maximize();
		cdriver.get("https://www.spicejet.com/");

		Assert.assertFalse(
				cdriver.findElement(By.xpath("//div[@class='carousel-item active']//a[@class='carousel-row-item']"))
						.isSelected());
		cdriver.findElement(
				By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Armed Forces'])")).click();
		System.out.println(cdriver
				.findElements(By.cssSelector(
						"div[class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1p4rafz r-1otgn73']"))
				.size());

		cdriver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);

		cdriver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']/div[text()='MAA']"))
				.click();
		Thread.sleep(2000);

		cdriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div[33]"))
				.click();
		Thread.sleep(2000);

		cdriver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[4]/div/div"))
				.click();
		Thread.sleep(2000);

		if (cdriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]"))
				.getAttribute("style").contains("238")) {

			System.out.println("One way is selected");

		} else {
			System.out.println("Round trip is selected");
		}

		Thread.sleep(2000);

		cdriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]"))
				.click();
		Thread.sleep(5000);
		while (i < 5) {
			cdriver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;

		}

		cdriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']/div[1]")).click();

		cdriver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();

		// ONLY WORK FOR SELECT TAG
		// WebElement selectdrop =
		// cdriver.findElement(By.xpath("//div[text()='Currency']"));
		// Select drop= new Select(selectdrop);
		// drop.selectByIndex(3);
		// System.out.println(drop.getFirstSelectedOption().getText());
		// drop.selectByVisibleText("INR");
		// System.out.println(drop.getFirstSelectedOption().getText());
		// drop.selectByVisibleText("USD");
		// System.out.println(drop.getFirstSelectedOption().getText());

		// cdriver.close();
		// cdriver.quit();

	}

}
