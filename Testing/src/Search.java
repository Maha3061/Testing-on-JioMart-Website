/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmaha
 */
package Selenium; 
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
public class Search {
    public static void main(String[] args) throws InterruptedException { 
System.setProperty("webdriver.chrome.driver", 
"E:\\VIT\\B1-ST\\PROJECT\\chromedriver_win32\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();  
driver.get("http://www.jiomart.com");  // opening url 
driver.manage().window().maximize(); 
Thread.sleep(2000); 
String at=driver.getTitle(); 
String et="Buy Grocery Online | Daily Needs Supermarket - JioMart"; 
if(at.equalsIgnoreCase(et)){ 
System.out.println("Test Successful"); 
} 
else { 
System.out.println("Test Failure");  
} 
driver.findElement(By.id("autocomplete-0-input")).click(); 
Thread.sleep(2000); 
driver.findElement(By.id("autocomplete-0-input")).sendKeys("Iphone X"); 
Thread.sleep(2000); 
driver.findElement(By.id("autocomplete-0-input")).sendKeys(Keys.ENTER); 
Thread.sleep(2000); 
driver.findElement(By.className("clsgetname")).click(); 
driver.quit();  //closing browser 
 }
}
