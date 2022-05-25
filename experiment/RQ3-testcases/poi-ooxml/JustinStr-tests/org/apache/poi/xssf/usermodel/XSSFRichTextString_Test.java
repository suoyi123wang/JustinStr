package org.apache.poi.xssf.usermodel;

import org.junit.Test;

public class XSSFRichTextString_Test {

  @Test(timeout = 5000)
  public void test_utfLength_1_1() throws Exception{

      java.lang.String string0 = "_x";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_2_2() throws Exception{

      java.lang.String string0 = "^";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_3_3() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_4_4() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_5_5() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_6_6() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_7_7() throws Exception{

      java.lang.String string0 = "yLI.SKl:a9ab/6s";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_8_8() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_9_9() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_10_10() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_11_11() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_12_12() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_13_13() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_14_14() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_15_15() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_16_16() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_17_17() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_18_18() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_19_19() throws Exception{

      java.lang.String string0 = " _YeB-uoJj\\\"*<x*r^;-NdRAKO\\\"DS>,Y?pco{j@QmS+9yW/r";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfLength_20_20() throws Exception{

      java.lang.String string0 = "H^bln^:mmbU@Mv=0hH\\\"yFin1n'?D_]EPir+*n{]6G&";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfLength(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_1_21() throws Exception{

      java.lang.String string0 = "_x";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_2_22() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_3_23() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_4_24() throws Exception{

      java.lang.String string0 = "\\]BWl.4bR\\\"";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_5_25() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_6_26() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_7_27() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_8_28() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_9_29() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_10_30() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_11_31() throws Exception{

      java.lang.String string0 = "Iy9=lKk";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_12_32() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_13_33() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_14_34() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_15_35() throws Exception{

      java.lang.String string0 = "f@C'st_?7^ Bg)`<Vkd&&tn%~Gd";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_16_36() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_17_37() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_18_38() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_19_39() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



  @Test(timeout = 5000)
  public void test_utfDecode_20_40() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFRichTextString.utfDecode(string0);

  }



}