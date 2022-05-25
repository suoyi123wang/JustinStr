package com.google.javascript.jscomp.jarjar.com.google.common.io;

import org.junit.Test;

public class LittleEndianDataOutputStream_Test {

  @Test(timeout = 5000)
  public void test_writeChars_1_1() throws Exception,java.io.IOException{

      java.lang.String string1 = "t";
      int int3 = -2147483648;
      boolean boolean4 = true;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int3, boolean4);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_2_2() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      java.io.PipedInputStream pipedInputStream5 = null;
      java.io.PipedOutputStream pipedOutputStream4 = new java.io.PipedOutputStream(pipedInputStream5);
      java.io.PipedInputStream pipedInputStream3 = new java.io.PipedInputStream(pipedOutputStream4);
      java.io.OutputStream outputStream2 = new java.io.PipedOutputStream(pipedInputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_3_3() throws Exception,java.io.IOException{

      java.lang.String string1 = "{?pR+:\\\"v0dWkm`4LF-:jslFWks+FV=z";
      int int4 = -2147483648;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int4);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_4_4() throws Exception,java.io.IOException{

      java.lang.String string1 = "<a> </a>";
      int int3 = 0;
      java.io.OutputStream outputStream2 = new java.io.ByteArrayOutputStream(int3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_5_5() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      int int3 = 1;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_6_6() throws Exception,java.io.IOException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(string3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_7_7() throws Exception,java.io.IOException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string7 = "{\"key\":2 }";
      java.io.File file5 = new java.io.File(string7);
      boolean boolean6 = false;
      java.io.OutputStream outputStream3 = new java.io.FileOutputStream(file5, boolean6);
      java.io.OutputStream outputStream4 = null;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream3, outputStream4);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_8_8() throws Exception,java.io.IOException{

      java.lang.String string1 = "_ADx2RLp_h!V).Vs2?*I#7'w95ebcq:B_nM;Pq]sNu$";
      java.io.File file6 = null;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      java.io.File file4 = new java.io.File(file6, string7);
      java.lang.String string5 = "n1wLI7";
      java.io.File file3 = new java.io.File(file4, string5);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_9_9() throws Exception,java.io.IOException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.io.PipedInputStream pipedInputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LeadPipeInputStream();
      java.io.OutputStream outputStream2 = new java.io.PipedOutputStream(pipedInputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_10_10() throws Exception,java.io.IOException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.io.File file7 = null;
      boolean boolean8 = false;
      boolean boolean9 = false;
      java.io.OutputStream outputStream5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file7, boolean8, boolean9);
      java.io.OutputStream outputStream6 = null;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream5, outputStream6);
      java.io.OutputStream outputStream4 = null;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.TeeOutputStream(outputStream3, outputStream4);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_11_11() throws Exception,java.io.IOException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file4 = new java.io.File(string6);
      java.lang.String string5 = ".\\a.txt";
      java.io.File file3 = new java.io.File(file4, string5);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_12_12() throws Exception,java.io.IOException{

      java.lang.String string1 = " #";
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string8 = "{\"key\":null}";
      java.lang.String string9 = "{\"key\":2 }";
      java.net.URI uRI6 = new java.net.URI(string7, string8, string9);
      java.io.File file3 = new java.io.File(uRI6);
      boolean boolean4 = true;
      boolean boolean5 = true;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file3, boolean4, boolean5);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_13_13() throws Exception,java.io.IOException{

      java.lang.String string1 = "\\n";
      int int4 = 2147483647;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int4);
      java.io.OutputStream outputStream2 = new java.io.ObjectOutputStream(outputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_14_14() throws Exception,java.io.IOException{

      java.lang.String string1 = "\\n";
      int int4 = 0;
      java.io.PipedInputStream pipedInputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LeadPipeInputStream(int4);
      java.io.OutputStream outputStream2 = new java.io.PipedOutputStream(pipedInputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_15_15() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      java.io.File file7 = null;
      java.lang.String string8 = "{\"key\":2 }";
      java.io.File file4 = new java.io.File(file7, string8);
      boolean boolean5 = true;
      boolean boolean6 = false;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file4, boolean5, boolean6);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_16_16() throws Exception,java.io.IOException{

      java.lang.String string1 = "[0,1]";
      int int4 = -2147483648;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int4);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_17_17() throws Exception,java.io.IOException{

      java.lang.String string1 = "<a> </a>";
      int int3 = -2147483648;
      boolean boolean4 = false;
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.com.google.common.io.FileBackedOutputStream(int3, boolean4);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_18_18() throws Exception,java.io.IOException{

      java.lang.String string1 = " ";
      java.lang.String string5 = "lfE[u*G=lC~cjcje$E3@Nh?h])|D{UI-aE5hx";
      java.net.URI uRI4 = new java.net.URI(string5);
      java.io.File file3 = new java.io.File(uRI4);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_19_19() throws Exception,java.io.IOException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      boolean boolean5 = false;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxOutputStream(project4, boolean5);
      java.io.OutputStream outputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2OutputStream(outputStream3);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



  @Test(timeout = 5000)
  public void test_writeChars_20_20() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      java.lang.String string3 = " ";
      boolean boolean4 = false;
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(string3, boolean4);
      com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream littleEndianDataOutputStream0 = new com.google.javascript.jscomp.jarjar.com.google.common.io.LittleEndianDataOutputStream(outputStream2);
      littleEndianDataOutputStream0.writeChars(string1);

  }



}