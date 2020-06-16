package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDataByMajorAndLoanDateTest {
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
  public void testGetDataByMajorAndLoanDate() throws Exception {
    driver.get("http://localhost:8080/login");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("susi@email.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("123456");
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.linkText("Transaction")).click();
    driver.findElement(By.xpath("//li[@id='BFB20002']/a/span")).click();
    driver.findElement(By.id("majors")).click();
    driver.findElement(By.id("majors")).clear();
    driver.findElement(By.id("majors")).sendKeys("Teknik Kimia");
    driver.findElement(By.id("loanDateFrom")).click();
    driver.findElement(By.id("loanDateFrom")).clear();
    driver.findElement(By.id("loanDateFrom")).sendKeys("21/03/2020");
    driver.findElement(By.id("loanDateTo")).click();
    driver.findElement(By.id("loanDateTo")).clear();
    driver.findElement(By.id("loanDateTo")).sendKeys("28/03/2020");
    driver.findElement(By.id("btnSearch")).click();

	String majorToBeFound = driver.findElement(By.id("majors")).getText();
	String majorFound = driver.findElement(By.xpath("//tbody[@id='tb-body-book']/tr/td[5]/p")).getText();
	
	assertThat(majorFound, containsString(majorToBeFound));

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
