package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver=null;

    public static void initialize(){
        if(driver==null){
            System.setProperty  (  "WebDriver.chrome driver" ,  "C:\\Users\\georg\\Downloads\\chromedriver_win32\\ chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage() .window().maximize();

        }
    }



}
