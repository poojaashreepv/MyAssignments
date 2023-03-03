package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		//Day2 Assignment 6
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		int rowSize = row.size();
		System.out.println("Count of Number of rows in the table : " +rowSize);
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[2]/td"));
		int columnSize = column.size();
		System.out.println("Count of Number of columns in the table : " +columnSize);

	}

}
