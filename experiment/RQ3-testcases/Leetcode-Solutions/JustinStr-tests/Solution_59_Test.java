import org.junit.Test;

public class Solution_59_Test {

  @Test(timeout = 5000)
  public void test_isTransformable_1_1() throws Exception{

      java.lang.String string1 = "l";
      java.lang.String string2 = "x\u0000";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_2_2() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "\u0000";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_3_3() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_4_4() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "\\n";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_5_5() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = " #";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_6_6() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "<a>Hello World</a>";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_7_7() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "<a>Hello World</a>";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_8_8() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_9_9() throws Exception{

      java.lang.String string1 = "jEkH**4>.c''%Ifc,{XcD=)pxQ3vk90Wf?0h}";
      java.lang.String string2 = "{\"key\":2 }";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_10_10() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "a ";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_11_11() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_12_12() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "{\"key\":null}";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_13_13() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "<a>Hello World</a>";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_14_14() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = ".\\a.txt";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_15_15() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_16_16() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "l6Y@2c92o\\\"%j?D{ C+RipHM3{eY#F-S[{";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_17_17() throws Exception{

      java.lang.String string1 = "]I_/[[]YN}u\\vN'fNwDE6J(?";
      java.lang.String string2 = "8H.9p=dl2Ahe69.S;$SfF/]zF`>";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_18_18() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_19_19() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "{\"key\":null}";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_isTransformable_20_20() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "$(YPMs =lS7,}'#jCp]C64-_>:+m0@lP:@t\\8m";
      Solution_59 solution_590 = new Solution_59();
      solution_590.isTransformable(string1, string2);

  }



}