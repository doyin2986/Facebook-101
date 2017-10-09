package logintesting;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebLogin {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		//connect to facebook
		driver.get("https://www.facebook.com/");
		
		//load browser manager
		driver.manage().window().maximize();
		
		//name facebook login
		driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("adedoyin");
		
		//surname facebook login
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("ojewale");
		
		//email
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("doyin.akinyemi@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).sendKeys("doyin.akinyemi@hotmail.com");
		
		//password
		driver.findElement(By.xpath(".//*[@id='u_0_t']")).sendKeys("Sholar86");
		
		//date
		Select sell=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		
		sell.selectByVisibleText("Sept");;
		
		Select sel1= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		
		sel1.selectByValue("6");
		
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		sel3.selectByIndex(6);
		  
		//sex
		driver.findElement(By.xpath(".//*[@id='u_0_x']/span[2]")).click();
		
		//create an account
		driver.findElement(By.xpath(".//*[@id='u_0_z']")).click();
		
		
		
		
		
		
		
		
		
		
		
	
	

	}

}
