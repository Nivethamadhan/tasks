package Task_10;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		//Implicit wait-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@href='/register/']")).click();
		driver.findElement(By.id("name")).sendKeys("Tom");
		driver.findElement(By.id("email")).sendKeys("nivetha23031998@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tommy123#");
		driver.findElement(By.id("mobileNumber")).sendKeys("9080676537");
		driver.findElement(By.id("signup-btn")).click();
		 
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("nivetha23031998@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tommy123#");
		driver.findElement(By.id("login-btn")).click();
		driver.close();
	}

}
