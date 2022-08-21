package com.app.reports;

import com.app.listeners.TestListener;
import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public final class ExtentReportManger  {

    private ExtentReportManger() {
    }

    private static final ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    static ExtentTest getExtentTest() {
        return extentTest.get();
    }

    static void setExtentTest(ExtentTest test) {
        if(Objects.nonNull(test)) {
            extentTest.set(test);
        }
    }
    static void unLoad()
    {
        extentTest.remove();
    }

}
