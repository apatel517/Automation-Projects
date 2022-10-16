package EcommercePracticeProject;
/*Test Steps
Step 1. Goto http://live.techpanda.org/
Step 2. Verify Title of the page
Step 3. Click on ‘MOBILE’ menu
Step 4. Verify Title of the page
Step 5. In the list of all mobile , select ‘SORT BY’ dropdown as ‘name’
Step 6. Verify all products are sorted by name */


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EcommerceProjectDay1 {

	public static void main(String[] args) throws IOException, InterruptedException {
 //Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/");
//Step 2
	String title = driver.findElement(By.xpath("//h2[1]")).getText();
	System.out.println(title);
	if(title.equals(title))
	{
		System.out.println("Title is verified");
	}
	else
	{
		System.out.println("Title is not verified");
	}
//Step 3
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 4
		String titleM = driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();
		System.out.println(titleM);
		if(titleM.equals(titleM))
		{
			System.out.println("Title is verified");	
		}
		else
		{
			System.out.println("Title is not verified");
		}
//Step 5
		WebElement statiDropwdown = driver.findElement(By.cssSelector("select[title=\"Sort By\"]"));
		Select dropdown = new Select(statiDropwdown);
		dropdown.selectByVisibleText("Name");
		
//Step 6
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("./screenshots.png"));
	        driver.quit();
		
		
	}
	

}
