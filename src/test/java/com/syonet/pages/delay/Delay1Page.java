package com.syonet.pages.delay;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.syonet.driver.WebDriverConfig;

public class Delay1Page implements Delay1 {
    
    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Delay1 clickStartButton() {
        this.driver.findElement( Delay1Elements.startButton ).click();
        Boolean butText = new WebDriverWait(driver, Duration.ofSeconds(6L)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"), "Hello World!"));
        assertTrue(butText, "O texto não foi exibido com Sucesso!");
        
        return this;
    }
  
}
