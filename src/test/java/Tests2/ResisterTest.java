package Tests2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

        driver.findElement(By.id("firstpassword")).sendKeys("Adelutza188@");

        driver.findElement(By.id("secondpassword")).sendKeys("Adelutza188@");

        driver.close();



















    }
}
