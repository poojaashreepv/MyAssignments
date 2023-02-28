package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Day1 Assignment 3
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of first product : " +text);
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
		System.out.println("Customer Rating for the first displayed product : " +text2);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandle=new ArrayList<String>(windowHandles);	
		driver.switchTo().window(windowHandle.get(1));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/oneplus.png");
		FileUtils.copyFile(screenshotAs, destn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		String text3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The Cart Subtotal is : " +text3);
		if(text.equals(text3)) {
			System.out.println("The Price of the Product and Card Subtotal is same");
		}
		else {
			System.out.println("The Price of the Product and Card Subtotal is different");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
