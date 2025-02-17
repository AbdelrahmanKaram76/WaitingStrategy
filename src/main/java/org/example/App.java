package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

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
        ImplicitWaitingStrategy(driver);
        ExplicitWaitingStrategy(driver);

    }
    public static void ImplicitWaitingStrategy(WebDriver driver){
        WebElement addBox = driver.findElement(By.id("adder"));
        addBox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try{
            WebElement box0 = driver.findElement(By.id("box0"));
            if (box0.isDisplayed()){
                System.out.println("Success");
            }
        }catch (NoSuchElementException e){
            System.out.println("Element can't catched ");
        }
    }
    public static void ExplicitWaitingStrategy(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textBox = driver.findElement(By.id("reveal"));
        textBox.click();
        WebElement revealedBox = driver.findElement(By.id("revealed"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
        if(revealedBox.isDisplayed()){
            revealedBox.sendKeys("Hello");
            System.out.println("Success");
        }
        else {
            System.out.println("Failed");
        }

    }
}
