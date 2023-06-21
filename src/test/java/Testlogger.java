import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogger {
	
	public static WebDriver driver;
	public static Logger log;
	public static void main(String[] args) {

		log= LogManager.getLogger(Testlogger.class);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("Successfully initaited chromedriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Give an implicit wait of 10 sec");
		driver.get("https://www.myntra.com/");
		log.info("Browsed into Myntra website");
		try {
			boolean text= driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
	}	

}
