package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		//Day2 Assignment 12
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		action.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item5)
		.keyUp(Keys.CONTROL)
		.perform();

	}

}
