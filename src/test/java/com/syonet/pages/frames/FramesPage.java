package com.syonet.pages.frames;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;

public class FramesPage implements Frames {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Frames getFrame() {
        driver.switchTo().frame( "frame-bottom" );
        String expected = "BOTTOM";
        String get = driver.findElement( By.tagName( "body" ) ).getText();
        assertEquals(expected, get,"Frame não foi encontrado com sucesso!");
        System.out.println( get );
        return this;
    }

}
