package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrames {

	public static void main(String[] args) {
		//Day2 Assignment 1
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String text1 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("After clicking the Button: " +text1);
		driver.switchTo().defaultContent();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int countFrames=frames.size();
		System.out.println("Total Number of Frames: " +countFrames);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String text2 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("Nested Frame :"+text2);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
