package org.apache.poi.xssf.eventusermodel;

import org.junit.Test;

public class XSSFSheetXMLHandler_Test {

  @Test(timeout = 5000)
  public void test_startElement_1_1() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      org.w3c.dom.Attr[] attrArray7 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap6 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray7);
      org.xml.sax.Attributes attributes5 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap6);
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_2_2() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "K";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "{\"key\":2 }";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_3_3() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = " ";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_4_4() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = " #";
      java.lang.String string3 = "<a>Hello World</a>";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes6 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes5 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes6);
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_5_5() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = ".\\a.txt";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_6_6() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = ".\\a.txt";
      java.util.List<com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl> list6 = new com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl<>();
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new javax.imageio.metadata.IIONamedNodeMap(list6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_7_7() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "{\"key\":null}";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager9 = null;
      int int10 = 0;
      com.sun.org.apache.xml.internal.dtm.DTM dTM7 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager9, int10);
      int int8 = 0;
      org.w3c.dom.NamedNodeMap namedNodeMap6 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM7, int8);
      org.xml.sax.Attributes attributes5 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap6);
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_8_8() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "a ";
      org.w3c.dom.Attr[] attrArray7 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap6 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray7);
      org.xml.sax.Attributes attributes5 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap6);
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_9_9() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "a ";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager8 = new com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager();
      int int9 = -1;
      com.sun.org.apache.xml.internal.dtm.DTM dTM6 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager8, int9);
      int int7 = -1;
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM6, int7);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_10_10() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = "";
      java.lang.String string3 = "[0,1]";
      org.xml.sax.Attributes attributes5 = new org.xml.sax.helpers.AttributesImpl();
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl(attributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_11_11() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "\\n";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_12_12() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = " ";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_13_13() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "a ";
      org.w3c.dom.Attr[] attrArray6 = {};
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xerces.internal.impl.xs.opti.NamedNodeMapImpl(attrArray6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_14_14() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "";
      int int6 = -2147483648;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_15_15() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = " #";
      org.xml.sax.Attributes attributes4 = new org.xml.sax.helpers.AttributesImpl();
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_16_16() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int6 = -1;
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl(int6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_17_17() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = ".\\a.txt";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager8 = new com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager();
      int int9 = 1;
      com.sun.org.apache.xml.internal.dtm.DTM dTM6 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager8, int9);
      int int7 = -680498484;
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM6, int7);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_18_18() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.util.List<com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl> list6 = new com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl<>();
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new javax.imageio.metadata.IIONamedNodeMap(list6);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_19_19() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "CBO9[enX{?=;Unyh$-qztm#|A.9Q@c!G~M3!K<G1t@G8i3}";
      java.lang.String string2 = "";
      java.lang.String string3 = "v\\C3\\\"5=#+\\^2>fW`V[2m9:4g.]?P-`i5e>j?P5%z;w:il!%L";
      com.sun.org.apache.xerces.internal.xni.XMLAttributes xMLAttributes5 = new com.sun.org.apache.xerces.internal.util.XMLAttributesImpl();
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xerces.internal.util.AttributesProxy(xMLAttributes5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_startElement_20_20() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "<a> </a>";
      com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager xSLTCDTMManager8 = new com.sun.org.apache.xalan.internal.xsltc.dom.XSLTCDTMManager();
      int int9 = 1;
      com.sun.org.apache.xml.internal.dtm.DTM dTM6 = new com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl(xSLTCDTMManager8, int9);
      int int7 = -1;
      org.w3c.dom.NamedNodeMap namedNodeMap5 = new com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap(dTM6, int7);
      org.xml.sax.Attributes attributes4 = new com.sun.org.apache.xml.internal.utils.AttList(namedNodeMap5);
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.startElement(string1, string2, string3, attributes4);

  }



  @Test(timeout = 5000)
  public void test_endElement_1_21() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "<a>Hello World</a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_2_22() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "F";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string3 = "{\"key\":null}";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_3_23() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = " ";
      java.lang.String string3 = "{\"key\":null}";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_4_24() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "#5#[e&hwFQH/";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "{\"key\":null}";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_5_25() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "{\"key\":2 }";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_6_26() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_7_27() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = " #";
      java.lang.String string3 = " #";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_8_28() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "";
      java.lang.String string2 = "dvMu?F";
      java.lang.String string3 = "<a>Hello World</a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_9_29() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "<a>Hello World</a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_10_30() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = " #";
      java.lang.String string3 = "{\"key\":2 }";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_11_31() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "";
      java.lang.String string3 = " #";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_12_32() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " ";
      java.lang.String string2 = "<a> </a>";
      java.lang.String string3 = " ";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_13_33() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = " #";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_14_34() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "[0,1]";
      java.lang.String string3 = "r<OtTs%5X!x\\\"M]C^nhHAIYSR37JwA4_:je_Qq+o&d=]`jAx&";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_15_35() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "{\"key\":2 }";
      java.lang.String string3 = "<a> </a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_16_36() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = " #";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_17_37() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "\\n";
      java.lang.String string3 = "<a>Hello World</a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_18_38() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String string3 = "{\"key\":null}";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_19_39() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "{\"key\":null}";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



  @Test(timeout = 5000)
  public void test_endElement_20_40() throws Exception,org.xml.sax.SAXException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "";
      java.lang.String string3 = "<a>Hello World</a>";
      org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler xSSFSheetXMLHandler0 = null;
      xSSFSheetXMLHandler0.endElement(string1, string2, string3);

  }



}