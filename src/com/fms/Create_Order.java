package com.fms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Order {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Project Cucumber\\Fms\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gratest.in/fmsweb/");
		System.out.println("url paseed");
		driver.findElement(By.name("username")).sendKeys("sectionincharge");
		System.out.println("user enter username");
		driver.findElement(By.name("password")).sendKeys("123");
		System.out.println("user entered password");
		driver.findElement(By.className("check-box")).click();
		System.out.println("Remember button is clicked");
		driver.findElement(By.className("submit-btn")).click();
		System.out.println("login button is clicked");
		//login page navigate to order page
		driver.findElement(By.className("navbar-brand")).click();
		System.out.println("burger menu button is cliked");
		driver.findElement(By.xpath("//a[@href='CreateOrder.php?action=new']")).click();
		System.out.println("Create order menu is clicked");
		WebElement section_incharge = driver.findElement(By.name("sectionIcId"));
		Select s=new Select(section_incharge);
		s.selectByIndex(1);
		System.out.println("section_incharge dropdown is selected");
		driver.findElement(By.name("fromDate")).sendKeys("01-12-2022");
		System.out.println("from_date field box selected ");
		driver.findElement(By.name("toDate")).sendKeys("05-12-2022");
		System.out.println("to_date field box selected");
		WebElement site_engineer = driver.findElement(By.name("siteEngineerId"));
		Select s1=new Select(site_engineer);
		s1.selectByIndex(1);
		System.out.println("site_engineer dropdown is selected");
		WebElement sub_conductor = driver.findElement(By.name("subContractor"));
		Select s2=new Select(sub_conductor);
		s2.selectByIndex(1);
		System.out.println("sub_conductor dropdown is selected");
		WebElement structure = driver.findElement(By.name("structureId1"));
		Select s3=new Select(structure);
		s3.selectByIndex(2);
		System.out.println("structure dropdown is selected");
		WebElement segment = driver.findElement(By.name("segmentId1"));
		Select s4=new Select(segment);
		s4.selectByIndex(1);
		System.out.println("segment dropdown is selected");
		WebElement sub_segment = driver.findElement(By.name("subSegmentId1"));
		Select s5=new Select(sub_segment);
		s5.selectByIndex(3);
		System.out.println("sub_segment dropdown is selected");
		WebElement element = driver.findElement(By.name("elementId1"));
		Select s6=new Select(element);
		s6.selectByIndex(1);
		System.out.println("element dropdown is selected");
		driver.findElement(By.name("location1")).sendKeys("bacd");
		System.out.println("location pass in location field box");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println("add button is clicked");
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("dimension edit button is clicked");
		Thread.sleep(3000);
		WebElement lenght = driver.findElement(By.xpath("//input[@name='length[]']"));
		lenght.clear();
		lenght.sendKeys("1");
		System.out.println("lenght is passed");
		WebElement Breath = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		Breath.clear();
		Breath.sendKeys("10");
		Thread.sleep(3000);
		System.out.println("lenght is passed");
		
		WebElement height = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
		height.clear();
		height.sendKeys("10");
		System.out.println("height is passed");

		WebElement radius = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		radius.clear();
		radius.sendKeys("11");
		System.out.println("radius is passed");

		WebElement required = driver.findElement(By.xpath("(//input[@type='number'])[5]"));
		required.clear();
		required.sendKeys("12");
		System.out.println("required is passed");

		WebElement message = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		message.clear();
		message.sendKeys("base");
		System.out.println("message is passed");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("dimension ok button is clicked");
		
		
	}
}
