package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs;

import org.junit.Test;

public class Jar_Test {

  @Test(timeout = 5000)
  public void test_zipFile_1_1() throws Exception,java.io.IOException{

      int int7 = 1;
      java.io.InputStream inputStream1 = new java.io.PipedInputStream(int7);
      java.io.OutputStream outputStream13 = null;
      java.io.OutputStream outputStream11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream13);
      java.io.OutputStream outputStream12 = null;
      java.io.OutputStream outputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream11, outputStream12);
      int int10 = 1;
      java.io.OutputStream outputStream8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream9, int10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "/";
      long long4 = -9223372036854775808L;
      java.lang.String string14 = ".\\a.txt";
      java.io.File file5 = new java.io.File(string14);
      int int6 = 0;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_2_2() throws Exception,java.io.IOException{

      java.io.File[] fileArray7 = {};
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatFileInputStream(fileArray7);
      java.io.PipedOutputStream pipedOutputStream10 = new java.io.PipedOutputStream();
      int int11 = 1;
      java.io.PipedInputStream pipedInputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LeadPipeInputStream(pipedOutputStream10, int11);
      java.io.OutputStream outputStream8 = new java.io.PipedOutputStream(pipedInputStream9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "'";
      long long4 = -1L;
      java.lang.String string12 = "http://lcs.ios.ac.cn/";
      java.io.File file5 = new java.io.File(string12);
      int int6 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_3_3() throws Exception,java.io.IOException{

      byte[] byteArray7 = {};
      int int8 = -1;
      int int9 = 1;
      java.io.InputStream inputStream1 = new java.io.ByteArrayInputStream(byteArray7, int8, int9);
      java.io.OutputStream outputStream10 = new java.io.PipedOutputStream();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream10);
      java.lang.String string3 = "\\n";
      long long4 = -1L;
      java.lang.String string13 = "http://lcs.ios.ac.cn/";
      java.io.File file11 = new java.io.File(string13);
      java.lang.String string12 = "{\"key\":null}";
      java.io.File file5 = new java.io.File(file11, string12);
      int int6 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_4_4() throws Exception,java.io.IOException{

      java.lang.String string8 = "a ";
      java.lang.String string9 = " ";
      java.io.File file7 = new java.io.File(string8, string9);
      java.io.InputStream inputStream1 = new java.io.FileInputStream(file7);
      int int11 = 0;
      java.io.OutputStream outputStream10 = new java.io.ByteArrayOutputStream(int11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream10);
      java.lang.String string3 = " #";
      long long4 = 9223372036854775807L;
      java.lang.String string13 = "[0,1]";
      java.lang.String string14 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string15 = "\\n";
      java.net.URI uRI12 = new java.net.URI(string13, string14, string15);
      java.io.File file5 = new java.io.File(uRI12);
      int int6 = -2147483648;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_5_5() throws Exception,java.io.IOException{

      java.lang.String string7 = "\\n";
      java.io.InputStream inputStream1 = new java.io.FileInputStream(string7);
      int int9 = 1;
      java.io.OutputStream outputStream8 = new java.io.ByteArrayOutputStream(int9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      long long4 = 9223372036854775807L;
      java.lang.String string11 = "\\n";
      java.net.URI uRI10 = new java.net.URI(string11);
      java.io.File file5 = new java.io.File(uRI10);
      int int6 = -1991760884;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_6_6() throws Exception,java.io.IOException{

      java.lang.String string9 = ".\\a.txt";
      java.io.Reader reader7 = new java.io.StringReader(string9);
      java.nio.charset.CharsetEncoder charsetEncoder8 = null;
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader7, charsetEncoder8);
      java.lang.String string13 = " #";
      java.io.File file12 = new java.io.File(string13);
      java.io.OutputStream outputStream11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file12);
      java.io.OutputStream outputStream10 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream10);
      java.lang.String string3 = "[0,1]";
      long long4 = -9223372036854775808L;
      java.lang.String string16 = "a ";
      java.lang.String string17 = " ";
      java.io.File file14 = new java.io.File(string16, string17);
      java.lang.String string15 = "";
      java.io.File file5 = new java.io.File(file14, string15);
      int int6 = 0;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_7_7() throws Exception,java.io.IOException{

      java.io.FileDescriptor fileDescriptor7 = new java.io.FileDescriptor();
      java.io.InputStream inputStream1 = new java.io.FileInputStream(fileDescriptor7);
      java.io.OutputStream outputStream8 = new java.io.ByteArrayOutputStream();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "a ";
      long long4 = 1L;
      java.lang.String string12 = "[0,1]";
      java.lang.String string13 = "{\"key\":null}";
      java.lang.String string14 = "[0,1]";
      java.net.URI uRI11 = new java.net.URI(string12, string13, string14);
      java.io.File file9 = new java.io.File(uRI11);
      java.lang.String string10 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file5 = new java.io.File(file9, string10);
      int int6 = 2147483647;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_8_8() throws Exception,java.io.IOException{

      int int10 = 565397399;
      java.io.PipedInputStream pipedInputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LeadPipeInputStream(int10);
      java.io.PipedOutputStream pipedOutputStream7 = new java.io.PipedOutputStream(pipedInputStream9);
      int int8 = 1;
      java.io.InputStream inputStream1 = new java.io.PipedInputStream(pipedOutputStream7, int8);
      java.lang.String string12 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string13 = "N;3J20(?&Ck|0'z/4x-jbc9JhqG'ZD,5~MD[/%'";
      java.io.File file11 = new java.io.File(string12, string13);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file11);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      long long4 = -8768368582491210347L;
      java.lang.String string15 = "{\"key\":2 }";
      java.net.URI uRI14 = new java.net.URI(string15);
      java.io.File file5 = new java.io.File(uRI14);
      int int6 = 2147483647;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_9_9() throws Exception,java.io.IOException{

      java.lang.String string9 = "!hPOMvc cLd3=v3@ JJRqs";
      java.net.URI uRI8 = new java.net.URI(string9);
      java.io.File file7 = new java.io.File(uRI8);
      java.io.InputStream inputStream1 = new java.io.FileInputStream(file7);
      java.lang.String string14 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string15 = "{\"key\":null}";
      java.lang.String string16 = "a ";
      java.net.URI uRI13 = new java.net.URI(string14, string15, string16);
      java.io.File file11 = new java.io.File(uRI13);
      java.lang.String string12 = "";
      java.io.File file10 = new java.io.File(file11, string12);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file10);
      java.lang.String string3 = "[0,1]";
      long long4 = 9223372036854775807L;
      java.lang.String string17 = "http://lcs.ios.ac.cn/";
      java.lang.String string18 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file5 = new java.io.File(string17, string18);
      int int6 = 0;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_10_10() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project12 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.io.InputStream inputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxInputStream(project12);
      sun.net.www.http.HttpClient httpClient10 = null;
      sun.net.www.MessageHeader messageHeader11 = null;
      java.io.InputStream inputStream7 = new sun.net.www.http.ChunkedInputStream(inputStream9, httpClient10, messageHeader11);
      java.io.InputStream inputStream8 = null;
      java.io.InputStream inputStream1 = new java.io.SequenceInputStream(inputStream7, inputStream8);
      java.lang.String string14 = "{\"key\":null}";
      java.io.File file13 = new java.io.File(string14);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file13);
      java.lang.String string3 = "yBx\\\"Eyh6qE){.{Lt#\\\"6F0";
      long long4 = 1L;
      java.lang.String string17 = " k{kcDgpm/9m-v'lUVk~&awi?wu$&f^z";
      java.io.File file15 = new java.io.File(string17);
      java.lang.String string16 = "[0,1]";
      java.io.File file5 = new java.io.File(file15, string16);
      int int6 = -1762881178;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_11_11() throws Exception,java.io.IOException{

      java.io.PipedOutputStream pipedOutputStream11 = new java.io.PipedOutputStream();
      java.io.InputStream inputStream9 = new java.io.PipedInputStream(pipedOutputStream11);
      java.nio.charset.Charset charset10 = null;
      java.io.Reader reader7 = new java.io.InputStreamReader(inputStream9, charset10);
      java.lang.String string8 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader7, string8);
      java.io.FileDescriptor fileDescriptor13 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream12 = new java.io.FileOutputStream(fileDescriptor13);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream12);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      long long4 = 8056293687672651098L;
      java.lang.String string15 = "a ";
      java.lang.String string16 = "\\n";
      java.lang.String string17 = " ";
      java.net.URI uRI14 = new java.net.URI(string15, string16, string17);
      java.io.File file5 = new java.io.File(uRI14);
      int int6 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_12_12() throws Exception,java.io.IOException{

      java.nio.channels.ReadableByteChannel readableByteChannel8 = null;
      java.lang.String string9 = " ";
      java.util.Iterator iterator7 = new java.util.Scanner(readableByteChannel8, string9);
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.com.google.common.io.MultiInputStream(iterator7);
      java.lang.String string11 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file10 = new java.io.File(string11);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file10);
      java.lang.String string3 = "";
      long long4 = 0L;
      java.lang.String string12 = "a ";
      java.lang.String string13 = "YrT\\\"I#u\\tL?\\\"";
      java.io.File file5 = new java.io.File(string12, string13);
      int int6 = -2147483648;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_13_13() throws Exception,java.io.IOException{

      java.io.PipedInputStream pipedInputStream12 = null;
      java.io.PipedOutputStream pipedOutputStream10 = new java.io.PipedOutputStream(pipedInputStream12);
      int int11 = -2147483648;
      java.io.PipedInputStream pipedInputStream9 = new java.io.PipedInputStream(pipedOutputStream10, int11);
      java.io.PipedOutputStream pipedOutputStream7 = new java.io.PipedOutputStream(pipedInputStream9);
      int int8 = -2147483648;
      java.io.InputStream inputStream1 = new java.io.PipedInputStream(pipedOutputStream7, int8);
      java.lang.String string14 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string15 = "\\n";
      java.io.File file13 = new java.io.File(string14, string15);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file13);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      long long4 = -9223372036854775808L;
      java.lang.String string17 = "http://lcs.ios.ac.cn/";
      java.lang.String string18 = " ";
      java.lang.String string19 = "GNp5m:1|bs +!2KiAsb@8yG!\\\"_t";
      java.net.URI uRI16 = new java.net.URI(string17, string18, string19);
      java.io.File file5 = new java.io.File(uRI16);
      int int6 = 1684620663;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_14_14() throws Exception,java.io.IOException{

      java.nio.channels.ReadableByteChannel readableByteChannel7 = null;
      java.io.InputStream inputStream1 = new sun.nio.ch.ChannelInputStream(readableByteChannel7);
      java.io.FileDescriptor fileDescriptor9 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream8 = new java.io.FileOutputStream(fileDescriptor9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "<a> </a>";
      long long4 = -6113227052280238937L;
      java.lang.String string12 = "{\"key\":null}";
      java.lang.String string13 = "{\"key\":2 }";
      java.io.File file10 = new java.io.File(string12, string13);
      java.lang.String string11 = ".\\a.txt";
      java.io.File file5 = new java.io.File(file10, string11);
      int int6 = 2101997879;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_15_15() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection resourceCollection7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DirSet();
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatResourceInputStream(resourceCollection7);
      java.lang.String string9 = "<a> </a>";
      java.io.File file8 = new java.io.File(string9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file8);
      java.lang.String string3 = "rjXDq?bU_z;<Mv||Fz*";
      long long4 = 9223372036854775807L;
      java.lang.String string12 = "<a> </a>";
      java.io.File file10 = new java.io.File(string12);
      java.lang.String string11 = " #";
      java.io.File file5 = new java.io.File(file10, string11);
      int int6 = 0;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_16_16() throws Exception,java.io.IOException{

      java.io.File[] fileArray7 = {};
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatFileInputStream(fileArray7);
      java.lang.String string9 = "http://lcs.ios.ac.cn/";
      boolean boolean10 = false;
      java.io.OutputStream outputStream8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(string9, boolean10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      long long4 = 307839125626061940L;
      java.lang.String string15 = "http://lcs.ios.ac.cn/";
      java.io.File file13 = new java.io.File(string15);
      java.lang.String string14 = " ";
      java.io.File file11 = new java.io.File(file13, string14);
      java.lang.String string12 = "^[1]([3-9])[0-9]{9}$";
      java.io.File file5 = new java.io.File(file11, string12);
      int int6 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_17_17() throws Exception,java.io.IOException{

      java.lang.String string7 = "<a>Hello World</a>";
      java.io.InputStream inputStream1 = new java.io.FileInputStream(string7);
      java.lang.String string10 = "http://lcs.ios.ac.cn/";
      java.lang.String string11 = "{\"key\":null}";
      java.io.File file9 = new java.io.File(string10, string11);
      java.io.OutputStream outputStream8 = new java.io.FileOutputStream(file9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream8);
      java.lang.String string3 = ".\\a.txt";
      long long4 = -1L;
      java.lang.String string12 = " ";
      java.lang.String string13 = " #";
      java.io.File file5 = new java.io.File(string12, string13);
      int int6 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_18_18() throws Exception,java.io.IOException{

      java.io.File[] fileArray7 = {};
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatFileInputStream(fileArray7);
      java.lang.String string10 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string11 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string12 = "^[1]([3-9])[0-9]{9}$";
      java.net.URI uRI9 = new java.net.URI(string10, string11, string12);
      java.io.File file8 = new java.io.File(uRI9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file8);
      java.lang.String string3 = "{\"key\":2 }";
      long long4 = 9223372036854775807L;
      java.lang.String string15 = ".\\a.txt";
      java.io.File file13 = new java.io.File(string15);
      java.lang.String string14 = "http://lcs.ios.ac.cn/";
      java.io.File file5 = new java.io.File(file13, string14);
      int int6 = -2147483648;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Ear();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_19_19() throws Exception,java.io.IOException{

      java.io.PipedOutputStream pipedOutputStream9 = new java.io.PipedOutputStream();
      int int10 = -2147483648;
      java.io.InputStream inputStream8 = new java.io.PipedInputStream(pipedOutputStream9, int10);
      java.io.Reader reader7 = new jdk.internal.util.xml.impl.ReaderUTF8(inputStream8);
      java.io.InputStream inputStream1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader7);
      java.lang.String string12 = "";
      boolean boolean13 = true;
      java.io.OutputStream outputStream11 = new java.io.FileOutputStream(string12, boolean13);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(outputStream11);
      java.lang.String string3 = ".\\a.txt";
      long long4 = 0L;
      java.lang.String string16 = "<a> </a>";
      java.io.File file14 = new java.io.File(string16);
      java.lang.String string15 = "<a>Hello World</a>";
      java.io.File file5 = new java.io.File(file14, string15);
      int int6 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



  @Test(timeout = 5000)
  public void test_zipFile_20_20() throws Exception,java.io.IOException{

      java.lang.String string8 = "1q%OsL}>jX-J|P q|';E\\\"` 4lho:Hw ";
      java.lang.String string9 = " ";
      boolean boolean10 = false;
      java.util.Enumeration enumeration7 = new java.util.StringTokenizer(string8, string9, boolean10);
      java.io.InputStream inputStream1 = new java.io.SequenceInputStream(enumeration7);
      java.lang.String string12 = "<a> </a>";
      java.io.File file11 = new java.io.File(string12);
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream zipOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipOutputStream(file11);
      java.lang.String string3 = " #";
      long long4 = 1L;
      java.lang.String string13 = "";
      java.lang.String string14 = "\\n";
      java.io.File file5 = new java.io.File(string13, string14);
      int int6 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Jar jar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.War();
      jar0.zipFile(inputStream1, zipOutputStream2, string3, long4, file5, int6);

  }



}