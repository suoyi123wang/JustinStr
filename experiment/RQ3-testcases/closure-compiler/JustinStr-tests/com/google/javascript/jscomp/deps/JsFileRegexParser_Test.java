package com.google.javascript.jscomp.deps;

import org.junit.Test;

public class JsFileRegexParser_Test {

  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_1_1() throws Exception{

      java.lang.String string1 = "@provideGoog";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_2_2() throws Exception{

      java.lang.String string1 = "@nocompile";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_3_3() throws Exception{

      java.lang.String string1 = "@externs";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_4_4() throws Exception{

      java.lang.String string1 = "S";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_5_5() throws Exception{

      java.lang.String string1 = "\\n";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_6_6() throws Exception{

      java.lang.String string1 = "y,G+h`\\\"rh:)dg2cw/>g)LN>jT2$H[OJ`cpY'Ti-V@zF[Q,";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_7_7() throws Exception{

      java.lang.String string1 = " ";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_8_8() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_9_9() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_10_10() throws Exception{

      java.lang.String string1 = " ";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_11_11() throws Exception{

      java.lang.String string1 = "\\n";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_12_12() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_13_13() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_14_14() throws Exception{

      java.lang.String string1 = "a ";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_15_15() throws Exception{

      java.lang.String string1 = "a ";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_16_16() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_17_17() throws Exception{

      java.lang.String string1 = "^5";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_18_18() throws Exception{

      java.lang.String string1 = " ";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_19_19() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseJsDocCommentLine_20_20() throws Exception{

      java.lang.String string1 = "MMS7Qpp\\\"B|/y~mEi~;/mZo/K%&4HGhi";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseJsDocCommentLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_1_21() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "declareModuleId";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_2_22() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = ";";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_3_23() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "require";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_4_24() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "provide";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_5_25() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "import";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_6_26() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "addDependency";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_7_27() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "export";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_8_28() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "goog.setTestOnly";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_9_29() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "p";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_10_30() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "goog.module.declareLegacyNamespace";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_11_31() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "module";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_12_32() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "goog.loadModule(function(";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_13_33() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_14_34() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_15_35() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_16_36() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_17_37() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.ErrorManager errorManager5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_18_38() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = " ";
      java.util.Set<java.util.HashSet> set4 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.SortingErrorManager(set4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_19_39() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = "<a> </a>";
      java.util.Set<java.util.HashSet> set3 = new java.util.HashSet<>();
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.SortingErrorManager(set3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



  @Test(timeout = 5000)
  public void test_parseLine_20_40() throws Exception,com.google.javascript.jscomp.deps.JsFileLineParser$ParseException{

      java.lang.String string1 = " #";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set5 = null;
      com.google.javascript.jscomp.ErrorManager errorManager4 = new com.google.javascript.jscomp.SortingErrorManager(set5);
      com.google.javascript.jscomp.ErrorManager errorManager3 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager4);
      com.google.javascript.jscomp.ErrorManager errorManager2 = new com.google.javascript.jscomp.ThreadSafeDelegatingErrorManager(errorManager3);
      com.google.javascript.jscomp.deps.JsFileRegexParser jsFileRegexParser0 = new com.google.javascript.jscomp.deps.JsFileRegexParser(errorManager2);
      jsFileRegexParser0.parseLine(string1);

  }



}