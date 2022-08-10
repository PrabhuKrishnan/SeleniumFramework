package com.app.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentReportManger {

    private ExtentReportManger() {
    }

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    static ExtentTest getExtentTest() {
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test) {
        threadLocal.set(test);

    }

}
