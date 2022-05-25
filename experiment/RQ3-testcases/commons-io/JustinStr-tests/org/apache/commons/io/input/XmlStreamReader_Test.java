package org.apache.commons.io.input;

import org.junit.Test;

public class XmlStreamReader_Test {

  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_1_1() throws Exception{

      String string0 = ";";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_2_2() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_3_3() throws Exception{

      String string0 = "<a> </a>";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_4_4() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_5_5() throws Exception{

      String string0 = " #";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_6_6() throws Exception{

      String string0 = "";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_7_7() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_8_8() throws Exception{

      String string0 = "a ";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_9_9() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_10_10() throws Exception{

      String string0 = "a ";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_11_11() throws Exception{

      String string0 = "{\"key\":2 }";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_12_12() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_13_13() throws Exception{

      String string0 = "<a>Hello World</a>";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_14_14() throws Exception{

      String string0 = " ";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_15_15() throws Exception{

      String string0 = " #";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_16_16() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_17_17() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_18_18() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_19_19() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeEncoding_20_20() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.getContentTypeEncoding(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_1_21() throws Exception{

      String string0 = "b;";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_2_22() throws Exception{

      String string0 = ";";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_3_23() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_4_24() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_5_25() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_6_26() throws Exception{

      String string0 = " #";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_7_27() throws Exception{

      String string0 = "";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_8_28() throws Exception{

      String string0 = "\\n";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_9_29() throws Exception{

      String string0 = "";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_10_30() throws Exception{

      String string0 = "[0,1]";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_11_31() throws Exception{

      String string0 = " ";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_12_32() throws Exception{

      String string0 = " ";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_13_33() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_14_34() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_15_35() throws Exception{

      String string0 = " ";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_16_36() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_17_37() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_18_38() throws Exception{

      String string0 = "a ";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_19_39() throws Exception{

      String string0 = "a ";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_getContentTypeMime_20_40() throws Exception{

      String string0 = "<a> </a>";
      XmlStreamReader.getContentTypeMime(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_1_41() throws Exception{

      String string0 = "application/xml-external-parsed-entity";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_2_42() throws Exception{

      String string0 = "+xml";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_3_43() throws Exception{

      String string0 = "application/";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_4_44() throws Exception{

      String string0 = "b";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_5_45() throws Exception{

      String string0 = "application/xml";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_6_46() throws Exception{

      String string0 = "B";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_7_47() throws Exception{

      String string0 = "W";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_8_48() throws Exception{

      String string0 = "application/xml-dtd";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_9_49() throws Exception{

      String string0 = "1";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_10_50() throws Exception{

      String string0 = " #";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_11_51() throws Exception{

      String string0 = "[0,1]";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_12_52() throws Exception{

      String string0 = "a ";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_13_53() throws Exception{

      String string0 = "";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_14_54() throws Exception{

      String string0 = "";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_15_55() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_16_56() throws Exception{

      String string0 = "[0,1]";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_17_57() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_18_58() throws Exception{

      String string0 = " #";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_19_59() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isAppXml_20_60() throws Exception{

      String string0 = "{\"key\":2 }";
      XmlStreamReader.isAppXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_1_61() throws Exception{

      String string0 = "text/";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_2_62() throws Exception{

      String string0 = "+xml";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_3_63() throws Exception{

      String string0 = "text/xml";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_4_64() throws Exception{

      String string0 = "text/xml-external-parsed-entity";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_5_65() throws Exception{

      String string0 = "X";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_6_66() throws Exception{

      String string0 = ">";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_7_67() throws Exception{

      String string0 = "D";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_8_68() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_9_69() throws Exception{

      String string0 = "{\"key\":2 }";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_10_70() throws Exception{

      String string0 = "akG=sx\\";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_11_71() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_12_72() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_13_73() throws Exception{

      String string0 = "[0,1]";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_14_74() throws Exception{

      String string0 = "{\"key\":2 }";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_15_75() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_16_76() throws Exception{

      String string0 = ".\\a.txt";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_17_77() throws Exception{

      String string0 = "";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_18_78() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_19_79() throws Exception{

      String string0 = "{\"key\":null}";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_isTextXml_20_80() throws Exception{

      String string0 = "<a> </a>";
      XmlStreamReader.isTextXml(string0);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_1_81() throws Exception,java.io.IOException{

      String string1 = ".\\a.txt";
      String string2 = "UTF-16";
      String string3 = "<a> </a>";
      String string4 = "";
      boolean boolean5 = false;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = " #";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_2_82() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "UTF-32";
      String string3 = "a ";
      String string4 = "http://lcs.ios.ac.cn/";
      boolean boolean5 = true;
      String string7 = "^[1]([3-9])[0-9]{9}$";
      java.net.URL uRL6 = new java.net.URL(string7);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRL6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_3_83() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = "E";
      String string3 = "a ";
      String string4 = "\\n";
      boolean boolean5 = false;
      java.io.InputStream inputStream6 = new DemuxInputStream();
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_4_84() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = "<a> </a>";
      String string3 = "{\"key\":2 }";
      String string4 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean5 = false;
      java.io.InputStream inputStream12 = null;
      java.io.InputStream inputStream10 = new BoundedInputStream(inputStream12);
      int int11 = -331664664;
      java.io.InputStream inputStream9 = new ReadAheadInputStream(inputStream10, int11);
      java.io.InputStream inputStream6 = new java.io.ObjectInputStream(inputStream9);
      boolean boolean7 = false;
      String string8 = "a ";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, boolean7, string8);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_5_85() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string3 = "^[1]([3-9])[0-9]{9}$";
      String string4 = "\\n";
      boolean boolean5 = false;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = "^Hac[0(kD{x>yeQ%Ev44AF.M%yu0`=P:!bso";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_6_86() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "\\n";
      String string3 = "[0,1]";
      String string4 = ".\\a.txt";
      boolean boolean5 = false;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = ".\\a.txt";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_7_87() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      String string2 = ".\\a.txt";
      String string3 = " #";
      String string4 = "a ";
      boolean boolean5 = true;
      java.util.concurrent.BlockingQueue<Integer> blockingQueue11 = null;
      java.io.InputStream inputStream9 = new QueueInputStream(blockingQueue11);
      boolean boolean10 = false;
      java.io.InputStream inputStream7 = new WindowsLineEndingInputStream(inputStream9, boolean10);
      int int8 = 0;
      java.io.InputStream inputStream6 = new org.apache.commons.io.input.buffer.CircularBufferInputStream(inputStream7, int8);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_8_88() throws Exception,java.io.IOException{

      String string1 = "";
      String string2 = "{\"key\":null}";
      String string3 = "a ";
      String string4 = ".\\a.txt";
      boolean boolean5 = false;
      String string12 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string13 = "";
      java.io.File file10 = new java.io.File(string12, string13);
      String string11 = "{\"key\":null}";
      java.io.RandomAccessFile randomAccessFile9 = new java.io.RandomAccessFile(file10, string11);
      java.io.InputStream inputStream6 = new RandomAccessFileInputStream(randomAccessFile9);
      String string7 = "a ";
      boolean boolean8 = true;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, string7, boolean8);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_9_89() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = "O;rw2&Jf|Ro/I6&y9-5s";
      String string3 = " #";
      String string4 = " ";
      boolean boolean5 = false;
      java.util.Set<String> set9 = new java.util.LinkedHashSet<>();
      java.util.Enumeration enumeration10 = null;
      java.util.Enumeration enumeration8 = new sun.util.ResourceBundleEnumeration(set9, enumeration10);
      java.io.InputStream inputStream6 = new java.io.SequenceInputStream(enumeration8);
      boolean boolean7 = true;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, boolean7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_10_90() throws Exception,java.io.IOException{

      String string1 = ".\\a.txt";
      String string2 = "<a>Hello World</a>";
      String string3 = ".\\a.txt";
      String string4 = "{\"key\":null}";
      boolean boolean5 = false;
      java.io.InputStream inputStream13 = null;
      int int14 = 2147483647;
      java.io.InputStream inputStream10 = new ReadAheadInputStream(inputStream13, int14);
      boolean boolean11 = true;
      String string12 = "{\"key\":2 }";
      java.io.Reader reader7 = new XmlStreamReader(inputStream10, boolean11, string12);
      java.nio.charset.Charset charset8 = null;
      int int9 = -1228035198;
      java.io.InputStream inputStream6 = new ReaderInputStream(reader7, charset8, int9);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_11_91() throws Exception,java.io.IOException{

      String string1 = "{\"key\":null}";
      String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string3 = "[0,1]";
      String string4 = "<a>Hello World</a>";
      boolean boolean5 = true;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = "<a> </a>";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_12_92() throws Exception,java.io.IOException{

      String string1 = " #";
      String string2 = ".\\a.txt";
      String string3 = "\\n";
      String string4 = "<a>Hello World</a>";
      boolean boolean5 = true;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = "<a> </a>";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_13_93() throws Exception,java.io.IOException{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      String string2 = "^[1]([3-9])[0-9]{9}$";
      String string3 = "a ";
      String string4 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean5 = false;
      java.util.concurrent.BlockingQueue<Integer> blockingQueue9 = new java.util.concurrent.SynchronousQueue<>();
      java.io.InputStream inputStream6 = new QueueInputStream(blockingQueue9);
      String string7 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean8 = false;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, string7, boolean8);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_14_94() throws Exception,java.io.IOException{

      String string1 = "{\"key\":null}";
      String string2 = "\\n";
      String string3 = "{\"key\":2 }";
      String string4 = "{\"key\":2 }";
      boolean boolean5 = false;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = "{\"key\":2 }";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_15_95() throws Exception,java.io.IOException{

      String string1 = ".\\a.txt";
      String string2 = " #";
      String string3 = "({=m*o:$3}K?8M(FZeU'cOwX=iAd\\owoc'4}B5Lt'U";
      String string4 = "[0,1]";
      boolean boolean5 = false;
      long long8 = -1L;
      java.io.InputStream inputStream6 = new NullInputStream(long8);
      boolean boolean7 = false;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, boolean7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_16_96() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = " #";
      String string3 = " #";
      String string4 = "<a>Hello World</a>";
      boolean boolean5 = false;
      java.io.InputStream inputStream7 = new ClosedInputStream();
      java.net.URL uRL10 = null;
      String string11 = "{\"key\":null}";
      int int12 = 0;
      sun.net.www.http.HttpClient httpClient8 = new sun.net.www.http.HttpClient(uRL10, string11, int12);
      sun.net.www.MessageHeader messageHeader9 = null;
      java.io.InputStream inputStream6 = new sun.net.www.http.ChunkedInputStream(inputStream7, httpClient8, messageHeader9);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_17_97() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "";
      String string3 = "\\n";
      String string4 = " #";
      boolean boolean5 = true;
      java.net.URLConnection uRLConnection6 = null;
      String string7 = " #";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection6, string7);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_18_98() throws Exception,java.io.IOException{

      String string1 = "<a> </a>";
      String string2 = "^[1]([3-9])[0-9]{9}$";
      String string3 = "^[1]([3-9])[0-9]{9}$";
      String string4 = "<a>Hello World</a>";
      boolean boolean5 = true;
      java.io.InputStream inputStream6 = new DemuxInputStream();
      boolean boolean7 = false;
      String string8 = "<a>Hello World</a>";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6, boolean7, string8);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_19_99() throws Exception,java.io.IOException{

      String string1 = "{\"key\":null}";
      String string2 = "http://lcs.ios.ac.cn/";
      String string3 = " #";
      String string4 = " #";
      boolean boolean5 = false;
      byte[] byteArray7 = {};
      java.io.InputStream inputStream6 = new java.io.ByteArrayInputStream(byteArray7);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateHttpEncoding_20_100() throws Exception,java.io.IOException{

      String string1 = "\\n";
      String string2 = "a ";
      String string3 = ".\\a.txt";
      String string4 = " #";
      boolean boolean5 = true;
      java.net.URL uRL11 = null;
      String string12 = "\\n";
      java.net.URL uRL9 = new java.net.URL(uRL11, string12);
      String string10 = "^[1]([3-9])[0-9]{9}$";
      java.net.URL uRL7 = new java.net.URL(uRL9, string10);
      String string8 = ".\\a.txt";
      java.net.URL uRL6 = new java.net.URL(uRL7, string8);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRL6);
      xmlStreamReader0.calculateHttpEncoding(string1, string2, string3, string4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_1_101() throws Exception,java.io.IOException{

      String string1 = "UTF-16LE";
      String string2 = "UTF-16LE";
      String string3 = "^";
      java.io.InputStream inputStream8 = null;
      java.io.InputStream inputStream7 = new org.apache.commons.io.input.buffer.CircularBufferInputStream(inputStream8);
      java.io.InputStream inputStream5 = new java.io.ObjectInputStream(inputStream7);
      int int6 = 2147483647;
      java.io.InputStream inputStream4 = new org.apache.commons.io.input.buffer.CircularBufferInputStream(inputStream5, int6);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_2_102() throws Exception,java.io.IOException{

      String string1 = "UTF-32LE";
      String string2 = "#";
      String string3 = "UTF-8";
      String string8 = "^[1]([3-9])[0-9]{9}$";
      String string9 = "<a> </a>";
      java.io.RandomAccessFile randomAccessFile6 = new java.io.RandomAccessFile(string8, string9);
      boolean boolean7 = false;
      java.io.InputStream inputStream4 = new RandomAccessFileInputStream(randomAccessFile6, boolean7);
      String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_3_103() throws Exception,java.io.IOException{

      String string1 = "^";
      String string2 = "UTF-16BE";
      String string3 = "M";
      java.io.InputStream inputStream7 = new DemuxInputStream();
      java.io.InputStream inputStream4 = new java.io.ObjectInputStream(inputStream7);
      String string5 = "http://lcs.ios.ac.cn/";
      boolean boolean6 = true;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5, boolean6);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_4_104() throws Exception,java.io.IOException{

      String string1 = "0";
      String string2 = "UTF-8";
      String string3 = "UTF-16";
      String string5 = "^[1]([3-9])[0-9]{9}$";
      java.io.File file4 = new java.io.File(string5);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(file4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_5_105() throws Exception,java.io.IOException{

      String string1 = "UTF-32BE";
      String string2 = "}";
      String string3 = "UTF-32";
      java.nio.file.Path path7 = null;
      int int8 = 0;
      java.io.InputStream inputStream4 = new BufferedFileChannelInputStream(path7, int8);
      String string5 = "\\n";
      boolean boolean6 = false;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5, boolean6);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_6_106() throws Exception,java.io.IOException{

      String string1 = "UTF-8";
      String string2 = "$";
      String string3 = "!";
      String string8 = "[0,1]";
      String string9 = " ";
      String string10 = "^[1]([3-9])[0-9]{9}$";
      java.net.URL uRL5 = new java.net.URL(string8, string9, string10);
      String string6 = "[0,1]";
      java.net.URLStreamHandler uRLStreamHandler7 = null;
      java.net.URL uRL4 = new java.net.URL(uRL5, string6, uRLStreamHandler7);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRL4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_7_107() throws Exception,java.io.IOException{

      String string1 = "$";
      String string2 = "<a> </a>";
      String string3 = "\\n";
      java.nio.file.Path path9 = null;
      java.io.Reader reader7 = new XmlStreamReader(path9);
      String string8 = ",krJ|ddX__2QKjtz,f`U#t0`{-P$vTps!:j0[< \\Wf0";
      java.io.InputStream inputStream4 = new ReaderInputStream(reader7, string8);
      String string5 = " #";
      boolean boolean6 = true;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5, boolean6);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_8_108() throws Exception,java.io.IOException{

      String string1 = "UTF-16BE";
      String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string3 = "";
      String string6 = "\\n";
      java.io.InputStream inputStream5 = new java.io.FileInputStream(string6);
      java.io.InputStream inputStream4 = new BoundedInputStream(inputStream5);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_9_109() throws Exception,java.io.IOException{

      String string1 = "v";
      String string2 = "{\"key\":2 }";
      String string3 = "";
      java.util.concurrent.BlockingQueue<Integer> blockingQueue7 = new java.util.concurrent.SynchronousQueue<>();
      java.io.InputStream inputStream4 = new QueueInputStream(blockingQueue7);
      String string5 = " #";
      boolean boolean6 = false;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5, boolean6);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_10_110() throws Exception,java.io.IOException{

      String string1 = ".";
      String string2 = "{\"key\":null}";
      String string3 = "{\"key\":2 }";
      String string9 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Throwable throwable10 = null;
      java.io.IOException iOException8 = new java.io.IOException(string9, throwable10);
      java.io.Reader reader5 = new BrokenReader(iOException8);
      java.nio.charset.CharsetEncoder charsetEncoder6 = null;
      int int7 = -1;
      java.io.InputStream inputStream4 = new ReaderInputStream(reader5, charsetEncoder6, int7);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_11_111() throws Exception,java.io.IOException{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string2 = "<a> </a>";
      String string3 = "^[1]([3-9])[0-9]{9}$";
      java.io.File file12 = null;
      int int13 = 1794707437;
      java.io.InputStream inputStream9 = new BufferedFileChannelInputStream(file12, int13);
      boolean boolean10 = true;
      String string11 = "a ";
      java.io.Reader reader6 = new XmlStreamReader(inputStream9, boolean10, string11);
      java.nio.charset.CharsetEncoder charsetEncoder7 = null;
      int int8 = 0;
      java.io.InputStream inputStream4 = new ReaderInputStream(reader6, charsetEncoder7, int8);
      String string5 = "";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_12_112() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "[0,1]";
      String string3 = "<a> </a>";
      byte[] byteArray8 = {};
      int int9 = -2147483648;
      java.io.InputStream inputStream7 = new UnsynchronizedByteArrayInputStream(byteArray8, int9);
      java.io.Reader reader5 = new XmlStreamReader(inputStream7);
      java.nio.charset.CharsetEncoder charsetEncoder6 = null;
      java.io.InputStream inputStream4 = new ReaderInputStream(reader5, charsetEncoder6);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_13_113() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string3 = "a ";
      byte[] byteArray6 = {};
      int int7 = -1;
      int int8 = 2147483647;
      java.io.InputStream inputStream4 = new java.io.ByteArrayInputStream(byteArray6, int7, int8);
      boolean boolean5 = true;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, boolean5);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_14_114() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      String string2 = "[0,1]";
      String string3 = "N5WYK,";
      java.nio.file.Path path4 = null;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(path4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_15_115() throws Exception,java.io.IOException{

      String string1 = "X!VTRn4v.9sC*E=| =-Yow2F>>?JW^8Ow~[R$n.ia?-";
      String string2 = "<a> </a>";
      String string3 = "<a> </a>";
      byte[] byteArray5 = {};
      int int6 = -2147483648;
      int int7 = 1715350606;
      java.io.InputStream inputStream4 = new java.io.ByteArrayInputStream(byteArray5, int6, int7);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_16_116() throws Exception,java.io.IOException{

      String string1 = "\\n";
      String string2 = "[0,1]";
      String string3 = "a ";
      java.nio.file.Path path5 = null;
      java.io.InputStream inputStream4 = new BufferedFileChannelInputStream(path5);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_17_117() throws Exception,java.io.IOException{

      String string1 = "\\n";
      String string2 = "^[1]([3-9])[0-9]{9}$";
      String string3 = "^[1]([3-9])[0-9]{9}$";
      java.io.FileDescriptor fileDescriptor7 = new java.io.FileDescriptor();
      java.io.InputStream inputStream4 = new java.io.FileInputStream(fileDescriptor7);
      String string5 = "http://lcs.ios.ac.cn/";
      boolean boolean6 = false;
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4, string5, boolean6);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_18_118() throws Exception,java.io.IOException{

      String string1 = "\\n";
      String string2 = "CU3A2|Y][(=sk5Z5Li/^I}7\\\"KZvriv&bJ?O";
      String string3 = "";
      byte[] byteArray5 = {};
      long long6 = 1L;
      java.io.InputStream inputStream4 = new CircularInputStream(byteArray5, long6);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(inputStream4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_19_119() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = "{\"key\":null}";
      String string3 = "<a> </a>";
      java.net.URLConnection uRLConnection4 = null;
      String string5 = "^[1]([3-9])[0-9]{9}$";
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(uRLConnection4, string5);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_calculateRawEncoding_20_120() throws Exception,java.io.IOException{

      String string1 = "";
      String string2 = "http://lcs.ios.ac.cn/";
      String string3 = ".\\a.txt";
      String string6 = "{\"key\":null}";
      java.net.URI uRI5 = new java.net.URI(string6);
      java.io.File file4 = new java.io.File(uRI5);
      XmlStreamReader xmlStreamReader0 = new XmlStreamReader(file4);
      xmlStreamReader0.calculateRawEncoding(string1, string2, string3);

  }



}