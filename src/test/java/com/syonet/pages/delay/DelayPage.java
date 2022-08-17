package com.syonet.pages.delay;

import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.delay.delay1.Delay1;
import com.syonet.pages.delay.delay1.Delay1Page;
import com.syonet.pages.delay.delay2.Delay2;
import com.syonet.pages.delay.delay2.Delay2Page;

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
