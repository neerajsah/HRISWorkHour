/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 *
 * @author neerajsah
 */
public class LoginHris
{
    WebDriver driver;
    
    public LoginHris(WebDriver driver)
    { this.driver=driver;
    }
    

    @Test
    public void login() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@id=\"demo-2\"]/div/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.id("txtUserName")).sendKeys("neerajsah");
        driver.findElement(By.id("txtPassword")).sendKeys("Neeraj@321#");
        driver.findElement(By.name("Submit")).click();
        
        Thread.sleep(2000);
    }
}
