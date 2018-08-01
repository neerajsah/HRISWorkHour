/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author neerajsah
 */
public class GetData 
{
   WebDriver driver;
   
   public GetData(WebDriver driver)
   {
      this.driver=driver;
   }
   
   public String data()
   {
        WebElement element=driver.findElement(By.xpath("//*[@id=\"dv_2018-08-01\"]/div/div[1]/div"));
        Actions toolAct = new Actions(driver);
        toolAct.moveToElement(element).perform();
        WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"dv_2018-08-01\"]/div/div[2]/ul/li[2]/div[2]/div/span[2]/b"));
        String toolTipText = toolTipElement.getText();
        System.out.println(toolTipText);
        
        return toolTipText;
   }
}
