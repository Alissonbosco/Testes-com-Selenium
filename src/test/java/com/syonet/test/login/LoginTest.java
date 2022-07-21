package com.syonet.test.login;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.login.Login;
import com.syonet.pages.main.MainPage;
import com.syonet.test.utils.Screenshot;
import com.syonet.pages.login.loginSucess.LoginSucessPage;

@DisplayName("Teste login")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder( OrderAnnotation.class )
public class LoginTest implements Screenshot {

    private static final String USERNAME = "tomsmith";
	private static final String PASSWORD = "SuperSecretPassword!";
	private Login loginPage;
    private LoginSucessPage loginSucessPage = new LoginSucessPage();

    @DisplayName("Pagina de login")
    @BeforeEach
    void goLoginPage() {
       this.loginPage= new MainPage().goToLogin();
    }

    @DisplayName("Testando login Com Usuario Errado")
    @Test
	void loginFakeUserTest() {
		loginPage.fillUsername( "joão pé de feijão" )
				.fillPassword( PASSWORD )
				.clickLoginButton();
		assertNotNull( loginPage.errorNotification() );
	}

    @DisplayName("Testando login Com Senha Errado")
    @Test
	void loginFakePasswordTest() {
		loginPage.fillUsername( USERNAME )
				.fillPassword( "sabe muito" )
				.clickLoginButton();
		assertNotNull( loginPage.errorNotification() );
	}

    @DisplayName("Testando login")
    @Test
    void loginTest(){
        loginPage
        .fillUsername(USERNAME)
        .fillPassword(PASSWORD)
        .clickLoginButton();
        assertNotNull(loginSucessPage.sucessNotification(), "Login realizado com sucesso!" );
    }

    @DisplayName( "Testando log off" )
	@Test
	void logoffTest() {
        loginPage
        .fillUsername(USERNAME)
        .fillPassword(PASSWORD)
        .clickLoginButton();
		loginSucessPage
        .clickLogOut();
        Boolean formVisible = this.loginPage.formIsVisible();
		assertTrue(formVisible);
	}

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
}
