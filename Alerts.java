package org.sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/Users/machd/Documents/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Alert a = driver.switchTo().alert();
	a.accept();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//img[@alt='continue']")).click();
	a.accept();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	a.accept();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.xpath("//*[@id='Button2']")).click();
	a.accept();
	driver.close();
	
	
	
}
}
