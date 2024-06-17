package java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Realme 11 Pro");
		ele.submit();
		Thread.sleep(3000);
		
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']/../../../preceding-sibling::div/div[1]"));
		Thread.sleep(3000);
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']/../../../preceding-sibling::div/div[1]/../following-sibling::div/div/div/div[1]"));
		Thread.sleep(3000);
		
		for (int i = 0; i < elements1.size(); i++) {
			String item = elements1.get(i).getText() + " " + elements.get(i).getText();
			System.out.println(item);
		}
		
/*		
		
		for (WebElement webElement : elements1) {
			String prod_name = webElement.getText();
			System.out.println(prod_name);
		}
		
		for (WebElement webElement : elements) {
			String prod_price = webElement.getText();
			System.out.println(prod_price);
		}
		
*/
		
		Thread.sleep(3000);
		driver.close();
	}

}
