package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilcitWait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		System.out.println("Wait for Visibility (1 - 10 Sec)");
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
		System.out.println("After (1 - 10 Sec) wait " +text+ " is visible");
		System.out.println("");
		System.out.println("Wait for Invisibility (1 - 10 Sec)");
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		System.out.println(text2);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println("After (1 - 10 Sec) wait " +text2+ " is invisible");
		System.out.println("");
		System.out.println("Wait for Clickability");
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		System.out.println("After wait Clickability is performed");
		System.out.println("");
		System.out.println("Wait for Text Change (1 - 10 Sec)");
		String text4 = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		Boolean until = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='I am going to change!']"), text4));
		System.out.println("Is Text Change : " +until);
		WebElement textChange = driver.findElement(By.xpath("(//button[@role='button'])[7]"));
		wait.until(ExpectedConditions.stalenessOf(textChange));
		if(until) {
        String text5 = driver.findElement(By.xpath("(//button[@role='button'])[7]")).getText();
		System.out.println("The Changed Text is " +text5);
		}
		else {
			System.out.println("The Text is Not Changed");
		}
	}

}
