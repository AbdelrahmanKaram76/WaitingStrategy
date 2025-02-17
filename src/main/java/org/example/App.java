package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        WebElement addBox = driver.findElement(By.id("adder"));
        addBox.click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        try{
            WebElement box0 = driver.findElement(By.id("box0"));
            if (box0.isDisplayed()){
                System.out.println("Success");
            }
        }catch (NoSuchElementException e){
            System.out.println("Element can't catched ");
        }
        finally {
            driver.quit();
        }


    }
}
