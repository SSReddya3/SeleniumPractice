import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G0003_drag_AND_drop_ActionClass2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
		
	
		 System.out.println("----------- url Entered----------- ");
		 
		Thread.sleep(1000);
//Action Class		
WebElement drag1=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement drop=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
	Actions act=new Actions(driver);

//Move to Element	
	act.dragAndDrop(drag1, drop).build().perform();
	System.out.println("----------- dragAnddrop completed---------- ");
	
	Thread.sleep(1000);
	


 Thread.sleep(1000);
 
 System.out.println("-----------completed----------- ");
	driver.close();
 }

}
