package com.app.listeners;

import com.app.config.ConfigFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

    private int retryCount = 0;
    private int retryLimit = 5;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(ConfigFactory.getConfig().retryFailedTest().equalsIgnoreCase("yes")) {
            if (retryCount < retryLimit) {
                retryCount++;
                return true;
            }
        }
        return  false;
    }
}
