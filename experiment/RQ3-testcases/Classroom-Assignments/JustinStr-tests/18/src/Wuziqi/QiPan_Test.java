package Wuziqi;

import org.junit.Test;

public class QiPan_Test {

  @Test(timeout = 5000)
  public void test_validInput_1_1() throws Exception{

      String string0 = "8";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_2_2() throws Exception{

      String string0 = "u=s";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_3_3() throws Exception{

      String string0 = "yP";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_4_4() throws Exception{

      String string0 = "sh3$";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_5_5() throws Exception{

      String string0 = "\\n";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_6_6() throws Exception{

      String string0 = "{\"key\":2 }";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_7_7() throws Exception{

      String string0 = "";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_8_8() throws Exception{

      String string0 = ".\\a.txt";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_9_9() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_10_10() throws Exception{

      String string0 = "[0,1]";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_11_11() throws Exception{

      String string0 = "<a> </a>";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_12_12() throws Exception{

      String string0 = "{\"key\":null}";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_13_13() throws Exception{

      String string0 = "fcbyYs0#z$:X1gSPOko^M[7EMOtG*O7K0q)^+]Ob5%7,9[";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_14_14() throws Exception{

      String string0 = " #";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_15_15() throws Exception{

      String string0 = ".\\a.txt";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_16_16() throws Exception{

      String string0 = "<a> </a>";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_17_17() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_18_18() throws Exception{

      String string0 = "<a> </a>";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_19_19() throws Exception{

      String string0 = " ";
      QiPan.validInput(string0);

  }



  @Test(timeout = 5000)
  public void test_validInput_20_20() throws Exception{

      String string0 = "r{- 9|?TF";
      QiPan.validInput(string0);

  }



}