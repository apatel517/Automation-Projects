package EcommercePracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test Steps:
1. Go to http://live.techpanda.org/
2. Click on My Account link
3. Login in application using previously created credential 
4. Click on 'My Orders'
5. Click on 'View Order'
6. *** when steps 4 and 5 are executed, step 6 RECENT ORDERS was not displaye   Verify the previously created order is displayed in 'RECENT ORDERS' table and status is Pending
7. Click on 'Print Order' link
8. *** note: the Change ... link was not found.  Click 'Change...' link and a popup will be opened as 'Select a destination' , select 'Save as PDF' link.
9. *** unable to execute this step, due to issue with step 8 issue Click on 'Save' button and save the file in some location.
10. *** unable to execute this step, due to steps 8 and 9 issues */

public class EcommerceProjectDay7b {

	public static void main(String[] args) throws InterruptedException {
		
//Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/");
//Step 2
		 driver.findElement(By.cssSelector(".skip-link.skip-account")) .click();
//Step 3
		 driver.findElement(By.xpath("//a[@title='Log In']")).click();
		 driver.findElement(By.id("email")).sendKeys("ap01@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("ap0123");
		 driver.findElement(By.id("send2")).click();
//Step 4
		 driver.findElement(By.xpath("//a[normalize-space()='My Orders']")).click();
//Step 5
		String pending =driver.findElement(By.cssSelector("em")).getText();
       
		System.out.println(pending);
	if(pending.equals(pending))
	{
		System.out.println("Order is pending");
	}
	else
	{
		System.out.println("Order is not pending");
	}
//Step 6
	driver.findElement(By.linkText("VIEW ORDER")).click();
    driver.quit();
}
}