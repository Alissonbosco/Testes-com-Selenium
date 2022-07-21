package com.syonet.pages.login;

import com.syonet.pages.login.loginSucess.LoginSucessPage;

public interface Login {

    Login fillUsername( String username );

    Login fillPassword( String userpassword );

    LoginSucessPage clickLoginButton();

    Login errorNotification();

    Boolean formIsVisible();

}
