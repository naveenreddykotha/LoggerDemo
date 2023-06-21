import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simplelogger {
	private static WebDriver driver;
	public static Logger log;

	
	
	public static void main(String[] args) {
		log = LogManager.getLogger(Testlogger.class);
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		log.info("Successfully initaited chromedriver");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.onlinestore.toolsqa.com");
        log.info("Web application launched");
        log.error("This is error message");
        log.fatal("this is fatal messafe");
        log.trace("this is trace message");
        log.debug("this debug message");
        log.warn("this is warn message");
        
		
	}

}
