package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\Seleniumproj\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement women= driver.findElement(By.xpath("//a[@title='Women']"));
		Actions wom= new Actions(driver);
		wom.moveToElement(women).build().perform();
Thread.sleep(3000);


WebElement casDress= driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
casDress.click();
Thread.sleep(3000);

WebElement instock= driver.findElement(By.xpath("//span[@class='available-now']"));
wom.moveToElement(instock).build().perform();
Thread.sleep(3000);

WebElement addTocart= driver.findElement(By.linkText("Add to cart"));
addTocart.click();
Thread.sleep(3000);

WebElement check_out= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
check_out.click();


JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400)", "");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement quantity= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
quantity.clear();
quantity.sendKeys("4");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement pco= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
pco.click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

JavascriptExecutor js1= (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,400)", "");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement email=driver.findElement(By.id("email_create"));
email.sendKeys("aravind.k17@gmail.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


WebElement create_An_Account= driver.findElement(By.id("SubmitCreate"));
create_An_Account.click();
Thread.sleep(3000);


WebElement firstName= driver.findElement(By.id("customer_firstname"));
firstName.sendKeys("aravind");
Thread.sleep(3000);


WebElement lastName= driver.findElement(By.id("customer_lastname"));
lastName.sendKeys("k");
Thread.sleep(3000);



WebElement Password= driver.findElement(By.id("passwd"));
Password.sendKeys("aravind@17");
Thread.sleep(3000);


WebElement day= driver.findElement(By.id("days"));
Select s=new Select(day);
s.selectByValue("17");


WebElement month= driver.findElement(By.id("months"));
Select s1=new Select(month);
s1.selectByIndex(12);


WebElement year= driver.findElement(By.id("years"));
Select s2=new Select(year);
s2.selectByValue("1993");


WebElement newsletter= driver.findElement(By.id("newsletter"));
newsletter.click();
Thread.sleep(3000);


WebElement offer= driver.findElement(By.id("optin"));
offer.click();
Thread.sleep(3000);

WebElement first= driver.findElement(By.id("firstname"));
first.sendKeys("aravind");
Thread.sleep(3000);


WebElement last= driver.findElement(By.id("lastname"));
last.sendKeys("k");
Thread.sleep(3000);

WebElement com= driver.findElement(By.id("company"));
com.sendKeys("gameover pvt ltd");
Thread.sleep(3000);

WebElement address1= driver.findElement(By.id("address1"));
address1.sendKeys("21,neelanagar ");
Thread.sleep(3000);

WebElement address2= driver.findElement(By.id("address2"));
address2.sendKeys("21,neelanagar ");
Thread.sleep(3000);



WebElement city= driver.findElement(By.id("city"));
city.sendKeys("CHENNAI ");
Thread.sleep(3000);



WebElement state= driver.findElement(By.id("id_state"));
Select s3 =new Select(state);
s3.selectByIndex(42);


WebElement pc= driver.findElement(By.id("postcode"));
pc.sendKeys("00000");
Thread.sleep(3000);

WebElement country= driver.findElement(By.id("id_country"));
Select s4=new Select(country);
s4.selectByIndex(1);


WebElement other= driver.findElement(By.id("other"));
other.sendKeys("NILL ");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


WebElement phone= driver.findElement(By.id("phone"));
phone.sendKeys("7894561230 ");
Thread.sleep(3000);


WebElement mobile= driver.findElement(By.id("phone_mobile"));
mobile.sendKeys("8015512454 ");
Thread.sleep(3000);



WebElement friend= driver.findElement(By.id("alias"));
friend.clear();
friend.sendKeys("aravind.kfrien@gmail.com");
Thread.sleep(3000);


WebElement reg= driver.findElement(By.id("submitAccount"));
reg.click();
Thread.sleep(3000);


WebElement co2= driver.findElement(By.xpath("//button[@name='processAddress']"));
co2.click();
Thread.sleep(3000);


WebElement agree= driver.findElement(By.id("cgv"));
agree.click();
Thread.sleep(3000);



WebElement co3= driver.findElement(By.xpath("//button[@name='processCarrier']"));
co3.click();
Thread.sleep(3000);


WebElement bank= driver.findElement(By.xpath("//a[@class='bankwire']"));
bank.click();
Thread.sleep(3000);




WebElement confirm= driver.findElement(By.xpath("//button[@class='button btn-default button-medium']"));
confirm.click();
Thread.sleep(3000);









	}
}
