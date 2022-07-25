package com.syonet.test.alerts;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.alerts.Alerts;
import com.syonet.pages.main.MainPage;
import com.syonet.test.utils.Screenshot;


@DisplayName("Alerts test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AlertsTest implements Screenshot {

    private Alerts alertsPage;

    @DisplayName("Pagina de Alertas")
    @BeforeAll
    void goToAlertsPage() {
       this.alertsPage= new MainPage().goToAlerts();
    }
    
    @DisplayName("Testando JS Alert")
    @Test
    void testJSAlert(){
        Boolean alertIsPresence = alertsPage.clickButtonJSAlert()
        .alertIsPresence();
        assertTrue(alertIsPresence, "Alerta não foi aberto com sucesso");
    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
    
}
