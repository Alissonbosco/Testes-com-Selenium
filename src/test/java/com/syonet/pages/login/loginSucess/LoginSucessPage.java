package com.syonet.pages.login.loginSucess;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.login.Login;
import com.syonet.pages.login.LoginPage;


public class LoginSucessPage implements LoginSucess {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Login clickLogOut(){
        this.driver.findElement( LoginSucessElements.buttonLogOut ).click();
        return new LoginPage();
    }

    @Override
    public LoginSucess sucessNotification(){
        try {
            this.driver.findElement(LoginSucessElements.sucessNotification).getText();
            return this;
        } catch (NoSuchElementException e){
            return null;

        }
    }
    
}
