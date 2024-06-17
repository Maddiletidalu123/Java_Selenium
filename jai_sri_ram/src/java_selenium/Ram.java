package java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ram {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		driver.findElement(By.id("APjFqb")).sendKeys("RAM");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='erkvQe']"));
		Thread.sleep(3000);
		
		for (int i = 0; i < elements.size(); i++) {
			String sp = elements.get(i).getText();
			System.out.println(sp);
		}
		
		
/*		
		for (WebElement webElement : elements) {
			String search_options = webElement.getText();
			System.out.println(search_options);
		}
	
*/
		Thread.sleep(3000);
		driver.close();
	}

}
