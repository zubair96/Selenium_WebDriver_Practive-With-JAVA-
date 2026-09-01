import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automate_Broken_links {
	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException  {
		WebDriver cDriver= new ChromeDriver();
		cDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
				cDriver.manage().window().maximize();
				String url= cDriver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
				
				//Single Link checking
				HttpURLConnection conn= (HttpURLConnection) new URI(url).toURL().openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int status= conn.getResponseCode();
				System.out.println(status);
				//Multiple links checking 
				
				List<WebElement> footerlinks= cDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
				
				SoftAssert a = new SoftAssert();
				for (WebElement flinks : footerlinks) {
					
					String url2= flinks.getAttribute("href");
					HttpURLConnection conn2= (HttpURLConnection) new URI(url2).toURL().openConnection();
					conn2.setRequestMethod("HEAD");
					conn2.connect();
					int status2=conn2.getResponseCode();
			
			a.assertTrue(status2<400, "The Link is Broken"+flinks.getText()+"is Broken with Status Code"+status2);		
	
	}
				
				a.assertAll();
	}
	
}
