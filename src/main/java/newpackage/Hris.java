package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author neerajsah
 */
public class Hris {
    WebDriver driver;
    LoginHris login;
    LoadTimeSheet load;
    GetData data;
    int count=0,hh=0,mm=0;

  
    @BeforeClass
    public void launchBrowser() throws Exception 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\neerajsah\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://hris.qainfotech.com/login.php");
    }
    
    @Test
    public void login() throws InterruptedException
    {

        
          login=new LoginHris(driver);
          login.login();
        
          load=new LoadTimeSheet(driver);
          load.load();
        
          data=new GetData(driver);
          String toolTipText = data.data();
        
       

         CalcTime calc=new CalcTime(driver,toolTipText);
         calc.calcTime();
       
        
    }   

    @AfterClass
    public void closeBrowser() throws Exception 
    {
        Thread.sleep(2000);
        driver.quit();
    }

   
}
