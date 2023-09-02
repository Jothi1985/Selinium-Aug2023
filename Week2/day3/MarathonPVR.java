package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.Select;

public class MarathonPVR {

	public static void main(String[] args) {

		/*SafariOptions options = new SafariOptions();
		options.addArguments("--disable-notifications");
		SafariDriver driver = new SafariDriver(options);*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//login
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		WebElement icon = driver.findElement(By.xpath("//span/div/i[@class='icon-bar icon']"));
		icon.click();
		driver.manage().window().maximize();
		
			
		//div/span[1]
	 
		

		
		WebElement movielibrary = driver.findElement(By.xpath("//a[contains(text(),'Movie Library')]"));
		movielibrary.click();
		
		
		WebElement city= driver.findElement(By.name("city"));
		Select cityselect = new Select(city);
		cityselect.selectByValue("Chennai");
		
		
		WebElement genre= driver.findElement(By.name("genre"));
		Select gendreselect = new Select(genre);
		gendreselect.selectByVisibleText("ANIMATION");
		
		

		WebElement lang= driver.findElement(By.name("lang"));
		Select langselect = new Select(lang);
		langselect.selectByVisibleText("ENGLISH");
	       
		WebElement apply= driver.findElement(By.xpath("//div//form/div/button[contains(text(),'Apply')]"));
		apply.click();
		
		
		WebElement movie=driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']//img"));
		movie.click();
		
		
		WebElement book =driver.findElement(By.xpath("//button[contains(text(),'Proceed To Book')]"));
		book.click();	
			
		
		WebElement cinemaName= driver.findElement(By.name("cinemaName"));
		Select cinemaNamesel = new Select(cinemaName);
		cinemaNamesel.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		WebElement datepicker =driver.findElement(By.xpath("//div[@class=\"pvr-datepicker\"]"));
		datepicker.click();

		WebElement datechoose = driver.findElement(By.xpath("//span[text()='12']"));
		datechoose.click();
		
		WebElement timings= driver.findElement(By.name("timings"));
		Select timingsel = new Select(timings);
		timingsel.selectByVisibleText("09:00 AM - 12:00 PM");
		
		driver.findElement(By.name("noOfTickets")).sendKeys("3");
		driver.findElement(By.name("name")).sendKeys("Jothi");
		driver.findElement(By.name("email")).sendKeys("test@123.com");
		driver.findElement(By.name("mobile")).sendKeys("1234567890");
	
		WebElement copyself = driver.findElement(By.xpath("//input[@id=\"copySelf\"]"));
	      copyself.click();
		
		


		WebElement food= driver.findElement(By.name("food"));
		Select foodselect = new Select(food);
		langselect.selectByVisibleText("NO");
		driver.findElement(By.name("comment")).sendKeys("NO	");
		
		
		WebElement buttonsend= driver.findElement(By.xpath("//button[text()='SEND REQUEST']"));
		buttonsend.click();
		

		WebElement buttoncancel= driver.findElement(By.xpath("//button[text()='CANCEL']"));
		buttoncancel.click();
		
		 
        String title = driver.getTitle();
        System.out.println(title);
        

		    /* WebElement genremovie= driver.findElement(By.xpath("//li/span[contains(text(),'ANIMATION')]"));
		     genremovie.click();
		     
		     WebElement lang= driver.findElement(By.xpath("//div/span[contains(text(),'Language')]"));
		     lang.click();
		     
		     WebElement langselection= driver.findElement(By.xpath("//li/span[contains(text(),'ENGLISH')]"));
		     langselection.click();*/
		     
		     driver.quit();
		     
		     
		   
	}

}


/*
01) Launch the Url  https://www.pvrcinemas.com/
02) Click  on Movie Library
03) Select the City -->chennai
04) Select the Genre-->Animation
05) Select the Language-->english
06) Click on Apply
07) Click on first resulting animation movie
08) Click proceed to book
09) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
10) Click on copy to self 
11) Click on  Send Request
12) Click cancel 
13) Close the OTP dialog
14) Verify the title of the page
Code to handle browser notification
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(options);
driver.get("");
*/
