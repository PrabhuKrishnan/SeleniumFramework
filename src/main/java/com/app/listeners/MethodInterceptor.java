package com.app.listeners;

import com.app.testdata.TestData;
import com.app.utils.DataProviderUtils;
import one.util.streamex.StreamEx;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MethodInterceptor implements IMethodInterceptor {
    @Override

    //Need to optimize this block later
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext iTestContext) {

           TestData testData = null;
           List<IMethodInstance> result = new ArrayList<>();

        /**
         * Refactor the logic using the Data Supplier
         */
        for (int i=0;i<methods.size();i++)
          {
              System.out.println(methods.get(i).getMethod().getMethodName());
                  if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(testData.testCaseName))
              {
                   if(testData.runTestcase.equalsIgnoreCase("yes"))
                   {
                        result.add(methods.get(i));
                   }
              }

          }
        return result;
    }
}
