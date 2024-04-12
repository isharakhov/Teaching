package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

  public void waitUntilVisible(final WebDriver driver, WebElement element, Duration secondsToWait) {
    new WebDriverWait(driver, secondsToWait).until(ExpectedConditions.visibilityOf(element));
  }
}
