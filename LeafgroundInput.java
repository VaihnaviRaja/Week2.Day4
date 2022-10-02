package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundInput {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Vaishnavi R");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Chennai India");
		boolean enabled = driver.findElement(By.xpath("//div[@class='col-12']/input")).isEnabled();
		System.out.println("Verifying box is enabled "+enabled);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String text = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("vaishu@xyz.com");
		driver.findElement(By.xpath("//div[@class='col-12']//textarea")).sendKeys("Iam a Tester");
		
		

	}

}
