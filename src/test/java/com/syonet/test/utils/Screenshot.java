package com.syonet.test.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syonet.driver.WebDriverConfig;

public interface Screenshot {

    @AfterEach
    default void screenshot(TestInfo info) throws IOException {
        Logger.getLogger(info.getDisplayName()).info("Getting screenshot");
        File arquivo = ((TakesScreenshot) WebDriverConfig.getDriver())
                .getScreenshotAs(OutputType.FILE);
        String path = String.format("target%sscreenshot%s%s.jpg",
                File.separator,
                File.separator,
                info.getDisplayName());
        FileUtils.copyFile(arquivo, new File(path));
        AllureScreenshot.saveScreenshotToAllure(Files.readAllBytes( arquivo.toPath() ));
    }

}
