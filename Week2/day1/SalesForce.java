package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://login.salesforce.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
    driver.findElement(By.id("password")).sendKeys("Leaf$1234");	
    driver.findElement(By.id("Login")).click();
    String title = driver.getTitle();
    System.out.println(title);
    Thread.sleep(2000);
	}

}

/*
Launch https://login.salesforce.com/
Enter username as hari.radhakrishnan@qeagle.com
3.  Enter password as Leaf$1234
4.  Click on Login*/