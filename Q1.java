package Task_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Implicit wait-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.id("datepicker"));
		driver.switchTo().frame("datepicker");
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next']"));
		
		WebElement d = driver.findElement(By.cssSelector("//table/thead/tbody/tr[4]/td[6]"));
		d.click();
		
		String val=driver.findElement(By.cssSelector("//table/thead/tbody/tr[4]/td[6]")).getText();//get the value of date
		System.out.println(val);
		driver.close();
		driver.quit();

}}
