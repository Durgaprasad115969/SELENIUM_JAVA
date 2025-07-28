package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
		
		WebDriver driver;
		
		
		loginpage(WebDriver driver) 
		{
			
			this.driver=driver;
			
		}
		//locators
		By txt_username_loc=By.xpath("//input[@placeholder='Username']");
		By txt_password_loc=By.xpath("//input[@placeholder='Password']");
		By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
		
		
		//Action methods
		
		public void setUserName(String user)
		{
			driver.findElement(txt_username_loc).sendKeys(user);
		}
		
		public void setpassword(String pwd)
		{
			driver.findElement(txt_password_loc).sendKeys(pwd);
		}
		public void clicklogin()
		{
			driver.findElement(btn_login_loc).click();
		}

	}


