package com.java.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Form 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrom.driver";
		String value="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
		String url="https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(url);
		Thread.sleep(2000);
 //get text
		String gettext = driver.findElement(By.xpath("//div[@class='segment_header']/h1")).getText();
		System.out.println(gettext);
		Thread.sleep(2000);
//First name		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Irfan");
		Thread.sleep(2000);
//Last name
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ansari");
		Thread.sleep(2000);
//Phone
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("9876543210");
		Thread.sleep(2000);
//Contry
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		Thread.sleep(2000);
//City
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Dhule");
		Thread.sleep(2000);
//Email
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("irfan145@gmail.com");
		Thread.sleep(2000);
//Gender
		boolean optionbefore = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
		System.out.println("Gender selected status="+optionbefore);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
//Days
		boolean checkboxStatus=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_4']")).isEnabled();
		System.out.println("checkboxstatus="+checkboxStatus);
		if(checkboxStatus==true)
		{
			driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_4']")).click();
		}
		Thread.sleep(2000);
//Url
		driver.findElement(By.xpath("(//div[@class='full_width_space'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='full_width_space'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//Logo		
		boolean display = driver.findElement(By.xpath("//img[@class='svg']")).isDisplayed();
		System.out.println("logo display status="+display);
		Thread.sleep(10000);
		
		driver.close();
	}

}
