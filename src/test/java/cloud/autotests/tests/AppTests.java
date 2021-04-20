package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Yandex Test")
    void test() {

        step("Open main page", () -> {
            // todo
        });

        step("Search for selenide", () -> {
            // todo
        });

        step("Check is Selenide in search results", () -> {
            // todo
        });

    }
}