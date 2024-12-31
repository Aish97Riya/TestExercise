package screenshotpkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotcls {
	WebDriver driver;
	
	public screenshotcls(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void screenshot(String imagetitle) throws IOException{
	
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\HP\\Aiswaryawkspc\\Testexercise\\Screenshots\\"+imagetitle);
	FileUtils.copyFile(src,dest);

}
}
