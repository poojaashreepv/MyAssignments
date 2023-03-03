package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		//Day2 Assignment 9
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(drag, 200, 120).perform();
	}

}
