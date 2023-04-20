import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G0006_RightClick_ActionClass3 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
		
	
		 System.out.println("----------- url Entered----------- ");
		 
		Thread.sleep(1000);
//Action Class		
WebElement drag1=driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
drag1.click();
WebElement drag2=driver.findElement(By.xpath("//div[@id='acceptable']"));
		
	Actions act=new Actions(driver);

//Move to Element	
	
	
	Thread.sleep(3000);	
	act.contextClick(drag2).build().perform();
	System.out.println("----------- RightClick completed---------- ");
	
	Thread.sleep(3000);
	


 Thread.sleep(1000);
 
 System.out.println("-----------completed----------- ");
	driver.close();
 }

}
