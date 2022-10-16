package EcommercePracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test Steps:
1. Go to http://live.techpanda.org/
2. Click on my account link
3. Login in application using previously created credential
4. Click on 'REORDER' link , change QTY & click Update
5. Verify Grand Total is changed
6. Complete Billing & Shipping Information
7. Verify order is generated and note the order number*/
public class EcommerceProjectDay8 {

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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='link-reorder']")).click();
		 String beforePrice = driver.findElement(By.cssSelector("strong span[class='price']")).getText();
		 System.out.println(beforePrice);
		 driver.findElement(By.cssSelector("input[title='Qty']")).clear();
		 driver.findElement(By.cssSelector("input[title='Qty']")).sendKeys("10");
		 driver.findElement(By.cssSelector("button[title='Update'] span span")).click();
		 String afterPrice = driver.findElement(By.cssSelector("strong span[class='price']")).getText();
		 System.out.println(afterPrice);
		 if(beforePrice.equals(afterPrice))
		 {
			 System.out.println("Grand Total Is not changed");
		 }
		 else
		 {
			 System.out.println("Grand Total Is changed");
		 }
//Step 6
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("billing:use_for_shipping_yes")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@onclick='billing.save()']//span//span[contains(text(),'Continue')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[onclick='shippingMethod.save()'] span span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[onclick='payment.save()'] span span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
//Step 7
		 String orderNum = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/p[1]/a")).getText();	
		 System.out.println(" Your order number is = " + orderNum);
		 driver.quit();
		 
		 
		 
		 
	}

}
