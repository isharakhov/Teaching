package pages;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waiter;

public class SearchResultsPage {

  private final WebDriver driver;
  private final Waiter waiter = new Waiter();
  private final Logger logger = LogManager.getLogger(SearchResultsPage.class);
  private static final By FIRST_TITLE = By.xpath("//div[@class='r']/a/h3");

  public SearchResultsPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getFirstResultTitle() {
    logger.info("Получаем текст из 1 результата поиска");
    waiter.waitUntilVisible(driver, (WebElement) FIRST_TITLE, Duration.ofSeconds(2));
    return driver.findElement(FIRST_TITLE).getText();
  }
}
