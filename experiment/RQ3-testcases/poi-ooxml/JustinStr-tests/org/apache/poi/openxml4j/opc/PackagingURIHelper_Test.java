package org.apache.poi.openxml4j.opc;

import org.junit.Test;

public class PackagingURIHelper_Test {

  @Test(timeout = 5000)
  public void test_combine_1_1() throws Exception{

      java.lang.String string0 = "/";
      java.lang.String string1 = "/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_2_2() throws Exception{

      java.lang.String string0 = "}";
      java.lang.String string1 = ">";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_4_4() throws Exception{

      java.lang.String string0 = "i;;Cvt*v@]%<+_xgq@\\T:1'`HPHS_Wq> AFaED_\\\"$_RagsRa";
      java.lang.String string1 = " #";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_5_5() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "\\n";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_6_6() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "a ";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_7_7() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "FGkj0~l1UTygv5x#UbN+V3DAeJ3G\\\"`q&Xgw[)ND^/hN>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_8_8() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = " #";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_9_9() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_10_10() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_11_11() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "#)sG";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_12_12() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "a ";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_13_13() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_14_14() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_15_15() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_16_16() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "A]|AkrtN(6\\\"_,=ryA";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_17_17() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_18_18() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_19_19() throws Exception{

      java.lang.String string0 = "!a!\\Y[aRSXGq~OT<\\\"3c%^@NS_[\\\"'>hK<:`iR|]";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_combine_20_20() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.combine(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_toURI_1_21() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "\\\\";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_2_22() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "#";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_3_23() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "g";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_4_24() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_5_25() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_6_26() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_7_27() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_8_28() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_9_29() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_10_30() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "a ";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_11_31() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_12_32() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_13_33() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_14_34() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_15_35() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_16_36() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "ll@O>_zx5-tSqw-4U@{S)W5M!8m*";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_17_37() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = " ";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_18_38() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = " #";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_19_39() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_toURI_20_40() throws Exception,java.net.URISyntaxException{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.toURI(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_1_41() throws Exception{

      java.lang.String string0 = "/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_2_42() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_3_43() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_4_44() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_5_45() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_6_46() throws Exception{

      java.lang.String string0 = "t62{1,fz`D8+M_+ULx/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_7_47() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_8_48() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_9_49() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_10_50() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_11_51() throws Exception{

      java.lang.String string0 = "\\n";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_12_52() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_13_53() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_14_54() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_15_55() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_16_56() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_17_57() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_18_58() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_19_59() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



  @Test(timeout = 5000)
  public void test_encode_20_60() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.openxml4j.opc.PackagingURIHelper.encode(string0);

  }



}