package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("demoSalesManager");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
       WebElement crm = driver.findElement(By.partialLinkText("CRM"));
       crm.click();
       
       WebElement createContact = driver.findElement(By.linkText("Create Contact"));
    		   createContact.click();
    		   
    		   
      
        driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("firstname");	
        driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("lastName");		
        driver.findElement(By.name("firstNameLocal")).sendKeys("firstNameLocal");		
        driver.findElement(By.name("lastNameLocal")).sendKeys("lastNameLocal");	
        driver.findElement(By.name("departmentName")).sendKeys("departmentName");	
        driver.findElement(By.name("description")).sendKeys("description");	
        
        
        WebElement state1 = driver.findElement(By.name("generalStateProvinceGeoId"));	
    	Select sta = new Select(state1);
    	sta.selectByVisibleText("New York");
    	
    	 WebElement submit = driver.findElement(By.name("submitButton"));	
         submit.click();
         
       WebElement edit= driver.findElement(By.linkText("Edit"));
       edit.click();
       
       WebElement desc = driver.findElement(By.name("description"));
       desc.clear();
       
       WebElement impnote = driver.findElement(By.name("importantNote"));
       impnote.sendKeys("importantNote");

       WebElement update = driver.findElement(By.xpath("//input[@name='submitButton']"));
       update.click();
       
       String title = driver.getTitle();
       System.out.println(title);
      
       
   
       
    	
	}

}
