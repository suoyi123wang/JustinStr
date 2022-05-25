package com.google.javascript.jscomp.jarjar.org.apache.tools.mail;

import org.junit.Test;

public class SmtpResponseReader_Test {

  @Test(timeout = 5000)
  public void test_hasMoreLines_1_1() throws Exception{

      java.lang.String string1 = "U%2-";
      int int3 = 0;
      java.io.InputStream inputStream2 = new java.io.PipedInputStream(int3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_2_2() throws Exception{

      java.lang.String string1 = "\r\\!\f-";
      java.io.InputStream inputStream2 = new java.io.PipedInputStream();
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_3_3() throws Exception{

      java.lang.String string1 = "6l-";
      java.lang.String string6 = " ";
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean8 = false;
      java.util.Enumeration enumeration5 = new java.util.StringTokenizer(string6, string7, boolean8);
      java.io.InputStream inputStream3 = new java.io.SequenceInputStream(enumeration5);
      boolean boolean4 = true;
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2InputStream(inputStream3, boolean4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_4_4() throws Exception{

      java.lang.String string1 = "zm";
      java.nio.channels.ReadableByteChannel readableByteChannel7 = null;
      java.io.InputStream inputStream5 = new sun.nio.ch.ChannelInputStream(readableByteChannel7);
      java.io.InputStream inputStream6 = null;
      java.io.InputStream inputStream3 = new java.io.SequenceInputStream(inputStream5, inputStream6);
      java.io.InputStream inputStream4 = null;
      java.io.InputStream inputStream2 = new java.io.SequenceInputStream(inputStream3, inputStream4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_5_5() throws Exception{

      java.lang.String string1 = "!2b";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DemuxInputStream(project3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_6_6() throws Exception{

      java.lang.String string1 = "K;Sv";
      byte[] byteArray3 = {};
      java.io.InputStream inputStream2 = new java.io.ByteArrayInputStream(byteArray3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_7_7() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string4 = " #";
      java.io.File file3 = new java.io.File(string4);
      java.io.InputStream inputStream2 = new java.io.FileInputStream(file3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_8_8() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection resourceCollection3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource();
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatResourceInputStream(resourceCollection3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_9_9() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      java.io.File file3 = new java.io.File(string4);
      java.io.InputStream inputStream2 = new java.io.FileInputStream(file3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_10_10() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.io.Reader reader5 = null;
      java.nio.charset.Charset charset6 = null;
      java.io.InputStream inputStream4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader5, charset6);
      java.io.Reader reader3 = new java.io.InputStreamReader(inputStream4);
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_11_11() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection resourceCollection3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.MultiRootFileSet();
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ConcatResourceInputStream(resourceCollection3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_12_12() throws Exception{

      java.lang.String string1 = " #";
      java.io.PipedOutputStream pipedOutputStream7 = null;
      int int8 = 2147483647;
      java.io.InputStream inputStream5 = new java.io.PipedInputStream(pipedOutputStream7, int8);
      java.lang.String string6 = "<a>Hello World</a>";
      java.io.Reader reader3 = new java.io.InputStreamReader(inputStream5, string6);
      java.lang.String string4 = "[0,1]";
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3, string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_13_13() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.io.InputStream inputStream7 = null;
      sun.net.www.http.HttpClient httpClient8 = null;
      sun.net.www.MessageHeader messageHeader9 = null;
      java.io.InputStream inputStream5 = new sun.net.www.http.ChunkedInputStream(inputStream7, httpClient8, messageHeader9);
      char char6 = '￿';
      java.io.Reader reader3 = new jdk.internal.util.xml.impl.ReaderUTF16(inputStream5, char6);
      java.lang.String string4 = "{\"key\":null}";
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3, string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_14_14() throws Exception{

      java.lang.String string1 = "";
      java.io.PipedInputStream pipedInputStream5 = null;
      java.io.PipedOutputStream pipedOutputStream4 = new java.io.PipedOutputStream(pipedInputStream5);
      java.io.InputStream inputStream3 = new java.io.PipedInputStream(pipedOutputStream4);
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.bzip2.CBZip2InputStream(inputStream3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_15_15() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = " ";
      java.io.InputStream inputStream2 = new java.io.FileInputStream(string3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_16_16() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string3 = ".\\a.txt";
      java.io.InputStream inputStream2 = new java.io.FileInputStream(string3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_17_17() throws Exception{

      java.lang.String string1 = " #";
      java.io.PipedOutputStream pipedOutputStream3 = new java.io.PipedOutputStream();
      java.io.InputStream inputStream2 = new java.io.PipedInputStream(pipedOutputStream3);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_18_18() throws Exception{

      java.lang.String string1 = " ";
      java.io.InputStream inputStream6 = null;
      java.io.Reader reader5 = new java.io.InputStreamReader(inputStream6);
      java.io.Reader reader3 = new java.io.BufferedReader(reader5);
      java.lang.String string4 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3, string4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_19_19() throws Exception{

      java.lang.String string1 = " ";
      java.io.Reader reader6 = null;
      java.io.Reader reader5 = new java.io.BufferedReader(reader6);
      java.io.Reader reader3 = new java.io.BufferedReader(reader5);
      java.nio.charset.Charset charset4 = null;
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3, charset4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



  @Test(timeout = 5000)
  public void test_hasMoreLines_20_20() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.io.InputStream inputStream7 = null;
      java.io.Reader reader5 = new jdk.internal.util.xml.impl.ReaderUTF8(inputStream7);
      int int6 = -1;
      java.io.Reader reader3 = new java.io.BufferedReader(reader5, int6);
      java.nio.charset.Charset charset4 = null;
      java.io.InputStream inputStream2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ReaderInputStream(reader3, charset4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader smtpResponseReader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.mail.SmtpResponseReader(inputStream2);
      smtpResponseReader0.hasMoreLines(string1);

  }



}