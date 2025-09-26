import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsiblings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
		password.sendKeys("secret123");
		
	}

}
