package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poojaashree");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P V");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("poojaashreepv@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Poojaa@123");
		WebElement bday=driver.findElement(By.name("birthday_day"));
		Select daydd=new Select(bday);
		daydd.selectByValue("15");
		WebElement month=driver.findElement(By.name("month"));
		Select monthdd=new Select(month);
		monthdd.selectByValue("Jul");
		WebElement year=driver.findElement(By.name("year"));
		Select yeardd=new Select(year);
		yeardd.selectByValue("2002");
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='1']")).click();
		driver.close();
		
		}

}
