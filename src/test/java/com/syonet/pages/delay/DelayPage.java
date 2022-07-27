package com.syonet.pages.delay;

import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;

public class DelayPage implements Delay {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Delay1 clickExemple1() {
        this.driver.findElement( DelayElements.exemple1 ).click();
        return new Delay1Page();
    }

    @Override
    public Delay2 clickExemple2() {
        this.driver.findElement( DelayElements.exemple2 ).click();
        return new Delay2Page();
    }


}
