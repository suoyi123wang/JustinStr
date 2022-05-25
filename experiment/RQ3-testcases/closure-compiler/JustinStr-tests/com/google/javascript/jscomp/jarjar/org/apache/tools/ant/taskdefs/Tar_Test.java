package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs;

import org.junit.Test;

public class Tar_Test {

  @Test(timeout = 5000)
  public void test_tarResource_1_1() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource();
      int int8 = 1;
      java.io.OutputStream outputStream5 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int8);
      int int6 = 2147483647;
      java.lang.String string7 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream5, int6, string7);
      java.lang.String string3 = "CajLrqI%z>g>ifUp)hI1wMCZLiC;Y~Z~;\t|4$@KMf*Q_9D\tR%\u000Bf\\&\\}P+f)E/fIe+D\u000B\r1uao*.L0ZL@|\u000BgmljwAViIVF__(=9h/1N";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_2_2() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string6 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.StringResource(project5, string6);
      java.io.OutputStream outputStream7 = new java.io.ByteArrayOutputStream();
      java.lang.String string8 = ";Bt1*'XuNbS)=\\t.C{p)hwiOg'";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, string8);
      java.lang.String string3 = "\u000BVAMZc/&VoekRC?3\n,.jw\\2oG>F3(\tf\"!#fp\"]\t+?iw4@P\f%\u000BYp:+\f^ z)@Snj:C]hh\t_EmL4z\t:,~8JUbXw.\r+P`Yxv4*K`acLX";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_3_3() throws Exception,java.io.IOException{

      java.lang.String string5 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.StringResource(string5);
      java.lang.String string9 = "{\"key\":null}";
      boolean boolean10 = false;
      java.io.OutputStream outputStream6 = new java.io.FileOutputStream(string9, boolean10);
      int int7 = 1;
      java.lang.String string8 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream6, int7, string8);
      java.lang.String string3 = "/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_4_4() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectComponent projectComponent5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Http();
      int int6 = -1183684908;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.LogOutputResource(projectComponent5, int6);
      java.io.OutputStream outputStream7 = new java.io.ByteArrayOutputStream();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7);
      java.lang.String string3 = "F\"n%@Vrq0(v&a6#zEXYHMEF~?e\nL\rB\"?RQp3Kq!+kdnR%Yb?/At.@gRrbT,|h!yR\"nJ\"\f?Gn(relITYN(GWWp)PJ6weipu\"Ch1v";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_5_5() throws Exception,java.io.IOException{

      java.lang.String string8 = "{\"key\":2 }";
      java.lang.String string9 = "";
      java.lang.String string10 = " #";
      java.net.URI uRI7 = new java.net.URI(string8, string9, string10);
      java.io.File file6 = new java.io.File(uRI7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLProvider uRLProvider5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(file6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(uRLProvider5);
      int int17 = 0;
      java.io.PipedInputStream pipedInputStream16 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LeadPipeInputStream(int17);
      java.io.OutputStream outputStream14 = new java.io.PipedOutputStream(pipedInputStream16);
      java.io.OutputStream outputStream15 = null;
      java.io.OutputStream outputStream11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream14, outputStream15);
      int int12 = -2027399534;
      int int13 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream11, int12, int13);
      java.lang.String string3 = ")";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_6_6() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.StringResource();
      java.io.OutputStream outputStream7 = new java.io.PipedOutputStream();
      java.io.OutputStream outputStream8 = null;
      java.io.OutputStream outputStream6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream7, outputStream8);
      java.io.OutputStream outputStream5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream5);
      java.lang.String string3 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_7_7() throws Exception,java.io.IOException{

      java.lang.String string6 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string7 = "\\n";
      java.io.File file5 = new java.io.File(string6, string7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(file5);
      java.lang.String string10 = " ";
      java.io.File file9 = new java.io.File(string10);
      java.io.OutputStream outputStream8 = new java.io.FileOutputStream(file9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream8);
      java.lang.String string3 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_8_8() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource();
      int int6 = -1790133981;
      java.io.OutputStream outputStream5 = new java.io.ByteArrayOutputStream(int6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream5);
      java.lang.String string3 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_9_9() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource();
      java.lang.String string8 = "{\"key\":2 }";
      java.lang.String string9 = " ";
      java.io.File file7 = new java.io.File(string8, string9);
      java.io.OutputStream outputStream5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file7);
      int int6 = -2147483648;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream5, int6);
      java.lang.String string3 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_10_10() throws Exception,java.io.IOException{

      java.lang.String string9 = "{\"key\":2 }";
      java.lang.String string10 = "";
      java.lang.String string11 = "{\"key\":2 }";
      java.net.URI uRI8 = new java.net.URI(string9, string10, string11);
      java.io.File file6 = new java.io.File(uRI8);
      java.lang.String string7 = "<a> </a>";
      java.io.File file5 = new java.io.File(file6, string7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(file5);
      java.io.OutputStream outputStream12 = new java.io.ByteArrayOutputStream();
      int int13 = -2147483648;
      int int14 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream12, int13, int14);
      java.lang.String string3 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_11_11() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLProvider uRLProvider5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(uRLProvider5);
      java.lang.String string10 = "<a>Hello World</a>";
      java.lang.String string11 = "\\n";
      java.io.File file8 = new java.io.File(string10, string11);
      boolean boolean9 = false;
      java.io.OutputStream outputStream6 = new java.io.FileOutputStream(file8, boolean9);
      java.lang.String string7 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream6, string7);
      java.lang.String string3 = "O.";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_12_12() throws Exception,java.io.IOException{

      java.lang.String string6 = "<a> </a>";
      java.io.File file5 = new java.io.File(string6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(file5);
      java.lang.String string10 = "{\"key\":null}";
      java.io.OutputStream outputStream7 = new java.io.FileOutputStream(string10);
      int int8 = 2147483647;
      java.lang.String string9 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, int8, string9);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_13_13() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string6 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.StringResource(project5, string6);
      java.lang.String string10 = "<a> </a>";
      java.io.File file9 = new java.io.File(string10);
      java.io.OutputStream outputStream7 = new java.io.FileOutputStream(file9);
      java.lang.String string8 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, string8);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_14_14() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string6 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.StringResource(project5, string6);
      java.io.FileDescriptor fileDescriptor9 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream7 = new java.io.FileOutputStream(fileDescriptor9);
      int int8 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, int8);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_15_15() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string6 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource(project5, string6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      boolean boolean10 = false;
      java.io.OutputStream outputStream7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxOutputStream(project9, boolean10);
      int int8 = 2147483647;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, int8);
      java.lang.String string3 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_16_16() throws Exception,java.io.IOException{

      java.lang.String string6 = " #";
      java.io.File file5 = new java.io.File(string6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource(file5);
      java.lang.String string10 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean11 = false;
      java.io.OutputStream outputStream7 = new java.io.FileOutputStream(string10, boolean11);
      int int8 = -1;
      int int9 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, int8, int9);
      java.lang.String string3 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_17_17() throws Exception,java.io.IOException{

      java.lang.String string8 = "{\"key\":2 }";
      java.io.File file6 = new java.io.File(string8);
      java.lang.String string7 = "<a> </a>";
      java.io.File file5 = new java.io.File(file6, string7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.URLResource(file5);
      java.io.FileDescriptor fileDescriptor12 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream11 = new java.io.FileOutputStream(fileDescriptor12);
      java.io.OutputStream outputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream11);
      java.lang.String string10 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream9, string10);
      java.lang.String string3 = ".:sUAAP`F}[h\\\"(z*L(-iccQG D$FFB#iZu!2E6mV3]scE";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_18_18() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string6 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource(project5, string6);
      java.lang.String string9 = "[0,1]";
      java.io.OutputStream outputStream7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(string9);
      java.lang.String string8 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream7, string8);
      java.lang.String string3 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_19_19() throws Exception,java.io.IOException{

      java.lang.String string10 = "a ";
      java.lang.String string11 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string12 = "a ";
      java.net.URI uRI9 = new java.net.URI(string10, string11, string12);
      java.io.File file7 = new java.io.File(uRI9);
      java.lang.String string8 = "^[1]([3-9])[0-9]{9}$";
      java.io.File file5 = new java.io.File(file7, string8);
      java.lang.String string6 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource(file5, string6);
      int int14 = 0;
      boolean boolean15 = false;
      java.io.OutputStream outputStream13 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int14, boolean15);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream13);
      java.lang.String string3 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



  @Test(timeout = 5000)
  public void test_tarResource_20_20() throws Exception,java.io.IOException{

      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string7 = "<a> </a>";
      java.lang.String string8 = " #";
      java.io.File file6 = new java.io.File(string7, string8);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource resource1 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource(project5, file6);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      boolean boolean12 = true;
      java.io.OutputStream outputStream9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxOutputStream(project11, boolean12);
      java.lang.String string10 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream tarOutputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarOutputStream(outputStream9, string10);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar.TarFileSet tar$TarFileSet4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar tar0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Tar();
      tar0.tarResource(resource1, tarOutputStream2, string3, tar$TarFileSet4);

  }



}