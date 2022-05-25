package com.google.javascript.jscomp;

import org.junit.Test;

public class NodeUtil_Test {

  @Test(timeout = 5000)
  public void test_getStringNumberValue_1_1() throws Exception{

      java.lang.String string0 = "\u000B";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_2_2() throws Exception{

      java.lang.String string0 = "k";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_3_3() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_4_4() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_5_5() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_6_6() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_7_7() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_8_8() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_9_9() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_10_10() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_11_11() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_12_12() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_13_13() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_14_14() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_15_15() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_16_16() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_17_17() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_18_18() throws Exception{

      java.lang.String string0 = "E%8.;A6T1$Mv_xlVt";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_19_19() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringNumberValue_20_20() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringNumberValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_1_21() throws Exception{

      java.lang.String string0 = "\u000B";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_2_22() throws Exception{

      java.lang.String string0 = "#";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_3_23() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_4_24() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_5_25() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_6_26() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_7_27() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_8_28() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_9_29() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_10_30() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_11_31() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_12_32() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_13_33() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_14_34() throws Exception{

      java.lang.String string0 = ".{LQqE3";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_15_35() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_16_36() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_17_37() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_18_38() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_19_39() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_getStringBigIntValue_20_40() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getStringBigIntValue(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_1_41() throws Exception{

      java.lang.String string0 = "K";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_2_42() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_3_43() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_4_44() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_5_45() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_6_46() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_7_47() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_8_48() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_9_49() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_10_50() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_11_51() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_12_52() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_13_53() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_14_54() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_15_55() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_16_56() throws Exception{

      java.lang.String string0 = "tjLa=s=S7X&rn<cHF4mX1#$x(;!$5]&w]y7YZ?RE=?vBJhzKZ";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_17_57() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_18_58() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_19_59() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_trimJsWhiteSpace_20_60() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(string0);

  }



  @Test(timeout = 5000)
  public void test_newQName_1_61() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = ".";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_2_62() throws Exception{

      java.io.OutputStream outputStream8 = null;
      java.io.OutputStream outputStream5 = new java.io.FilterOutputStream(outputStream8);
      boolean boolean6 = true;
      java.lang.String string7 = " ";
      java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream5, boolean6, string7);
      int int4 = 2147483647;
      java.io.PrintStream printStream2 = new sun.net.www.http.ChunkedOutputStream(printStream3, int4);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_3_63() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_4_64() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_5_65() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_6_66() throws Exception{

      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_7_67() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_8_68() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_9_69() throws Exception{

      java.lang.String string5 = "\\n";
      java.io.OutputStream outputStream3 = new java.io.FileOutputStream(string5);
      boolean boolean4 = false;
      java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream3, boolean4);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_10_70() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_11_71() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_12_72() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_13_73() throws Exception{

      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_14_74() throws Exception{

      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.PrintStream printStream3 = new java.io.PrintStream(string5, string6);
      int int4 = -2147483648;
      java.io.PrintStream printStream2 = new sun.net.www.http.ChunkedOutputStream(printStream3, int4);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_15_75() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = ":^1D-6s=T7 |6S1QlB$$()>N%$`#I$;*?s,Jt";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_16_76() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_17_77() throws Exception{

      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string4 = "{\"key\":null}";
      java.io.PrintStream printStream2 = new java.io.PrintStream(string3, string4);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_18_78() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_19_79() throws Exception{

      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_newQName_20_80() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.newQName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_1_81() throws Exception{

      java.lang.String string0 = ".";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_2_82() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_3_83() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_4_84() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_5_85() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_6_86() throws Exception{

      java.lang.String string0 = "rhnD<.\\Vi+=upui_:V";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_7_87() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_8_88() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_9_89() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_10_90() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_11_91() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_12_92() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_13_93() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_14_94() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_15_95() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_16_96() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_17_97() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_18_98() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_19_99() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_getRootOfQualifiedName_20_100() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_1_101() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_2_102() throws Exception{

      java.lang.String string0 = "v";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_3_103() throws Exception{

      java.lang.String string0 = "U";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_4_104() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_5_105() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_6_106() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_7_107() throws Exception{

      java.lang.String string0 = "@[S&@$";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_8_108() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_9_109() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_10_110() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_11_111() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_12_112() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_13_113() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_14_114() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_15_115() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_16_116() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_17_117() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_18_118() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_19_119() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isLatin_20_120() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.isLatin(string0);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_1_121() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = ".";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_2_122() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "j";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_3_123() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "L $6}o;G%uR(1o?cy|`";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_4_124() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_5_125() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = " #";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_6_126() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_7_127() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_8_128() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_9_129() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_10_130() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_11_131() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_12_132() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_13_133() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_14_134() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_15_135() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_16_136() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_17_137() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_18_138() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_19_139() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



  @Test(timeout = 5000)
  public void test_isValidQualifiedName_20_140() throws Exception{

      com.google.javascript.jscomp.parsing.parser.FeatureSet featureSet0 = null;
      java.lang.String string1 = " ";
      com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(featureSet0, string1);

  }



}