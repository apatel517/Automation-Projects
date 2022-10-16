package EcommercePracticeProject;

/* Verify can create an account in e-Commerce site and can share wishlist to other poeple using email.  
Test Steps:
1-Go to http://live.techpanda.org/
2- Click on my account link
3- Click Create an Account link and fill New User information except Email ID
4.-Click Register
5- Verify Registration is done. Expected account registration done.
6- Go to TV menu
7- Add product in your wish list - use product - LG LCD
8-Click SHARE WISHLIST 
9-In next page enter Email and a message and click SHARE WISHLIST
10-Check wishlist is shared. Expected wishlist shared successfully. */
		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProjectDay5 {

	public static void main(String[] args) {

//Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/");
//Step 2
		driver.findElement(By.cssSelector(".skip-link.skip-account")) .click();
//Step 3
		driver.findElement(By.xpath("//a[@title='Register']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Asad");
		driver.findElement(By.id("lastname")).sendKeys("Patel");
		driver.findElement(By.id("email_address")).sendKeys("ap01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ap0123");
		driver.findElement(By.id("confirmation")).sendKeys("ap0123");
//Step 4
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
//Step 5
	String confirmation =driver.findElement(By.xpath("//li[@class='success-msg']//ul//li")).getText();
	System.out.println(confirmation);
	if(confirmation.equals(confirmation))
	{
		System.out.println("Registration is Successfull");	
	}
	else
	{
		System.out.println("Registration is Successfull");
	}
//Step 6
	driver.findElement(By.xpath("//a[normalize-space()='TV']")).click();
//Step 7
	driver.findElement(By.xpath("//li/a[@class='link-wishlist']")).click();
//Step 8
	driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
//Step 9
	driver.findElement(By.id("email_address")).sendKeys("as@gmail.com");
	driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
//Step 10
	String wishList=driver.findElement(By.cssSelector("li[class='success-msg'] ul li")).getText();
	System.out.println(wishList);
	if(wishList.equals(wishList))
	{
		System.out.println("WishList Successfully Shared");
	}
	else
	{
		System.out.println("WishList Failed to Shared");
	}
		driver.quit();
		
		
		
		
	}

}
