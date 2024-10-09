package Task_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Implicit wait-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element1=driver.findElement(By.xpath("draggable"));
		WebElement element2=driver.findElement(By.id("droppable"));
		Actions objAct=new Actions(driver);
		
		objAct.dragAndDrop(element1,element2)//drag and drop
		.build()
		.perform();
		
		String x=element2.getText();
		if(x.equalsIgnoreCase("Dropped !")) {
			System.out.println("Dragged and drop successful");
		}
		else
		{
			System.out.println("Dragged and dropped unsuccessful");
		}
	}

}
