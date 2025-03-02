import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  TestSelenium {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }
    @Test
    public void test(){
        chromeDriver.get("https://vitimex.com.vn/");
        WebElement timKiem = chromeDriver.findElement(By.xpath("//input[@id='keyword']"));
        timKiem.sendKeys("Quan Dai");
    }

}
