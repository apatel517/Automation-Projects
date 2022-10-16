package EcommercePracticeProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test Steps
1. Go to http://live.techpanda.org/index.php/backendlogin
2. Login the credentials provided
3. Go to Sales-> Orders menu
4. Select 'CSV' in Export To dropdown and click Export button.
5. Read downloaded file and display all order information in console windows
6. Attach this exported file and email to another email id */

public class EcommerceProjectDay10 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//Step 1
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://live.techpanda.org/index.php/backendlogin");
//Step 2
		 driver.findElement(By.id("username")).sendKeys("user01");
		 driver.findElement(By.id("login")).sendKeys("guru99com");
		 driver.findElement(By.xpath("//input[@title='Login']")).click();
		 driver.findElement(By.xpath("//span[normalize-space()='close']")).click();
//Step 3
		 driver.findElement(By.linkText("Sales")).click();
		 driver.findElement(By.linkText("Orders")).click();
//Step 4
		 driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();
		 Thread.sleep(3000);
//Step 5
		String filePath = System.getProperty("/Users/asad/Downloads/orders.csv");
		File a = new File(filePath);
		FileReader fr = new FileReader(a);
		BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line!=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			fr.close();
			br.close();
		
		}
			
		}
	


