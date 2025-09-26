import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAncestor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement ancestorForm = driver.findElement(By.xpath("//input[@id='username']/ancestor::form"));
		System.out.println(ancestorForm.getAttribute("name"));
		driver.quit();
	}
 
}
