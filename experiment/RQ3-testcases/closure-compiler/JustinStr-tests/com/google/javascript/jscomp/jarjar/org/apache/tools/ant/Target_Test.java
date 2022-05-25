package com.google.javascript.jscomp.jarjar.org.apache.tools.ant;

import org.junit.Test;

public class Target_Test {

  @Test(timeout = 5000)
  public void test_parseDepends_1_1() throws Exception{

      java.lang.String string0 = "}";
      java.lang.String string1 = "a ";
      java.lang.String string2 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_2_2() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "a ";
      java.lang.String string2 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_3_3() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_4_4() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = " ";
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_5_5() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_6_6() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = " ";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_7_7() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_8_8() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_9_9() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_10_10() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_11_11() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_12_12() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = " #";
      java.lang.String string2 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_13_13() throws Exception{

      java.lang.String string0 = "w9l";
      java.lang.String string1 = " #";
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "cQlB6";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_15_15() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "{/}'HK";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_16_16() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "VMp1<IMN<Q<iGTq&Cd~1DgDq:#?VS|FSp$r8Q9??CnR>xls)";
      java.lang.String string2 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_17_17() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "oe&SaZ=:$R8_)Z~9D.&k7SbC";
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_18_18() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_19_19() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDepends_20_20() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "";
      java.lang.String string2 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target.parseDepends(string0, string1, string2);

  }



}