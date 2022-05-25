package com.google.javascript.jscomp.resources;

import org.junit.Test;

public class PropertiesParser_Test {

  @Test(timeout = 5000)
  public void test_parse_1_1() throws Exception{

      java.lang.String string0 = "#";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_2_2() throws Exception{

      java.lang.String string0 = "!";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_3_3() throws Exception{

      java.lang.String string0 = ",";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_4_4() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_5_5() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_6_6() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_7_7() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_8_8() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_9_9() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_10_10() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_11_11() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_12_12() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_13_13() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_15_15() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_16_16() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_17_17() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_18_18() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_19_19() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



  @Test(timeout = 5000)
  public void test_parse_20_20() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.resources.PropertiesParser.parse(string0);

  }



}