import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A001_BrowserCommands2_With_Diffarent_Commands {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
//Opening the Web Page
		
		driver.get("https://book.spicejet.com/Login.aspx");


		
// Getting the  Title of the web page By using diffarent Commands
      String title= driver.getTitle();
       System.out.println("Title of the Page = "+title);
		
   	
// Getting the  Current URL of the web page By using diffarent Commands
      String  CurrentURL= driver.getCurrentUrl();
       System.out.println("Title of the Page = "+CurrentURL);
				
		
// Getting the   Page Source of the web page By using diffarent Commands
      String  PageSource= driver.getPageSource();
     //  System.out.println("Title of the Page"+PageSource);
		
 
    //Wait the 2 Seconds
		
    		Thread.sleep(2000);
    		
    //Opening the SME Travelers Web Page
    		driver.findElement(By.xpath("//a[contains(text() ,'SpiceShuttle')]")).click();
    //Wait the 2 Seconds
    		
    				Thread.sleep(4000);
    		
		driver.quit();
		
		
		
	}

}
