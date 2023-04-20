import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A001_BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
//Opening the Web Page
		
		driver.get("https://book.spicejet.com/Login.aspx");
		

				
// Getting the   Page Source of the web page
       System.out.println("Title of the Page"+driver.getPageSource());
		
    // Getting the  Title of the web page
       System.out.println("Title of the Page"+driver.getTitle());
		

    // Getting the   Current URL of the web page
       System.out.println("Title of the Page"+driver.getCurrentUrl());
  
					
//Wait the 2 Seconds
		
		Thread.sleep(2000);
		
//Opening the SME Travelers Web Page
		driver.findElement(By.xpath("//a[contains(text() ,'SpiceShuttle')]")).click();
//Wait the 2 Seconds
		
				Thread.sleep(2000);		
		
//Closing	 the WebPage	
		
		
		
		driver.close();
		
		
		
	}

}
