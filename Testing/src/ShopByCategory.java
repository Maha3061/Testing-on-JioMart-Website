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
public class ShopByCategory {
    public static void main(String[] args) throws InterruptedException { 
  System.setProperty("webdriver.chrome.driver","E:\\VIT\\B1-ST\\PROJECT\\chromedriver_win32\\chromedriver.exe"); 
  WebDriver driver=new ChromeDriver();   
  driver.get("https://www.jiomart.com");  
  driver.manage().window().maximize(); 
  Thread.sleep(2000); 
  driver.get("https://www.jiomart.com/all-category"); 
  String at=driver.getTitle(); 
  String et="JioMart"; 
  if(at.equalsIgnoreCase(et)) { 
   System.out.println("Test Successful"); 
  } 
  else { 
   System.out.println("Test Failure");  
  } 
  //Groceries 
  driver.findElement(By.className("cat_sub_name")).click(); 
  Thread.sleep(2000); 
  driver.findElement(By.className("cat_name")).click(); 
  Thread.sleep(2000); 
  driver.get("https://www.jiomart.com/c/groceries/fruits-vegetables/219"); 
  Thread.sleep(2000);  
  driver.quit(); 
 } 
 
}
