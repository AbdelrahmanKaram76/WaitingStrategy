package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Register {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.advix.ai/");
        RegisterHappy r1 = new RegisterHappy(driver);
        r1.setFirstName("testAtSahl");
        r1.setEmail("testAtSahl@gmail.com");
        r1.setPassword("Password");
        r1.openMenu();
        r1.openRegisterForm();
        r1.fillData(r1.getFirstName() , r1.getEmail() , r1.getPassword());
    }

}
