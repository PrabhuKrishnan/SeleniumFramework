package com.app.testdata;

import com.creditdatamw.zerocell.annotation.Column;

public class TestData {

    @Column(name="testcaseName",index = 0)
    public String testCaseName;

    @Column(name = "username",index = 1)
    public String username;

    @Column(name = "password",index = 2 )
    public String password;

    @Column(name = "expectedTitle",index = 3)
    public String expectedTitle;

    @Column(name="runTestcase",index =4)
    public String runTestcase;




}
