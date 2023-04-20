import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C003_Checkbox_Radio_Button_Operations {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
 //Opening the Web Page
		
  driver.get("https://www.htmlelements.com/demos/listbox/radio-buttons/");
		
  driver.switchTo().frame( driver.findElement(By.className("demo-frame")));
  
  
  WebElement  s=driver.findElement(By.xpath(" //div[@class='smart-thumb']"));
  Thread.sleep(5000);
 
 // WebElement  s=driver.findElement(By.xpath(" //div[@class='smart-thumb']"));
  Thread.sleep(5000);
 
  WebElement  me=driver.findElement(By.xpath("//span[normalize-space()='India']"));
  
  
  Actions act=new Actions(driver);
//act.dragAndDropBy(s, 0, 400).build().perform();
  act.moveToElement(me).build().perform();
//Move to Element	
//	act.dragAndDrop(drag1, drop).build().perform();
	System.out.println("----------- dragAnddrop completed---------- ");
	                   
//Wait the 2 Seconds
		
Thread.sleep(2000);
driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
Thread.sleep(5000);
     		
//Performing isSelected redio Button     		
System.out.println("Button Selected is "+driver.findElement(By.xpath("//span[normalize-space()='India']")).isSelected());
Thread.sleep(5000);
//Performing isDisplayed redio Button
System.out.println("Button isDisplayed is "+driver.findElement(By.xpath("//span[normalize-space()='India']")).isDisplayed());
Thread.sleep(5000);
//Performing isDisplayed redio Button
System.out.println("Button isEnabled is "+driver.findElement(By.xpath("//span[normalize-space()='India']")).isEnabled());
Thread.sleep(5000);
//Using Select Class for operating Dropdown


//Wait the 2 Seconds
		
		Thread.sleep(5000);
		
//Closing	 the WebPage	
		
		
		//driver.close();
		
		
		
	}

}
