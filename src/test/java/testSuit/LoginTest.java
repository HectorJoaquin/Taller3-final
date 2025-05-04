package testSuit;

import io.qameta.allure.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import session.Session;

public class LoginTest {

    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    MenuSection menuSection = new MenuSection();


    @BeforeEach
    public void openBrowser(){
        Session.getSession().getBrowser().get("https://www.todoist.com/es");
    }


    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSesion();
    }


    @Test
    @Order(1)
    @Owner("JBGroup")
    @Epic("Login")
    @Feature("Authentication")
    @Story("Login")
    @DisplayName("Verify login is successful")
    @io.qameta.allure.Description("This test case is to verify that the user can login successfully")
    @Link(name="test case manual", url="jira/123123")
    @Issue("DEF12312313")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTestSuccessfully(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("hectorjoaquinramongomez@gmail.com");
        loginSection.passwordTextBox.setText("tL!9Pz#7qB@3uVx2");
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.labelText.isControlDisplayed(),"Hoy");
    }



}
