package org.example;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RegisterHappy {
    private String firstName ;
    private String email ;
    private String password ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static WebDriver driver;
    public RegisterHappy(WebDriver driver){
        this.driver = driver;
    }
    public static void openMenu(){
        WebElement profileBtn = driver.findElement(By.xpath("//button[@id='radix-:rc:']"));
        profileBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void openRegisterForm(){
        WebElement createAccBtn = driver.findElement(By.xpath("//*[@id=\"radix-:rd:\"]/div[3]/h5"));
        createAccBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void fillData(String firstName1 , String email1 , String password1){
        WebElement firstName = driver.findElement(By.id("name"));
        firstName.sendKeys(firstName1);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(email1);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(password1);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[5]/div/div/form/button"));
        submitBtn.click();
    }
}
