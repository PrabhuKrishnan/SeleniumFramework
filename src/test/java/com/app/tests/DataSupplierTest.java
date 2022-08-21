package com.app.tests;

import com.app.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

import java.util.List;

public class DataSupplierTest {

    @Test()
    public void Test()
    {
        /*System.out.println(testData.testCaseName);
        System.out.println(testData.username);
        System.out.println(testData.password);*/

        TestData testData = null;
        System.out.println(testData.testCaseName);




    }

   /* @DataSupplier
    public StreamEx<TestData> getData()
    {
       return TestDataReader.use(XlsxReader.class)
               .withTarget(TestData.class)
               .withSource("Testdata.xlsx")
               .read();
    }*/
}
