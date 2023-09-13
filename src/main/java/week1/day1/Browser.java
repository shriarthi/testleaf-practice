package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	
	public String browserName(String browser)
	{
		System.out.println("Browser launched successfully"+browser);
		return browser;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	

	public static void main(String[] args) {
		
	//	EdgeDriver driver =new EdgeDriver();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Browser obj = new Browser();
		obj.browserName("chrome");
		obj.loadUrl();
	}
		

	}


