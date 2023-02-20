package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		//Day2 Assignment 6
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Poojaashree");
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Chennai, India");
		WebElement verify = driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
		boolean isdisplaying = verify.isDisplayed();
		System.out.println("Text box verification status : "+verify.getAttribute("placeholder"));
		System.out.println("Is text box disabled : "+isdisplaying);
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement retrieve = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		System.out.println("The retrived text is : "+retrieve.getAttribute("value"));
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("poojaashreepv@gamil");
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Hi I am Poojaashree");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[9]")).sendKeys(Keys.ENTER);
		WebElement message = driver.findElement(By.xpath("(//div[@role='alert']//span)[2]"));
		System.out.println("Error message is : "+message.getText());
        WebElement label = driver.findElement(By.xpath("//label[text()='Username']"));
		org.openqa.selenium.Point before = label.getLocation();
		System.out.println("Label position before click : "+before);
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
		org.openqa.selenium.Point after = label.getLocation();
		System.out.println("Label position after click : "+after);
        if(before == after)	{
			System.out.println("Username label position are equal");
		} 
        else {
			System.out.println("Username label position are not equal");
		}
        driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Poojaashree");
		driver.findElement(By.xpath("//li[@data-item-label='Poojaashree2']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).click();
	    driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("02/15/2023");
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-k')]")).click();
		WebElement display = driver.findElement(By.xpath("(//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui')])[2]"));
		boolean status = display.isDisplayed();
		System.out.println("Keyboard appeared : "+ status);
        driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank']/p)[2]")).sendKeys("LeafGround");
        driver.close();

	}

}
