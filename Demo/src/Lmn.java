import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lmn {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Badruddin Khan\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = "";
			driver.get("https://demoqa.com/links");
			
			List<WebElement> list = driver.findElements(By.tagName("a"));
//			Asser
			
			System.out.println("Length" + list.size());
			
			Iterator<WebElement> itr = list.iterator();
			while(itr.hasNext()) {
				url = itr.next().getText();
				System.out.println(url);
			}
			
//			driver.quit();
			
		
		}
	
	
}
