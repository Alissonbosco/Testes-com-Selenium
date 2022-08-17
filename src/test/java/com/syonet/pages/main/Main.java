package com.syonet.pages.main;

import com.syonet.pages.alerts.Alerts;
import com.syonet.pages.delay.Delay;
import com.syonet.pages.frames.Frames;
import com.syonet.pages.large.Large;
import com.syonet.pages.login.Login;
import com.syonet.pages.upload.Upload;
import com.syonet.pages.windows.Windows;

public interface Main  {

    Login goToLogin();

    Alerts goToAlerts();

    Windows goToWindows();

    Delay goToDelay();

    Frames goToFrames();

    Upload goToUpload();

    Large goToLarge();
    
}
