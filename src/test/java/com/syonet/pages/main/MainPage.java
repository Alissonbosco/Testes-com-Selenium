package com.syonet.pages.main;

import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.login.Login;
import com.syonet.pages.login.LoginPage;

public class MainPage implements Main {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Login goToLogin() {
        this.driver.get( "http://the-internet.herokuapp.com/login" );
        return new LoginPage();
    }

    

}
