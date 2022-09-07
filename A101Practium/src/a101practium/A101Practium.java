/*
 * click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a101practium;

/**
 *
 * @author Lenovo
 */
import java.util.Date;
import java.util.Random;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class A101Practium {

    /**
     * @param args the command line arguments
     */
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.a101.com.tr";
        System.setProperty("webdriver.chrome.driver", "D:\\Sinem\\A101Practium\\src\\chromedriverfolder\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(new Date() + "- Anasayfa acildi.");

        var filter = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        if (filter != null) {
            filter.click();
        }
        System.out.println(new Date() + "- Cerez kullanimi kabul edildi.");

        Actions action = new Actions(driver);
        var menu = driver.findElement(By.xpath("//a[@href='/giyim-aksesuar/']"));
        action.moveToElement(menu).build().perform();
        Thread.sleep(1000);
        System.out.println(new Date() + "- Giyim aksesuar menusu acildi.");

        var searchResult = driver.findElement(By.xpath("//a[@href='/giyim-aksesuar/dizalti-corap/']"));
        if (searchResult != null) {
            searchResult.click();
        }
        Thread.sleep(2000);

        System.out.println(new Date() + "- Dizalti corap menusune girildi.");
        var blackfilter = driver.findElement(By.id("attributes_integration_colourSİYAH"));
        if (blackfilter != null) {
            blackfilter.click();
        }
        Thread.sleep(2000);
        System.out.println(new Date() + "- Urunlerden siyah olanlar filtrelendi.");

        var product = driver.findElement(By.xpath("//a[@class='name-price']"));
        if (product != null) {
            product.click();
        }
        Thread.sleep(2000);
        System.out.println(new Date() + "- Urun secildi.");

        var basket = driver.findElement(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
        if (basket != null) {
            basket.click();
        }
        Thread.sleep(2000);
        System.out.println(new Date() + "- Urun sepete eklendi.");
        var basketgo = driver.findElement(By.xpath("//a[@class='go-to-shop']"));
        if (basketgo != null) {
            basketgo.click();
        }
        Thread.sleep(2000);
        System.out.println(new Date() + "- Sepet sayfasina gidildi.");
        var basketapprove = driver.findElement(By.xpath("//a[@class='button green checkout-button block js-checkout-button']"));
        if (basketapprove != null) {
            basketapprove.click();
        }
        Thread.sleep(2000);
        System.out.println(new Date() + "- Siparis tamamla aksiyonuna tiklandi.");
        var loginwithout = driver.findElement(By.xpath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']"));
        loginwithout.click();
        Thread.sleep(2000);
        System.out.println(new Date() + "- uyeliksiz devam et aksiyonuna tiklandi.");
        var emailText = driver.findElement(By.name("user_email"));
        emailText.sendKeys("deneme*@gmail.com");

        var buttonContiune = driver.findElement(By.xpath("//button[@class='button block green']"));
        buttonContiune.click();
        Thread.sleep(2000);
        System.out.println(new Date() + "- email girilip butona tiklandi.");
        var newAddress = driver.findElement(By.xpath("//a[@class='new-address js-new-address']"));
        newAddress.click();
        Thread.sleep(1000);
        System.out.println(new Date() + "- yeni adres olustur butonuna tiklandi.");
        var title = driver.findElement(By.name("title"));
        var first_name = driver.findElement(By.name("first_name"));
        var last_name = driver.findElement(By.name("last_name"));
        var phone_number = driver.findElement(By.name("phone_number"));
        var city = driver.findElement(By.name("city"));
        var township = driver.findElement(By.name("township"));

        var district = driver.findElement(By.name("district"));
        var line = driver.findElement(By.name("line"));
        var postcode = driver.findElement(By.name("postcode"));

        if (title != null) {
            title.sendKeys("Ev Adresim");
        }

        if (first_name != null) {
            first_name.sendKeys("Sinem");
        }

        if (last_name != null) {
            last_name.sendKeys("Erdoğan");
        }

        if (phone_number != null) {
            phone_number.sendKeys("5554696699");
        }

        if (city != null) {
            Select selectcity = new Select(city);
            selectcity.selectByVisibleText("KONYA");
        }

        Thread.sleep(1000);

        if (township != null) {
            Select selecttownship = new Select(township);
            selecttownship.selectByVisibleText("MERAM");
        }

        Thread.sleep(1000);

        if (district != null) {

            Select selectdistrict = new Select(district);
            selectdistrict.selectByValue("48256");
        }

        Thread.sleep(1000);

        if (line != null) {
            Random rnd = new Random();
            int sayi = rnd.nextInt(100, 1000);
            line.sendKeys("Deneme Adress" + sayi);
        }

        if (postcode != null) {
            postcode.sendKeys("48256");
        }

        Thread.sleep(1000);
        System.out.println(new Date() + "- yeni adres bilgileri dolduruldu.");
        var save = driver.findElement(By.xpath("//button[@class='button green js-set-country js-prevent-emoji']"));
        if (save != null) {
            save.click();
        }

        Thread.sleep(2000);
        System.out.println(new Date() + "- adres kaydedildi.");
        var cargo = driver.findElement(By.xpath("//input[@class='js-shipping-radio']"));
        if (cargo != null) {
            cargo.sendKeys(Keys.SPACE);
        }

        Thread.sleep(2000);
        System.out.println(new Date() + "- kargo secimi yapildi.");
        var saveAndDone = driver.findElement(By.xpath("//button[@class='button block green js-proceed-button']"));
        if (saveAndDone != null) {
            saveAndDone.click();
        }
        System.out.println(new Date() + "- kaydet ve devam et aksiyonuna tiklandi.");
        System.out.println(new Date() + "- TEST BITTI");

        driver.quit();
    }

}
