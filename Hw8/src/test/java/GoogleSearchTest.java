import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class GoogleSearchTest extends BaseTest {

  private GoogleHomePage googleHomePage;
  private static final String BASE_URL = "www.google.com";

  @BeforeMethod
  public void setUp() {
    googleHomePage = new GoogleHomePage(driver);
  }

  @Test
  public void testGoogleSearch() {
    googleHomePage.goTo(BASE_URL);
    googleHomePage.search("HeadHunter");
    assertTrue(driver.getTitle().contains("HeadHunter"));
  }

  @Test
  public void testGoogleMapsSearch() {
    googleHomePage.goTo(BASE_URL + "/maps");
    assertEquals(driver.getTitle(), "Google Maps");
  }

  @Test
  public void testGoogleTranslate() {
    googleHomePage.goTo("https://translate.google.com");
    assertEquals(driver.getTitle(), "Google Переводчик");
  }
}
