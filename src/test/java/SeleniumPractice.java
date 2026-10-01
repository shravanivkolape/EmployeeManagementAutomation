import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/PracticeApplication/index.html");

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.id("loginButton")).click();
    }
}