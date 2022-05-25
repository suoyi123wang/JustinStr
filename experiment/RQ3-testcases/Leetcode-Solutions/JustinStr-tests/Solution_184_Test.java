import org.junit.Test;

public class Solution_184_Test {

  @Test(timeout = 5000)
  public void test_isValidTagName_1_1() throws Exception{

      java.lang.String string1 = "qh!*J+Mkr,";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_2_2() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_3_3() throws Exception{

      java.lang.String string1 = "-@";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_4_4() throws Exception{

      java.lang.String string1 = "\t";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_5_5() throws Exception{

      java.lang.String string1 = "FLU~G'\"(";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_6_6() throws Exception{

      java.lang.String string1 = "Z\nWa]An!x";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_7_7() throws Exception{

      java.lang.String string1 = "[0,1]";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_8_8() throws Exception{

      java.lang.String string1 = "a ";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_9_9() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_10_10() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_11_11() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_12_12() throws Exception{

      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_13_13() throws Exception{

      java.lang.String string1 = "[0,1]";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_14_14() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_15_15() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_16_16() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_17_17() throws Exception{

      java.lang.String string1 = "_8fYugpl2Y_&x4bm'";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_18_18() throws Exception{

      java.lang.String string1 = "a ";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_19_19() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = true;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidTagName_20_20() throws Exception{

      java.lang.String string1 = " ";
      boolean boolean2 = false;
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidTagName(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_1_21() throws Exception{

      java.lang.String string1 = "l[CDATA[";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_2_22() throws Exception{

      java.lang.String string1 = "[CDATA[";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_3_23() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_4_24() throws Exception{

      java.lang.String string1 = "<a> </a>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_5_25() throws Exception{

      java.lang.String string1 = "\\n";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_6_26() throws Exception{

      java.lang.String string1 = "[0,1]";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_7_27() throws Exception{

      java.lang.String string1 = "[0,1]";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_8_28() throws Exception{

      java.lang.String string1 = " ";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_9_29() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_10_30() throws Exception{

      java.lang.String string1 = " ";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_11_31() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_12_32() throws Exception{

      java.lang.String string1 = "[0,1]";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_13_33() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_14_34() throws Exception{

      java.lang.String string1 = "N57Dj9-cHr> zwG";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_15_35() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_16_36() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_17_37() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_18_38() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_19_39() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValidCdata_20_40() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValidCdata(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_1_41() throws Exception{

      java.lang.String string1 = ">";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_2_42() throws Exception{

      java.lang.String string1 = "<";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_3_43() throws Exception{

      java.lang.String string1 = "U!";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_4_44() throws Exception{

      java.lang.String string1 = "/";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_5_45() throws Exception{

      java.lang.String string1 = "_>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_6_46() throws Exception{

      java.lang.String string1 = "b/";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_7_47() throws Exception{

      java.lang.String string1 = "!";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_8_48() throws Exception{

      java.lang.String string1 = "]]>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_9_49() throws Exception{

      java.lang.String string1 = "X]]>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_10_50() throws Exception{

      java.lang.String string1 = "B<";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_11_51() throws Exception{

      java.lang.String string1 = "";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_12_52() throws Exception{

      java.lang.String string1 = "6";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_13_53() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_14_54() throws Exception{

      java.lang.String string1 = "<a> </a>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_15_55() throws Exception{

      java.lang.String string1 = "\\n";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_16_56() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_17_57() throws Exception{

      java.lang.String string1 = "[0,1]";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_18_58() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_19_59() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



  @Test(timeout = 5000)
  public void test_isValid_20_60() throws Exception{

      java.lang.String string1 = "<a> </a>";
      Solution_184 solution_1840 = new Solution_184();
      solution_1840.isValid(string1);

  }



}