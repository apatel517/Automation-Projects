package EcommercePracticeProject;

/*Test Steps
1-Goto http://live.techpanda.org/
2-Click on ‘MOBILE’ menu
3-In mobile products list , click on ‘Add To Compare’ for 2 mobiles (Sony Xperia & Iphone)
4-Click on ‘COMPARE’ button. A popup window opens
5-Verify the pop-up window and check that the products are reflected in it Heading "COMPARE PRODUCTS" with selected products in it.
6-Close the Popup Windows*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProjectDay4 {

	public static void main(String[] args) {

		
//Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/");
//Step 2
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 3
		 driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]")).click();
//Step 4
		 driver.findElement(By.xpath("//button[@title='Compare']//span//span[contains(text(),'Compare')]")).click();
		 for (String handle:driver.getWindowHandles())
		 {
			driver.switchTo().window(handle) ;
		 }
			 
//Step 5
		String heading = driver.findElement(By.xpath("//h1[normalize-space()='Compare Products']")).getText();
	    System.out.println(heading);
	    if (heading.equals(heading))
	    {
	    	System.out.println("Two phone are Compared");
	    }
	    else
	    {
	    	System.out.println("Two phone are not compared");
	    }
//Step 6
	    driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	    driver.quit();
	
	}

}
