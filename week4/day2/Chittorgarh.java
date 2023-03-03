package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		//Day2 Assignment 5
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr"));
		int rowsize=row.size();
		List<String> securityList=new ArrayList<String>();
		for(int i=1;i<=rowsize;i++) {
		    String securityNames = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr["+i+"]/td[2]")).getText();
		    System.out.println(securityNames);
		    securityList.add(securityNames);
		 }
		 Set<String> uniqueData=new HashSet<String>(securityList);
		 if(securityList.size()==uniqueData.size()) {
			 System.out.println("No duplicates"); 
		 } 
		 else {
			 System.out.println("Found duplicates"); 
		 }
      }

}
