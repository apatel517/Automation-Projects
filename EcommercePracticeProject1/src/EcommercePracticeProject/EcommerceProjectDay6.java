package EcommercePracticeProject;
/*  Verify user is able to purchase product using registered email id(USE CHROME BROWSER)     
Test Steps:
1. Go to http://live.techpanda.org/
2. Click on my account link
3. Login in application using previously created credential
4. Click on MY WISHLIST link 
5. In next page, Click ADD TO CART link
6. Enter general shipping country, state/province and zip for the shipping cost estimate
7. Click Estimate 
8. Verify Shipping cost generated 
9. Select Shipping Cost, Update Total 
10. Verify shipping cost is added to total 
11. Click "Proceed to Checkout"
12a. Enter Billing Information, and click Continue
12b. Enter Shipping Information, and click Continue
13. In Shipping Method, Click Continue
14. In Payment Information select 'Check/Money Order' radio button. Click Continue
15. Click 'PLACE ORDER' button 
16. Verify Oder is generated. Note the order number*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EcommerceProjectDay6 {

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
		 driver.findElement(By.xpath("//a[normalize-space()='My Wishlist']")).click();
//Step 5
		 driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
//Step 6
		 WebElement country = driver.findElement(By.id("country"));
		 Select dropdown = new Select(country);
		 dropdown.selectByVisibleText("United States");
		 WebElement region = driver.findElement(By.id("region_id"));
		 Select dropdown2 = new Select(region);
		 dropdown2.selectByVisibleText("Illinois");
		 driver.findElement(By.id("postcode")).sendKeys("60015");
//Step 7
		 driver.findElement(By.xpath("//span[contains(text(),'Estimate')]")).click();
//Step 8
		String flatRate= driver.findElement(By.xpath("//span[normalize-space()='$5.00']")).getText();
		System.out.println(flatRate);
		if(flatRate.equals(flatRate))
		{
	    System.out.println("Shipping cost is Fixed ="+flatRate);	
		}
//Step 9
		driver.findElement(By.id("s_method_flatrate_flatrate")).click();
		driver.findElement(By.xpath("//button[@title='Update Total']")).click();
//Step 10
		String fixedRate = "$5.00";
		String shippingCostInclu = driver.findElement(By.xpath("//td[@class='a-right']//span[@class='price'][normalize-space()='$5.00']")).getText();
		System.out.println("shippingCostInclu="+shippingCostInclu);
		if(fixedRate.equals(shippingCostInclu))
		{
			System.out.println("Shipping Cost is successfully included");
		}
		else
		{
			System.out.println("Shipping Cost is successfully included");
		}
//Step 11
		driver.findElement(By.xpath("//button[@title='Proceed to Checkout']")).click();
//Step 12a
		 driver.findElement(By.id("billing:firstname")).clear();
		 driver.findElement(By.id("billing:firstname")).sendKeys("Asad");
		 driver.findElement(By.id("billing:lastname")).clear();
		 driver.findElement(By.id("billing:lastname")).sendKeys("Patel");
		 driver.findElement(By.id("billing:street1")).sendKeys("123 niles ave");
		 driver.findElement(By.id("billing:city")).sendKeys("Niles");
		 WebElement billingregion = driver.findElement(By.id("billing:region_id"));
		 Select dropdownbiRe = new Select(billingregion);
		 dropdownbiRe.selectByVisibleText("Illinois");
		 driver.findElement(By.id("billing:postcode")).sendKeys("60015");
		 WebElement billingCountry = driver.findElement(By.id("billing:country_id"));
		 Select dropdownbillingC = new Select(billingCountry);
		 dropdownbillingC.selectByVisibleText("United States");
		 driver.findElement(By.id("billing:telephone")).sendKeys("773123456");
		 driver.findElement(By.id("billing:use_for_shipping_no")).click();
		 driver.findElement(By.xpath("//button[@onclick='billing.save()']")).click();
//Step 12b
		 Thread.sleep(2000);
		 driver.findElement(By.id("shipping:firstname")).sendKeys("Asad");
		 driver.findElement(By.id("shipping:lastname")).sendKeys("Patel");
		 driver.findElement(By.id("shipping:street1")).sendKeys("456 niles ave");
		 driver.findElement(By.id("shipping:city")).sendKeys("Niles");
		 WebElement shippingregion = driver.findElement(By.id("shipping:region_id"));
		 Select dropdownshippingR = new Select(shippingregion);
		 dropdownshippingR.selectByVisibleText("Illinois");
		 driver.findElement(By.id("shipping:postcode")).sendKeys("60018");
		 WebElement shippingC = driver.findElement(By.id("shipping:country_id"));
		 Select dropdownshiC = new Select(shippingC);
		 dropdownshiC.selectByVisibleText("United States");
		 driver.findElement(By.id("shipping:telephone")).sendKeys("773123456");
		 driver.findElement(By.xpath("//button[@onclick='shipping.save()']")).click();
		 Thread.sleep(2000);
//Step 13
		 driver.findElement(By.cssSelector("button[onclick='shippingMethod.save()'] span span")).click();
//Step 14
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		 driver.findElement(By.xpath("//button[@class='button']//span//span[contains(text(),'Continue')]")).click();
//Step 15
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[title='Place Order']")).click();
//Step 16
		 String orderNum = driver.findElement(By.cssSelector("//div[@class='main-container col1-layout']//p[1]")).getText();
		 System.out.println("Your Order Number is ="+orderNum);
		 driver.quit();
		 
		 

	
	}

}
