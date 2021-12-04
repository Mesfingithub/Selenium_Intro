
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StaticHomePageTest {

    WebDriver driver;


    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }


    // 1.Open the browser and website
    // 2. Meta Data form website (URL, Head)
    // 3. Navigate method
    // 4. Normal element html-event
    // 5. Close browser


    /**
     * Test Case: 1 = Open the Website and verify the Home page contents
     * Step: 1 = Open Browser and enter website name
     * Step: 2 = verify the website url and title name
     * Step: 3 = Verify the html body with id as a name;
     */

    @Test
    public void openWebpage() throws InterruptedException {
        driver.get("https://websitesdemos-4baf7.web.app/");
//        driver.navigate().to("http://google.com");
        driver.navigate().refresh();//refresh the page
        Thread.sleep(2000);
        //driver.close // close the current page/tab
        //driver.quit();
    }



    @Test
    public void validateTitleAndURL(){
        // System.out.println(driver.getTitle() + " " +  driver.getCurrentUrl());
        assertEquals(driver.getTitle(),"Welcome to EdgeLedger");
        assertEquals(driver.getCurrentUrl(), "https://websitesdemos-4baf7.web.app/");
        String id = driver.findElement(By.xpath("//body[@id='home']")).getTagName();
//        assertEquals(id, "                            //body[@id='home']");
        System.out.println(id);

        assertEquals(id, "body");

    }

    /**
     * Test Case 2: Verify the landing page with image and button
     * Step 1 = locate an image and verify the image locator
     * Step 2 = Verify the home page welcome text
     * Step 3 = verify the button and upon click Read More Section
     *
     */

    @Test
    public void validateLandingPage(){
//        boolean logo = driver.findElement(By.xpath("//i[@class='fas fa-book-open']")).isDisplayed();
////        System.out.println(logo);
//        assertEquals(logo, true);

        String actualText = driver.findElement(By.xpath("//h1[@class='logo']")).getText();
        System.out.println(actualText);
        //assertEquals(actualText, "EdgeLedger");

    }




    @Test
    public void validateHomeLink(){
        driver.findElement(By.xpath("//a[@href='#home']")).isDisplayed();

    }

    @AfterTest
    public void testCleanUp(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
       // driver.quit();
    }
}