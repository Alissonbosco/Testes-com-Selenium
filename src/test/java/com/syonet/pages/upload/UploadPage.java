package com.syonet.pages.upload;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.syonet.driver.WebDriverConfig;

public class UploadPage implements Upload {

    private WebDriver driver = WebDriverConfig.getDriver();

    @Override
    public Upload uploadFile() {
        String path = "/home/syonet/Downloads/Desafio_Selenium.html";       
        File file = new File(path);
        WebElement uploadFile = driver.findElement( UploadElements.filePathInput);
        uploadFile.sendKeys(file.getAbsolutePath());
        driver.findElement(UploadElements.uploadButton).click();
        return this;
    }

    @Override
    public Upload verificationFile(){
        String fileExpected = "Desafio_Selenium.html";
        String fileActual =driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(fileExpected,fileActual, "O arquivo não foi incluido com sucesso!");
        return this;

    }
}

