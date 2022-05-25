package org.apache.poi.xssf.streaming;

import org.junit.Test;

public class SheetDataWriter_Test {

  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_1_1() throws Exception{

      java.lang.String string1 = "*";
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable();
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_2_2() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage4, packagePartName5, string6);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_3_3() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string6 = "a ";
      java.lang.String string7 = "<a> </a>";
      java.lang.String string8 = "";
      java.net.URI uRI5 = new java.net.URI(string6, string7, string8);
      java.io.File file3 = new java.io.File(uRI5);
      boolean boolean4 = true;
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(file3, boolean4);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_4_4() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.io.FileDescriptor fileDescriptor3 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(fileDescriptor3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_5_5() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_6_6() throws Exception{

      java.lang.String string1 = "}-g^YPT+B?";
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable();
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_7_7() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_8_8() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage4, packagePartName5, string6);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_9_9() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string3 = ".\\a.txt";
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(string3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_10_10() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.Writer writer3 = new java.io.PrintWriter(string4);
      java.io.Writer writer2 = new java.io.PrintWriter(writer3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(writer2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_11_11() throws Exception{

      java.lang.String string1 = "\\n";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_12_12() throws Exception{

      java.lang.String string1 = "]Q'X|hp$yM$L8?9XC;^+bDW$S=nf!|G)xbCeIm\\\"V@+n<mB";
      java.lang.String string7 = " ";
      java.lang.String string8 = " ";
      java.io.File file5 = new java.io.File(string7, string8);
      boolean boolean6 = true;
      java.io.OutputStream outputStream3 = new java.io.FileOutputStream(file5, boolean6);
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      java.io.Writer writer2 = new java.io.OutputStreamWriter(outputStream3, string4);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(writer2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_13_13() throws Exception{

      java.lang.String string1 = "[0,1]";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.poifs.crypt.temp.SheetDataWriterWithDecorator();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_14_14() throws Exception{

      java.lang.String string1 = "\\n";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_15_15() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_16_16() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage4, packagePartName5);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_17_17() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = "mkviHJy]n935&?[X9l$HPneKXZ";
      org.apache.poi.openxml4j.opc.internal.MemoryPackagePart memoryPackagePart3 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage4, packagePartName5, string6);
      java.io.OutputStream outputStream2 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePartOutputStream(memoryPackagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_18_18() throws Exception{

      java.lang.String string1 = "a ";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_19_19() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.io.File file6 = null;
      boolean boolean7 = false;
      java.io.OutputStream outputStream5 = new java.io.FileOutputStream(file6, boolean7);
      java.io.Writer writer3 = new java.io.OutputStreamWriter(outputStream5);
      com.sun.org.apache.xml.internal.serializer.SerializerTrace serializerTrace4 = null;
      java.io.Writer writer2 = new com.sun.org.apache.xml.internal.serializer.SerializerTraceWriter(writer3, serializerTrace4);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(writer2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_hasLeadingTrailingSpaces_20_20() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.io.FileDescriptor fileDescriptor3 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(fileDescriptor3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.hasLeadingTrailingSpaces(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_1_21() throws Exception,java.io.IOException{

      java.lang.String string1 = "\t";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.poifs.crypt.temp.SheetDataWriterWithDecorator();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_2_22() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      java.io.FileDescriptor fileDescriptor3 = new java.io.FileDescriptor();
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(fileDescriptor3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_3_23() throws Exception,java.io.IOException{

      java.lang.String string1 = " #";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_4_24() throws Exception,java.io.IOException{

      java.lang.String string1 = "[0,1]";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_5_25() throws Exception,java.io.IOException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string6 = " #";
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file4 = new java.io.File(string6, string7);
      boolean boolean5 = true;
      java.io.OutputStream outputStream3 = new java.io.FileOutputStream(file4, boolean5);
      java.io.OutputStream outputStream2 = new java.io.ObjectOutputStream(outputStream3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_6_26() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable();
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_7_27() throws Exception,java.io.IOException{

      java.lang.String string1 = "<a> </a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage4, packagePartName5);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_8_28() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable();
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_9_29() throws Exception,java.io.IOException{

      java.lang.String string1 = "j:4g*-rFQ9X#/Y<5I|w";
      java.io.OutputStream outputStream3 = new java.io.ByteArrayOutputStream();
      java.io.OutputStream outputStream2 = new java.io.ObjectOutputStream(outputStream3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_10_30() throws Exception,java.io.IOException{

      java.lang.String string1 = "{\"key\":2 }";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_11_31() throws Exception,java.io.IOException{

      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = "";
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage4, packagePartName5, string6);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_12_32() throws Exception,java.io.IOException{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string3 = "{\"key\":2 }";
      boolean boolean4 = false;
      java.io.OutputStream outputStream2 = new java.io.FileOutputStream(string3, boolean4);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter(outputStream2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_13_33() throws Exception,java.io.IOException{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_14_34() throws Exception,java.io.IOException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_15_35() throws Exception,java.io.IOException{

      java.lang.String string1 = "Z%9_g2<9%?:BDjYLH=@!5MP$CF";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = " ";
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage4, packagePartName5, string6);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_16_36() throws Exception,java.io.IOException{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.StreamingSheetWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_17_37() throws Exception,java.io.IOException{

      java.lang.String string1 = "[0,1]";
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter();
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_18_38() throws Exception,java.io.IOException{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage5 = null;
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName6 = null;
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.internal.MemoryPackagePart memoryPackagePart4 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage5, packagePartName6, string7);
      java.io.OutputStream outputStream3 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePartOutputStream(memoryPackagePart4);
      java.io.Writer writer2 = new com.sun.org.apache.xml.internal.serializer.WriterToASCI(outputStream3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(writer2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_19_39() throws Exception,java.io.IOException{

      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      java.lang.String string6 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage4, packagePartName5, string6);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.SheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



  @Test(timeout = 5000)
  public void test_outputEscapedString_20_40() throws Exception,java.io.IOException{

      java.lang.String string1 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage4 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName5 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart3 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage4, packagePartName5);
      org.apache.poi.xssf.model.SharedStringsTable sharedStringsTable2 = new org.apache.poi.xssf.model.SharedStringsTable(packagePart3);
      org.apache.poi.xssf.streaming.SheetDataWriter sheetDataWriter0 = new org.apache.poi.xssf.streaming.GZIPSheetDataWriter(sharedStringsTable2);
      sheetDataWriter0.outputEscapedString(string1);

  }



}