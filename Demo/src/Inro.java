import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("vsxfgdsg");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Badruddin Khan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//div[@class='CodeMirror-cursors']")).click();
	 driver.findElement(By.xpath("//div[@class='CodeMirror-cursors']")).clear();
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().dismiss();
	
		
		
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook");
//		driver.findElement(By.xpath("//div[@jsmodel = 'vWNDde']")).click();
//		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK' ]")).click();
		
		driver.getTitle();
//		driver.close();
//		driver.quit();
//		
		
		
//		driver.get("https://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		
//		driver.quit();
		
//		WebElement element = driver.findElement(By.xpath("www.google.com"));
//		File f = element.getScreenshotAs(OutputType.FILE);
//		FileUtills.copyFile(f, new File("screennshot.png"));
//		driver.quit();
		
		
			
		
	}

}
