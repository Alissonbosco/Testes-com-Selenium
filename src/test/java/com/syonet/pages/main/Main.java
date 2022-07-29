package com.syonet.pages.main;

import com.syonet.pages.Windows.Windows;
import com.syonet.pages.alerts.Alerts;
import com.syonet.pages.delay.Delay;
import com.syonet.pages.draganddrop.DragAndDrop;
import com.syonet.pages.frames.Frames;
import com.syonet.pages.large.Large;
import com.syonet.pages.login.Login;
import com.syonet.pages.upload.Upload;

public interface Main  {

    Login goToLogin();

    Alerts goToAlerts();

    Windows goToWindows();

    Delay goToDelay();

    Frames goToFrames();

    Upload goToUpload();

    // DragAndDrop goToDragAndDrop();

    Large goToLarge();
    
}
