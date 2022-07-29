package com.syonet.test.large;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.large.Large;
import com.syonet.pages.main.MainPage;

@DisplayName("Teste Large")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LargeTest {

    private Large largePage;

    @DisplayName("Pagina de large")
    @BeforeEach
    void goLoginPage() {
       this.largePage= new MainPage().goToLarge();
    }

    @DisplayName("Teste de Large")
    @Test
    void testLarge(){
        largePage.printConsoleNoSiblings()
        .printConsoleSiblings();
        

    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
}
