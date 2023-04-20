import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B002_BrowseNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
                                 //Opening the Web Page
		
		                                                 driver.get("https://demo.guru99.com/test/newtours/register.php");
		
                                 // Getting the  Title of the web page
                                                            System.out.println("Title of the Page"+driver.getTitle());
		

                                 // Getting the   Current URL of the web page
                                                    System.out.println("Title of the Page"+driver.getCurrentUrl());

//Wait the 2 Seconds
		
     		Thread.sleep(2000);
     		
// Open the new web page By Using Navigation Commands
       driver.navigate().to("https://the-internet.herokuapp.com/tables");
   
                                 // Getting the Current Page Title of the web page
                                                System.out.println("Title of the Page"+driver.getTitle());		

                                // Getting the   Current URL of the web page
                                                System.out.println("Title of the Page"+driver.getCurrentUrl());
       
//Go Back To Privies Web Page
       
       driver.navigate().back();
       
                                // Getting the Current Page Title of the web page
                                                 System.out.println("Title of the Page"+driver.getTitle());		

                                // Getting the   Current URL of the web page
                                                 System.out.println("Title of the Page"+driver.getCurrentUrl());
        
//Go To Forward Web Page
       
       driver.navigate().forward();
         
                                  // Getting the Current Page Title of the web page
                                                  System.out.println("Title of the Page"+driver.getTitle());		

                                  // Getting the   Current URL of the web page
                                                   System.out.println("Title of the Page"+driver.getCurrentUrl());
       
 //Refresh the WebPage
       driver.navigate().refresh();

                                  // Getting the Current Page Title of the web page
                                                   System.out.println("Title of the Page"+driver.getTitle());		

                                  // Getting the   Current URL of the web page
                                                    System.out.println("Title of the Page"+driver.getCurrentUrl());
        
       
       
       
//Wait the 2 Seconds
		
		Thread.sleep(2000);
		
//Closing	 the WebPage	
		
		
		
		driver.close();
		
		
		
	}

}
