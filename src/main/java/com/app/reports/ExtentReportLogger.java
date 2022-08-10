package com.app.reports;

import com.app.utils.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public final class ExtentReportLogger {

    private ExtentReportLogger() {
    }

    public static void pass(String message) {
        ExtentReportManger.getExtentTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail(String message) {
        ExtentReportManger.getExtentTest().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void info(String message) {
        ExtentReportManger.getExtentTest().info(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
}
