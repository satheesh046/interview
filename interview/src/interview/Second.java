package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\SATHEESH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" ); ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*"); WebDriver driver = new
		 ChromeDriver(co); driver.get("https://www.google.com/");
		  
		 
		int a = 12, b = 23;
		System.out.println(a + b);
	}

}
