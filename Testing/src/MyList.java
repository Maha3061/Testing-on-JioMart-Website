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
import org.openqa.selenium.chrome.ChromeDriver; 
public class MyList extends Signin {
    public static void main(String[] args) throws InterruptedException {   
  System.setProperty("webdriver.chrome.driver","E:\\VIT\\B1-ST\\PROJECT\\chromedriver_win32\\chromedriver.exe");   
WebDriver driver=new ChromeDriver();   
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
  driver.findElement(By.id("autocomplete-0-input")).sendKeys("RICE"); 
  Thread.sleep(5000); 
  driver.get("https://www.jiomart.com/catalogsearch/result?q=rice"); 
  Thread.sleep(1000); 
  driver.findElement(By.className("cat-img")).click(); 
  Thread.sleep(1000); 
  driver.findElement(By.id("wishlist_btn")).click(); 
  Thread.sleep(3000); 
  driver.get("https://www.jiomart.com/customer/wishlist"); 
  Thread.sleep(5000); 
  String at=driver.getTitle(); 
  String et="Buy Grocery Online at Best Prices Pan India"; 
  if(at.equalsIgnoreCase(et)) { 
   System.out.println("Test Successful"); 
  } 
  else { 
   System.out.println("Test Failure");  
  } 
driver.quit(); 
 }
}
