import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.io.File;
import java.io.IOException;
 
public class Fr {
    public static void main(String[] args) throws IOException {
        //set the location of chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Badruddin Khan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        //navigate to url
        driver.get("https://demoqa.com");
//        
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
		
//		 String url = "https://www.tutorialspoint.com/tutor_connect/index.php";
//		 driver.get(url);
//	      WebElement drpdwn = driver.findElement(By.xpath("//select[@name='selType']"));
//	      // capture screenshot with getScreenshotAs() of the dropdown
//	      File f = drpdwn.getScreenshotAs(OutputType.FILE);
//	      FileUtils.copyFile(f, new File("C:\\projectScreenshots\\homePageScresadenshot.png"));
//	      driver.quit();
//        
        //closing the webdriver
//        driver.close();
    }
}