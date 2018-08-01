import newpackage.CalcTime;
import newpackage.GetData;
import newpackage.LoadTimeSheet;
import newpackage.LoginHris;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author neerajsah
 */
public class HrisTest 
{

    WebDriver driver;
    LoginHris login;
    LoadTimeSheet load;
    GetData data;
    
    
    @BeforeClass
    public void launchBrowser() throws Exception 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\neerajsah\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://hris.qainfotech.com/login.php");
       
    }
    
    @Test
    public void login() throws InterruptedException
    {

        
          login=new LoginHris(driver);
          login.login();
        
//          load=new LoadTimeSheet(driver);
//          load.load();
        
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
