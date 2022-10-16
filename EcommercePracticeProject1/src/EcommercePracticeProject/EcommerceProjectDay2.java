package EcommercePracticeProject;
/* Test Steps:
1-Goto http://live.techpanda.org/
2-Click on ‘MOBILE’ menu
3-In the list of all mobile , read the cost of Sony Xperia mobile (which is $100)
4-Click on Sony Xperia mobile
5-Read the Sony Xperia mobile from detail page. Product value in list and details page should be equal ($100).*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProjectDay2 {

	public static void main(String[] args) {

//Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/");
//Step 2
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 3
		 String cost = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
		 System.out.println(cost);
		 if(cost.equals(cost))
		 {
			 System.out.println("Cost of sony Xperia is =" +cost) ;
		 }
		 else
		 {
			 System.out.println("Cost of sony Xperia is not verified");
		 }
//Step 4
		 driver.findElement(By.id("product-collection-image-1")).click();
//Step 5
		String detailCost = driver.findElement(By.xpath("//span[@class='price']")).getText();
		 System.out.println(detailCost);
		 if(detailCost.equals(detailCost))
		 {
			 System.out.println("Cost of sony Xperia in detail page is =" +detailCost) ;
		 }
		 else
		 {
			 System.out.println("Cost of sony Xperia is not verified");
		 }
		 driver.quit();
		 
		 
	}
	

}
