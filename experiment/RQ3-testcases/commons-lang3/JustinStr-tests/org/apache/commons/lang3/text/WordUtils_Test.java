package org.apache.commons.lang3.text;

import org.junit.Test;

public class WordUtils_Test {

  @Test(timeout = 5000)
  public void test_wrap_1_1() throws Exception{

      java.lang.String string0 = "";
      int int1 = -2147483648;
      java.lang.String string2 = " ";
      boolean boolean3 = true;
      java.lang.String string4 = "mN\\X_wtLF*!?f/g&wU<844./&pC#EC";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_2_2() throws Exception{

      java.lang.String string0 = "<a> </a>";
      int int1 = -2147483648;
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = false;
      java.lang.String string4 = "{\"key\":null}";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_3_3() throws Exception{

      java.lang.String string0 = " #";
      int int1 = -2147483648;
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = true;
      java.lang.String string4 = "";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_4_4() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      int int1 = 2147483647;
      java.lang.String string2 = "";
      boolean boolean3 = true;
      java.lang.String string4 = "a ";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_5_5() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      int int1 = 2098021090;
      java.lang.String string2 = "a ";
      boolean boolean3 = false;
      java.lang.String string4 = "{\"key\":null}";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_6_6() throws Exception{

      java.lang.String string0 = "\\n";
      int int1 = 0;
      java.lang.String string2 = "\\n";
      boolean boolean3 = false;
      java.lang.String string4 = "\\n";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_7_7() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      int int1 = -2147483648;
      java.lang.String string2 = "<a> </a>";
      boolean boolean3 = false;
      java.lang.String string4 = "^[1]([3-9])[0-9]{9}$";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_8_8() throws Exception{

      java.lang.String string0 = "a ";
      int int1 = 0;
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = true;
      java.lang.String string4 = "";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_9_9() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      int int1 = -2147483648;
      java.lang.String string2 = "[0,1]";
      boolean boolean3 = false;
      java.lang.String string4 = "^[1]([3-9])[0-9]{9}$";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_10_10() throws Exception{

      java.lang.String string0 = "8@JfD->4kV8&Eo$9?0$O@p`At";
      int int1 = -2147483648;
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = false;
      java.lang.String string4 = " #";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_11_11() throws Exception{

      java.lang.String string0 = "\\n";
      int int1 = 2147483647;
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = false;
      java.lang.String string4 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_12_12() throws Exception{

      java.lang.String string0 = "%je67-o-\\Bt'tC_}!JX#\\o<,YMLR^";
      int int1 = -2147483648;
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = true;
      java.lang.String string4 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_13_13() throws Exception{

      java.lang.String string0 = "";
      int int1 = 2147483647;
      java.lang.String string2 = "<a>Hello World</a>";
      boolean boolean3 = true;
      java.lang.String string4 = "{\"key\":null}";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_14_14() throws Exception{

      java.lang.String string0 = "<a> </a>";
      int int1 = -2147483648;
      java.lang.String string2 = "{\"key\":2 }";
      boolean boolean3 = false;
      java.lang.String string4 = "<a>Hello World</a>";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_15_15() throws Exception{

      java.lang.String string0 = "";
      int int1 = 1;
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean3 = true;
      java.lang.String string4 = "`\\sIG5oZn,rxSB&>(";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_16_16() throws Exception{

      java.lang.String string0 = "a ";
      int int1 = 0;
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = true;
      java.lang.String string4 = ".\\a.txt";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_17_17() throws Exception{

      java.lang.String string0 = "[0,1]";
      int int1 = 820397066;
      java.lang.String string2 = " ";
      boolean boolean3 = false;
      java.lang.String string4 = "`MRnN{ut[As-cBHS:9A|X`x?L%;@Y{^\\\"w4J/AP";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_18_18() throws Exception{

      java.lang.String string0 = "1CO/6+fB6ePb2K,j1iG{";
      int int1 = 0;
      java.lang.String string2 = "{\"key\":2 }";
      boolean boolean3 = true;
      java.lang.String string4 = "";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_19_19() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      int int1 = -903053703;
      java.lang.String string2 = ".lkvmmYh]kl^z";
      boolean boolean3 = true;
      java.lang.String string4 = "{\"key\":2 }";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



  @Test(timeout = 5000)
  public void test_wrap_20_20() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      int int1 = -1;
      java.lang.String string2 = " #";
      boolean boolean3 = true;
      java.lang.String string4 = " #";
      org.apache.commons.lang3.text.WordUtils.wrap(string0, int1, string2, boolean3, string4);

  }



}