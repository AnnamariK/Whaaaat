package FirstProject.FirstProject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WiniumElements {
	WiniumDriver driver = null;
	
	@BeforeClass
	public void setUpEnvironment() throws IOException
	{
	
	DesktopOptions options = new DesktopOptions();
	options.setApplicationPath("D:\\Jnrhenergy\\client\\Junifer.Thor.ClientRH.exe");
	
	
	try {
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}

}
	@Test
	public void testNotePadApp()
	{
		System.out.println(driver.findElementByXPath("//*[@Name='Junifer Login']"
				+ "/*[@Name='The XtraLayoutControl']"
		+ "/*[@AutomationId='txtPassword']/*[@LocalizedControlType='edit']").getAttribute("Name"));
		System.out.println(driver.findElementByXPath("//*[@ClassName='Notepad']/*[@ClassName='Edit']").getAttribute("Name"));
		driver.findElementByXPath("//*[@Name='Junifer Login']"
				+ "/*[@Name='The XtraLayoutControl']"
		+ "/*[@AutomationId='txtPassword']/*[@LocalizedControlType='edit']").sendKeys("aaa");
//				+ "/container[@controlname='layout']/element[@controlname='txtPassword']"
//				+ "/text[@controltypename='TextBoxMaskBox']").sendKeys("This is Uday test");
	}
	
	@AfterClass
	public void tearDown() throws IOException
	{
		driver.close();
	}
	
}
	
