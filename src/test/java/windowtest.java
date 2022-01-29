import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class windowtest extends ShareData {

    @Test
    public void windowtest(){


        WebElement skipSignInElement= driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        WebElement switchtoelement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoelement).perform();

        WebElement WindowsElement = driver.findElement(By.xpath("//a[text()='Windows']"));
       WindowsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");


        List<WebElement> WindowOptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        WindowOptions.get(0).click();
        WebElement newTabOK= driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newTabOK.click();

        System.out.println("Titlul paginii"+ driver.getTitle());
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Titlul paginii"+ driver.getTitle());

        List<WebElement> WindowsOptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        WindowsOptions.get(2).click();
        WebElement newWindow= driver.findElement(By.cssSelector("#Seperate>button"));
        newWindow.click();

        System.out.println("Titlul paginii"+ driver.getTitle());
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        System.out.println("Titlul ferestrei 2"+ driver.getTitle());




        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii"+ driver.getTitle());





    }


}
