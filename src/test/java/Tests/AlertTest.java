package Tests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void TestAutomat(){

        WebElement skipSignInElement= driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        WebElement switchtoelement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoelement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        //driver.get merge si asteapata;
        //driver.navigate nu asteapta;

        List<WebElement> alertOptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertOptions.get(0).click();
        WebElement alertOK= driver.findElement(By.cssSelector("#OKTab>button"));
        alertOK.click();

        Alert OK= driver.switchTo().alert();
        OK.accept();

        alertOptions.get(1).click();
        WebElement alertOkCancel= driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOkCancel.click();
        Alert OKCancel= driver.switchTo().alert();
        OKCancel.dismiss();

        alertOptions.get(2).click();
        WebElement alertTextbox= driver.findElement(By.cssSelector("#Textbox>button"));
        alertTextbox.click();
        Alert Textbox= driver.switchTo().alert();
        Textbox.sendKeys("Good job");
        Textbox.accept();









    }



}
