package com.syonet.test.frames;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.frames.Frames;
import com.syonet.pages.main.MainPage;

@DisplayName("Teste de Frames")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FramesTest {

    private Frames framesPage;

    @DisplayName("Pagina de frames")
    @BeforeEach
    void goDelayPage() {
       this.framesPage= new MainPage().goToFrames();
    }
    
    @DisplayName("Teste de Frames")
    @Test
    void testFrames(){
        framesPage.getFrame();

    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
}
