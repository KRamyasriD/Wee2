package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FacebookAssignment {
	
	
	
	 public static void main(String[] args) {
		
    // Step 1: Download and set the path 
	 WebDriverManager.chromedriver().setup();
	 	 
	
	// Step 2: Launch the chromebrowser
	ChromeDriver driver=new ChromeDriver(); 

	
	// Step 3: Load the URL https://en-gb.facebook.com/
	driver.get("https://www.facebook.com/");
	
	
	// Step 4: Maximise the window
	driver.manage().window().maximize();
	

	// Step 5: Add implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// Step 6: Click on Create New Account button
	driver.findElement(By.linkText("Create new account")).click();
		
	// Step 7: Enter the first name
	driver.findElement(By.name("firstname")).sendKeys("TestRam");
	
	
	// Step 8: Enter the last name
	 driver.findElement(By.name("lastname")).sendKeys("Test");
	 	 
	// Step 9: Enter the mobile number
	 driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	 
	 
	// Step 10: Enterthe password
	 driver.findElement(By.name("reg_passwd__")).sendKeys("TestRam");
	 
	// Step 11: Handle all the three drop downs
	 
	WebElement select1 = driver.findElement(By.id("day"));
	Select obj = new Select(select1);
	obj.selectByIndex(12);
	
	WebElement select2 = driver.findElement(By.id("month"));
	Select obj1 = new Select(select2);
    obj1.selectByVisibleText("Jun");
	
	WebElement select3 = driver.findElement(By.id("year"));
	Select obj2 = new Select(select3);
	obj2.selectByValue("2019");
	

	
	// Step 12: Select the radio button "Female" 
	
	driver.findElement(By.name("sex")).click();	
	
	// ( A normal click will do for this step) 

	
}
	 
}
