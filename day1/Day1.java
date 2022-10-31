package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	
	public static void main(String[] args) {
		
		// set path for chrome 
		
		 WebDriverManager.chromedriver().setup(); 
		 
//		 String path = System.getProperty("webdriver.chrome.driver");
//		 
//		 System.out.println(path);
		 
		 // to launch chrome broser 
		 
		 ChromeDriver driver=new ChromeDriver(); 
		 
		 // return type of get : void 
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 // to max broswer
		 
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		  
		 
		 
	}

}












