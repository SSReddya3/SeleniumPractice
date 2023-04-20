import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F0002_Iframe_with_in_an_Iframe {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		 System.out.println("----------- url Entered----------- ");
	
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	
	 System.out.println("-----------Button ----------- ");
	 
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='Multiple']/iframe")));
	System.out.println("-----------enterd in 1st frame ----------- ");
	
	driver.switchTo().frame(driver.findElement(By.xpath( "//div[@class='iframe-container']/iframe")));
	System.out.println("-----------enterd in 2st frame ----------- ");
	
	 Thread.sleep(1000);
		
	 System.out.println("-----------singleframe----------- ");
		
	
		
	 Thread.sleep(1000);
		
	 driver.findElement(By.xpath("//div[@class='row']/div/input[@type='text']")).sendKeys("Sivasankarreddyaswhjhjvjkhvvggff");
		
	 System.out.println("-----------text enterd ----------- ");
		
	driver.switchTo().defaultContent();
	
	
	 Thread.sleep(1000);
	
		
	 


      Thread.sleep(1000);
      
      System.out.println("-----------completed2----------- ");
		driver.close();
	}

}
