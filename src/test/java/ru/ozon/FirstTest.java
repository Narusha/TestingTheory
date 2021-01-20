package ru.ozon;
import io.qameta.allure.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FirstTest {
    public static ChromeDriver driver;

    @Test()
    public void Step1() {
        try {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver.get("https://www.ozon.ru");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(3000);
            driver.getKeyboard().pressKey(Keys.ESCAPE);
            Thread.sleep(3000);
            Allure.addAttachment("Main", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }

    @Test()
    public void Step2() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/header/div[1]/div[2]/div/div[1]/button")).click();
            Thread.sleep(3000);
            Allure.addAttachment("Catalog", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }


    @Test()
    public void Step3() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/header/div[1]/div[2]/div/div[2]/div/div[1]/div/a[6]")).click();
            Thread.sleep(3000);
            Allure.addAttachment("Appliances", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }


    @Test()
    public void Step4() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[4]/div/div[1]/aside/div[2]/a")).click();
            Thread.sleep(3000);
            Allure.addAttachment("Kitchen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }

    }


    @Test()
    public void Step5() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[1]/aside/section/main/div[2]/div[2]/div[1]/div/a")).click();
            Thread.sleep(3000);
            Allure.addAttachment("coffee", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }

    @Test()
    public void Step6() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[1]/input")).click();
            driver.getKeyboard().sendKeys(Keys.chord(Keys.CONTROL, "a"));
            driver.getKeyboard().sendKeys(Keys.DELETE);
            Thread.sleep(3000);
            driver.getKeyboard().sendKeys("10000");
            Thread.sleep(3000);
            driver.getKeyboard().pressKey(Keys.ENTER);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[2]/input")).click();
            Thread.sleep(3000);
            driver.getKeyboard().sendKeys(Keys.chord(Keys.CONTROL, "a"));
            driver.getKeyboard().sendKeys(Keys.DELETE);
            driver.getKeyboard().sendKeys("11000");
            Thread.sleep(3000);
            driver.getKeyboard().pressKey(Keys.ENTER);
            Thread.sleep(3000);
            Allure.addAttachment("price", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            Thread.sleep(3000);
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }

    }


    @Test()
    public void Step7() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]")).click();
            Thread.sleep(3000);
            driver.getKeyboard().sendKeys(Keys.DOWN, Keys.DOWN);
            Thread.sleep(3000);
            driver.getKeyboard().pressKey(Keys.ENTER);
            Thread.sleep(3000);
            Allure.addAttachment("sort", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            Thread.sleep(3000);
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }


    @Test()
    public void Step8() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/div/div/div[3]/div[2]/div/div[1]/div/button")).click();
            Thread.sleep(3000);
            Allure.addAttachment("clickplus", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
        }
    }


    @Test()
    public void Step9() {
        try {
            driver.findElement(By.xpath("//*[@id=\"__ozon\"]/div/div[1]/header/div[1]/div[4]/a[2]")).click();
            Thread.sleep(3000);
            Allure.addAttachment("basket", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            String price1 = driver.findElement(By.xpath("//*[@id=\"split-Main-0\"]/div[3]/div[3]/div[1]/div/span")).getText();
            driver.findElement(By.xpath("//*[@id=\"split-Main-0\"]/div[3]/div[4]/div/div[1]/div/div[1]/div/div/input")).click();
            driver.getKeyboard().sendKeys(Keys.DOWN, Keys.DOWN);
            driver.getKeyboard().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            Allure.addAttachment("result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            String price2 = driver.findElement(By.xpath("//*[@id=\"split-Main-0\"]/div[3]/div[3]/div[1]/div/span")).getText();
            price1 = price1.substring(0, price1.length() - 1);
            price1 = price1.replace(" ", "");
            price2 = price2.substring(0, price2.length() - 1);
            price2 = price2.replace(" ", "");
            if (Integer.parseInt(price1)*3 != Integer.parseInt(price2)) {
                fail("Тест не пройден");
            }
            driver.quit();
        } catch (Exception ex) {
            fail("Error: " + ex.getMessage());
            driver.quit();
        }
    }
}