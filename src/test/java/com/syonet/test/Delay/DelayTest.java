package com.syonet.test.Delay;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.delay.Delay;
import com.syonet.pages.main.MainPage;
import com.syonet.test.utils.Screenshot;

@DisplayName("Teste delay")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DelayTest implements Screenshot {

    private Delay delayPage;
    

    @DisplayName("Pagina de delay")
    @BeforeEach
    void goDelayPage() {
       this.delayPage= new MainPage().goToDelay();
    }
    
    @DisplayName("Testando exemplo1")
    @Test
    void testExemple1(){
        delayPage.clickExemple1()
       .clickStartButton();
        
    }

    @DisplayName("Testando exemplo2")
    @Test
    void testExemple2(){
        delayPage.clickExemple2()
        .clickStartButton();
    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}

}
