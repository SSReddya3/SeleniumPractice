import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F0003_IFrames3 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	
	
	driver.findElement(By.xpath("//li[@class='active']/a[@class='analystic']")).click();
	
	driver.switchTo().frame("singleframe");
	
	 Thread.sleep(1000);
		
	 System.out.println("-----------singleframe----------- ");
	 Thread.sleep(1000);
		
	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sivasankarreddyaswhjhjvjkhvvggff");
		
	driver.switchTo().defaultContent();
	
	
	 Thread.sleep(1000);
	
		
	 


      Thread.sleep(1000);
      
      System.out.println("-----------completed2----------- ");
		driver.close();
	}

}
