package interview;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class first {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("C:\\Users\\SATHEESH\\Desktop\\driven.xls");
		Workbook work=Workbook.getWorkbook(file);
		Sheet sheet=work.getSheet(0);
		int rows=sheet.getRows();
		int columns=sheet.getColumns();
		String testdata[][]=new String[rows-1][columns]; 
		for(int i=1;i<rows;i++){
			for(int j=0;j<columns;j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		
	



		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SATHEESH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0nzawgb2pmtw61svcp2hpofdks59667.node0");
WebElement username=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
username.sendKeys("satheesh");
WebElement password=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
password.sendKeys(" ,India");
	}

}
