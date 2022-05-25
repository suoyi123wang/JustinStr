package com.google.javascript.jscomp.jarjar.org.apache.tools.mail;

import org.junit.Test;

public class MailMessage_Test {

  @Test(timeout = 5000)
  public void test_sanitizeAddress_1_1() throws Exception{

      java.lang.String string0 = "=>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_2_2() throws Exception{

      java.lang.String string0 = "2(";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_3_3() throws Exception{

      java.lang.String string0 = "(";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_4_4() throws Exception{

      java.lang.String string0 = "q)";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_5_5() throws Exception{

      java.lang.String string0 = "<";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_6_6() throws Exception{

      java.lang.String string0 = "><";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_7_7() throws Exception{

      java.lang.String string0 = ">";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_8_8() throws Exception{

      java.lang.String string0 = "o";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_9_9() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_10_10() throws Exception{

      java.lang.String string0 = ")";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_11_11() throws Exception{

      java.lang.String string0 = "#9f)#\\\"e<mk";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_12_12() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_13_13() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_14_14() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_15_15() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_16_16() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_17_17() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_18_18() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_19_19() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeAddress_20_20() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailMessage.sanitizeAddress(string0);

  }



}