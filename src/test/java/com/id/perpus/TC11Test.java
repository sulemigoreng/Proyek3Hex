package com.id.perpus;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

<<<<<<< HEAD:src/test/java/com/id/perpus/TC11Test.java
public class TC11Test {
=======
public class Script11Test {
>>>>>>> origin/Hamzah:src/test/java/com/id/perpus/Script11Test.java
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScript11() throws Exception {
    driver.get("http://localhost:8080/kembali");
    String Expected = driver.findElement(By.xpath("//tbody[@id='tb-body-book']/tr/td[2]")).getText();
    driver.findElement(By.xpath("//tbody[@id='tb-body-book']/tr/td[9]/a/i")).click();
    driver.findElement(By.id("btnSubmit")).click();
    String Result = driver.findElement(By.xpath("//tbody[@id='tb-body-book']/tr/td[2]")).getText();
	assertEquals(Expected, Result);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
