package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2AssignmentUpdateCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//* 1	Launch the browser
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
						
		 //	* 2	Enter the username
			driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Democsr2");

			
			//* 3	Enter the password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

			
			//* 4	Click Login
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			//* 5	Click crm/sfa link
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

			//* 6	Click Leads link
			driver.findElement(By.xpath("//a[text()='Leads']")).click();

			//* 7	Click Find leads
			driver.findElement(By.xpath("//a[contains(text(),'Find')]"));
			
			
			//* 8	Click create leads
			driver.findElement(By.xpath("//a[(text()='Create Lead')]")).click();

			
			//* 9	enter your company name 
			driver.findElement(By.xpath("//input[contains(@id,'cr')]")).sendKeys("TestCompany");
		
			//* 10 enter your first name
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");


			//* 11 enter your last name
			driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("XPATH");

			
			//12 click on create lead
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();

			//* 13 Click Edit
			driver.findElement(By.xpath("(//a [@class = 'subMenuButton'])[3]")).click();
			
			
			//* 14 Change the company name
			driver.findElement(By.xpath("//input [@id='updateLeadForm_companyName']")).sendKeys("UpdateComp");
			
			String Updatename = "UpdateComp";
			
			
			//* 15 Click Update
			driver.findElement(By.xpath("//input [@name = 'submitButton']")).click();

			
			//* 16 Confirm the changed name appears
			
			String Companyname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			
			
			System.out.println("Updated company name - "+ Companyname);
			
			if (Companyname.contains(Updatename)) {
				
				System.out.println("Lead Company Updated successfully");
			}
				
				else {
					System.out.println("Update Lead Company failed");
			}
			
	

	}

}
