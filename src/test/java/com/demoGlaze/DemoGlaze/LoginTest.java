package com.demoGlaze.DemoGlaze;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.demoGlaze.DemoGlaze.base.ExcelReader;
import com.demoGlaze.DemoGlaze.base.Keywords;

public class LoginTest 
{
	@Test
	public void signupTest() 
	{
		ArrayList testData = ExcelReader.getTestData("D://Fila//demoGlaze.xlsx");
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
			if(testData.get(i).equals("logout")) 
			{
				String objectName = testData.get(i+2).toString();
				key.logout(objectName);
			}
			if(testData.get(i).equals("close")) 
			{
				key.close();
			}
		}
	}
}
