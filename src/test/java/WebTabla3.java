import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabla3 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/tables");
		
	List<WebElement>row=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));         //table[@id='table1']/tbody/tr[1]/td[1] 
	List<WebElement>col=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td"));
	
	
	
		for(int r=1;r<=row.size();r++) {
			for(int c=1;c<=col.size();c++) {
					
				String table=driver.findElement(By.xpath("//table[@id='table2']/tbody/tr["+r+"]/td["+c+"]")).getText();
				
				
				System.out.println(r +"st row is "+ c +"st col is " +" and table2 data is = "+ table);
			
		
			
			}
		}
		
		
		
      Thread.sleep(10000);
		driver.close();
	}

}
