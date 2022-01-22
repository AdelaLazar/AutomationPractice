package Tests2;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ResisterTest {

    public WebDriver driver;

    @Test

    public void register(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");


        driver.manage().window().maximize();


        WebElement signiniElement= driver.findElement(By.id("section"));
        signiniElement.click();

        WebElement Firstnamelement= driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String Firstnamelvalue= "Adela";
        Firstnamelement.sendKeys(Firstnamelvalue);

        WebElement Lastnamelement= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String Lastnamelvalue= "Lazar";
        Lastnamelement.sendKeys(Lastnamelvalue);

        WebElement Emailaddresselement= driver.findElement(By.cssSelector("input[type='email'"));
        String Emailadressvalue="lazaradela_2007@yahoo.com";
        Emailaddresselement.sendKeys(Emailadressvalue);

        WebElement phoneelement= driver.findElement(By.cssSelector("input[type='tel'"));
        String phonevalue="0740733214";
        phoneelement.sendKeys(phonevalue);


        WebElement skills = driver.findElement(By.id("Skills"));
        Select skill = new Select(skills);
        skill.selectByValue ("Java");

        WebElement Countryelement= driver.findElement(By.cssSelector("input[type='text'"));
        String Countryvalue="Romania";
        Countryelement.sendKeys(Countryvalue);


        WebElement years= driver.findElement(By.id("yearbox"));
        Select year= new Select(years);
        year.selectByValue("1991");


        WebElement days= driver.findElement(By.id("daybox"));
        Select day= new Select(days);
        day.selectByValue("6");


        WebElement languageElement= driver.findElement(By.id("msdd"));
        languageElement.click();
        List<WebElement> LanguageOptions= driver.findElements(By.cssSelector("ul.ui-autocomplete.ui-front>li>a"));
        for (int index = 0;index < LanguageOptions.size();index ++){
            if(LanguageOptions.get(index).getText().equals("English") || (LanguageOptions.get(index).getText().equals("Arabic"))){
                LanguageOptions.get(index).click();
            }
        }

        phoneelement.click();

        WebElement CountryElement= driver.findElement(By.cssSelector("span[role='combobox']"));
        CountryElement.click();
        WebElement CountryInputElement= driver.findElement(By.className("select2-search__field"));
        CountryInputElement.sendKeys("Australia");
        CountryInputElement.sendKeys(Keys.ENTER);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");


        driver.findElement(By.id("firstpassword")).sendKeys("Adelutza188@");

        driver.findElement(By.id("secondpassword")).sendKeys("Adelutza188@");


        WebElement uploadFileElement= driver.findElement(By.id("imagesrc"));
        uploadFileElement.sendKeys("C:\\Users\\HP\\Desktop\\Sa50\\Eu\\20200310_012147.jpg");





















    }
}
