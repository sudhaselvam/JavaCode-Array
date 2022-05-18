package dailypractice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	WebDriver driver = null;
	Actions actions = null;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();

	}

	@Test
	public void testcase() throws InterruptedException {
		Thread.sleep(5000);
		actions = new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement e = driver.findElement(By.xpath("//input[@id='age']"));
		actions.moveToElement(e).build().perform();
		Thread.sleep(5000);
		String expected = driver.findElement(By.xpath("//input[@title='We ask for your age only for statistical purposes.']")).getAttribute("title");

		System.out.println(expected);
		//Assert.assertEquals(expected, "We ask for your age only for statistical purposes.");
		// Assert.assertTrue(expected.contains("age"));

	}

	@Test(priority = 3)
	public void testcase1() throws InterruptedException {
		Thread.sleep(5000);
		actions = new Actions(driver);
		

		WebElement e1 = driver.findElement(By.xpath("//a[text() ='Tooltips']"));

		actions.moveToElement(e1).build().perform();

		String toolTips = driver.findElement(By.xpath("//a[@title='That's what this widget is']")).getAttribute("title");
		System.out.println(toolTips);
		//Assertion.assertEquals(toolTips, "That's what this widget is");

	}
	
	@Test
	public void validTool() {
		actions = new Actions(driver);

		WebElement e1 = driver.findElement(By.xpath("//a[text() ='ThemeRoller']"));

		actions.moveToElement(e1).build().perform();
		String toolTips=driver.findElement(By.xpath("//a[text() ='ThemeRoller']")).getAttribute("title");
		//String toolTips = driver.findElement(By.xpath("//a[@title='ThemeRoller: jQuery UI's theme builder application']")).getAttribute("title");
		System.out.println(toolTips);
		//Assert.assertEquals(toolTips, "ThemeRoller: jQuery UI's theme builder application");
	
	}
}
