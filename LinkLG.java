package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		System.out.println(driver.getTitle());
		driver.get("https://leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).click();
		System.out.println(driver.getTitle());
		driver.get("https://leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
	}

}
