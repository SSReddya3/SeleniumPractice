import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E002_Alert_and_PopUp_Dissmiss {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
 //Opening the Web Page
		
  driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
                                
//Wait the 2 Seconds
		
     		Thread.sleep(2000);
     		
//Alert_and_PopUp   
     		
driver.findElement(By.xpath("//*[@name='confirmalertbox']")).click();

Thread.sleep(3000);
//Geting the Alert_and_PopUp  text message
System.out.println("1) Alertclass text is ="+driver.switchTo().alert().getText());

Thread.sleep(3000);


//click ok Button in the Alert_and_PopUp 	

driver.switchTo().alert().accept();


System.out.println("2) Alertclass result is ="+driver.findElement(By.xpath("//*[@id='demo']")).getText());
Thread.sleep(3000);	
driver.findElement(By.xpath("//*[@name='confirmalertbox']")).click();

Thread.sleep(3000);

System.out.println("3) Alertclass text is ="+driver.switchTo().alert().getText());

driver.switchTo().alert().dismiss();

	
System.out.println("4) Alertclass result is ="+driver.findElement(By.xpath("//*[@id='demo']")).getText());

	



//Wait the 2 Seconds
		
		Thread.sleep(5000);
		
//Closing	 the WebPage	
		
		
		driver.close();
		
		
		
	}

}
