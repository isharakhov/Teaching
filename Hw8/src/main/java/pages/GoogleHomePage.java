package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
  private final WebDriver driver;
  private final Logger logger = LogManager.getLogger(GoogleHomePage.class);
  private static final By SEARCH_INPUT = By.name("q");
  private static final By SEARCH_BUTTON = By.name("btnK");

  public GoogleHomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void search(String keyword) {
    logger.info("В поисковую строку вводим слов: " + keyword + " и нажимаем кнопку поиска");
    driver.findElement(SEARCH_INPUT).sendKeys(keyword);
    driver.findElement(SEARCH_BUTTON).click();
  }

  public void goTo(String url) {
    logger.info("Переходим на - %s".formatted(url));
    driver.get(url);
  }
}
