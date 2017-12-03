package Log4j.log4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AppTest {

	static Logger logger = Logger.getLogger(AppTest.class.getName());
	protected WebDriver driver;

	@BeforeMethod
	public void launchApp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void verifyTestCase() {
		System.out.println("Inside Test case");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
