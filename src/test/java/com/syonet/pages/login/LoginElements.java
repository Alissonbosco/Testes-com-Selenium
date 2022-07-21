package com.syonet.pages.login;

import org.openqa.selenium.By;

public class LoginElements {

    protected static final By inputUsername = By.id( "username" );
    protected static final By inputPassword = By.id( "password" );
    protected static final By loginButton = By.xpath( "//button[@class='radius']" );
    protected static final By errorNotification = By.xpath("//div[@class='flash error']");
    protected static final By formIsVisible = By.id("login");
}
