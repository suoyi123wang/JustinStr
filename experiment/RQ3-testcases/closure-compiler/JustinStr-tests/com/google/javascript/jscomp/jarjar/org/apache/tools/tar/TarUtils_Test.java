package com.google.javascript.jscomp.jarjar.org.apache.tools.tar;

import org.junit.Test;

public class TarUtils_Test {

  @Test(timeout = 5000)
  public void test_formatNameBytes_1_1() throws Exception,java.io.IOException{

      java.lang.String string0 = "h";
      byte[] byteArray1 = {};
      int int2 = 2147483647;
      int int3 = 0;
      java.nio.charset.Charset charset5 = new sun.nio.cs.US_ASCII();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_2_2() throws Exception,java.io.IOException{

      java.lang.String string0 = "";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = -1492400840;
      char[] charArray5 = {};
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.Simple8BitZipEncoding(charArray5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_3_3() throws Exception,java.io.IOException{

      java.lang.String string0 = " ";
      byte[] byteArray1 = {};
      int int2 = 1;
      int int3 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_4_4() throws Exception,java.io.IOException{

      java.lang.String string0 = "<a>Hello World</a>";
      byte[] byteArray1 = {};
      int int2 = 1988861842;
      int int3 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_5_5() throws Exception,java.io.IOException{

      java.lang.String string0 = "<a> </a>";
      byte[] byteArray1 = {};
      int int2 = 1;
      int int3 = -1;
      char[] charArray5 = {};
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.Simple8BitZipEncoding(charArray5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_6_6() throws Exception,java.io.IOException{

      java.lang.String string0 = "";
      byte[] byteArray1 = {};
      int int2 = 2147483647;
      int int3 = 710547882;
      char[] charArray5 = {};
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.Simple8BitZipEncoding(charArray5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_7_7() throws Exception,java.io.IOException{

      java.lang.String string0 = " ";
      byte[] byteArray1 = {};
      int int2 = 1;
      int int3 = 0;
      java.lang.String string5 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding(string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_8_8() throws Exception,java.io.IOException{

      java.lang.String string0 = "<a>Hello World</a>";
      byte[] byteArray1 = {};
      int int2 = 0;
      int int3 = 2147483647;
      java.lang.String string5 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding(string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_9_9() throws Exception,java.io.IOException{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = 1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_10_10() throws Exception,java.io.IOException{

      java.lang.String string0 = "<a> </a>";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = 1;
      java.nio.charset.Charset charset5 = new sun.nio.cs.US_ASCII();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_11_11() throws Exception,java.io.IOException{

      java.lang.String string0 = "{\"key\":null}";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = 0;
      java.nio.charset.Charset charset5 = new sun.nio.cs.US_ASCII();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_12_12() throws Exception,java.io.IOException{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      byte[] byteArray1 = {};
      int int2 = 1;
      int int3 = 1254502550;
      java.lang.String string5 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding(string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_13_13() throws Exception,java.io.IOException{

      java.lang.String string0 = " ";
      byte[] byteArray1 = {};
      int int2 = 1;
      int int3 = -1;
      java.nio.charset.Charset charset5 = new sun.nio.cs.US_ASCII();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_14_14() throws Exception,java.io.IOException{

      java.lang.String string0 = ".\\a.txt";
      byte[] byteArray1 = {};
      int int2 = 2147483647;
      int int3 = 2147483647;
      java.nio.charset.Charset charset5 = new sun.nio.cs.US_ASCII();
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.NioZipEncoding(charset5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_15_15() throws Exception,java.io.IOException{

      java.lang.String string0 = "[0,1]";
      byte[] byteArray1 = {};
      int int2 = 0;
      int int3 = -1;
      char[] charArray5 = {};
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.Simple8BitZipEncoding(charArray5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_16_16() throws Exception,java.io.IOException{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = -2147483648;
      java.lang.String string5 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding(string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_17_17() throws Exception,java.io.IOException{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      byte[] byteArray1 = {};
      int int2 = -2147483648;
      int int3 = -1;
      char[] charArray5 = {};
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.Simple8BitZipEncoding(charArray5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_18_18() throws Exception,java.io.IOException{

      java.lang.String string0 = "";
      byte[] byteArray1 = {};
      int int2 = 2147483647;
      int int3 = -1;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_19_19() throws Exception,java.io.IOException{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      int int2 = 2147483647;
      int int3 = 0;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



  @Test(timeout = 5000)
  public void test_formatNameBytes_20_20() throws Exception,java.io.IOException{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      int int2 = -1;
      int int3 = -2147483648;
      com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipEncoding zipEncoding4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.zip.FallbackZipEncoding();
      com.google.javascript.jscomp.jarjar.org.apache.tools.tar.TarUtils.formatNameBytes(string0, byteArray1, int2, int3, zipEncoding4);

  }



}