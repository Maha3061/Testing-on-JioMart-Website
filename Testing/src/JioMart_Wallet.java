package Selenium; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;  
public class JioMart_Wallet { 
 public static void main(String[] args) throws InterruptedException { 
  // TODO Auto-generated method stub 
  System.setProperty("webdriver.chrome.driver", 
    "E:\\VIT\\B1-ST\\PROJECT\\chromedriver_win32\\chromedriver.exe"); 
  WebDriver driver=new ChromeDriver(); //Parent p=new Child   (WebDriver is Parent & ChromeDriver is Child) 
  driver.get("https://www.jiomart.com/customer/account/login");  // opening url 
  driver.manage().window().maximize(); 
  Thread.sleep(2000);  
  driver.findElement(By.id("loginfirst_mobileno")).sendKeys("6385349896"); 
  Thread.sleep(10000); 
//  driver.findElement(By.tagName("button")).click(); 
//  driver.findElement(By.id("singalotpcol logotp ng-pristine ng-invalid ng-touched")); 
//  driver.findElement(By.className("btn-login")).sendKeys(Keys.ENTER); 
  driver.get("https://www.jiomart.com/customer/account/login");  
  Thread.sleep(5000); 
  driver.get("https://www.jiomart.com/customer/account/jiomartwallets");  // opening url 
  driver.manage().window().maximize(); 
  Thread.sleep(2000);  
  String at=driver.getTitle(); 
  String et="Buy Grocery Online at Best Prices Pan India"; 
  driver.quit();  //closing browser 
  if(at.equalsIgnoreCase(et)) { 
   System.out.println("Test Successful"); 
  } 
  else { 
   System.out.println("Test Failure");  
  } 
 } 
 
} 
