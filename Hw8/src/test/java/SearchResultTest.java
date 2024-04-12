import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.SearchResultsPage;

public class SearchResultTest extends BaseTest {

  private GoogleHomePage googleHomePage;
  private SearchResultsPage searchResultsPage;

  @BeforeClass
  public void setUp() {
    googleHomePage = new GoogleHomePage(driver);
    searchResultsPage = new SearchResultsPage(driver);
  }

  @Test
  public void testSearch() {
    googleHomePage.goTo("www.google.com");
    googleHomePage.search("HeadHunter");
    assertEquals(searchResultsPage.getFirstResultTitle(), "HeadHunter");
  }
}
