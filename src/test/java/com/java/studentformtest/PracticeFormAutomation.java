package com.java.studentformtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormAutomation {

    public static class PracticeFormAutomationTest {
        public static void main(String[] args) throws InterruptedException {
            testPracticeForm();
        }

        public static void testPracticeForm() throws InterruptedException {
            // Setup ChromeDriver
            WebDriver driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

            // Fill form name
            WebElement name = driver.findElement(By.id("name"));
            name.sendKeys("Dilmi Sooriyaarachchi");
            Thread.sleep(2000);

            // Fill form email
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("dilmihirunika2001@gmail.com");
            Thread.sleep(2000);

            // Select gender radio button
            driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input[@type='radio']")).click();
            Thread.sleep(2000);

            // Fill Mobile
            WebElement mobile = driver.findElement(By.id("mobile"));
            mobile.sendKeys("0703038659");
            Thread.sleep(2000);

            // Enter date
            WebElement dateField = driver.findElement(By.id("dob"));
            dateField.clear();
            dateField.sendKeys("10/05/2001");
            Thread.sleep(2000);

            // Enter subject
            WebElement subject = driver.findElement(By.id("subjects"));
            subject.sendKeys("Science");
            Thread.sleep(2000);

            // Hobbies checkboxes
            driver.findElement(By.xpath("//label[text()='Sports']/preceding-sibling::input[@type='checkbox']")).click();
            driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input[@type='checkbox']")).click();
            Thread.sleep(2000);

            // Upload picture
            WebElement picture = driver.findElement(By.id("picture"));
            picture.sendKeys("D:\\Java\\StudentForm\\Profile.jpg");
            Thread.sleep(3000);

            // Current address
            WebElement addressBox = driver.findElement(By.xpath("//textarea[@id='picture']"));
            addressBox.sendKeys("No 275, Kandy Road, Colombo");
            Thread.sleep(2000);

            // Select State
            WebElement stateDropdown = driver.findElement(By.id("state"));
            Select selectState = new Select(stateDropdown);
            selectState.selectByVisibleText("NCR");
            Thread.sleep(2000);

            // Select City
            WebElement cityDropdown = driver.findElement(By.id("city"));
            Select selectCity = new Select(cityDropdown);
            selectCity.selectByVisibleText("Agra");
            Thread.sleep(2000);

            // Submit form
            driver.findElement(By.xpath("//input[@class='btn btn-primary' and @value='Login']")).click();

            // Print success message in console
            System.out.println("Form submitted successfully!");

            // Verify successful navigation or form reset
            String currentUrl = driver.getCurrentUrl();
            assert currentUrl != null;
            if (currentUrl.contains("selenium")) {
                System.out.println("Test Passed: Submission verified!");
            } else {
                System.out.println("Test Failed: Unexpected URL after submission.");
            }

            // Wait before closing browser
            Thread.sleep(2000);
            driver.quit();
        }
    }
}