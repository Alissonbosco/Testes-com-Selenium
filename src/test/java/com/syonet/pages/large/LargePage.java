package com.syonet.pages.large;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;
import com.syonet.driver.WebDriverConfig;

public class LargePage implements Large {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Large printConsoleNoSiblings() {
        String expectedText = "No siblings";
        String getText = this.driver.findElement( LargeElements.noSiblings ).getText();
        System.out.println( getText );
        assertEquals( expectedText, getText, "O conteúdo da pagina está incorreto!" );
        return this;
    }

    @Override
    public Large printConsoleSiblings() {
        String getText = this.driver.findElement( LargeElements.siblings ).getText().toString();
        if ( getText == null ) {
            System.out.println( "O texto está vazio!" );
        }
        System.out.println( getText );
        return this;
    }
}
