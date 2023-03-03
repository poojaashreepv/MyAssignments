package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		//Day2 Assignment 3
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions action=new Actions(driver);
		action.moveToElement(brands).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).click();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println("The Title is : " +title);
		if(title.contains("L'Oreal Paris")) {
			System.out.println("Title contains L'Oreal Paris");
		}
		else {
			System.out.println("Title doesn't contains L'Oreal Paris");
		}
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='title '] )[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='filter-name '])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-xdicx1']")).click();
		driver.findElement(By.xpath("(//span[@class='title '] )[6]")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("(//div[@class='css-xdicx1'])[4]")).click();
		String text = driver.findElement(By.xpath("//div[@class='css-rtde4j']")).getText();
		System.out.println("The Filters applied are " +text);
		if(text.contains("Shampoo")) {
			System.out.println("The Filter is applied");
		}
		else {
			System.out.println("The Filter is not applied");
		}
		driver.findElement(By.xpath("//div[@class='css-1rd7vky']")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandle=new ArrayList<String>(windowHandles);	
		driver.switchTo().window(windowHandle.get(1));
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		String text1 = driver.findElement(By.xpath("//h1[@class='css-1gc4x7i']")).getText();
		String text2 = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("The MRP of the " +text1+ " product is " +text2);
		driver.findElement(By.xpath("//button[@class=' css-1qvy369']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		driver.switchTo().frame(0);
		String text3 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("The Grand Total is " +text3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']")).click();
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		System.out.println("The Final Grand Total is " +text4);
		if(text4.contains(text3)) {
			System.out.println("The Both Grand Total is same ");
		}
		else {
			System.out.println("The Both Grand total is different");
		}
		Thread.sleep(2000);
	    driver.quit();
	}

}
