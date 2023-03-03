package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Day2 Assignment 8
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement mens = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions action=new Actions(driver);
		action.moveToElement(mens).perform();
		driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[6]")).click();
		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		int totalCount=Integer.parseInt(text.replaceAll("[^0-9]", ""));
		System.out.println("Total count of item is " +totalCount);
		String text2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String text3 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String replaceText2 = text2.replaceAll("[^0-9]", "");
		String replaceText3 = text3.replaceAll("[^0-9]", "");
		int categoryCount1 = Integer.parseInt(replaceText2);
		int categoryCount2 = Integer.parseInt(replaceText3);
		int totCategoryCount=categoryCount1+categoryCount2;
		System.out.println("Sum of Categories count is " +totCategoryCount );
		if(totalCount==totCategoryCount) {
			System.out.println("Both Total Count and Category Count are same");
		}
		else {
			System.out.println("Both Total Count and Category Count are different");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(2000);
		List<WebElement> brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> brandNames=new ArrayList<String>();
		for (WebElement brands : brand) {
			brandNames.add(brands.getText()); 
	    }
		System.out.println(brandNames);
        if(brandNames.contains("Duke")) {
	   	System.out.println("All Products in the Page is Duke Brand");
	   }
	   else {
	   	System.out.println("All Products in the Page is not Duke Brand ");
	   }
        Thread.sleep(1000);
        
        WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
        WebElement betterDiscount = driver.findElement(By.xpath("(//label[@class='sort-label '])[4]"));
		action.moveToElement(sort).click(betterDiscount).perform();
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("The Price of the first displayed product is " +text4);
		driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandle=new ArrayList<String>(windowHandles);	
		driver.switchTo().window(windowHandle.get(1));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/jacket.png");
		FileUtils.copyFile(screenshotAs, destn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,' pdp-add-to-wishlist pdp-button')]")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	}
	


