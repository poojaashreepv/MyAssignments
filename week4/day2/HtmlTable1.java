package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable1 {

	public static void main(String[] args) {
		//Day2 Assignment 7
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int colSize=col.size();
		for(int i=1;i<=colSize;i++) {			
			String lib1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println(lib1);
		}
		System.out.println("");
		for(int i=1;i<=colSize;i++) {			
			String lib2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td["+i+"]")).getText();
			System.out.println(lib2);
		}
		
	}

}
