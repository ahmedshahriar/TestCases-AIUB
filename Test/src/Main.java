/**
 * Created By Sakib, Ahmed Shahriar
 * On 08.08.2019
 * Project Name : Developing and Executing Test Cases for AIUB System
 
 **/

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\H311812Z3R\\eclipse-workspace\\Test\\lib\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		Actions action = new Actions(driver);
		
		
		
		
//		driver.get("http://www.aiub.edu");
		
		//right section elements
		String xpathCalender = "/html/body/div[4]/div[1]/div/div/div[2]/div/div/div[5]/div/div/div/a[1]/h3/i";
		String xpathConvocation ="/html/body/div[4]/div[1]/div/div/div[2]/div/div/div[4]/div/div/div/a[1]/h3/i";
		
		//convocation options
		String xpathConvocation8 = "/html/body/div[4]/div/div[2]/div[1]/div[1]/div[2]/a[8]";
		String xpathConvocation9 = "/html/body/div[4]/div/div[2]/div[1]/div[1]/div[2]/a[9]";
		String xpathConvocation10 = "/html/body/div[4]/div/div[2]/div[1]/div[1]/div[2]/a[10]";
		
		//navbar elements
		String xpathFaculties = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/a";
		String xpathAdministration = "/html/body/div[3]/div/div[2]/ul[2]/li[4]/a";
		String xpathAcademics = "/html/body/div[3]/div/div[2]/ul[2]/li[3]/a";
		
		//academics section
		String xpathAcademicRegulations = "/html/body/div[3]/div/div[2]/ul[2]/li[3]/ul/li[1]/a";
		String xpathFees = "/html/body/div[3]/div/div[2]/ul[2]/li[3]/ul/li[2]/a";
		
		
		//faculties section
		String xpathFsit = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/ul/li[4]/a";
		String xpathFoEngg = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/ul/li[3]/a";
		String xpathFba = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/ul/li[2]/a";
		String xpathFass = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/ul/li[1]/a";
		String xpathFacultyList = "/html/body/div[3]/div/div[2]/ul[2]/li[5]/ul/li[5]/a";
		
		
		//TC_8 Clicking on ‘Convocation’
		clickConvocation(driver, xpathConvocation);
		
		
		//TC_16	Clicking on  ‘8th   Convocation’
		clickConvocation8(driver, xpathConvocation,xpathConvocation8);
		
		
		//TC_17	Clicking on  ‘9th Convocation’ 
		clickConvocation9(driver, xpathConvocation,xpathConvocation9);
		
		//TC_18	Clicking on  ‘10th Convocation’ 
		clickConvocation10(driver, xpathConvocation,xpathConvocation10);
		
		//TC_19	Put the mouse pointer over Academics
		mouseOverAcademics(driver, xpathAcademics,action);
		
		//TC_20	Click on Academic Regulations
		clickAcademicRegulations(driver, xpathAcademics, xpathAcademicRegulations, action);
		
		//TC_21	Click on Admission & Registration
		/**
		 * There is no such thing as Admission & Registration , hence no script for this case
	 	 **/
		
		//TC_22	Click on Courses & Tuition Fees
		clickFees(driver, xpathAcademics, xpathFees, action);
		

		
		
		//TC_23 Click on the ‘Academic Calendar’
		//clickCalender(driver, xpathCalender);
		
		//TC_24 Put the mouse pointer over Faculty 
		//mouseOverFaculty(driver, xpathFaculties,action);
		
		//TC_25 Click on Faculty of Science & Information Technology
		//clickFsit(driver, xpathFaculties, xpathFsit, action);
		
		//TC_26 Click on Faculty of Engineering
		//clickFoEngg(driver, xpathFaculties, xpathFoEngg, action);
		
		//TC_27 Click on Faculty of Business Administration
		//clickFba(driver, xpathFaculties, xpathFba, action);
		 
		//TC_28 Click on Faculty of Arts & Social Sciences
		//clickFass(driver, xpathFaculties, xpathFass, action);
		
		//TC_29 Click on Faculty List
		//clickFacultyList(driver, xpathFaculties, xpathFacultyList, action);
		
		//TC_30 Putting mouse pointer  over Administration
		//mouseOverAdministration(driver, xpathAdministration,action);
		
		
	}
	
	/**
	 * Clicking on ‘Convocation’
 	 **/
	
	public static void clickConvocation(WebDriver driver,String xpathConvocation) {
		driver.get("http://www.aiub.edu");
		driver.findElement(By.xpath(xpathConvocation)).click();
		
		sleep();
		//driver.quit();
	}
	

	/**
	 * Clicking on  ‘8th   Convocation’
 	 **/
	
	public static void clickConvocation8(WebDriver driver,String xpathConvocation,String xpathConvocation8) {
		
		driver.get("http://www.aiub.edu");
		driver.findElement(By.xpath(xpathConvocation)).click();
		
		sleep();
		driver.findElement(By.xpath(xpathConvocation8)).click();
		sleep();
		//driver.quit();
	}
	
	/**
	 * Clicking on  ‘9th   Convocation’
 	 **/
	
	public static void clickConvocation9(WebDriver driver,String xpathConvocation,String xpathConvocation9) {
		
		driver.get("http://www.aiub.edu");
		driver.findElement(By.xpath(xpathConvocation)).click();
		
		sleep();
		driver.findElement(By.xpath(xpathConvocation9)).click();
		sleep();
		//driver.quit();
	}
	
	/**
	 * Clicking on  ‘10th   Convocation’
 	 **/
	
	public static void clickConvocation10(WebDriver driver,String xpathConvocation,String xpathConvocation10) {
		
		driver.get("http://www.aiub.edu");
		driver.findElement(By.xpath(xpathConvocation)).click();
		
		sleep();
		driver.findElement(By.xpath(xpathConvocation10)).click();
		sleep();
		//driver.quit();
	}
	
	/**
	 * Put  the mouse pointer over Academics 
 	 **/
	
	public static void mouseOverAcademics(WebDriver driver,String xpathAcademics,Actions action) {
		
		driver.get("http://www.aiub.edu");
		WebElement section = driver.findElement(By.xpath(xpathAcademics));
		action.moveToElement(section).perform();
		sleep();
		//driver.quit();
	}
	
	
	/**
	 * Click on Academic Regulations
 	 **/
	public static void clickAcademicRegulations(WebDriver driver,String xpathAcademics,String xpathAcademicRegulations,Actions action) {
		sleep();
		
		driver.get("http://www.aiub.edu");
		WebElement section = driver.findElement(By.xpath(xpathAcademics));
		action.moveToElement(section).perform();
		
		
		driver.findElement(By.xpath(xpathAcademicRegulations)).click();
		sleep();
		//driver.quit();
	}
	
	/**
	 * Click on Courses & Tuition Fees
 	 **/
	public static void clickFees(WebDriver driver,String xpathAcademics,String xpathFees,Actions action) {
		
		driver.get("http://www.aiub.edu");
		WebElement section = driver.findElement(By.xpath(xpathAcademics));
		action.moveToElement(section).perform();
		driver.findElement(By.xpath(xpathFees)).click();
		sleep();
		
		driver.quit();
	}
	
	
	//TC_16 - TC_22 done
	
	
	
	
	
	
	
	
	
	/**
	 * Click on the ‘Academic Calendar’ 
 	 **/
	
	public static void clickCalender(WebDriver driver,String xpathCalender) {
		
		driver.findElement(By.xpath(xpathCalender)).click();
		
		sleep();
		driver.quit();
	}
	
	/**
	 * Put  the mouse pointer over Faculty 
 	 **/
	
	public static void mouseOverFaculty(WebDriver driver,String xpathFaculties,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		sleep();
		driver.quit();
	}
	
	/**
	 * Click on Faculty of Science & Information Technology
 	 **/
	public static void clickFsit(WebDriver driver,String xpathFaculties,String xpathFsit,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		
		driver.findElement(By.xpath(xpathFsit)).click();
		sleep();
		driver.quit();
	}
	
	/**
	 * Click on Faculty of Engineering
 	 **/
	public static void clickFoEngg(WebDriver driver,String xpathFaculties,String xpathFoEngg,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		
		driver.findElement(By.xpath(xpathFoEngg)).click();
		sleep();
		driver.quit();
	}
	
	
	/**
	 * Click on Faculty of Business Administration
 	 **/
	public static void clickFba(WebDriver driver,String xpathFaculties,String xpathFba,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		
		driver.findElement(By.xpath(xpathFba)).click();
		sleep();
		driver.quit();
	}
	
	
	/**
	 * Click on Faculty of Arts & Social Sciences
 	 **/
	public static void clickFass(WebDriver driver,String xpathFaculties,String xpathFass,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		
		driver.findElement(By.xpath(xpathFass)).click();
		sleep();
		driver.quit();
	}
	
	/**
	 * Click on Faculty List
 	 **/
	public static void clickFacultyList(WebDriver driver,String xpathFaculties,String xpathFacultyList,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathFaculties));
		action.moveToElement(section).perform();
		driver.findElement(By.xpath(xpathFaculties)).click();
		
		sleep();
		driver.quit();
	}
	
	
	
	/**
	 * Putting mouse pointer over Administration
 	 **/
	public static void mouseOverAdministration(WebDriver driver,String xpathAdministration,Actions action) {
		
		WebElement section = driver.findElement(By.xpath(xpathAdministration));
		action.moveToElement(section).perform();
		
		sleep();
		driver.quit();
	}
	
	
	
	/**
	 * Sleep 1 second
 	 **/
	 
	public static void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
