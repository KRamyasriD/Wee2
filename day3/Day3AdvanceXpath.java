package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3AdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
						
		 // grandparent to grandchild 
			driver.findElement(By.xpath("(//form[@id='login']//input)[1]")).sendKeys("Democsr2");

		//  elder sibling to younger sibling
			driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");

			
			// parent to child 
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			
			//parent to child 
			driver.findElement(By.xpath("//div[@id='button']/div")).click();
			
			//grand parent to grand child 
		    driver.findElement(By.xpath("(//div[@class='x-panel-tr'])[2]")).click();
		    
		    
			//child to parent 
		    driver.findElement(By.xpath("//a[contains(text(),'Create')]/parent::li")).click();
		    
		    //ElderCousin to YoungerCousin 
		    driver.findElement(By.xpath("//span[@class='requiredField']/following::input ")).sendKeys("AdvanceXpath");
		    
		    //YoungerCousin to ElderCousin 
		    //driver.findElement(By.xpath("((//span[@class='requiredField'])[3]/preceding::input)[33]")).sendKeys("Advacne");
		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Advance");
		    
		    //child to parent 
		    //driver.findElement(By.xpath("(//input[@name='lastName'])[3]/parent::td")).sendKeys("Xpath");
		    
		    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("XPATH");

		    
		    
		    //
		    driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		    
		    
			
			

	}

}
