package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		System.out.println(driver.getTitle());
		driver.get("https://leafground.com/button.xhtml");
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		driver.findElement(By.xpath("//span[text()='Submit']")).getCssValue("Color");
		
		
	}

}
