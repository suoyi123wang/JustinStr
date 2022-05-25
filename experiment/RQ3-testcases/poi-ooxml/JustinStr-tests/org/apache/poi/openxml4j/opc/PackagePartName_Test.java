package org.apache.poi.openxml4j.opc;

import org.junit.Test;

public class PackagePartName_Test {

  @Test(timeout = 5000)
  public void test_compare_1_1() throws Exception{

      java.lang.String string0 = "I";
      java.lang.String string1 = "4";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_2_2() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_3_3() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "8ag";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_4_4() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_5_5() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_6_6() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_8_8() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_9_9() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_10_10() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_11_11() throws Exception{

      java.lang.String string0 = "*cCmY6Jj]Ar5FbCCwc";
      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_12_12() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "pH)7S`,egvmT$'D{_G8q";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_13_13() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_14_14() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_15_15() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_16_16() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_17_17() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_18_18() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_19_19() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_compare_20_20() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePartName.compare(string0, string1);

  }



}