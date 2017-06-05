package com.demo.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class NewTest {
  @Test(invocationCount=100,threadPoolSize=50)
  public void test1() throws IOException {
	  JsoupTest jsoupTest = new JsoupTest();
	  jsoupTest.get1("http://www.baidu.com");
  }
}
