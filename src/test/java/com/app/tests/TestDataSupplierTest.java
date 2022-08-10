package com.app.tests;

import com.app.annotations.FrameworkAnnotation;
import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestDataSupplierTest {

    @FrameworkAnnotation
     @Test(dataProvider = "getData")
    public void dataSupplierTest(String username)
     {
         System.out.println(username);
     }

     @DataSupplier()
     public List<String> getData()
     {
         return Arrays.asList("Prabhu");
     }


}
