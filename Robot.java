import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
public static void main (String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "/Users/machd/Documents/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("Hello");
	Robot r= new Robot();
	
	
	Actions acc= new Actions(driver);
	acc.contextClick().perform();
	acc.doubleClick().perform();
	
	
	
}




}
