package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Day2 Assignment 4
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String text = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println("Total Count Of Sport Shoes : " +text);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();  
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println("The sort applied is " +text2);
		String text3 = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		String text4 = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		String replaceText3 = text3.replaceAll("[^0-9]", "");
		String replaceText4 = text4.replaceAll("[^0-9]", "");
		int from = Integer.parseInt(replaceText3);
		int to = Integer.parseInt(replaceText4);
		if(from<to) {
		System.out.println("After sorting applied the price range is from " +from+ " to " +to+ " hence the items displayed are sorted correctly");
		}
		else {
			System.out.println("After sorting applied the price range is from " +from+ " to " +to+ " hence the items displayed are not sorted correctly");
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='filters-list sdCheckbox  '])[4]")).click();
		String filters = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[1]")).getText();
		if(filters.contains("Navy")) {
			System.out.println("The filter is applied");
		}
		else {
			System.out.println("The filter is not applied");
		}
		WebElement trainingShoe = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
		Actions action=new Actions(driver);
		action.moveToElement(trainingShoe).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		Thread.sleep(2000);
		String text5 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(2000);
		System.out.println("The Cost of the item is " +text5);
		Thread.sleep(3000);
		String text6 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[@class='percent-desc ']")).getText();
		Thread.sleep(2000);
		System.out.println("The Discount Percentage of item is " +text6);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/shoe.png");
		FileUtils.copyFile(screenshotAs, destn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}


