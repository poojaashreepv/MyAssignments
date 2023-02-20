package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement verify = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']]"));
		System.out.println("Verify if check box is disabled : "+verify.getText());
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling :: div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling :: div")).click();
		driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling :: div")).click();
		driver.findElement(By.xpath("//label[text()='Amsterdam']/preceding-sibling :: div")).click();
		driver.close();
	}

}
