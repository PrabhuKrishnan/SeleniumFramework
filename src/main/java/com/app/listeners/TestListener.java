package com.app.listeners;

import com.app.annotations.FrameworkAnnotation;
import com.app.reports.ExtentReport;
import com.app.reports.ExtentReportLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getDescription());
        ExtentReport.assignAuthor(result
                .getMethod()
                .getConstructorOrMethod()
                .getMethod()
                .getAnnotation(FrameworkAnnotation.class).author());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportLogger.pass(result.getName() + "is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReportLogger.fail(result.getName() + "is failed");
        ExtentReportLogger.fail(result.getThrowable().getMessage());
        ExtentReportLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onStart(ITestContext context) {

        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }


}
