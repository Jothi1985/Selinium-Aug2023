package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateContact {

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
       
       
       WebElement leads = driver.findElement(By.linkText("Leads"));
       leads.click();
       
       WebElement findleads = driver.findElement(By.linkText("Find Leads"));
       findleads.click();
       

       WebElement phone = driver.findElement(By.xpath("//span[contains(text(),'Phone')]"));
       phone.click();
       
       WebElement phonecountycode = driver.findElement(By.name("phoneCountryCode"));
       phonecountycode.clear();
       phonecountycode.sendKeys("32");
       
       WebElement phoneAreaCode = driver.findElement(By.name("phoneAreaCode"));
       phoneAreaCode.sendKeys("467");
       
       WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
       phoneNumber.sendKeys("652414");
       
       WebElement leadbutton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
       leadbutton.click();
     
       
       //String leadid = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td/div/a)")).getText();

       WebElement tablefirstrow = driver.findElement(By.xpath("//a[contains(text(),'jothi')]"));
       String leadname = tablefirstrow.getText();
       
       driver.findElement(By.xpath("//a[contains(text(),'jothi')]")).click();
       
       WebElement duplicate = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
       duplicate.click();
       
       String title = driver.getTitle();
       System.out.println(title);
       

       WebElement createLead = driver.findElement(By.xpath("//input[@name='submitButton']"));
       createLead.click();
       

       WebElement verify = driver.findElement(By.xpath("//span[text()='jothimani']"));
       String result = verify.getText();
       
       if(result==leadname) {System.out.println("DuplicateLead");} else {System.out.println("No duplicate");}
	}

}
