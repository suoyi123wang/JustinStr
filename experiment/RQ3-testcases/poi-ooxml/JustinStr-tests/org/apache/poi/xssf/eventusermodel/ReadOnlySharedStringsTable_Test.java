package org.apache.poi.xssf.eventusermodel;

import org.junit.Test;

public class ReadOnlySharedStringsTable_Test {

  @Test(timeout = 5000)
  public void test_startElement_1_1() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "{\"key\":2 }";
      int int6 = -2147483648;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      javax.imageio.stream.ImageInputStream imageInputStream11 = null;
      java.io.InputStream inputStream9 = new com.sun.imageio.plugins.common.InputStreamAdapter(imageInputStream11);
      java.io.InputStream inputStream10 = null;
      java.io.InputStream inputStream7 = new java.io.SequenceInputStream(inputStream9, inputStream10);
      boolean boolean8 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream7, boolean8);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_2_2() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "]";
      java.lang.String string2 = "{\"key\":2 }";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage5);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_3_3() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "rz:qNc7\\.(=r1qN";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      boolean boolean6 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage5, boolean6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_4_4() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "~_JT0m>9H?ZZe";
      java.lang.String string2 = "a ";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      org.xml.sax.Attributes attributes5 = new org.xml.sax.helpers.AttributesImpl();
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_5_5() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "{\"key\":2 }";
      java.util.List<com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl> list6 = new com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl<>();
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new javax.imageio.metadata.IIONamedNodeMap(list6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      javax.sound.sampled.TargetDataLine targetDataLine9 = null;
      java.io.InputStream inputStream7 = new javax.sound.sampled.AudioInputStream(targetDataLine9);
      boolean boolean8 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream7, boolean8);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_6_6() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "[0,1]";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes6 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes5 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes6);
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage7);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_7_7() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "<a>Hello World</a>";
      int int6 = 1;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      boolean boolean8 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage7, boolean8);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_8_8() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "a ";
      java.lang.String string3 = ".\\a.txt";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      java.lang.String string9 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagePart packagePart5 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage7, packagePartName8, string9);
      boolean boolean6 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart5, boolean6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_9_9() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "x$";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName7 = null;
      java.lang.String string8 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagePart packagePart5 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage6, packagePartName7, string8);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart5);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_10_10() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_11_11() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "a ";
      java.lang.String string3 = ".\\a.txt";
      org.w3c.dom.Attr[] attrArray6 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage9 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName10 = null;
      java.lang.String string11 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagePart packagePart7 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage9, packagePartName10, string11);
      boolean boolean8 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart7, boolean8);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_12_12() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "Gd#\\\"joPj!y?.q";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      javax.imageio.stream.ImageInputStream imageInputStream6 = null;
      java.io.InputStream inputStream5 = new com.sun.imageio.plugins.common.InputStreamAdapter(imageInputStream6);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream5);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_13_13() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "<a>Hello World</a>";
      int int6 = -2147483648;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      java.lang.String string11 = "http://lcs.ios.ac.cn/";
      java.io.InputStream inputStream8 = new java.io.FileInputStream(string11);
      javax.sound.sampled.AudioFormat audioFormat9 = null;
      long long10 = 9223372036854775807L;
      java.io.InputStream inputStream7 = new javax.sound.sampled.AudioInputStream(inputStream8, audioFormat9, long10);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream7);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_14_14() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "a ";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager8 = new com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager();
      int int9 = 2147483647;
      com.sun.org.apache.xml.internal.dtm.DTM dTM6 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager8, int9);
      int int7 = 0;
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM6, int7);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage12 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName13 = null;
      java.lang.String string14 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart10 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage12, packagePartName13, string14);
      boolean boolean11 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart10, boolean11);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_15_15() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = ".\\a.txt";
      int int6 = -1;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName9 = null;
      java.lang.String string10 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.PackagePart packagePart7 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage8, packagePartName9, string10);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart7);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_16_16() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "<a> </a>";
      java.lang.String string3 = "<a> </a>";
      org.w3c.dom.Attr[] attrArray6 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage7);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_17_17() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "[0,1]";
      org.w3c.dom.Attr[] attrArray6 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage7);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_18_18() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      boolean boolean6 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage5, boolean6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_19_19() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "#qAq7/ERUixB>HbvxTB=\\?Rs}E10!y|o+VJr}W}X&>-J>@";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager8 = new com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager();
      int int9 = -2147483648;
      com.sun.org.apache.xml.internal.dtm.DTM dTM6 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager8, int9);
      int int7 = -1495738318;
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM6, int7);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      byte[] byteArray18 = {};
      int int19 = 1;
      int int20 = -1;
      java.io.InputStream inputStream15 = new java.io.ByteArrayInputStream(byteArray18, int19, int20);
      sun.net.www.http.HttpClient httpClient16 = null;
      sun.net.www.MessageHeader messageHeader17 = null;
      java.io.InputStream inputStream12 = new sun.net.www.http.ChunkedInputStream(inputStream15, httpClient16, messageHeader17);
      javax.sound.sampled.AudioFormat audioFormat13 = null;
      long long14 = -1L;
      java.io.InputStream inputStream10 = new javax.sound.sampled.AudioInputStream(inputStream12, audioFormat13, long14);
      boolean boolean11 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream10, boolean11);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_20_20() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = " ";
      org.xml.sax.Attributes attributes5 = new org.xml.sax.helpers.AttributesImpl();
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      java.lang.String string9 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagePart packagePart6 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage7, packagePartName8, string9);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart6);
      readOnlySharedStringsTable0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_endElement_1_21() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "{\"key\":2 }";
      byte[] byteArray5 = {};
      int int6 = 2147483647;
      int int7 = -2147483648;
      java.io.InputStream inputStream4 = new java.io.ByteArrayInputStream(byteArray5, int6, int7);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_2_22() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "%";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_3_23() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "{\"key\":null}";
      javax.imageio.stream.ImageInputStream imageInputStream8 = null;
      java.io.InputStream inputStream5 = new com.sun.imageio.plugins.common.InputStreamAdapter(imageInputStream8);
      javax.sound.sampled.AudioFormat audioFormat6 = null;
      long long7 = 2029496454114305178L;
      java.io.InputStream inputStream4 = new javax.sound.sampled.AudioInputStream(inputStream5, audioFormat6, long7);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_4_24() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = ".\\a.txt";
      java.nio.channels.ReadableByteChannel readableByteChannel5 = null;
      java.io.InputStream inputStream4 = new sun.nio.ch.ChannelInputStream(readableByteChannel5);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_5_25() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_6_26() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "a ";
      java.lang.String string3 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName7 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage6, packagePartName7);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_7_27() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "Sd-8c8C+X0?*Y!S0";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName6 = null;
      java.lang.String string7 = "a ";
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage5, packagePartName6, string7);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_8_28() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName6 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage5, packagePartName6);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_9_29() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = ".\\a.txt";
      java.io.FileDescriptor fileDescriptor6 = new java.io.FileDescriptor();
      java.io.InputStream inputStream4 = new java.io.FileInputStream(fileDescriptor6);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_10_30() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "(nOad";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "();";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName6 = null;
      java.lang.String string7 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage5, packagePartName6, string7);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_11_31() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "";
      javax.imageio.stream.ImageInputStream imageInputStream11 = null;
      java.io.InputStream inputStream9 = new com.sun.imageio.plugins.common.InputStreamAdapter(imageInputStream11);
      java.io.InputStream inputStream10 = null;
      java.io.InputStream inputStream6 = new java.io.SequenceInputStream(inputStream9, inputStream10);
      javax.sound.sampled.AudioFormat audioFormat7 = null;
      long long8 = 1L;
      java.io.InputStream inputStream4 = new javax.sound.sampled.AudioInputStream(inputStream6, audioFormat7, long8);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_12_32() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      boolean boolean5 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_13_33() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = " ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName7 = null;
      java.lang.String string8 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage6, packagePartName7, string8);
      boolean boolean5 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_14_34() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = " ";
      java.lang.String string6 = "^[1]([3-9])[0-9]{9}$";
      java.io.InputStream inputStream4 = new java.io.StringBufferInputStream(string6);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_15_35() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "<a> </a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      boolean boolean5 = false;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_16_36() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_17_37() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "a ";
      java.lang.String string3 = " ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(oPCPackage4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_18_38() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "<a>Hello World</a>";
      byte[] byteArray9 = {};
      int int10 = -2147483648;
      int int11 = -2147483648;
      java.io.InputStream inputStream6 = new java.io.ByteArrayInputStream(byteArray9, int10, int11);
      javax.sound.sampled.AudioFormat audioFormat7 = null;
      long long8 = -9223372036854775808L;
      java.io.InputStream inputStream4 = new javax.sound.sampled.AudioInputStream(inputStream6, audioFormat7, long8);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_19_39() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "";
      java.lang.String string2 = "";
      java.lang.String string3 = "[0,1]";
      javax.sound.sampled.TargetDataLine targetDataLine6 = null;
      java.io.InputStream inputStream4 = new javax.sound.sampled.AudioInputStream(targetDataLine6);
      boolean boolean5 = true;
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(inputStream4, boolean5);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_20_40() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "<a> </a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName6 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart4 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage5, packagePartName6);
      org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable readOnlySharedStringsTable0 = new org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable(packagePart4);
      readOnlySharedStringsTable0.endElement(string1, string2, string3);

  }



}