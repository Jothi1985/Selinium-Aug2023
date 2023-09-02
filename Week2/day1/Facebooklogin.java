package week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebooklogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		if (driver.findElement(By.xpath("//div/div/div/button[contains(text(),'Decline')]"))!=null) 
		{
			WebElement precond = driver.findElement(By.xpath("//div/div/div/button[contains(text(),'Decline')]"));
			precond.click();}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement login = driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]"));
		login.click();
		
		
		
			
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("firstname");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("lastname");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("test@123.com");
		
		WebElement email1 = driver.findElement(By.name("reg_email_confirmation__"));
		email1.sendKeys("test@123.com");
			
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("abc");
		
		WebElement bdayselect = driver.findElement(By.name("birthday_day"));
		Select bday = new Select(bdayselect);
		bday.selectByIndex(2);
		
		WebElement bdaymonth = driver.findElement(By.name("birthday_month"));
		Select month= new Select(bdaymonth);
		month.selectByValue("7");
		
		WebElement bdayyear = driver.findElement(By.name("birthday_year"));
		Select year = new Select(bdayyear);
		year.selectByVisibleText("2004");
		
		WebElement Gender = driver.findElement(By.xpath("//span/label[contains(text(),'Female')]"));
		Gender.click();
		
		driver.close();
		
		
		}
	   
		
		
		
	

}
