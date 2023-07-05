package com.demoGlaze.DemoGlaze.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
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
			File desFile = new File("D://Fila/Loggedin.png");
			FileHandler.copy(scrFile, desFile);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void logout(String objectName) 
	{
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
	}
	public void close() 
	{
		driver.quit();
	}
	public void laptops(String objectName) 
	{
		try 
		{
			Thread.sleep(4000);
			driver.findElement(By.linkText("Laptops")).click();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public void macbook(String objectName) 
	{
		try 
		{
			Thread.sleep(4000);
			driver.findElement(By.linkText("MacBook Pro")).click();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public void addToCart(String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Add to cart")).click();
		try 
		{
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void cart(String objectName) 
	{
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		try 
		{
			Thread.sleep(5000);
			File scrFile = driver.getScreenshotAs(OutputType.FILE);
			File desFile = new File("D://Fila/addedToCart.png");
			FileHandler.copy(scrFile, desFile);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void placeOrder(String objectName) 
	{
		try 
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public void name(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void country(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void city(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void card(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void month(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void year(String data, String objectName) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	}
	public void purchase(String objectName) 
	{
		try 
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath(prop.getProperty(objectName))).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			File scrFile = driver.getScreenshotAs(OutputType.FILE);
			File desFile = new File("D://Fila/orderPlaced.png");
			FileHandler.copy(scrFile, desFile);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}