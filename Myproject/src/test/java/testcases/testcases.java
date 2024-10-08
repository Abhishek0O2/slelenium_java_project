package testcases;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testcases {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zoho.com");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[4]/a[1]")).click();
        // explicit wait - to wait for the compose button to be click-able
//        WebDriverWait wait = new WebDriverWait(driver,);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[3]/div[4]/form[1]/div[3]/div[1]/div/span/input")));
// click on the compose button as soon as the "compose" button is visible
        //   driver.findElement(By.xpath("//*[@id=\"login_id\"]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div[4]/form[1]/div[3]/div[1]/div/span/input")).sendKeys("maxoutabhi731@gmail.com");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Automation@123");
        driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
    }
}
