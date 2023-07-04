package com.demoGlaze.DemoGlaze.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Keywords 
{
	ChromeDriver driver;
	FileInputStream fis;
	Properties prop;
	FileInputStream config;
	Properties propConfig;
	public void open() 
	{
		try 
		{
			fis = new FileInputStream("D:\\DemoGlaze\\src\\main\\java\\com\\demoGlaze\\DemoGlaze\\base\\ObjectRepository.properties");
			prop = new Properties();
			prop.load(fis);
			
			config = new FileInputStream("D:\\DemoGlaze\\src\\main\\java\\com\\demoGlaze\\DemoGlaze\\base\\Config.properties");
			propConfig = new Properties();
			propConfig.load(config);
			
			if(propConfig.getProperty("browser").equals("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "D://jimmy//chromedriver4.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			if(propConfig.getProperty("browser").equals("fireFox")) 
			{
				System.setProperty("webdriver.gecko.driver", "D://jimmy//geckodriver4.exe");
				FirefoxDriver driver = new FirefoxDriver();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void url(String httpUrl) 
	{
		driver.get(httpUrl);
	}
	public void click(String objectName) 
	{
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
	}
	public void Username(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void Password(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void click1(String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		try 
		{
			Thread.sleep(5000);
			File scrFile = driver.getScreenshotAs(OutputType.FILE);
			File desFile = new File("D://Fila/Glaze.png");
			FileHandler.copy(scrFile, desFile);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}