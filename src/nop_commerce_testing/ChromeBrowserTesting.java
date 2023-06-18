package nop_commerce_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) throws InterruptedException {

        //1.Setup Chrome browser
        String baseUrl = "https://demo.nopcommerce.com/";
        WebDriver driver = new ChromeDriver();

        //2.Open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " +title);

        //4.Print the current url
        System.out.println("Current Url is: " + driver.getCurrentUrl() );

        //5.Print the page source
        System.out.println("Page source is: " +driver.getPageSource());

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Poonam123@gmail.com");

        //7.Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("Poonam123");

        Thread.sleep(2000);

        //8.Close the browser
        driver.close();
    }
}
