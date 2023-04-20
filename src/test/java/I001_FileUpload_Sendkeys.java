import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I001_FileUpload_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
 //Opening the Web Page
		
  driver.get("http://sme.spicejet.com/Airline/SMERegister");
		
                                
//Wait the 2 Seconds
		
     		Thread.sleep(2000);
     		
     		
driver.findElement(By.xpath("//*[@id='smeRegistration_OrganizationName']")).sendKeys("SS SOFT Solutions");
Thread.sleep(5000);
//Using Select Class for operating Dropdown

Select sel=new Select(driver.findElement(By.xpath("//*[@id='IndustrialBody']")));
Thread.sleep(5000);
     	sel.selectByIndex(1);
     	
     	Thread.sleep(5000);
     	
     	sel.selectByValue("2");
     	
     	Thread.sleep(5000);
     	
     	sel.selectByVisibleText("ASSOCHAM");
     	Thread.sleep(5000);
     	
driver.findElement(By.xpath("//*[@id='INBRegistrationNumber']")).sendKeys("sd254125"); 
driver.findElement(By.xpath("//*[@id='INBRegistrationNumber']")).sendKeys("cda125dwrc");
driver.findElement(By.xpath("//*[@id='smeRegistration_RegisteredAddress']")).sendKeys("1-44,asefr,deadfc,papap");

WebElement region=driver.findElement(By.xpath("//*[@id='smeRegistration_Region']"));
     		
      Select sel1=new Select(region);
       sel1.selectByIndex(0);
       sel1.selectByValue("4");
       sel1.selectByVisibleText("South");



driver.findElement(By.xpath("//*[@id='smeRegistration_City']")).sendKeys("kadapa");
driver.findElement(By.xpath("//*[@name='smeRegistration.State']")).sendKeys("ap");
driver.findElement(By.name("smeRegistration.Pincode")).sendKeys("621041");
driver.findElement(By.xpath("//input[@id='smeRegistration_ContactPhone']")).sendKeys("9510234678");
   driver.findElement(By.xpath("//*[@name='smeRegistration.Fax']")).sendKeys("9510234678");
   driver.findElement(By.xpath("//*[@name='smeRegistration.Website']")).sendKeys("www.sssoftsolutuions.com");       
 driver.findElement(By.xpath("//*[@name='smeRegistration.PANNumber']")).sendKeys("dxsae5482r");
 

driver.findElement(By.id("smeRegistration_PANFile")).sendKeys("C:\\Users\\ssred\\OneDrive\\Pictures\\Screenshots\\2023-04-09.png");
       
driver.findElement(By.id("btnSubmit")).click();



WebElement title=driver.findElement(By.xpath("//*[@id='smeRegAuthorizedSignatoryDetail_Title']"));
Select tt=new Select(title);
tt.selectByValue("1");
driver.findElement(By.xpath("//*[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("ss");
driver.findElement(By.name("smeRegAuthorizedSignatoryDetail.MiddleName")).sendKeys("reddy");
driver.findElement(By.xpath("//*[@id='smeRegAuthorizedSignatoryDetail_LastName']")).sendKeys("Ankireddypalle");
   driver.findElement(By.xpath("//*[@id='EmailAddress']")).sendKeys("9510234678@gmail.com");
  
   driver.findElement(By.xpath("//input[@id='smeRegistration_ContactPhone']")).sendKeys(Keys.CONTROL+"A",Keys.CONTROL+"C");
   
   driver.findElement(By.xpath("//input[@id='txtMobile']")).sendKeys(Keys.CONTROL+"V");       
 
   driver.findElement(By.xpath("//input[@id='txtMobile']")).sendKeys("9510234678"); 
   
driver.findElement(By.id("btnSubmit")).click();


System.out.println(driver.findElement(By.xpath("(//*[@class='alert alert-warning'])[1]")).getText());

//Wait the 2 Seconds
Thread.sleep(5000);

driver.findElement(By.id("smeRegistration_PANFile")).sendKeys("D:\\March2023\\Selenium_Practice\\src\\screen1.png");

		
		Thread.sleep(5000);
		
//Closing	 the WebPage	
		
		
		//driver.close();
		
		
		
	}

}
