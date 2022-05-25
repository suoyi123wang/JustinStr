package com.google.javascript.jscomp.deps;

import org.junit.Test;

public class DepsFileRegexParser_Test {

  @Test(timeout = 5000)
  public void test_parseLine_1_1() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "addDependency";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_2_2() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "c";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_3_3() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_4_4() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_5_5() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_6_6() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_7_7() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_8_8() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_9_9() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_10_10() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = ".\\a.txt";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_11_11() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "{\"key\":null}";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_12_12() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "a ";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_13_13() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_14_14() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a> </a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_15_15() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.jarjar.com.google.common.base.Function function2 = null;
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(function2, errorManager3);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_16_16() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_17_17() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a> </a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_18_18() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "{\"key\":2 }";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_19_19() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_20_20() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "[0,1]";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.DepsFileRegexParser depsFileRegexParser0 = new com.google.javascript.jscomp.deps.DepsFileRegexParser(errorManager2);
      depsFileRegexParser0.parseLine(string1);

  }



}