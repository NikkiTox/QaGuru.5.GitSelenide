package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class selenideSearch {

        String softAssertion = "SoftAssertions";
        String jUnit5 = "Using JUnit5 extend test class";

    @Test
    void shouldHaveSelenideInGithub(){
        //открыть страницу репозитория Selenide
        open("https://github.com/selenide/selenide");
        //перейти на вкладку Wiki
        $("#wiki-tab").click();
        //найти ссылку Soft Assertions
        $("#wiki-pages-filter").setValue(softAssertion);
        //открыть ссылку Soft Assertions
        $("#wiki-pages-box").$(withText(softAssertion)).click();
        //найти пример с JUnit5
        $(".markdown-body").shouldHave(Condition.text(jUnit5));

    }
}
