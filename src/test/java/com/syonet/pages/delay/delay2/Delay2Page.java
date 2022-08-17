package com.syonet.pages.delay.delay2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.delay.delay1.Delay1Elements;

public class Delay2Page implements Delay2 {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Delay2 clickStartButton() {
        this.driver.findElement( Delay1Elements.startButton ).click();
        Boolean butText = new WebDriverWait(driver, Duration.ofSeconds(5L)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"), "Hello World!"));
        assertTrue(butText, "O texto não foi exibido com Sucesso!");
        return this;
    }

}
