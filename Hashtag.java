package day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashtag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragathi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001\r\n");
		driver.manage().window().maximize();
		/*001
		driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo03\"]/ul/li[1]/a")).click();
		*/
		
		/*002
		  driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo03\"]/ul/li[1]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/services/wordpress-development']")).click();
		  Thread.sleep(1500);
		 */
		
		/*003
		driver.findElement(By.xpath("//a[@href='/shopify-experts']")).click();
		*/
		
		/*004
		driver.findElement(By.xpath("//a[@href='/blogs']")).click();
		*/
		
		/*005
		driver.findElement(By.xpath("//a[@href='/careers']")).click();
		*/
		
		/*006
		driver.findElement(By.xpath("//a[@href='/casestudies']")).click();
		*/
		
		/*007
		driver.findElement(By.xpath("//a[@href='/about-us']")).click();
		*/
		
		/*008
		driver.findElement(By.xpath("//a[@href='/contact-us']")).click();
		*/
		
		/*009
		driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo03\"]/div/button[1]")).click();
		*/
		
		/*010
		driver.findElement(By.xpath("//a[@href='/contact-us']")).click();
		*/
		
		/*011
		driver.findElement(By.name("name")).sendKeys("Pragathi K");
		driver.findElement(By.name("email")).sendKeys("prakozhi.07@gamil.com");
		driver.findElement(By.name("phone")).sendKeys("7358733847");
		driver.findElement(By.name("resume")).sendKeys("C:\\Users\\pragathi\\Desktop\\PragathiKResume-jul23.pdf");
		driver.findElement(By.name("description")).sendKeys("works as automation and manual tester");
		driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")).click();
		*/
		
		/*012
		driver.findElement(By.name("email")).sendKeys("prakozhi.07@gamil.com");
		driver.findElement(By.name("phone")).sendKeys("7358733847");
		driver.findElement(By.name("resume")).sendKeys("C:\\Users\\pragathi\\Desktop\\PragathiKResume-jul23.pdf");
		driver.findElement(By.name("description")).sendKeys("works as automation and manual tester");
		driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")).click();
		*/
		
		
		
		
		driver.findElement(By.name("phone")).sendKeys("fhgvj");
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
