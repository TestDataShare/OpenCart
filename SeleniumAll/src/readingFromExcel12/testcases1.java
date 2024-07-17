package readingFromExcel12;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcases1 extends utils {

	public static void main(String[] args) throws IOException {
		// https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html
		  System.setProperty("webdriver.chrome.driver","F:\\Software testing\\Selenium jars\\chromedriver-win32\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  String excelpath = System.getProperty("user.dir")+"./Excel/DataRead.xlsx";
		  int totalnorows = testcases1.getrowcount(excelpath, "calc");
	   	  int col= testcases1.getcolcount(excelpath, "calc", totalnorows);
	   	  System.out.println(totalnorows);
	   	  System.out.println(col);
	   	  int count= 0;
	   	  for(int i=1; i<=totalnorows; i++)
	   	  {
	   		 
	   	    String princ= testcases1.getCellData(excelpath, "calc", i, 0);
	   		String ROI= testcases1.getCellData(excelpath, "calc", i, 1);
	   		String per = testcases1.getCellData(excelpath, "calc", i,2);
	   		String Pfr= testcases1.getCellData(excelpath, "calc", i,3);
	   		String frequen= testcases1.getCellData(excelpath, "calc", i,4);
	   		
	   		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
	   		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
	   		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per);
	   		Select s = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
	   		s.selectByVisibleText(Pfr);
	   		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
	   		s1.selectByVisibleText(frequen);
	   		driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']")).click();
	   		String value = driver.findElement(By.xpath("//span[@name='resp_matval']")).getText();
	   		System.out.println(value);
	   		double d = Double.parseDouble(value);
	   		System.out.println(d);
	   		driver.findElement(By.xpath("//a[@onclick='javascript:reset_fdcalcfrm();']")).click();
	        count++;
	   	  }
		  System.out.println(count);
		  driver.close();
	}

}
