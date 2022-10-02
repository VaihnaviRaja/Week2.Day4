package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioLG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean enabled = driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled();
		System.out.println("Safari is Enabled " +enabled);
		boolean enabled2 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("Default check"+enabled2);
		
		
		

	}

}
