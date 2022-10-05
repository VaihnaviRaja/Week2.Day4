package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
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
		Point location = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println(x);
		System.out.println(y);
		String color = driver.findElement(By.xpath("//span[text()='Submit']")).getCssValue("Color");
		System.out.println(color);
		Point location1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getLocation();
		int x1=location1.getX();
		int y1=location1.getY();
		System.out.println(x1);
		System.out.println(y1);
		
		
		
	}

}
