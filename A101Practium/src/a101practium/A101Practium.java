/*
 * click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a101practium;

/**
 *
 * @author Lenovo
 */
import java.util.Random;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class A101Practium {

    /**
     * @param args the command line arguments
     */
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String url ="https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/";
        //chromedriver path değişebilir.
        System.setProperty("webdriver.chrome.driver","D:\\SİNEM\\A101Practium\\src\\chromedriverfolder\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get(url);
        
        Thread.sleep(2000);
        var filter = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        if (filter!=null) {
            filter.click();
        }
            
            
        Thread.sleep(1000);
        var blackfilter = driver.findElement(By.id("attributes_integration_colourSİYAH"));
           if (blackfilter!=null) {
            blackfilter.click();
        }
         Thread.sleep(2000);
        var product = driver.findElement(By.xpath("//a[@class='name-price']"));
           if (product!=null) {
            product.click();
        }
          Thread.sleep(2000);
        var basket = driver.findElement(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
           if (basket!=null) {
            basket.click();
        } 
           
           Thread.sleep(1000);
        var basketapprove = driver.findElement(By.xpath("//a[@class='button green block']"));
           if (basketapprove!=null) {
            basketapprove.click();
        } 
              var loginwithout = driver.findElement(By.xpath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']"));
            loginwithout.click();
            Thread.sleep(2000);

            var emailText = driver.findElement(By.name("user_email"));
            emailText.sendKeys("deneme*@gmail.com");

            var buttonContiune = driver.findElement(By.xpath("//button[@class='button block green']"));
            buttonContiune.click();
            Thread.sleep(2000);

            var newAddress = driver.findElement(By.xpath("//a[@class='new-address js-new-address']"));
            newAddress.click();
            Thread.sleep(1000);

            var title = driver.findElement(By.name("title"));
            var first_name= driver.findElement(By.name("first_name"));
            var last_name = driver.findElement(By.name("last_name"));
            var phone_number = driver.findElement(By.name("phone_number"));
            var city = driver.findElement(By.name("city"));
            var township = driver.findElement(By.name("township"));

            var district = driver.findElement(By.name("district"));
            var line = driver.findElement(By.name("line"));
            var postcode = driver.findElement(By.name("postcode"));

            if (title!=null)
            {
                title.sendKeys("Ev Adresim");
            }

            if (first_name != null)
            {
                first_name.sendKeys("Sinem");
            }

            if (last_name != null)
            {
                last_name.sendKeys("Erdoğan");
            }

            if (phone_number != null)
            {
                phone_number.sendKeys("5554696699");
            }


            if (city != null)
            {
                Select selectcity = new Select(city);
                selectcity.selectByVisibleText("KONYA");
            } 

            Thread.sleep(500);

            if (township != null)
            {
                Select selecttownship = new Select(township);
                selecttownship.selectByVisibleText("MERAM");
            }
  
            Thread.sleep(500);

            if (district != null)
            {
                
                Select selectdistrict = new Select(district);
                selectdistrict.selectByValue("48256");
            }
      
            Thread.sleep(500);

           
            if (line!=null)
            {
                Random rnd = new Random();
                int sayi = rnd.nextInt(1, 100);
                line.sendKeys("Deneme Adress" + sayi);
            }

            if (postcode != null)
            {
                postcode.sendKeys("48256");
            }
            
            Thread.sleep(500);

            var save = driver.findElement(By.xpath("//button[@class='button green js-set-country js-prevent-emoji']"));
            if (save!=null)
            {
                save.click();
            }
          

            Thread.sleep(2000);

            var cargo = driver.findElement(By.xpath("//input[@class='js-shipping-radio']"));
            if (cargo != null)
            {
                cargo.sendKeys(Keys.SPACE);
            }
           

            Thread.sleep(2000);
            var saveAndDone = driver.findElement(By.xpath("//button[@class='button block green js-proceed-button']"));
            if (saveAndDone != null)
            {
                saveAndDone.click();
            }
        System.out.println("Page title is "+driver.getTitle());
        
        //driver.quit();
        
    }
    
}
