package org.apache.poi.openxml4j.opc.internal;

import org.junit.Test;

public class ZipHelper_Test {

  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_1_1() throws Exception{

      java.lang.String string0 = "/";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_2_2() throws Exception{

      java.lang.String string0 = "\\";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_3_3() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_4_4() throws Exception{

      java.lang.String string0 = "*2%'hm9.~=@Qkxz:. l(-Y6'!87qq8X~94\\\"^";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_5_5() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_6_6() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_7_7() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_8_8() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_9_9() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_10_10() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_11_11() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_12_12() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_13_13() throws Exception{

      java.lang.String string0 = "n(v!`";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_14_14() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_15_15() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_16_16() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_17_17() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_18_18() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_19_19() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



  @Test(timeout = 5000)
  public void test_getOPCNameFromZipItemName_20_20() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.openxml4j.opc.internal.ZipHelper.getOPCNameFromZipItemName(string0);

  }



}