package com.google.javascript.jscomp.deps;

import org.junit.Test;

public class ModuleLoader_Test {

  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_1_1() throws Exception{

      java.lang.String string0 = "../";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_2_2() throws Exception{

      java.lang.String string0 = "./";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_3_3() throws Exception{

      java.lang.String string0 = "a";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_4_4() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_5_5() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_6_6() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_7_7() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_8_8() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_9_9() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_10_10() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_11_11() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_12_12() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_13_13() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_14_14() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_15_15() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_16_16() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_17_17() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_18_18() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_19_19() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isRelativeIdentifier_20_20() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleLoader.isRelativeIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_1_21() throws Exception{

      java.lang.String string0 = "/";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_2_22() throws Exception{

      java.lang.String string0 = "{";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_3_23() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_4_24() throws Exception{

      java.lang.String string0 = "<aiODAdR+qA{&7O&hzWo87]L!";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_5_25() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_6_26() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_7_27() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_8_28() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_9_29() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_10_30() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_11_31() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_12_32() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_13_33() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_14_34() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_15_35() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_16_36() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_17_37() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_18_38() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_19_39() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsoluteIdentifier_20_40() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleLoader.isAbsoluteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_1_41() throws Exception{

      java.lang.String string0 = "/";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_2_42() throws Exception{

      java.lang.String string0 = "M";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_3_43() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_4_44() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_5_45() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_6_46() throws Exception{

      java.lang.String string0 = "nltGyj/v}V";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_7_47() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_8_48() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_9_49() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_10_50() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_11_51() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_12_52() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_13_53() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_14_54() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_15_55() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_16_56() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_17_57() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_18_58() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_19_59() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isPathIdentifier_20_60() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.isPathIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_1_61() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = ".";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_2_62() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "7";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_3_63() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_4_64() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_5_65() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_6_66() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_7_67() throws Exception{

      java.lang.String string0 = "sFF*:]nlB*\\\"R:>+MW44A2j<>t8'";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_8_68() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_9_69() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_10_70() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_11_71() throws Exception{

      java.lang.String string0 = "|l}dKKxR*lM$\\j;WK\\|3,><f[W>tRsysho_{GI;c,3'R4";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_12_72() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_13_73() throws Exception{

      java.lang.String string0 = ")*pPV";
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_14_74() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_15_75() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_16_76() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_17_77() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_18_78() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_19_79() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_relativePathFrom_20_80() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleLoader.relativePathFrom(string0, string1);

  }



}