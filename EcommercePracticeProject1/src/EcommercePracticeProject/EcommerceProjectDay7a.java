package EcommercePracticeProject;
/*  Verify that you will ba[href='http://live.techpanda.org/index.php/sales/order/view/order_id/17059/']e able to save previously placed order as a pdf file  
Test Steps:
1. Go to http://live.techpanda.org/
2. Click on My Account link
3. Login in application using previously created credential 
4. Click on 'My Orders'
5. Click on 'View Order'
6. *** note: After steps 4 and 5, step 6 "RECENT ORDERS" was not displayed Verify the previously created order is displayed in 'RECENT ORDERS' table and status is Pending
7. Click on 'Print Order' link
8. *** note: the link was not found. Click 'Change...' link and a popup will be opened as 'Select a destination' , select 'Save as PDF' link.
9. *** unable to execute this step, due to issue with step 8 issue
   Click on 'Save' button and save the file in some location.
10. *** unable to execute this step, due to steps 8 and 9 issues. Verify Order is saved as PD*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProjectDay7a { 

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
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("VIEW ORDER")).click();
//Step 6
		String recentOrd = driver.findElement(By.cssSelector("h2")).getText();
		if("RecentOrder".equals(recentOrd))
				{
			System.out.println("Recen Order Displayed");
				}
		else
		{
			System.out.println("Recen Order failed to Displayed");
		}
//Step 7
		driver.findElement(By.linkText("Print Order")).click();
		driver.quit();
		 
	}

}
