import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E003_Alert_and_PopUp_SendMessage {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
//Maximizeing the Window	
		
		//driver.manage().window().maximize();
		
 //Opening the Web Page
		
  driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
                                
//Wait the 2 Seconds
		
     		Thread.sleep(2000);
     		
     		
     		
     		
//Alert_and_PopUp   
     		
     		
driver.findElement(By.xpath("//*[@name='promptalertbox1234']")).click();

Thread.sleep(3000);
//Geting the Alert_and_PopUp  text message
System.out.println("1) Alertclass text is ="+driver.switchTo().alert().getText());

Thread.sleep(3000);


//click ok Button in the Alert_and_PopUp 	

driver.switchTo().alert().accept();


System.out.println("2) Alertclass result is ="+driver.findElement(By.xpath("//*[@id='demoone']")).getText());
Thread.sleep(3000);	
driver.findElement(By.xpath("//*[@name='promptalertbox1234']")).click();

Thread.sleep(3000);

System.out.println("3) Alertclass text is ="+driver.switchTo().alert().getText());

//click dismiss Button in the Alert_and_PopUp 
driver.switchTo().alert().dismiss();

	
System.out.println("5) Alertclass result is ="+driver.findElement(By.xpath("//*[@id='demoone']")).getText());

Thread.sleep(3000);	
driver.findElement(By.xpath("//*[@name='promptalertbox1234']")).click();

Thread.sleep(3000);

System.out.println("6) Alertclass text is ="+driver.switchTo().alert().getText());

//Send the Message on Alert_and_PopUp 

Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@name='promptalertbox1234']")).click();
	

	driver.switchTo().alert().sendKeys("SivaSankarReddyAnkireddyPalle");

	Thread.sleep(3000);

	System.out.println("7) Alertclass result is ="+driver.findElement(By.xpath("//*[@id='demoone']")).getText());



//Wait the 2 Seconds
		
		Thread.sleep(5000);
		
//Closing	 the WebPage	
		
		
		driver.close();
		
		
		
	}

}
