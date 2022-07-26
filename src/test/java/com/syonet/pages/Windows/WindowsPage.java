package com.syonet.pages.Windows;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;

public class WindowsPage implements Windows {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public WindowsPage clickHere() {
        this.driver.findElement( WindowsElements.here ).click();
        return this;
    }

    @Override
    public NewWindow getWindowsNew() {

        Set< String > abas = driver.getWindowHandles();

        String windowCurrent = driver.getWindowHandle();
        for ( String aba : abas ) {
            if ( !windowCurrent.equals( aba ) ) {
                driver.switchTo().window( aba );
            }
        }
        return new NewWindowPage();
    }

}
