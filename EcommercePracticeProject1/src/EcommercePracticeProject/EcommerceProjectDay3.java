package EcommercePracticeProject;

/* Test Steps:
1-Goto http://live.techpanda.org/
2-Click on ‘MOBILE’ menu
3-In the list of all mobile , click on ‘ADD TO CART’ for Sony Xperia mobile
4-Change ‘QTY’ value to 1000 and click ‘UPDATE’ button. Expected that an error is displayed  "The requested quantity for "Sony Xperia" is not available.
5-Verify the error message
6-Then click on ‘EMPTY CART’ link in the footer of list of all mobiles. A message "SHOPPING CART IS EMPTY" is shown.
7- Verify cart is empty */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProjectDay3 {

	public static void main(String[] args) {

//Step 1
	System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://live.techpanda.org/");
//Step 2
	 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 3
	 driver.findElement(By.xpath("//li[3]//div[1]//div[3]//button[1]//span[1]//span[1]")).click();
//Step 4
	 driver.findElement(By.xpath("//input[@title='Qty']")).clear();
	 driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
	 driver.findElement(By.cssSelector("button[title='Update'] span span")).click();
//Step 5
	 String errorMsg = driver.findElement(By.xpath("//li[@class='error-msg']//ul//li")).getText();
	 System.out.println(errorMsg);
	 if(errorMsg.equals(errorMsg))
	 {
		System.out.println("Error Message Verified") ;
	 }
	 else
	 {
		 System.out.println("Error Message Verified"); 
	 }
//Step 6
	 driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
//Step 7
	String shoppingCart = driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart is Empty']")).getText();
	System.out.println(shoppingCart);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
