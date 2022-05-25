package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs;

import org.junit.Test;

public class Expand_Test {

  @Test(timeout = 5000)
  public void test_extractFile_1_1() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = ".\\a.txt";
      java.lang.String string10 = "\\n";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string11 = "^[1]([3-9])[0-9]{9}$";
      java.io.File file3 = new java.io.File(string11);
      java.io.InputStream inputStream17 = null;
      sun.net.www.http.HttpClient httpClient18 = null;
      sun.net.www.MessageHeader messageHeader19 = null;
      java.io.InputStream inputStream15 = new sun.net.www.http.ChunkedInputStream(inputStream17, httpClient18, messageHeader19);
      boolean boolean16 = false;
      java.io.InputStream inputStream14 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2InputStream(inputStream15, boolean16);
      java.io.Reader reader12 = new java.io.InputStreamReader(inputStream14);
      java.nio.charset.CharsetEncoder charsetEncoder13 = null;
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader12, charsetEncoder13);
      java.lang.String string5 = "k\\\\";
      long long20 = 1L;
      java.util.Date date6 = new java.sql.Timestamp(long20);
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.mappers.CutDirsMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_2_2() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "a ";
      java.io.File file2 = new java.io.File(string9);
      java.lang.String string11 = " ";
      java.lang.String string12 = "[0,1]";
      java.lang.String string13 = "";
      java.net.URI uRI10 = new java.net.URI(string11, string12, string13);
      java.io.File file3 = new java.io.File(uRI10);
      java.lang.String string16 = "/73)W,l02CH\\\"svqf&9S(9{\\\"XFBYA6>";
      java.net.URI uRI15 = new java.net.URI(string16);
      java.io.File file14 = new java.io.File(uRI15);
      java.io.InputStream inputStream4 = new java.io.FileInputStream(file14);
      java.lang.String string5 = "\\\\";
      long long17 = 9223372036854775807L;
      java.util.Date date6 = new java.sql.Time(long17);
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.mappers.CutDirsMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_3_3() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "{\"key\":null}";
      java.io.File file2 = new java.io.File(string9);
      java.lang.String string10 = "<a>Hello World</a>";
      java.io.File file3 = new java.io.File(string10);
      java.io.InputStream inputStream15 = null;
      java.io.Reader reader14 = new java.io.InputStreamReader(inputStream15);
      java.io.InputStream inputStream12 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader14);
      java.nio.charset.CharsetDecoder charsetDecoder13 = null;
      java.io.Reader reader11 = new java.io.InputStreamReader(inputStream12, charsetDecoder13);
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader11);
      java.lang.String string5 = "/";
      java.util.Date date6 = new java.sql.Date();
      boolean boolean7 = true;
      java.lang.String string16 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper(string16);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_4_4() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string10 = "{\"key\":2 }";
      java.lang.String string11 = ".\\a.txt";
      java.lang.String string12 = "";
      java.net.URI uRI9 = new java.net.URI(string10, string11, string12);
      java.io.File file2 = new java.io.File(uRI9);
      java.lang.String string13 = ".\\a.txt";
      java.lang.String string14 = "http://lcs.ios.ac.cn/";
      java.io.File file3 = new java.io.File(string13, string14);
      int int15 = -1;
      java.io.InputStream inputStream4 = new java.io.PipedInputStream(int15);
      java.lang.String string5 = "$/";
      long long16 = -9223372036854775808L;
      java.util.Date date6 = new java.util.Date(long16);
      boolean boolean7 = false;
      java.lang.String string17 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper(string17);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_5_5() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string11 = "http://lcs.ios.ac.cn/";
      java.io.File file9 = new java.io.File(string11);
      java.lang.String string10 = " #";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string12 = " #";
      java.lang.String string13 = "[0,1]";
      java.io.File file3 = new java.io.File(string12, string13);
      java.io.InputStream inputStream4 = new java.io.PipedInputStream();
      java.lang.String string5 = "&";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_6_6() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string12 = "<a>Hello World</a>";
      java.net.URI uRI11 = new java.net.URI(string12);
      java.io.File file9 = new java.io.File(uRI11);
      java.lang.String string10 = "<a>Hello World</a>";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string13 = "<a> </a>";
      java.lang.String string14 = "{\"key\":null}";
      java.io.File file3 = new java.io.File(string13, string14);
      java.lang.String string20 = "<a>Hello World</a>";
      java.lang.CharSequence charSequence19 = new java.lang.StringBuilder(string20);
      java.io.Reader reader17 = new com.google.javascript.jscomp.jarjar.com.google.common.io.CharSequenceReader(charSequence19);
      int int18 = -1;
      java.io.Reader reader15 = new java.io.BufferedReader(reader17, int18);
      java.nio.charset.CharsetEncoder charsetEncoder16 = null;
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader15, charsetEncoder16);
      java.lang.String string5 = "";
      long long21 = 9223372036854775807L;
      java.util.Date date6 = new java.sql.Date(long21);
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.GlobPatternMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_7_7() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "a ";
      java.lang.String string10 = "<a> </a>";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string13 = "http://lcs.ios.ac.cn/";
      java.lang.String string14 = "{\"key\":2 }";
      java.io.File file11 = new java.io.File(string13, string14);
      java.lang.String string12 = "<a> </a>";
      java.io.File file3 = new java.io.File(file11, string12);
      java.nio.channels.ReadableByteChannel readableByteChannel15 = null;
      java.io.InputStream inputStream4 = new sun.nio.ch.ChannelInputStream(readableByteChannel15);
      java.lang.String string5 = " #";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_8_8() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string10 = " #";
      java.lang.String string11 = ".\\a.txt";
      java.lang.String string12 = "{\"key\":null}";
      java.net.URI uRI9 = new java.net.URI(string10, string11, string12);
      java.io.File file2 = new java.io.File(uRI9);
      java.lang.String string13 = "<a>Hello World</a>";
      java.lang.String string14 = "<a>Hello World</a>";
      java.io.File file3 = new java.io.File(string13, string14);
      java.io.Reader reader20 = null;
      java.io.InputStream inputStream19 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader20);
      java.io.InputStream inputStream17 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2InputStream(inputStream19);
      java.lang.String string18 = "a ";
      java.io.Reader reader15 = new java.io.InputStreamReader(inputStream17, string18);
      java.nio.charset.Charset charset16 = null;
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader15, charset16);
      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.GlobPatternMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_9_9() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string11 = " ";
      java.io.File file9 = new java.io.File(string11);
      java.lang.String string10 = "'e*15$74G{/|7OF.}RF]T(tL?SQ0i?SZ";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string12 = " #";
      java.lang.String string13 = " ";
      java.io.File file3 = new java.io.File(string12, string13);
      byte[] byteArray14 = {};
      int int15 = -2147483648;
      int int16 = 0;
      java.io.InputStream inputStream4 = new java.io.ByteArrayInputStream(byteArray14, int15, int16);
      java.lang.String string5 = "<a> </a>";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FlatFileNameMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_10_10() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "{\"key\":null}";
      java.io.File file2 = new java.io.File(string9);
      java.lang.String string10 = "<a> </a>";
      java.io.File file3 = new java.io.File(string10);
      java.lang.String string12 = "<a> </a>";
      java.lang.String string13 = "\\n";
      java.io.File file11 = new java.io.File(string12, string13);
      java.io.InputStream inputStream4 = new java.io.FileInputStream(file11);
      java.lang.String string5 = ".\\a.txt";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.optional.ScriptMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_11_11() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string12 = ".\\a.txt";
      java.net.URI uRI11 = new java.net.URI(string12);
      java.io.File file9 = new java.io.File(uRI11);
      java.lang.String string10 = "[0,1]";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string13 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string14 = "";
      java.io.File file3 = new java.io.File(string13, string14);
      java.lang.String string17 = "\\n";
      java.io.Reader reader15 = new java.io.StringReader(string17);
      java.lang.String string16 = "\\n";
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader15, string16);
      java.lang.String string5 = "\\n";
      long long18 = 0L;
      java.util.Date date6 = new java.sql.Timestamp(long18);
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.GlobPatternMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_12_12() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string11 = "http://lcs.ios.ac.cn/";
      java.lang.String string12 = "[0,1]";
      java.io.File file9 = new java.io.File(string11, string12);
      java.lang.String string10 = " ";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string13 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file3 = new java.io.File(string13);
      java.util.Iterator iterator14 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResourceIterator();
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.com.google.common.io.MultiInputStream(iterator14);
      java.lang.String string5 = "\\n";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = false;
      java.lang.String string15 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper(string15);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_13_13() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string11 = "u~\\\":|tzW.B~vgcX^jY7O\\";
      java.io.File file9 = new java.io.File(string11);
      java.lang.String string10 = "<a> </a>";
      java.io.File file2 = new java.io.File(file9, string10);
      java.lang.String string12 = "http://lcs.ios.ac.cn/";
      java.io.File file3 = new java.io.File(string12);
      java.io.InputStream inputStream20 = null;
      java.io.Reader reader18 = new java.io.InputStreamReader(inputStream20);
      int int19 = -2147483648;
      java.io.Reader reader15 = new java.io.BufferedReader(reader18, int19);
      java.nio.charset.CharsetEncoder charsetEncoder16 = null;
      int int17 = -2147483648;
      java.io.InputStream inputStream13 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader15, charsetEncoder16, int17);
      boolean boolean14 = false;
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2InputStream(inputStream13, boolean14);
      java.lang.String string5 = "{\"key\":2 }";
      long long21 = -9223372036854775808L;
      java.util.Date date6 = new java.sql.Date(long21);
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.RegexpPatternMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_14_14() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "{\"key\":2 }";
      java.lang.String string10 = "a+j)g-0mVqnt4\\\"X1b_tX7U6~5A/YZ-L~:jHg|{E@-RlrV(";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string11 = "";
      java.io.File file3 = new java.io.File(string11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project13 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string15 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file14 = new java.io.File(string15);
      java.util.Iterator iterator12 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResourceIterator(project13, file14);
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.com.google.common.io.MultiInputStream(iterator12);
      java.lang.String string5 = " #";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_15_15() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = " ";
      java.lang.String string10 = " #";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string11 = "a ";
      java.io.File file3 = new java.io.File(string11);
      java.io.PipedInputStream pipedInputStream18 = null;
      java.io.PipedOutputStream pipedOutputStream16 = new java.io.PipedOutputStream(pipedInputStream18);
      int int17 = 2147483647;
      java.io.InputStream inputStream14 = new java.io.PipedInputStream(pipedOutputStream16, int17);
      java.lang.String string15 = " ";
      java.io.Reader reader12 = new java.io.InputStreamReader(inputStream14, string15);
      java.lang.String string13 = " #";
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader12, string13);
      java.lang.String string5 = " ";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_16_16() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string10 = "{\"key\":2 }";
      java.net.URI uRI9 = new java.net.URI(string10);
      java.io.File file2 = new java.io.File(uRI9);
      java.lang.String string12 = "";
      java.net.URI uRI11 = new java.net.URI(string12);
      java.io.File file3 = new java.io.File(uRI11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project14 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection resourceCollection13 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Resources(project14);
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatResourceInputStream(resourceCollection13);
      java.lang.String string5 = "{\"key\":2 }";
      java.util.Date date6 = new java.sql.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_17_17() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string10 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string11 = "<a> </a>";
      java.lang.String string12 = ".\\a.txt";
      java.net.URI uRI9 = new java.net.URI(string10, string11, string12);
      java.io.File file2 = new java.io.File(uRI9);
      java.lang.String string14 = "a ";
      java.lang.String string15 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string16 = "<a>Hello World</a>";
      java.net.URI uRI13 = new java.net.URI(string14, string15, string16);
      java.io.File file3 = new java.io.File(uRI13);
      java.io.PipedOutputStream pipedOutputStream17 = new java.io.PipedOutputStream();
      java.io.InputStream inputStream4 = new java.io.PipedInputStream(pipedOutputStream17);
      java.lang.String string5 = " ";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FlatFileNameMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_18_18() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "a ";
      java.lang.String string10 = "{\"key\":null}";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string12 = "[0,1]";
      java.net.URI uRI11 = new java.net.URI(string12);
      java.io.File file3 = new java.io.File(uRI11);
      int int18 = 0;
      java.io.InputStream inputStream16 = new java.io.PipedInputStream(int18);
      java.nio.charset.Charset charset17 = null;
      java.io.Reader reader15 = new java.io.InputStreamReader(inputStream16, charset17);
      java.io.InputStream inputStream13 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader15);
      java.io.InputStream inputStream14 = null;
      java.io.InputStream inputStream4 = new java.io.SequenceInputStream(inputStream13, inputStream14);
      java.lang.String string5 = "\\n";
      java.util.Date date6 = new java.sql.Date();
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.optional.ScriptMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_19_19() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "";
      java.lang.String string10 = "[0,1]";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string14 = " #";
      java.net.URI uRI13 = new java.net.URI(string14);
      java.io.File file11 = new java.io.File(uRI13);
      java.lang.String string12 = "<a>Hello World</a>";
      java.io.File file3 = new java.io.File(file11, string12);
      java.io.FileDescriptor fileDescriptor17 = new java.io.FileDescriptor();
      java.io.InputStream inputStream15 = new java.io.FileInputStream(fileDescriptor17);
      java.io.InputStream inputStream18 = null;
      java.io.InputStream inputStream19 = null;
      java.io.InputStream inputStream16 = new java.io.SequenceInputStream(inputStream18, inputStream19);
      java.io.InputStream inputStream4 = new java.io.SequenceInputStream(inputStream15, inputStream16);
      java.lang.String string5 = "a ";
      java.util.Date date6 = new java.util.Date();
      boolean boolean7 = true;
      java.lang.String string20 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper(string20);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Untar();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



  @Test(timeout = 5000)
  public void test_extractFile_20_20() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils fileUtils1 = null;
      java.lang.String string9 = "";
      java.lang.String string10 = "{\"key\":null}";
      java.io.File file2 = new java.io.File(string9, string10);
      java.lang.String string12 = "{\"key\":null}";
      java.lang.String string13 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string14 = " #";
      java.net.URI uRI11 = new java.net.URI(string12, string13, string14);
      java.io.File file3 = new java.io.File(uRI11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project15 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxInputStream(project15);
      java.lang.String string5 = ".\\a.txt";
      long long16 = 1L;
      java.util.Date date6 = new java.sql.Time(long16);
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper fileNameMapper8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand expand0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Expand();
      expand0.extractFile(fileUtils1, file2, file3, inputStream4, string5, date6, boolean7, fileNameMapper8);

  }



}