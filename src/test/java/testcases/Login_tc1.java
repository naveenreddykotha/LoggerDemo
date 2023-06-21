package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Homepage;
import pages.Loginpage;

public class Login_tc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Loginpage login=new Loginpage(driver);
		Homepage home=new Homepage(driver);
		
		login.enterUsername("naveen123@gmail.com");
		login.enterPassword("Naveen@123");
		login.clickLogin();
		
		System.out.println("The page heading is --- " +home.getHeading());
		home.clickLogout();
		
		
		

	}

}
