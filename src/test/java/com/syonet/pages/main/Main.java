package com.syonet.pages.main;

import com.syonet.pages.Windows.Windows;
import com.syonet.pages.alerts.Alerts;
import com.syonet.pages.delay.Delay;
import com.syonet.pages.frames.Frames;
import com.syonet.pages.login.Login;

public interface Main  {

    Login goToLogin();

    Alerts goToAlerts();

    Windows goToWindows();

    Delay goToDelay();

    Frames goToFrames();
    
}
