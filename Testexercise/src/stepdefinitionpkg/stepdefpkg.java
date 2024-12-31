package stepdefinitionpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazonsignInpkg.amazonsignIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import screenshotpkg.screenshotcls;

public class stepdefpkg {
	
	WebDriver driver;
	
	@Given("^Open google chrome website$")
	public void open_google_chrome_website() throws Throwable {
		ChromeOptions co=new ChromeOptions();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement a=driver.findElement(By.id("APjFqb"));
		a.sendKeys("Amazon");
		a.submit();
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}

	@Then("^Amazon signIn using POM$")
	public void amazon_signIn_using_POM() throws Throwable {
		driver.findElement(By.linkText("Women's fashion")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'sign in')]")).click();
		amazonsignIn a = new amazonsignIn(driver);
		a.enterusername("mjudhai2020@gmail.com");
		screenshotcls s= new screenshotcls(driver);
		s.screenshot("UsernameEntered.jpg");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='continue']")));
		a.clickcontinuebutton();
		a.enterpassword("Welcome@2020");
		a.clicksubmitbutton();
	}
	@Given("^Open browserstack website using select class$")
	public void open_browserstack_website_using_select_class() throws Throwable {
		ChromeOptions co=new ChromeOptions();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		screenshotcls s= new screenshotcls(driver);
		WebElement b=driver.findElement(By.xpath("//select[@name='country']"));
		Select obj =new Select(b);
		obj.selectByIndex(3);
		s.screenshot("thirdindex.jpg");
		Select obj1 =new Select(b);
		obj1.selectByVisibleText("AUSTRALIA");
		s.screenshot("AUSTRALIA.jpg");
		
	}
	@Given("^Handling dropdown in selenium with select class$")
	public void handling_dropdown_in_selenium_with_select_class() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		screenshotcls s= new screenshotcls(driver);
		WebElement c=driver.findElement(By.xpath("//select[@name='country']"));
		Select ob=new Select(c);
		ob.selectByIndex(5);
		s.screenshot("fifth.jpg");
		Select ob1=new Select(c);
		ob.selectByVisibleText("ANGOLA");
		s.screenshot("angola.jpg");
		}
	@Given("^dropdown without select class$")
	public void dropdown_without_select_class() throws Throwable {
		ChromeOptions co=new ChromeOptions();
		driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/handling-dropdown-in-selenium-without-select-class");
		driver.manage().window().maximize();
		screenshotcls s= new screenshotcls(driver);
		WebElement b=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		b.click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Status']"))).click().build().perform();
	//	a.click(driver.findElement(By.xpath("//a[@title='Status']")));
		s.screenshot("clickstatus.jpg");
		Thread.sleep(5000);
	}
	@Given("^dropdown without select class exercise$")
	public void dropdown_without_select_class_exercise() throws Throwable {
		ChromeOptions co=new ChromeOptions();
		driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/handling-dropdown-in-selenium-without-select-class");
		driver.manage().window().maximize();
		screenshotcls s= new screenshotcls(driver);
		WebElement b=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		b.click();
		WebElement c=driver.findElement(By.xpath("//a[@title='Open Source']"));
		c.click();
		Thread.sleep(5000);
		s.screenshot("opensourcepage.jpg");
		
				
	   
	}
	   


}
