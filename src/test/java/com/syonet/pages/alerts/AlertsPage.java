package com.syonet.pages.alerts;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.syonet.driver.WebDriverConfig;

public class AlertsPage implements Alerts {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public AlertsPage clickButtonJSAlert() {
            this.driver.findElement( AlertsElements.buttonJSAlert ).click();
            return this;
        }
        
    @Override
    public Boolean alertIsPresence() {
        try {
            Alert alert = new WebDriverWait(driver, Duration.ofSeconds(1l)).until(ExpectedConditions.alertIsPresent());
            alert.accept();
            return true; 
        } catch (TimeoutException e) {
            return false;
        }
    }

}