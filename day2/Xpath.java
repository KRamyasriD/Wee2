package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	 	
		 
			// Step 2: Launch the chromebrowser
			ChromeDriver driver=new ChromeDriver(); 

			
			// Step 3: Load the URL https://en-gb.facebook.com/
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			// Partial Attribute xpath
			driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Democsr2");
			
			
			//Attribute Xpath
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			//Index Based 
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			// Partial text based 
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

			//Text based 
			driver.findElement(By.xpath("//a[text()='Leads']")).click();

			//Partial Text Based
			driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


			//Partial Attribute Based
			driver.findElement(By.xpath("//input[contains(@id,'cr')]")).sendKeys("TestCompany");
			
			
			String name = "Test";
			
			//Index Based
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");
			
			// Attribute xpath
			driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("XPATH");
			
			//Index Based 
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			
		Thread.sleep(2000);
				
		String firstname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		System.out.println("FirstName "+ firstname);
		
		if (name.equals(firstname)) {
			System.out.println("Lead created successfully");
		}
			
			else {
				System.out.println("create Lead failed");
		}
		
			
			
			
			
			
			
	}

}
