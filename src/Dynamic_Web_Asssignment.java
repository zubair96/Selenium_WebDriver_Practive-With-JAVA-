import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Web_Asssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cDriver = new ChromeDriver();
        cDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        cDriver.manage().window().maximize();
        
        cDriver.findElement(By.id("checkBoxOption2")).click();
        
   String text= cDriver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
   
   
   cDriver.findElement(By.id("dropdown-class-example")).click();
   
            
   WebElement selectdrop = cDriver.findElement(By.id("dropdown-class-example"));
   
   Select drop= new Select(selectdrop);
   
   drop.selectByVisibleText(text);
   
   
   cDriver.findElement(By.id("name")).sendKeys(text);
   cDriver.findElement(By.id("alertbtn")).click();
   
 System.out.println(cDriver.switchTo().alert().getText().split(",")[0].trim().split(" ")[1]);
 
  //or
 
 String alertText= cDriver.switchTo().alert().getText();
 
 if(alertText.contains(text)) {
	 System.out.println("Alert Message Passed");
	
 }else{
	 System.out.println("Alert Message Passed");
 }
 
 
        
 cDriver.switchTo().alert().accept();

	}
	
}
