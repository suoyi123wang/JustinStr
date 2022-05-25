package com.google.javascript.jscomp;

import org.junit.Test;

public class OptimizeCalls_Test {

  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_1_1() throws Exception{

      java.lang.String string5 = "a ";
      java.lang.String string6 = "a ";
      java.io.File file3 = new java.io.File(string5, string6);
      java.lang.String string4 = ",uz2?MYa*jHDjRK=~#a2y";
      java.io.PrintStream printStream2 = new java.io.PrintStream(file3, string4);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "inherits";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_2_2() throws Exception{

      java.net.URI uRI9 = null;
      java.io.File file6 = new java.io.File(uRI9);
      boolean boolean7 = false;
      boolean boolean8 = false;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file6, boolean7, boolean8);
      boolean boolean4 = false;
      java.lang.String string5 = "{\"key\":null}";
      java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream3, boolean4, string5);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "JSCompiler_renameProperty";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_3_3() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "'";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_4_4() throws Exception{

      java.lang.String string3 = "[0,1]";
      java.io.PrintStream printStream2 = new java.io.PrintStream(string3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "|";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_5_5() throws Exception{

      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "]";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_6_6() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "N";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_7_7() throws Exception{

      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "$jscomp$inherits";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_8_8() throws Exception{

      java.io.OutputStream outputStream3 = new java.io.PipedOutputStream();
      java.io.PrintStream printStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailPrintStream(outputStream3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "goog$inherits";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_9_9() throws Exception{

      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_10_10() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_11_11() throws Exception{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = null;
      boolean boolean6 = false;
      java.io.OutputStream outputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxOutputStream(project5, boolean6);
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream4);
      java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = " #";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_12_12() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_13_13() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_14_14() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_15_15() throws Exception{

      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_16_16() throws Exception{

      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "nOUA w_B1u]m_WGZ=N&a_C).VcuH1M)FwT-X{FH^B";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_17_17() throws Exception{

      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_18_18() throws Exception{

      java.lang.String string6 = "<a>Hello World</a>";
      java.lang.String string7 = "\\n";
      java.io.File file4 = new java.io.File(string6, string7);
      boolean boolean5 = false;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file4, boolean5);
      java.io.PrintStream printStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.MailPrintStream(outputStream3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(printStream2);
      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_19_19() throws Exception{

      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler();
      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



  @Test(timeout = 5000)
  public void test_mayBeOptimizableName_20_20() throws Exception{

      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = new com.google.javascript.jscomp.Compiler(errorManager2);
      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.OptimizeCalls.mayBeOptimizableName(abstractCompiler0, string1);

  }



}