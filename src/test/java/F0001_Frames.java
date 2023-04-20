import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F0001_Frames {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/frames");
		
	
	
	driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();
	
	driver.switchTo().frame("frame-top");
	
	 Thread.sleep(1000);
		
	 System.out.println("-----------frame-top----------- ");
	 Thread.sleep(1000);
		
	
	driver.switchTo().frame("frame-left");
	
	 Thread.sleep(1000);
	
		
	 
	 System.out.println("-----------frame-left----------- ");
	 Thread.sleep(1000);
		
	 driver.switchTo().parentFrame();
	 driver.switchTo().frame("frame-middle");
		
	 Thread.sleep(1000);
		
	 System.out.println("-----------frame-middle----------- ");
	 Thread.sleep(1000);
		
	 driver.switchTo().parentFrame();
	 
	 driver.switchTo().frame("frame-right");
		
	 Thread.sleep(1000);
		
	 System.out.println("-----------frame-right----------- ");
	 Thread.sleep(1000);
		
	 driver.switchTo().parentFrame();
	 driver.switchTo().parentFrame();
	
	 Thread.sleep(1000);
 driver.switchTo().parentFrame();
	 
	 driver.switchTo().frame("frame-bottom");
		
	 Thread.sleep(1000);
		
	 System.out.println("-----------frame-bottom----------- ");
	 Thread.sleep(1000);
		
	// driver.switchTo().parentFrame();
	// driver.switchTo().parentFrame();
	 
	 driver.switchTo().defaultContent();
      Thread.sleep(1000);
      
      System.out.println("-----------completed2----------- ");
		driver.close();
	}

}
