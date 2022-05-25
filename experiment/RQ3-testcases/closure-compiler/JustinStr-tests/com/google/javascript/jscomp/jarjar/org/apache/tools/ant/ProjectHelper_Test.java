package com.google.javascript.jscomp.jarjar.org.apache.tools.ant;

import org.junit.Test;

public class ProjectHelper_Test {

  @Test(timeout = 5000)
  public void test_genComponentName_1_1() throws Exception{

      java.lang.String string0 = "G";
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_2_2() throws Exception{

      java.lang.String string0 = "_";
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_3_3() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_4_4() throws Exception{

      java.lang.String string0 = "antlib:org.apache.tools.ant";
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_5_5() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_6_6() throws Exception{

      java.lang.String string0 = "y-$A-8Liy^/QyGiuf5ojK6#m!";
      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_8_8() throws Exception{

      java.lang.String string0 = "O$'z~494-&7R_vtJ$X+qV6j@$~wigF|L,Ar~^|K>hB>T-ont]";
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_9_9() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_10_10() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_11_11() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_12_12() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "F$F8s-J`(q6f7r|NBNQ5o$wg*IW38\\";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_13_13() throws Exception{

      java.lang.String string0 = "kmR";
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_14_14() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_15_15() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_16_16() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_17_17() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_18_18() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_19_19() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_genComponentName_20_20() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "ro-s,wWT!2m";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.genComponentName(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_1_21() throws Exception{

      java.lang.String string0 = ":";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_2_22() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_3_23() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_4_24() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_5_25() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_6_26() throws Exception{

      java.lang.String string0 = "aiSP3mLgbd:7;@2<.j";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_7_27() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_8_28() throws Exception{

      java.lang.String string0 = "+w+hU;PI<#T)c7a9MAw}tuCYRryQ0Zc oys':";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_9_29() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_10_30() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_11_31() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_12_32() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_13_33() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_14_34() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_15_35() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_16_36() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_17_37() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_18_38() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_19_39() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractUriFromComponentName_20_40() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractUriFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_1_41() throws Exception{

      java.lang.String string0 = ":";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_2_42() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_3_43() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_4_44() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_5_45() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_6_46() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_7_47() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_8_48() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_9_49() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_10_50() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_11_51() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_12_52() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_13_53() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_14_54() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_15_55() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_16_56() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_17_57() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_18_58() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_19_59() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



  @Test(timeout = 5000)
  public void test_extractNameFromComponentName_20_60() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper.extractNameFromComponentName(string0);

  }



}