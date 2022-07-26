package com.syonet.test.windows;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.Windows.Windows;
import com.syonet.pages.main.MainPage;
import com.syonet.test.utils.Screenshot;

@DisplayName( "Teste das Abas" )
@TestInstance( TestInstance.Lifecycle.PER_CLASS )

public class windowsTest implements Screenshot {

    private Windows windowsPage;
   
    @DisplayName( "Pagina de Abas" )
    @BeforeAll
    void goToWindowsPage() {
        this.windowsPage = new MainPage().goToWindows();
    }

    @DisplayName("Testando a abertura da aba")
    @Test
    void hereWindowTest() {
        windowsPage.clickHere()
        .getWindowsNew()
        .printConsole();
    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
}
