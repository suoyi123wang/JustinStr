package com.google.javascript.jscomp.jarjar.org.apache.tools.zip;

import org.junit.Test;

public class ZipEntry_Test {

  @Test(timeout = 5000)
  public void test_setName_1_1() throws Exception{

      java.lang.String string1 = "/";
      java.lang.String string4 = " #";
      java.io.File file2 = new java.io.File(string4);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(file2, string3);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_2_2() throws Exception{

      java.lang.String string1 = "2";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      java.util.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_3_3() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string5 = "5CNhr[R/>wQ'\\\"S1YE>j";
      java.util.zip.ZipEntry zipEntry4 = new java.util.jar.JarEntry(string5);
      java.util.zip.ZipEntry zipEntry3 = new java.util.jar.JarEntry(zipEntry4);
      java.util.zip.ZipEntry zipEntry2 = new java.util.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_4_4() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.net.URI uRI6 = null;
      java.io.File file4 = new java.io.File(uRI6);
      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(file4, string5);
      java.util.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_5_5() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = " ";
      java.util.zip.ZipEntry zipEntry3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_6_6() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string4 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_7_7() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = ".p'<TcCWI3LyleVZF6!)6Q0/)";
      java.io.File file2 = new java.io.File(string4);
      java.lang.String string3 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(file2, string3);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_8_8() throws Exception{

      java.lang.String string1 = "";
      java.util.zip.ZipEntry zipEntry5 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_9_9() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_10_10() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "{\"key\":null}";
      java.util.zip.ZipEntry zipEntry2 = new java.util.jar.JarEntry(string3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_11_11() throws Exception{

      java.lang.String string1 = " #";
      java.lang.String string3 = ".\\a.txt";
      java.util.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_12_12() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_13_13() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_14_14() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      java.util.zip.ZipEntry zipEntry3 = new java.util.zip.ZipEntry(string4);
      java.util.zip.ZipEntry zipEntry2 = new java.util.zip.ZipEntry(zipEntry3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_15_15() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_16_16() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_17_17() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string5 = " #";
      java.net.URI uRI4 = new java.net.URI(string5);
      java.io.File file2 = new java.io.File(uRI4);
      java.lang.String string3 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(file2, string3);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_18_18() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_19_19() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string5 = "{\"key\":2 }";
      java.io.File file3 = new java.io.File(string5);
      java.lang.String string4 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(file3, string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(zipEntry2);
      zipEntry0.setName(string1);

  }



  @Test(timeout = 5000)
  public void test_setName_20_20() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry zipEntry0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEntry(string2);
      zipEntry0.setName(string1);

  }



}