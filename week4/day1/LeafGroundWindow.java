package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindow {

	public static void main(String[] args) throws InterruptedException {
		//Day1 Assignment 2
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String title1 = driver.getTitle();
		System.out.println("The Title of the Main Page is " +title1);
		System.out.println("");
		System.out.println("Click and Confirm new Window Opens");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winHandle=new ArrayList<String>(windowHandles);	
		driver.switchTo().window(winHandle.get(1));
		if(windowHandles.size()>0) {
			System.out.println("The New Window is Opened");
			String title = driver.getTitle();
			System.out.println("Title of the New Opened Window is " +title);
		}
		else {
			System.out.println("The New Window is not Opened");
		}
		driver.close();
		System.out.println("");
		driver.switchTo().window(winHandle.get(0));
		System.out.println("Find the number of opened tabs");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> winHandle1=new ArrayList<String>(windowHandles1);	
		int size = windowHandles1.size();
		System.out.println("The Number Of Opened Tabs : " +size);
		for(int i=1;i<=size-1;i++) {
			driver.switchTo().window(winHandle1.get(i));
			System.out.println("The Title of " +i+ " Page is "+driver.getTitle());
			driver.close();
			
		}
		System.out.println("");
		driver.switchTo().window(winHandle1.get(0));
		System.out.println("Close all windows except Primary");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> winHandle2=new ArrayList<String>(windowHandles2);
		int size2 = windowHandles2.size();
		for(int j=1;j<=size2-1;j++) {
			driver.switchTo().window(winHandle2.get(j));
			System.out.println("The Title of " +j+ " Page is "+driver.getTitle());
			driver.close();
			
		}
		System.out.println("Except Primary Window all Windows are Closed");
		System.out.println("");
		driver.switchTo().window(winHandle2.get(0));
		System.out.println("Wait for 2 new tabs to open");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		System.out.println("The 2 New Tabs are Opened after delay");
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> winHandle3=new ArrayList<String>(windowHandles3);
		int size3 = windowHandles3.size();
		for(int k=1;k<=size3-1;k++) {
			driver.switchTo().window(winHandle3.get(k));
			System.out.println("The Title of " +k+ " Page is "+driver.getTitle());
			driver.close();
			
		}
		
		
	}

}
