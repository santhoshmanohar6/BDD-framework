package genericmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import initilizer.initializer;

public class automationgenaric extends initializer {
	
	
	
	public static WebElement getelementByID(String id)
	{
		return driver.findElement(By.id(id));
		
	}
	public static WebElement getelementByname(String name)
	{
		return driver.findElement(By.name(name));
		
	}
	public static WebElement getelementByxpath(String xpath)
	{
		return driver.findElement(By.xpath(xpath));
		
	}
	public static void selecttheelement(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByValue(text);
	}

}
