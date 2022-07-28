package com.syonet.test.upload;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import com.syonet.driver.WebDriverConfig;
import com.syonet.pages.main.MainPage;
import com.syonet.pages.upload.Upload;

@DisplayName("Teste upload")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UploadTest {

    private Upload uploadPage;

    @DisplayName("Pagina de upload")
    @BeforeEach
    void goUploadPage() {
       this.uploadPage= new MainPage().goToUpload();
    }

    @DisplayName("Teste de Upload")
    @Test
    void testUpload(){
        uploadPage.uploadFile()
        .verificationFile();

    }

    @AfterAll
	static void tearDown( TestInfo info ) {
		Logger.getLogger( info.getDisplayName() ).info( "Closing driver" );
		WebDriverConfig.killDriver();
	}
    
}
