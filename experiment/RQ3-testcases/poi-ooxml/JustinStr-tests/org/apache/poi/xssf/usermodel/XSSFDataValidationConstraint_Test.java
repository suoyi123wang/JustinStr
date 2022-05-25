package org.apache.poi.xssf.usermodel;

import org.junit.Test;

public class XSSFDataValidationConstraint_Test {

  @Test(timeout = 5000)
  public void test_removeLeadingEquals_1_1() throws Exception{

      java.lang.String string0 = "9=";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_2_2() throws Exception{

      java.lang.String string0 = "=";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_3_3() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_4_4() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_5_5() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_6_6() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_7_7() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_8_8() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_9_9() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_10_10() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_11_11() throws Exception{

      java.lang.String string0 = "I";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_12_12() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_13_13() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_15_15() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_16_16() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_17_17() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_18_18() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_19_19() throws Exception{

      java.lang.String string0 = " #";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_removeLeadingEquals_20_20() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.removeLeadingEquals(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_1_21() throws Exception{

      java.lang.String string0 = "\"";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_2_22() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_3_23() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_4_24() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_5_25() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_6_26() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_7_27() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_8_28() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_9_29() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_10_30() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_11_31() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_12_32() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_13_33() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_14_34() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_15_35() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_16_36() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_17_37() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_18_38() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_19_39() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isFormulaEmpty_20_40() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint.isFormulaEmpty(string0);

  }



}