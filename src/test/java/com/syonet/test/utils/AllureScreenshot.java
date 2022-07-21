package com.syonet.test.utils;

import io.qameta.allure.Attachment;

public class AllureScreenshot {
    
    @Attachment( value = "Page screenshot", type = "image/jpeg" )
    protected static byte[] saveScreenshotToAllure( byte[] screenshot ) {
        return screenshot;
    }

}
