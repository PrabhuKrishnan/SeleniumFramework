package com.app.reports;

import com.app.config.ConfigFactory;
import com.app.utils.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public final class ExtentReportLogger {

    private ExtentReportLogger() {
    }

    public static void pass(String message) {
            ExtentReportManger.getExtentTest().pass(message);
    }
    public static  void pass(String message, boolean isScreenshotNeeded){
        if(ConfigFactory.getConfig().passedStepsScreenshot().equalsIgnoreCase("yes") && isScreenshotNeeded)
        {
            ExtentReportManger.getExtentTest().pass(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
        }
        else {
            pass(message);
        }
    }

    public static  void fail(String message, boolean isScreenshotNeeded)
    {
        if(ConfigFactory.getConfig().failedStepsScreenshot().equalsIgnoreCase("yes") && isScreenshotNeeded)
        {
            ExtentReportManger.getExtentTest().pass(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
        }
        else{
            fail(message);
        }
    }

    public static void fail(String message) {
        ExtentReportManger.getExtentTest().fail(message);

    }

    public static void skip(String message, boolean isScreenshotNeeded)
    {
        if(ConfigFactory.getConfig().skippedStepsScreenshot().equalsIgnoreCase("yes") && isScreenshotNeeded)
        {
            ExtentReportManger.getExtentTest().fail(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
        }
        else {
            skip(message);
        }
    }
    public static void  skip(String message)
    {
        ExtentReportManger.getExtentTest().skip(message);

    }

    public static void info(String message) {
        ExtentReportManger.getExtentTest().info(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

}
