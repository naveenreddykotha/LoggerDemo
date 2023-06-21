package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By heading=By.xpath("//h3[normalize-space()='Automation']");
	By logoutbtn=By.xpath("//button[normalize-space()='Sign Out']");
	
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	public void clickLogout() {
		driver.findElement(logoutbtn).click();
	}
}
