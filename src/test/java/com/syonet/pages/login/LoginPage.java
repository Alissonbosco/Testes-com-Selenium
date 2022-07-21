package com.syonet.pages.login;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.login.loginSucess.LoginSucessPage;

public class LoginPage implements Login {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Login fillUsername( String username ) {
        this.driver.findElement( LoginElements.inputUsername ).sendKeys( username );
        return this;
    }

    @Override
    public Login fillPassword( String userpassword ) {
        this.driver.findElement( LoginElements.inputPassword ).sendKeys( userpassword );
        return this;
    }

    @Override
    public LoginSucessPage clickLoginButton() {
        this.driver.findElement( LoginElements.loginButton ).click();
        return new LoginSucessPage();

    }

    @Override
    public Login errorNotification(){
        try {
            this.driver.findElement(LoginElements.errorNotification).getText();
            return this;
        } catch (NoSuchElementException e){
            return null;
        }
        
    }

    @Override
    public Boolean formIsVisible(){
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5l)).until(ExpectedConditions.visibilityOfElementLocated(LoginElements.formIsVisible));
            return true;
        } catch (TimeoutException e) {
            return false;
        }

    }
}
