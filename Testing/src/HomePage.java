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
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePage {
    public static void main(String[] args) throws InterruptedException { 
System.setProperty("webdriver.chrome.driver", 
"E:\\VIT\\B1-ST\\PROJECT\\chromedriver_win32\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();  
driver.get("http://www.jiomart.com");  // opening url 
driver.manage().window().maximize(); 
Thread.sleep(2000); 
String at=driver.getTitle(); 
String et="Buy Grocery Online | Daily Needs Supermarket - JioMart"; 
driver.quit();  //closing browser 
if(at.equalsIgnoreCase(et)) { 
System.out.println("Test Successful");} 
else{ 
System.out.println("Test Failure"); } 
}
}
