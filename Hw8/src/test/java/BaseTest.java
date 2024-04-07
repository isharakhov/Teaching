import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Waiter;

public abstract class BaseTest {
  protected WebDriver driver;
  protected Logger logger;
  protected Waiter waiter;

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/i.sharakhov/IdeaProjects/Teaching/Hw8/googlechrome");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    logger = LogManager.getLogger(this.getClass().getName());
    waiter = new Waiter();
  }

  @AfterClass
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
