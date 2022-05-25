package com.google.javascript.jscomp.jarjar.org.kohsuke.args4j;

import org.junit.Test;

public class CmdLineParser_Test {

  @Test(timeout = 5000)
  public void test_isOption_1_1() throws Exception{

      java.lang.String string1 = "U";
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OwnedBySelector();
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_2_2() throws Exception{

      java.lang.String string1 = "-";
      java.lang.ClassLoader classLoader3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      java.lang.String string4 = "\\n";
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReflectWrapper(classLoader3, string4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_3_3() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string4 = " #";
      java.lang.Object object2 = new java.util.zip.ZipEntry(string4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_4_4() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.FilesMatch();
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_5_5() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      byte[] byteArray4 = {};
      java.lang.Object object2 = new sun.security.util.DerInputStream(byteArray4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_6_6() throws Exception{

      java.lang.String string1 = "[0,1]";
      int int4 = -1379558515;
      int int5 = 2147483647;
      java.net.InetAddress inetAddress6 = null;
      java.lang.Object object2 = new java.net.ServerSocket(int4, int5, inetAddress6);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_7_7() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = " #";
      java.lang.Object object2 = new sun.net.www.MimeEntry(string4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_8_8() throws Exception{

      java.lang.String string1 = "yi8YHFpV8@?CphfLgI8hnH3{V'yEC";
      java.lang.Object object2 = new com.google.javascript.jscomp.CodePrinter();
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_9_9() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSetCollection();
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_10_10() throws Exception{

      java.lang.String string1 = "";
      java.util.Set<com.google.javascript.jscomp.SortingErrorManager$ErrorReportGenerator> set6 = null;
      com.google.javascript.jscomp.ErrorManager errorManager5 = new com.google.javascript.jscomp.SortingErrorManager(set6);
      com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = new com.google.javascript.jscomp.Compiler(errorManager5);
      java.lang.Object object2 = new com.google.javascript.jscomp.CheckSuper(abstractCompiler4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_11_11() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.net.URL uRL8 = null;
      java.lang.String string9 = "{\"key\":null}";
      java.net.URL uRL6 = new java.net.URL(uRL8, string9);
      java.lang.String string7 = ".\\a.txt";
      java.net.URL uRL4 = new java.net.URL(uRL6, string7);
      java.lang.String string5 = "<a> </a>";
      java.lang.Object object2 = new sun.net.ProgressSource(uRL4, string5);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_12_12() throws Exception{

      java.lang.String string1 = "";
      byte byte4 = 1;
      java.lang.String string5 = "<a> </a>";
      sun.security.util.DerValue derValue3 = new sun.security.util.DerValue(byte4, string5);
      java.lang.Object object2 = new sun.security.x509.GeneralName(derValue3);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_13_13() throws Exception{

      java.lang.String string1 = "";
      byte[] byteArray4 = {};
      java.nio.charset.Charset charset6 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset6);
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarEntry(byteArray4, zipEncoding5);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_14_14() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.nio.charset.Charset charset3 = new sun.nio.cs.US_ASCII();
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset3);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_15_15() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.com.google.protobuf.GeneratedMessage generatedMessage3 = null;
      com.google.javascript.jscomp.jarjar.com.google.protobuf.GeneratedMessage generatedMessage6 = null;
      com.google.javascript.jscomp.jarjar.com.google.protobuf.GeneratedMessage.BuilderParent generatedMessage$BuilderParent7 = null;
      boolean boolean8 = false;
      com.google.javascript.jscomp.jarjar.com.google.protobuf.GeneratedMessage.BuilderParent generatedMessage$BuilderParent4 = new com.google.javascript.jscomp.jarjar.com.google.protobuf.SingleFieldBuilder(generatedMessage6, generatedMessage$BuilderParent7, boolean8);
      boolean boolean5 = true;
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.com.google.protobuf.SingleFieldBuilder(generatedMessage3, generatedMessage$BuilderParent4, boolean5);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_16_16() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string4 = "{\"key\":null}";
      java.lang.Object object2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.cvslib.CvsTagEntry(string4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_17_17() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      byte[] byteArray4 = {};
      java.lang.Object object2 = new sun.security.x509.UniqueIdentity(byteArray4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_18_18() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      javax.management.MBeanNotificationInfo[] mBeanNotificationInfoArray4 = {};
      java.lang.Object object2 = new javax.management.NotificationBroadcasterSupport(mBeanNotificationInfoArray4);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_19_19() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.parsing.parser.util.SourcePosition sourcePosition4 = null;
      com.google.javascript.jscomp.parsing.parser.util.SourcePosition sourcePosition5 = null;
      java.lang.String string6 = "http://lcs.ios.ac.cn/";
      java.lang.Object object2 = new com.google.javascript.rhino.NonJSDocComment(sourcePosition4, sourcePosition5, string6);
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.ParserProperties parserProperties3 = null;
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2, parserProperties3);
      cmdLineParser0.isOption(string1);

  }



  @Test(timeout = 5000)
  public void test_isOption_20_20() throws Exception{

      java.lang.String string1 = " ";
      java.lang.Object object2 = new java.util.BitSet();
      com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser cmdLineParser0 = new com.google.javascript.jscomp.jarjar.org.kohsuke.args4j.CmdLineParser(object2);
      cmdLineParser0.isOption(string1);

  }



}