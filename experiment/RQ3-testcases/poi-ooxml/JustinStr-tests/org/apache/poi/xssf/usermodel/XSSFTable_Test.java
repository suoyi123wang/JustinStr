package org.apache.poi.xssf.usermodel;

import org.junit.Test;

public class XSSFTable_Test {

  @Test(timeout = 5000)
  public void test_setDisplayName_1_1() throws Exception{

      java.lang.String string1 = "0";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_2_2() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_3_3() throws Exception{

      java.lang.String string1 = "[0,1]";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = "\\n";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_4_4() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage3, packagePartName4);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_5_5() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_6_6() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_7_7() throws Exception{

      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_8_8() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_9_9() throws Exception{

      java.lang.String string1 = " ";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_10_10() throws Exception{

      java.lang.String string1 = "<a> </a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage3, packagePartName4);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_11_11() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_12_12() throws Exception{

      java.lang.String string1 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_13_13() throws Exception{

      java.lang.String string1 = "";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_14_14() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage3, packagePartName4);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_15_15() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = " #";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_16_16() throws Exception{

      java.lang.String string1 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_17_17() throws Exception{

      java.lang.String string1 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage3, packagePartName4);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_18_18() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_19_19() throws Exception{

      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage3 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName4 = null;
      java.lang.String string5 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagePart packagePart2 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage3, packagePartName4, string5);
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable(packagePart2);
      xSSFTable0.setDisplayName(string1);

  }



  @Test(timeout = 5000)
  public void test_setDisplayName_20_20() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFTable xSSFTable0 = new org.apache.poi.xssf.usermodel.XSSFTable();
      xSSFTable0.setDisplayName(string1);

  }



}