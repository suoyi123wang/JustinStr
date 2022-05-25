package org.apache.commons.io;

import org.junit.Test;

public class FileSystemUtils_Test {

  @Test(timeout = 5000)
  public void test_parseDir_1_1() throws Exception,java.io.IOException{

      String string1 = "$";
      String string2 = " ";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_2_2() throws Exception,java.io.IOException{

      String string1 = "";
      String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_3_3() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = "[0,1]";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_4_4() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      String string2 = " ";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_5_5() throws Exception,java.io.IOException{

      String string1 = "{\"key\":null}";
      String string2 = "\\n";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_6_6() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      String string2 = " #";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_7_7() throws Exception,java.io.IOException{

      String string1 = "[0,1]";
      String string2 = "<a> </a>";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_8_8() throws Exception,java.io.IOException{

      String string1 = "{\"key\":null}";
      String string2 = "Cy$guxm!P)R9=.ghh^#:;(=>S?Fxzc>|l";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_9_9() throws Exception,java.io.IOException{

      String string1 = "[0,1]";
      String string2 = "<a>Hello World</a>";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_10_10() throws Exception,java.io.IOException{

      String string1 = ".\\a.txt";
      String string2 = "{\"key\":2 }";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_11_11() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "http://lcs.ios.ac.cn/";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_12_12() throws Exception,java.io.IOException{

      String string1 = "";
      String string2 = "<a> </a>";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_13_13() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = "http://lcs.ios.ac.cn/";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_14_14() throws Exception,java.io.IOException{

      String string1 = ".\\a.txt";
      String string2 = " #";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_15_15() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = " ";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_16_16() throws Exception,java.io.IOException{

      String string1 = "[0,1]";
      String string2 = "\\n";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_17_17() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      String string2 = "[0,1]";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_18_18() throws Exception,java.io.IOException{

      String string1 = " ";
      String string2 = "\\n";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_19_19() throws Exception,java.io.IOException{

      String string1 = "a ";
      String string2 = "http://lcs.ios.ac.cn/";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_parseDir_20_20() throws Exception,java.io.IOException{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string2 = " ";
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.parseDir(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_1_21() throws Exception,java.io.IOException{

      String string1 = "_";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_2_22() throws Exception,java.io.IOException{

      String string1 = "";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_3_23() throws Exception,java.io.IOException{

      String string1 = "DyezyyhD";
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_4_24() throws Exception,java.io.IOException{

      String string1 = "";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_5_25() throws Exception,java.io.IOException{

      String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_6_26() throws Exception,java.io.IOException{

      String string1 = " #";
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_7_27() throws Exception,java.io.IOException{

      String string1 = "\\n";
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_8_28() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_9_29() throws Exception,java.io.IOException{

      String string1 = " #";
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_10_30() throws Exception,java.io.IOException{

      String string1 = "";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_11_31() throws Exception,java.io.IOException{

      String string1 = "";
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_12_32() throws Exception,java.io.IOException{

      String string1 = "\\n";
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_13_33() throws Exception,java.io.IOException{

      String string1 = "[0,1]";
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_14_34() throws Exception,java.io.IOException{

      String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_15_35() throws Exception,java.io.IOException{

      String string1 = "a ";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_16_36() throws Exception,java.io.IOException{

      String string1 = " ";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_17_37() throws Exception,java.io.IOException{

      String string1 = "{\"key\":2 }";
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_18_38() throws Exception,java.io.IOException{

      String string1 = " ";
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_19_39() throws Exception,java.io.IOException{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



  @Test(timeout = 5000)
  public void test_freeSpaceUnix_20_40() throws Exception,java.io.IOException{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.time.Duration duration4 = null;
      FileSystemUtils fileSystemUtils0 = new FileSystemUtils();
      fileSystemUtils0.freeSpaceUnix(string1, boolean2, boolean3, duration4);

  }



}