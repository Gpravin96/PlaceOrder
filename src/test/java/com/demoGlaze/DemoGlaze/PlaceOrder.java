package com.demoGlaze.DemoGlaze;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.demoGlaze.DemoGlaze.base.ExcelReader;
import com.demoGlaze.DemoGlaze.base.Keywords;

public class PlaceOrder 
{
	@Test
	public void placingOrderTest() 
	{
		ArrayList testData = ExcelReader.getTestData("D://Fila//demoGlaze1.xlsx");
		Keywords key = new Keywords();
		for(int i=0;i<testData.size();i++) 
		{
			if(testData.get(i).equals("open")) 
			{
				key.open();
			}
			if(testData.get(i).equals("url")) 
			{
				String httpUrl = testData.get(i+1).toString();
				key.url(httpUrl);
			}
			if(testData.get(i).equals("click")) 
			{
				String objectName = testData.get(i+2).toString();
				key.click(objectName);
			}
			if(testData.get(i).equals("Username")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.Username(data, objectName);
			}
			if(testData.get(i).equals("Password")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.Password(data, objectName);
			}
			if(testData.get(i).equals("click1")) 
			{
				String objectName = testData.get(i+2).toString();
				key.click1(objectName);
			}
			if(testData.get(i).equals("laptops")) 
			{
				String objectName = testData.get(i+2).toString();
				key.laptops(objectName);
			}
			if(testData.get(i).equals("macbook")) 
			{
				String objectName = testData.get(i+2).toString();
				key.macbook(objectName);
			}
			if(testData.get(i).equals("addToCart")) 
			{
				String objectName = testData.get(i+2).toString();
				key.addToCart(objectName);
			}
			if(testData.get(i).equals("cart")) 
			{
				String objectName = testData.get(i+2).toString();
				key.cart(objectName);
			}
			if(testData.get(i).equals("placeOrder")) 
			{
				String objectName = testData.get(i+2).toString();
				key.placeOrder(objectName);
			}
			if(testData.get(i).equals("name")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.name(data, objectName);
			}
			if(testData.get(i).equals("country")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.country(data, objectName);
			}
			if(testData.get(i).equals("city")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.city(data, objectName);
			}
			if(testData.get(i).equals("card")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.card(data, objectName);
			}
			if(testData.get(i).equals("month")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.month(data, objectName);
			}
			if(testData.get(i).equals("year")) 
			{
				String data = testData.get(i+1).toString();
				String objectName = testData.get(i+2).toString();
				key.year(data, objectName);
			}
			if(testData.get(i).equals("purchase")) 
			{
				String objectName = testData.get(i+2).toString();
				key.purchase(objectName);
			}
			/*if(testData.get(i).equals("close")) 
			{
				key.close();
			}*/
		}
	}
}
