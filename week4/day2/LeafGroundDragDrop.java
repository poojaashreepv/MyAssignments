package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDragDrop {

	public static void main(String[] args) {
		//Day2 Assignment 2
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
	    Actions action=new Actions(driver);
	    action.dragAndDropBy(drag, 300, 350).perform();
		WebElement dragtarget = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement droptarget = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		action.dragAndDrop(dragtarget, droptarget).perform();
	}

}
