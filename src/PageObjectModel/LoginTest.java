package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	void testLogin() {
		loginpage lp = new loginpage(driver);
		lp.setUserName("admin");
		lp.setpassword("admin123");
		lp.clicklogin();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
