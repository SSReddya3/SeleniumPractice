import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H0001_Keyboard_Operations {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 //Opening the Web Page
		
		  driver.get("https://nxtgenaiacademy.com/demo-site");
				
		                                
		//Wait the 2 Seconds
				
		     		Thread.sleep(2000);
		     		
		driver.findElement(By.name("vfb-5")).sendKeys("Siva");
		driver.findElement(By.name("vfb-5")).sendKeys(Keys.CONTROL+"A",Keys.CONTROL+"c");
		driver.findElement(By.id("vfb-7")).sendKeys(Keys.CONTROL+"V");
		
		driver.findElement(By.id("vfb-7")).sendKeys("sankar");
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("vfb-13[address]")).sendKeys("sankarapuram");       
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("ss");
		driver.findElement(By.id("vfb-13-city")).sendKeys("sasiram");
		driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("ap");
		driver.findElement(By.name("vfb-13[zip]")).sendKeys("124565");       
		       
		List<WebElement> Country= driver.findElements(By.xpath("(//span[@role='combobox'])[1]"));

		//List<WebElement> Country=Country1.equals("india");

		
		driver.findElement(By.id("vfb-14")).sendKeys("sankar1234@gmail.com");
		       
 Thread.sleep(1000);
 
 System.out.println("-----------completed----------- ");
	driver.close();
 }

}
