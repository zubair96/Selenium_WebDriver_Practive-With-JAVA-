import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningClass {

	public static void main(String[] args) {
		// Invoke Browser
		// Chrome->ChromeDriver->Methods ( get(hitting url ) , close to close the
		// browsers,

		WebDriver driver = new ChromeDriver();

		driver.get("https://stage.memberportal.velux.quantum-h.com/at/login");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://stage.memberportal.velux.quantum-h.com/at/login");
		driver2.getTitle();
		System.out.println(driver2.getTitle());
		driver2.getCurrentUrl();
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		driver2.quit();

		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://stage.memberportal.velux.quantum-h.com/at/login");
		driver3.getTitle();
		System.out.println(driver3.getTitle());
		driver3.getCurrentUrl();
		System.out.println(driver3.getCurrentUrl());
		driver3.close();
		driver3.quit();

		int num = 5;
		String job = "F NT job";
		char letters = 'r';
		double k = 7.99;
		boolean mycard = true;
		int a;
		int b;

		System.out.print("enter a number");

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(arr2[2]);

	}

}
