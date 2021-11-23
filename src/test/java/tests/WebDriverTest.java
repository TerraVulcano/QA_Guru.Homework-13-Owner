package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebDriverTest extends TestBase {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
   private final static int ISSUE_NUMBER = 65;
    private final String BASE_URL = "https://github.com";

    @Test
    public void testIssueSearch() {

        open(BASE_URL);
        $(".header-search-input").setValue(REPOSITORY).submit();
        $(By.linkText(REPOSITORY)).click();
        $("#issues-tab").click();
        $(withText("#" + ISSUE_NUMBER)).shouldBe(Condition.visible);
    }
}
