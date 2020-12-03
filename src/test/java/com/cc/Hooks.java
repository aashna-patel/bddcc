package com.cc;

import com.cc.driverFactory.driverManager;
import org.junit.After;
import org.junit.Before;

public class Hooks extends driverManager {
    driverManager driverManager= new driverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.maximise();
        driverManager.navigateTo("");
        driverManager.applyImplicitWait();
    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
