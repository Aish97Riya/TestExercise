package amazonsignInpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonsignIn {
	
	WebDriver driver;
	By username=By.id("ap_email");
	By continueButton=By.xpath("//input[@id='continue']");
    By password=By.id("ap_password");
    By submitButton=By.xpath("//input[@type='submit']");
	public amazonsignIn(WebDriver driver)
	{
		this.driver=driver;
	}
public void enterusername(String username1)
{
	driver.findElement(username).sendKeys(username1);
}
public void enterpassword(String password1)
{
	driver.findElement(password).sendKeys(password1);
}
public void clickcontinuebutton() {
	driver.findElement(continueButton).click();
	
}
public void clicksubmitbutton()
{
	driver.findElement(submitButton).click();
}
}