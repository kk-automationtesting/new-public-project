package org.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */

public class AppTest 
{
	String abc = getTest();
   
	@Test
    public void googleTest() throws InterruptedException, ParseException, IOException
    {
    	System.out.println(System.getProperty("user.dir")  + "hiiiiiiiiiiiiiiiii"+ "\\resources\\chromedriver_103.0.5060.134\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\chromedriver_103.0.5060.134\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	WebElement inputSearch = driver.findElement(By.xpath("//input[@name='q']"));
    	inputSearch.sendKeys("Automation testing");
    	WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
    	searchButton.click();
    	Thread.sleep(10000);
    	driver.quit();
    	
    	String todayDate = getTodayDate("yyyy_MM_dd_hh_mm_ss_a");
		String fileName = "\\Test_File_" + todayDate +".txt";
		String path = System.getProperty("user.dir")+ fileName;
		System.out.println("path : "+ path);
		File newfile = new File(path);
		if(newfile.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("\n\nFile not created xxxxxxxxxx");
		}
    	
    	Files.deleteIfExists(newfile.toPath());
    }
   
    public static String getTodayDate(String formate) throws ParseException {
		//String date = java.time.LocalDate.now().toString();
		//DateFormat parser = new SimpleDateFormat("yyyy-mm-dd");
		//Date convertedDate = parser.parse(date);
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern(formate);
		String date = formatter.format(LocalDateTime.now());
		return date;
	}
    public String getTest() {
    	return "";
    }
    
    
    
}
