package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util;

import org.junit.Test;

public class DOMElementWriter_Test {

  @Test(timeout = 5000)
  public void test_encodedata_1_1() throws Exception,java.io.IOException{

      java.lang.String string6 = "<a> </a>";
      java.lang.String string7 = "[0,1]";
      java.lang.String string8 = "{\"key\":2 }";
      java.net.URI uRI5 = new java.net.URI(string6, string7, string8);
      java.io.File file4 = new java.io.File(uRI5);
      java.io.Writer writer3 = new java.io.PrintWriter(file4);
      java.io.Writer writer1 = new java.io.BufferedWriter(writer3);
      java.lang.String string2 = "]]>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_2_2() throws Exception,java.io.IOException{

      int int4 = -1222940705;
      java.io.OutputStream outputStream3 = new java.io.ByteArrayOutputStream(int4);
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3);
      java.lang.String string2 = "r]]>";
      boolean boolean5 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean5);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_3_3() throws Exception,java.io.IOException{

      java.io.File file8 = null;
      java.lang.String string9 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file6 = new java.io.File(file8, string9);
      boolean boolean7 = false;
      java.io.OutputStream outputStream5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file6, boolean7);
      java.io.Writer writer3 = new java.io.PrintWriter(outputStream5);
      boolean boolean4 = false;
      java.io.Writer writer1 = new java.io.PrintWriter(writer3, boolean4);
      java.lang.String string2 = "^";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_4_4() throws Exception,java.io.IOException{

      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file3 = new java.io.File(string5);
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      java.io.Writer writer1 = new java.io.PrintWriter(file3, string4);
      java.lang.String string2 = "";
      boolean boolean6 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean6, dOMElementWriter$XmlNamespacePolicy7);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_5_5() throws Exception,java.io.IOException{

      java.io.OutputStream outputStream8 = null;
      java.nio.charset.Charset charset9 = null;
      java.io.Writer writer7 = new java.io.OutputStreamWriter(outputStream8, charset9);
      java.io.Writer writer5 = new java.io.BufferedWriter(writer7);
      boolean boolean6 = false;
      java.io.Writer writer3 = new java.io.PrintWriter(writer5, boolean6);
      int int4 = 0;
      java.io.Writer writer1 = new java.io.BufferedWriter(writer3, int4);
      java.lang.String string2 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_6_6() throws Exception,java.io.IOException{

      int int4 = 2147483647;
      java.io.OutputStream outputStream3 = new java.io.ByteArrayOutputStream(int4);
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3);
      java.lang.String string2 = "t";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_7_7() throws Exception,java.io.IOException{

      java.io.OutputStream outputStream3 = new java.io.PipedOutputStream();
      boolean boolean4 = false;
      java.io.Writer writer1 = new java.io.PrintWriter(outputStream3, boolean4);
      java.lang.String string2 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_8_8() throws Exception,java.io.IOException{

      java.lang.String string6 = "{\"key\":null}";
      boolean boolean7 = false;
      java.io.OutputStream outputStream5 = new java.io.FileOutputStream(string6, boolean7);
      java.io.OutputStream outputStream3 = new java.io.ObjectOutputStream(outputStream5);
      java.nio.charset.Charset charset4 = null;
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, charset4);
      java.lang.String string2 = "<a>Hello World</a>";
      boolean boolean8 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean8);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_9_9() throws Exception,java.io.IOException{

      java.lang.String string5 = "";
      boolean boolean6 = false;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(string5, boolean6);
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, string4);
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy8 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean7, dOMElementWriter$XmlNamespacePolicy8);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_10_10() throws Exception,java.io.IOException{

      java.io.Writer writer1 = new java.io.StringWriter();
      java.lang.String string2 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_11_11() throws Exception,java.io.IOException{

      java.lang.String string5 = "[0,1]";
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(string5);
      java.nio.charset.Charset charset4 = new sun.nio.cs.US_ASCII();
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, charset4);
      java.lang.String string2 = "a ";
      boolean boolean6 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean6, dOMElementWriter$XmlNamespacePolicy7);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_12_12() throws Exception,java.io.IOException{

      int int3 = 0;
      java.io.Writer writer1 = new java.io.StringWriter(int3);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_13_13() throws Exception,java.io.IOException{

      java.lang.String string7 = "[0,1]";
      java.io.File file5 = new java.io.File(string7);
      boolean boolean6 = true;
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file5, boolean6);
      java.lang.String string4 = "[0,1]";
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, string4);
      java.lang.String string2 = ".\\a.txt";
      boolean boolean8 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy9 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean8, dOMElementWriter$XmlNamespacePolicy9);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_14_14() throws Exception,java.io.IOException{

      int int3 = 1;
      java.io.Writer writer1 = new java.io.StringWriter(int3);
      java.lang.String string2 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_15_15() throws Exception,java.io.IOException{

      java.io.Writer writer4 = new java.io.StringWriter();
      boolean boolean5 = true;
      java.io.Writer writer3 = new java.io.PrintWriter(writer4, boolean5);
      java.io.Writer writer1 = new java.io.PrintWriter(writer3);
      java.lang.String string2 = "<a> </a>";
      boolean boolean6 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean6);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_16_16() throws Exception,java.io.IOException{

      java.lang.String string5 = "<a>Hello World</a>";
      boolean boolean6 = false;
      java.io.OutputStream outputStream3 = new java.io.FileOutputStream(string5, boolean6);
      java.nio.charset.Charset charset4 = null;
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, charset4);
      java.lang.String string2 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_17_17() throws Exception,java.io.IOException{

      java.lang.String string4 = "@b~ 2{1g=h:,";
      java.lang.String string5 = "\\n";
      java.io.File file3 = new java.io.File(string4, string5);
      java.io.Writer writer1 = new java.io.PrintWriter(file3);
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean6 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean6, dOMElementWriter$XmlNamespacePolicy7);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_18_18() throws Exception,java.io.IOException{

      java.lang.String string6 = "[0,1]";
      java.io.File file5 = new java.io.File(string6);
      java.io.Writer writer3 = new java.io.PrintWriter(file5);
      boolean boolean4 = false;
      java.io.Writer writer1 = new java.io.PrintWriter(writer3, boolean4);
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy8 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean7, dOMElementWriter$XmlNamespacePolicy8);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_19_19() throws Exception,java.io.IOException{

      java.lang.String string6 = " #";
      java.lang.String string7 = "{\"key\":2 }";
      java.io.Writer writer4 = new java.io.PrintWriter(string6, string7);
      boolean boolean5 = false;
      java.io.Writer writer3 = new java.io.PrintWriter(writer4, boolean5);
      java.io.Writer writer1 = new java.io.BufferedWriter(writer3);
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean8 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean8);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_encodedata_20_20() throws Exception,java.io.IOException{

      java.lang.String string6 = "";
      java.io.File file5 = new java.io.File(string6);
      java.io.OutputStream outputStream3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LazyFileOutputStream(file5);
      java.nio.charset.Charset charset4 = null;
      java.io.Writer writer1 = new java.io.OutputStreamWriter(outputStream3, charset4);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy8 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean7, dOMElementWriter$XmlNamespacePolicy8);
      dOMElementWriter0.encodedata(writer1, string2);

  }



  @Test(timeout = 5000)
  public void test_isReference_1_21() throws Exception{

      java.lang.String string1 = ";";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_2_22() throws Exception{

      java.lang.String string1 = "VV#";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_3_23() throws Exception{

      java.lang.String string1 = "#";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_4_24() throws Exception{

      java.lang.String string1 = "D&";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_5_25() throws Exception{

      java.lang.String string1 = "%x";
      boolean boolean2 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_6_26() throws Exception{

      java.lang.String string1 = "R\\Qx";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_7_27() throws Exception{

      java.lang.String string1 = "&";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_8_28() throws Exception{

      java.lang.String string1 = "J5x";
      boolean boolean2 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2, dOMElementWriter$XmlNamespacePolicy3);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_9_29() throws Exception{

      java.lang.String string1 = "w#";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_10_30() throws Exception{

      java.lang.String string1 = "q";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_11_31() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2, dOMElementWriter$XmlNamespacePolicy3);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_12_32() throws Exception{

      java.lang.String string1 = "{\r";
      boolean boolean2 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_13_33() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2, dOMElementWriter$XmlNamespacePolicy3);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_14_34() throws Exception{

      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_15_35() throws Exception{

      java.lang.String string1 = " ";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter.XmlNamespacePolicy dOMElementWriter$XmlNamespacePolicy3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2, dOMElementWriter$XmlNamespacePolicy3);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_16_36() throws Exception{

      java.lang.String string1 = "a ";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_17_37() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_18_38() throws Exception{

      java.lang.String string1 = "[0,1]";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_19_39() throws Exception{

      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter(boolean2);
      dOMElementWriter0.isReference(string1);

  }



  @Test(timeout = 5000)
  public void test_isReference_20_40() throws Exception{

      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter dOMElementWriter0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DOMElementWriter();
      dOMElementWriter0.isReference(string1);

  }



}