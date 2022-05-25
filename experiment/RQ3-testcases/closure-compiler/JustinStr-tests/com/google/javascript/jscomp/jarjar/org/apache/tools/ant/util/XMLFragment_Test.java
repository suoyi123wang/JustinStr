package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util;

import org.junit.Test;

public class XMLFragment_Test {

  @Test(timeout = 5000)
  public void test_createDynamicElement_1_1() throws Exception{

      java.lang.String string1 = "2";
      java.lang.String string2 = " #";
      java.lang.String string3 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_2_2() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = ",Z\\\"@+abXm(,kYPr:6jO,:KMQn?2ynTn(PL^5`,30{bhltvo*Y";
      java.lang.String string3 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_3_3() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_4_4() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_5_5() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "a ";
      java.lang.String string3 = "4&NZA[rLi_q(J'h>?U,kX325";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_6_6() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_7_7() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "";
      java.lang.String string3 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_8_8() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = " #";
      java.lang.String string3 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_9_9() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = " ";
      java.lang.String string3 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_10_10() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_11_11() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_12_12() throws Exception{

      java.lang.String string1 = " #";
      java.lang.String string2 = "{\"key\":2 }";
      java.lang.String string3 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_13_13() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_14_14() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "r`Dnd)Y%Vk6\\\"RRHAtE 1";
      java.lang.String string3 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_15_15() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_16_16() throws Exception{

      java.lang.String string1 = " #";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_17_17() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "a ";
      java.lang.String string3 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.EchoXML();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_18_18() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_19_19() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = " #";
      java.lang.String string3 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_createDynamicElement_20_20() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "{\"key\":2 }";
      java.lang.String string3 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment xMLFragment0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.XMLFragment();
      xMLFragment0.createDynamicElement(string1, string2, string3);

  }



}