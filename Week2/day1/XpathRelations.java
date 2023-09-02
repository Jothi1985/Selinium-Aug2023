package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelations {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		//Login leaftaps
		
		/*1. Launch http://leaftaps.com/opentaps 
		 * 2. Enter username as demoSalesManager (Use : Attribute based) 
		 * 3. Enter password as crmsfa (Use : Attribute based)
		 *  4. Click on Login (Use : Attribute based) 
		 *  5. Click on CRM/SFA (Use Partial Text based xpath) 
		 *  6. Click on Leads(Use Text based)
		 */
		
         WebElement search = driver.findElement(By.xpath(" //form[@class='css-19j7d8y']/input"));
         search.sendKeys("products");
         
         WebElement parentsearch = driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']/parent::form"));
         parentsearch.sendKeys("products");


        
        
      

	}

}

