package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntoToWebDriver {

    WebDriver driver;

    @BeforeTest
    public  void setUp(){
        driver = new ChromeDriver();
    }


    @Test
    public void openwebpage() throws InterruptedException{

//        driver.get("http://google.com");
//        driver.navigate().to("http://google.com");
        driver.get("https://websitesdemos-4baf7.web.app/");
        driver.navigate().refresh();  // refresh the page
        driver.manage().window().maximize(); // maximize the window
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='#about'][contains(.,'About')]")).click();



        /**
         * driver.quit(); // close the whole browser
         * driver.close(); // only the current tab
         */
    }

    @AfterTest
    public void testCleanUp(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
          driver.quit();
    }
}
