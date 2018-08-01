/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author neerajsah
 */
public class LoadTimeSheet 
{
    WebDriver driver;
    
    public LoadTimeSheet(WebDriver driver)
    { this.driver=driver;
    }
    
     public void load() throws InterruptedException
    {
        driver.findElement(By.id("hamburger")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addstatustag")).click();
        Thread.sleep(2000);
    }
}
