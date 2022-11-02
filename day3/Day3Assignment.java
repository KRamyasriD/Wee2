package week2.day3;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://acme-test.uipath.com/login");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.manage().window().maximize();
			
//			 Load url "https://acme-test.uipath.com/login"
//			 2. Enter email as "kumar.testleaf@gmail.com"
			driver.findElement(By.xpath("//div[@class='controls']//input")).sendKeys("kumar.testleaf@gmail.com");
			
//			 3. Enter Password as "leaf@12"
			driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
			
//			4. Click login button
			driver.findElement(By.xpath("(//a[contains(text(),' Register')]/preceding::button)[2]")).click();
			
			
//			 5. Get the title of the page and print
			String title = driver.getTitle();
			System.out.println("Page Title is " + title);
			
//			 6. Click on Log Out
			driver.findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right']//a)[3]"));
			
//			 7. Close the browser (use -driver.close())
			driver.close();
			
			
			
			
}
}

