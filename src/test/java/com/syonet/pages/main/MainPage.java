package com.syonet.pages.main;

import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.alerts.Alerts;
import com.syonet.pages.alerts.AlertsPage;
import com.syonet.pages.delay.Delay;
import com.syonet.pages.delay.DelayPage;
import com.syonet.pages.frames.Frames;
import com.syonet.pages.frames.FramesPage;
import com.syonet.pages.large.Large;
import com.syonet.pages.large.LargePage;
import com.syonet.pages.login.Login;
import com.syonet.pages.login.LoginPage;
import com.syonet.pages.upload.Upload;
import com.syonet.pages.upload.UploadPage;
import com.syonet.pages.windows.Windows;
import com.syonet.pages.windows.WindowsPage;

public class MainPage implements Main {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Login goToLogin() {
        this.driver.get( "http://the-internet.herokuapp.com/login" );
        return new LoginPage();
    }

    @Override
    public Alerts goToAlerts() {
        this.driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        return new AlertsPage();
    }

    @Override
    public Windows goToWindows() {
        this.driver.get("http://the-internet.herokuapp.com/windows");
        return new WindowsPage();
    }

    @Override
    public Delay goToDelay(){
        this.driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        return new DelayPage();

    }

    @Override
    public Frames goToFrames(){
        this.driver.get("http://the-internet.herokuapp.com/nested_frames");
        return new FramesPage();
    }

    @Override
    public Upload goToUpload(){
        this.driver.get("http://the-internet.herokuapp.com/upload");
        return new UploadPage();
    }

    @Override
    public Large goToLarge(){
        this.driver.get("http://the-internet.herokuapp.com/large");
        return new LargePage();
    }
}
