import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabla4 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://nxtgenaiacademy.com/webtable");
		
	List<WebElement>row=driver.findElements(By.xpath("//*[@class='elementor-widget-container']/table/tbody/tr"));
	//List<WebElement>col=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		
			for(int c=1;c<=row.size();c++) {
				String table=driver.findElement(By.xpath("//*[@class='elementor-widget-container']/table/tbody/tr["+c+"]")).getText();
				
				System.out.println(c +"st row is  and data is = "+ table);
			
		
			
			
		}
		
		
		
      Thread.sleep(10000);
		driver.close();
	}

}
