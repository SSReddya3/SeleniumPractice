import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C001_WebElements {

	public static void main(String[] args) throws InterruptedException {
		
//Opening the Browser		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//Maximizeing the Window	
		
		driver.manage().window().maximize();
		
 //Opening the Web Page
		
  driver.get("https://nxtgenaiacademy.com/demo-site");
		
                                
//Wait the 2 Seconds
		
     		Thread.sleep(2000);
     		
driver.findElement(By.name("vfb-5")).sendKeys("Siva");
driver.findElement(By.id("vfb-7")).sendKeys("sankar");
driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.name("vfb-13[address]")).sendKeys("sankarapuram");       
driver.findElement(By.name("vfb-13[address-2]")).sendKeys("ss");
driver.findElement(By.id("vfb-13-city")).sendKeys("sasiram");
driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("ap");
driver.findElement(By.name("vfb-13[zip]")).sendKeys("124565");       
       
List<WebElement> Country= driver.findElements(By.xpath("(//span[@role='combobox'])[1]"));

//List<WebElement> Country=Country1.equals("india");

for(int i=1;i<Country.size();i++) {
	String list=Country.get(i).getText();
	System.out.println(i+"Country in tne list"+list);
	
	if(list.equalsIgnoreCase("india"))
			{
		System.out.println(list);
		Country.get(i).click();
			}
			

}


driver.findElement(By.id("vfb-14")).sendKeys("sankar1234@gmail.com");
       
//Wait the 2 Seconds
		
		Thread.sleep(2000);
		
//Closing	 the WebPage	
		
		
		
		//driver.close();
		
		
		
	}

}
