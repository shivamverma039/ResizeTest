package resizetest;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension dim = new Dimension(250, 50);
		driver.manage().window().setSize(dim);
	}

}
