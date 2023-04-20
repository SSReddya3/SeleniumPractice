import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D0001_Drodown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
	
	
	Select sel=new Select(driver.findElement(By.xpath("//*[@id='dropdown']")));
	
	 System.out.println("-----------completed1----------- ");
	
	//sel.selectByIndex(0);
			 Thread.sleep(2000);
	sel.selectByValue("2");	
	 Thread.sleep(1000);
		
	 sel.selectByVisibleText("Option 1");
	 
      Thread.sleep(1000);
      
      System.out.println("-----------completed2----------- ");
		driver.close();
	}

}
