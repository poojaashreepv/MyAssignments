package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		//Day2 Assignment 10
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		WebElement status = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println("Default browser selected : "+status.getText());
		WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		System.out.println("Default age group selected : "+age.getText());
		driver.close();

	}

}
