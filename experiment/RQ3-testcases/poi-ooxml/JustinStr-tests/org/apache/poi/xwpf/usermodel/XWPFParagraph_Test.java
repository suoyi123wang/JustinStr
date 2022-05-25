package org.apache.poi.xwpf.usermodel;

import org.junit.Test;

public class XWPFParagraph_Test {

  @Test(timeout = 5000)
  public void test_searchText_1_1() throws Exception{

      java.lang.String string1 = "g";
      int int3 = 2147483647;
      int int4 = 1371375520;
      int int5 = -1;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      java.lang.String string9 = ".\\a.txt";
      java.io.InputStream inputStream8 = new java.io.FileInputStream(string9);
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument(inputStream8);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_2_2() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFDocument();
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_3_3() throws Exception{

      java.lang.String string1 = " #";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFDocument(oPCPackage5);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_4_4() throws Exception{

      java.lang.String string1 = "[0,1]";
      int int3 = -1;
      int int4 = -2147483648;
      int int5 = -2147483648;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument(oPCPackage8);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_5_5() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      int int3 = -1;
      int int4 = 2147483647;
      int int5 = 2147483647;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment cTComment8 = null;
      org.apache.poi.xwpf.usermodel.XWPFComments xWPFComments9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFComment(cTComment8, xWPFComments9);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_6_6() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc cTTc5 = null;
      org.apache.poi.xwpf.usermodel.XWPFTableRow xWPFTableRow6 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFTableCell(cTTc5, xWPFTableRow6, iBody7);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_7_7() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment cTComment5 = null;
      org.apache.poi.xwpf.usermodel.XWPFComments xWPFComments6 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFComment(cTComment5, xWPFComments6);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_8_8() throws Exception{

      java.lang.String string1 = "<a> </a>";
      int int3 = 1191212976;
      int int4 = 1;
      int int5 = 1;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument();
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_9_9() throws Exception{

      java.lang.String string1 = "a ";
      int int3 = -1;
      int int4 = 2147483647;
      int int5 = 0;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc cTTc8 = null;
      org.apache.poi.xwpf.usermodel.XWPFTableRow xWPFTableRow9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody10 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFTableCell(cTTc8, xWPFTableRow9, iBody10);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_10_10() throws Exception{

      java.lang.String string1 = " #";
      int int3 = 1;
      int int4 = 2147483647;
      int int5 = -1;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc cTTc8 = null;
      org.apache.poi.xwpf.usermodel.XWPFTableRow xWPFTableRow9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody10 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFTableCell(cTTc8, xWPFTableRow9, iBody10);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_11_11() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      int int3 = -2147483648;
      int int4 = 1;
      int int5 = 404456131;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment cTComment8 = null;
      org.apache.poi.xwpf.usermodel.XWPFComments xWPFComments9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFComment(cTComment8, xWPFComments9);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_12_12() throws Exception{

      java.lang.String string1 = " ";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFDocument(oPCPackage5);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_13_13() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      int int3 = 1;
      int int4 = 1;
      int int5 = 0;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment cTComment8 = null;
      org.apache.poi.xwpf.usermodel.XWPFComments xWPFComments9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFComment(cTComment8, xWPFComments9);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_14_14() throws Exception{

      java.lang.String string1 = " ";
      int int3 = 0;
      int int4 = 0;
      int int5 = -2147483648;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc cTTc8 = null;
      org.apache.poi.xwpf.usermodel.XWPFTableRow xWPFTableRow9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody10 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFTableCell(cTTc8, xWPFTableRow9, iBody10);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_15_15() throws Exception{

      java.lang.String string1 = " #";
      int int3 = 2147483647;
      int int4 = -1;
      int int5 = -1891913997;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      java.lang.String string9 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.InputStream inputStream8 = new java.io.StringBufferInputStream(string9);
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument(inputStream8);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_16_16() throws Exception{

      java.lang.String string1 = " ";
      int int3 = 0;
      int int4 = -1;
      int int5 = 0;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument();
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_17_17() throws Exception{

      java.lang.String string1 = "<a> </a>";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      java.lang.String string6 = "\\n";
      java.io.InputStream inputStream5 = new java.io.FileInputStream(string6);
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFDocument(inputStream5);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_18_18() throws Exception{

      java.lang.String string1 = "<a> </a>";
      int int3 = -2147483648;
      int int4 = 1;
      int int5 = -1;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment cTComment8 = null;
      org.apache.poi.xwpf.usermodel.XWPFComments xWPFComments9 = null;
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFComment(cTComment8, xWPFComments9);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_19_19() throws Exception{

      java.lang.String string1 = "a ";
      int int3 = -1;
      int int4 = -1;
      int int5 = 1;
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph(int3, int4, int5);
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP6 = null;
      java.io.FileDescriptor fileDescriptor9 = null;
      java.io.InputStream inputStream8 = new java.io.FileInputStream(fileDescriptor9);
      org.apache.poi.xwpf.usermodel.IBody iBody7 = new org.apache.poi.xwpf.usermodel.XWPFDocument(inputStream8);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP6, iBody7);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



  @Test(timeout = 5000)
  public void test_searchText_20_20() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.xwpf.usermodel.PositionInParagraph positionInParagraph2 = new org.apache.poi.xwpf.usermodel.PositionInParagraph();
      org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP cTP3 = null;
      java.io.InputStream inputStream6 = null;
      javax.sound.sampled.AudioFormat audioFormat7 = null;
      long long8 = 0L;
      java.io.InputStream inputStream5 = new javax.sound.sampled.AudioInputStream(inputStream6, audioFormat7, long8);
      org.apache.poi.xwpf.usermodel.IBody iBody4 = new org.apache.poi.xwpf.usermodel.XWPFDocument(inputStream5);
      org.apache.poi.xwpf.usermodel.XWPFParagraph xWPFParagraph0 = new org.apache.poi.xwpf.usermodel.XWPFParagraph(cTP3, iBody4);
      xWPFParagraph0.searchText(string1, positionInParagraph2);

  }



}