package com.syonet.pages.windows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;

public class NewWindowPage implements NewWindow {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public void printConsole() {
        String expectedText = "New Window";
        String getText = this.driver.findElement( By.tagName( "body" ) ).getText();
        System.out.println( getText );
       assertEquals(expectedText, getText, "O conteúdo da pagina está incorreto!");
    }

}