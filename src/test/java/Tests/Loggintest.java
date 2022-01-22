package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loggintest {

  // Declaram variabila webdriver.


  public WebDriver driver;

  @Test
    public void login(){
      //Setam driverul de chrome
      System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
      //Deschidem o instanta de chrome.
      driver=new ChromeDriver();
      //Accesam un url
      driver.get("http://demo.automationtesting.in/Index.html");
      //Facem driverul in modul maximmise
    driver.manage().window().maximize();

    WebElement signiniElement= driver.findElement(By.id("btn1"));
    signiniElement.click();

    WebElement emailelement= driver.findElement(By.cssSelector("input[placeholder='E mail']"));
    String emailvalue= "lazaradela_2007@yahoo.com";
    emailelement.sendKeys(emailvalue);

    WebElement passwordelement= driver.findElement(By.cssSelector("input[placeholder='Password']"));
    String passwordvalue="33A11";
    passwordelement.sendKeys(passwordvalue);

    WebElement enterelement= driver.findElement(By.id("enterbtn"));
    enterelement.click();

    WebElement errormsgelement=driver.findElement(By.id("errormsg"));
    errormsgelement.click();

    String expectedmessage="Invalid User Name or PassWord";
    String actualmsg=errormsgelement.getText();
    Assert.assertEquals("textul cautat nu este corect",expectedmessage,actualmsg);

    //quit= inchide instanta cu toate taburile deschise
    //close = inchide tabul curent

    driver.close();




  }

}
