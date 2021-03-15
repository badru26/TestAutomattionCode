import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prs {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Badruddin Khan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		String url = "";
		List li = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> itr = li.iterator();
		
		while(itr.hasNext())
		{
			driver.findElement(By.xpath("dfdf")).sendKeys("'fkjdkfj");
			System.out.println(itr.next().getText());
		}
		
		
		
	}

}
