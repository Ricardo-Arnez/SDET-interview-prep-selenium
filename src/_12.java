import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "_drivers/browser-drivers/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
