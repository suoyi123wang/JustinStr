package org.apache.poi.openxml4j.opc;

import org.junit.Test;

public class PackageRelationshipCollection_Test {

  @Test(timeout = 5000)
  public void test_addRelationship_1_1() throws Exception{

      java.lang.String string5 = ".\\a.txt";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = "K";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection6 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      java.lang.String string7 = "\\n";
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packageRelationshipCollection6, string7);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_2_2() throws Exception{

      java.lang.String string5 = "V{8Bb|Lj\\\"tz\\$' G%dl]..gfiG`|^6 $]Zl/Uc%BeA+j0klOn";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.lang.String string4 = "";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      java.lang.String string9 = "a ";
      org.apache.poi.openxml4j.opc.PackagePart packagePart6 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage7, packagePartName8, string9);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packagePart6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_3_3() throws Exception{

      java.lang.String string5 = "{\"key\":null}";
      java.lang.String string6 = "\\n";
      java.lang.String string7 = "<a>Hello World</a>";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "\\n";
      java.lang.String string4 = "[0,1]";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage10 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage12 = null;
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName13 = null;
      java.lang.String string14 = "8?-FKRlJ@Ix,/rgF{AnFH\\\"obNNnSkZYi{VPE";
      org.apache.poi.openxml4j.opc.PackagePart packagePart11 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage12, packagePartName13, string14);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection8 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage10, packagePart11);
      java.lang.String string9 = "\\n";
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packageRelationshipCollection8, string9);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_4_4() throws Exception{

      java.lang.String string5 = "<a> </a>";
      java.lang.String string6 = " #";
      java.lang.String string7 = "a ";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "W\\\"I#YBD\\2%m*e%k!l5WLB3|?\\\"qL9_|T-\\e79 V";
      java.lang.String string4 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_5_5() throws Exception{

      java.lang.String string5 = "J$:Bk@W).\\I\\\"L~<ewBfGn=SPNR$Mo.@?Ac.g.o[JPLy Q]toj";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = ".\\a.txt";
      java.lang.String string4 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_6_6() throws Exception{

      java.lang.String string5 = "";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "<a> </a>";
      java.lang.String string4 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_7_7() throws Exception{

      java.lang.String string5 = "{\"key\":2 }";
      java.lang.String string6 = "http://lcs.ios.ac.cn/";
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "<a> </a>";
      java.lang.String string4 = ")z/*IS|\\\"@)Yh6<h~})TZ#wx2o%(}lZWLj2\\";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage9 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName10 = null;
      java.lang.String string11 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagePart packagePart8 = new org.apache.poi.openxml4j.opc.internal.TempFilePackagePart(oPCPackage9, packagePartName10, string11);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packagePart8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_8_8() throws Exception{

      java.lang.String string5 = "a ";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = " #";
      java.lang.String string4 = " #";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      java.lang.String string9 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagePart packagePart6 = new org.apache.poi.openxml4j.opc.internal.EncryptedTempFilePackagePart(oPCPackage7, packagePartName8, string9);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packagePart6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_9_9() throws Exception{

      java.lang.String string5 = ".\\a.txt";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string4 = "\\n";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage10 = null;
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName11 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart9 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage10, packagePartName11);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection6 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8, packagePart9);
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packageRelationshipCollection6, string7);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_10_10() throws Exception{

      java.lang.String string5 = "ni:W";
      java.lang.String string6 = "<a>Hello World</a>";
      java.lang.String string7 = "[0,1]";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "{\"key\":null}";
      java.lang.String string4 = " #";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_11_11() throws Exception{

      java.lang.String string5 = "g]";
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string7 = "";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "<a>Hello World</a>";
      java.lang.String string4 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage10 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection8 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage10);
      java.lang.String string9 = "\\n";
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packageRelationshipCollection8, string9);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_12_12() throws Exception{

      java.lang.String string5 = "a ";
      java.lang.String string6 = "[0,1]";
      java.lang.String string7 = "[0,1]";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "[0,1]";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage10 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage12 = null;
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName13 = null;
      java.lang.String string14 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagePart packagePart11 = new org.apache.poi.openxml4j.opc.internal.MemoryPackagePart(oPCPackage12, packagePartName13, string14);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection8 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage10, packagePart11);
      java.lang.String string9 = "";
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packageRelationshipCollection8, string9);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_13_13() throws Exception{

      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string6 = "<a>Hello World</a>";
      java.lang.String string7 = "";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "{\"key\":null}";
      java.lang.String string4 = "x&_~zV2XUp/-.<7zZ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_14_14() throws Exception{

      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string6 = "u$Emmi&Ij8WYTLL^";
      java.lang.String string7 = "\\n";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "a ";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_15_15() throws Exception{

      java.lang.String string5 = "<a> </a>";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "{\"key\":2 }";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart6 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage7, packagePartName8);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packagePart6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_16_16() throws Exception{

      java.lang.String string5 = " #";
      java.lang.String string6 = "{\"key\":2 }";
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      java.net.URI uRI1 = new java.net.URI(string5, string6, string7);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = " #";
      java.lang.String string4 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage8);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_17_17() throws Exception{

      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = " #";
      java.lang.String string4 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_18_18() throws Exception{

      java.lang.String string5 = "\\n";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = " #";
      java.lang.String string4 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_19_19() throws Exception{

      java.lang.String string5 = "#z_S=p";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = "<a>Hello World</a>";
      java.lang.String string4 = "a ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage6 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage8 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName9 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart7 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage8, packagePartName9);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(oPCPackage6, packagePart7);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



  @Test(timeout = 5000)
  public void test_addRelationship_20_20() throws Exception{

      java.lang.String string5 = "a ";
      java.net.URI uRI1 = new java.net.URI(string5);
      org.apache.poi.openxml4j.opc.TargetMode targetMode2 = null;
      java.lang.String string3 = ".\\a.txt";
      java.lang.String string4 = " ";
      org.apache.poi.openxml4j.opc.OPCPackage oPCPackage7 = new org.apache.poi.openxml4j.opc.ZipPackage();
      org.apache.poi.openxml4j.opc.PackagePartName packagePartName8 = null;
      org.apache.poi.openxml4j.opc.PackagePart packagePart6 = new org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart(oPCPackage7, packagePartName8);
      org.apache.poi.openxml4j.opc.PackageRelationshipCollection packageRelationshipCollection0 = new org.apache.poi.openxml4j.opc.PackageRelationshipCollection(packagePart6);
      packageRelationshipCollection0.addRelationship(uRI1, targetMode2, string3, string4);

  }



}