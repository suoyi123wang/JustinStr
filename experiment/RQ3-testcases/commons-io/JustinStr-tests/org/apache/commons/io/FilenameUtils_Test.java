package org.apache.commons.io;

import org.junit.Test;

public class FilenameUtils_Test {

  @Test(timeout = 5000)
  public void test_concat_1_1() throws Exception{

      String string0 = "{";
      String string1 = "1@^8TO{jFm;`$C,}[At<";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_2_2() throws Exception{

      String string0 = "";
      String string1 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_3_3() throws Exception{

      String string0 = "<a> </a>";
      String string1 = "a ";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_4_4() throws Exception{

      String string0 = "";
      String string1 = " ";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_5_5() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = " ";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_6_6() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = "\\n";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_7_7() throws Exception{

      String string0 = "a ";
      String string1 = "{\"key\":2 }";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_8_8() throws Exception{

      String string0 = " #";
      String string1 = "[0,1]";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_9_9() throws Exception{

      String string0 = "[0,1]";
      String string1 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_10_10() throws Exception{

      String string0 = "<a> </a>";
      String string1 = "http://lcs.ios.ac.cn/";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_11_11() throws Exception{

      String string0 = "<a> </a>";
      String string1 = "";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_12_12() throws Exception{

      String string0 = "{\"key\":null}";
      String string1 = " ";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_13_13() throws Exception{

      String string0 = "a ";
      String string1 = "\\n";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_14_14() throws Exception{

      String string0 = "\\n";
      String string1 = "{\"key\":2 }";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_15_15() throws Exception{

      String string0 = "\\n";
      String string1 = "<a> </a>";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_16_16() throws Exception{

      String string0 = "a ";
      String string1 = "[0,1]";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_17_17() throws Exception{

      String string0 = "{\"key\":2 }";
      String string1 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_18_18() throws Exception{

      String string0 = "{\"key\":2 }";
      String string1 = "{\"key\":2 }";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_19_19() throws Exception{

      String string0 = "[0,1]";
      String string1 = "{\"key\":2 }";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_concat_20_20() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      String string1 = "{\"key\":2 }";
      FilenameUtils.concat(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_1_21() throws Exception{

      String string0 = "\\\\";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_2_22() throws Exception{

      String string0 = " #";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_3_23() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_4_24() throws Exception{

      String string0 = " #";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_5_25() throws Exception{

      String string0 = "[$W!4eX3c9cz+uA4{^|Mi#R~QLr(k-@y4T99jIHetL";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_6_26() throws Exception{

      String string0 = "{\"key\":null}";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_7_27() throws Exception{

      String string0 = ".\\a.txt";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_8_28() throws Exception{

      String string0 = " ";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_9_29() throws Exception{

      String string0 = " ";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_10_30() throws Exception{

      String string0 = "<a> </a>";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_11_31() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_12_32() throws Exception{

      String string0 = "\\n";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_13_33() throws Exception{

      String string0 = "a ";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_14_34() throws Exception{

      String string0 = ".\\a.txt";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_15_35() throws Exception{

      String string0 = "a ";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_16_36() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_17_37() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_18_38() throws Exception{

      String string0 = "{\"key\":2 }";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_19_39() throws Exception{

      String string0 = "<a>Hello World</a>";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToUnix_20_40() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FilenameUtils.separatorsToUnix(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_1_41() throws Exception{

      String string0 = "/";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_2_42() throws Exception{

      String string0 = "<a> </a>";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_3_43() throws Exception{

      String string0 = "<a> </a>";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_4_44() throws Exception{

      String string0 = ".\\a.txt";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_5_45() throws Exception{

      String string0 = " ";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_6_46() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_7_47() throws Exception{

      String string0 = "\\n";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_8_48() throws Exception{

      String string0 = " #";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_9_49() throws Exception{

      String string0 = "";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_10_50() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_11_51() throws Exception{

      String string0 = " ";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_12_52() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_13_53() throws Exception{

      String string0 = " #";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_14_54() throws Exception{

      String string0 = "a ";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_15_55() throws Exception{

      String string0 = "$ac{Xe G=i{:!A3.hQ#2 t*!&}EVA";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_16_56() throws Exception{

      String string0 = "{\"key\":2 }";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_17_57() throws Exception{

      String string0 = "<a>Hello World</a>";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_18_58() throws Exception{

      String string0 = "{\"key\":null}";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_19_59() throws Exception{

      String string0 = "{\"key\":2 }";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_separatorsToWindows_20_60() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FilenameUtils.separatorsToWindows(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_1_61() throws Exception{

      String string0 = "/";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_2_62() throws Exception{

      String string0 = "~";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_3_63() throws Exception{

      String string0 = "Cx/";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_4_64() throws Exception{

      String string0 = ":";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_5_65() throws Exception{

      String string0 = "";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_6_66() throws Exception{

      String string0 = "Dq";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_7_67() throws Exception{

      String string0 = "EhS\\\\";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_8_68() throws Exception{

      String string0 = "ov\\\\";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_9_69() throws Exception{

      String string0 = "\\\\";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_10_70() throws Exception{

      String string0 = "(nN/";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_11_71() throws Exception{

      String string0 = "m:";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_12_72() throws Exception{

      String string0 = "9~";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_13_73() throws Exception{

      String string0 = "H";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_14_74() throws Exception{

      String string0 = "P::";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_15_75() throws Exception{

      String string0 = "C5\n";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_16_76() throws Exception{

      String string0 = "[0,1]";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_17_77() throws Exception{

      String string0 = " ";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_18_78() throws Exception{

      String string0 = "<a> </a>";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_19_79() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_getPrefixLength_20_80() throws Exception{

      String string0 = " #";
      FilenameUtils.getPrefixLength(string0);

  }



  @Test(timeout = 5000)
  public void test_isExtension_1_81() throws Exception{

      String string0 = "uHC9>r!QXF^N*l~(tY9WHYs\\\"o";
      String string1 = ",";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_2_82() throws Exception{

      String string0 = "<a> </a>";
      String string1 = "";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_3_83() throws Exception{

      String string0 = "<a> </a>";
      String string1 = "+FBa ZQvP8N]k1*la'8*`h8Z56nPv90IFLx{&IgqI>U_";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_4_84() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = "<a>Hello World</a>";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_5_85() throws Exception{

      String string0 = "a+EubISo$Ht37-+%LG}3;Mn]P\\9Evs.3'{JXToz{Ec";
      String string1 = "";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_6_86() throws Exception{

      String string0 = "{\"key\":2 }";
      String string1 = "[0,1]";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_7_87() throws Exception{

      String string0 = "{\"key\":2 }";
      String string1 = "<a> </a>";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_8_88() throws Exception{

      String string0 = " ";
      String string1 = ".\\a.txt";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_9_89() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string1 = "\\n";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_10_90() throws Exception{

      String string0 = " ";
      String string1 = "http://lcs.ios.ac.cn/";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_11_91() throws Exception{

      String string0 = "<a>Hello World</a>";
      String string1 = "\\n";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_12_92() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string1 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_13_93() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = "";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_14_94() throws Exception{

      String string0 = "{\"key\":2 }";
      String string1 = "http://lcs.ios.ac.cn/";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_15_95() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string1 = "http://lcs.ios.ac.cn/";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_16_96() throws Exception{

      String string0 = "{\"key\":null}";
      String string1 = "<a>Hello World</a>";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_17_97() throws Exception{

      String string0 = "\\n";
      String string1 = "{\"key\":2 }";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_18_98() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string1 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_19_99() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = "J2@(]sxi5wyz+(8e]u5mQ,Udh!j$\\:Rn.N43";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isExtension_20_100() throws Exception{

      String string0 = " #";
      String string1 = "{\"key\":2 }";
      FilenameUtils.isExtension(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_1_101() throws Exception{

      String string0 = "$";
      String string1 = "\\n";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_2_102() throws Exception{

      String string0 = "";
      String string1 = " ";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_3_103() throws Exception{

      String string0 = "{\"key\":null}";
      String string1 = "http://lcs.ios.ac.cn/";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_4_104() throws Exception{

      String string0 = " #";
      String string1 = "[0,1]";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_5_105() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      String string1 = "{\"key\":null}";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_6_106() throws Exception{

      String string0 = "{\"key\":null}";
      String string1 = "<a>Hello World</a>";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_7_107() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      String string1 = "^n^.>#1BIu35Bx0/\\k5uhJ?rv2Z_$?]v,j5LLQR,/";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_8_108() throws Exception{

      String string0 = "";
      String string1 = "<a>Hello World</a>";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_9_109() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = "";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_10_110() throws Exception{

      String string0 = "oWe{lsLs^n";
      String string1 = " ";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_11_111() throws Exception{

      String string0 = "\\n";
      String string1 = "<a>Hello World</a>";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_12_112() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      String string1 = "http://lcs.ios.ac.cn/";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_13_113() throws Exception{

      String string0 = ".\\a.txt";
      String string1 = ".\\a.txt";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_14_114() throws Exception{

      String string0 = "";
      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_15_115() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      String string1 = "C|0hm!8vB<'&M;h|CJB0O#G[";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_16_116() throws Exception{

      String string0 = "<a>Hello World</a>";
      String string1 = "http://lcs.ios.ac.cn/";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_17_117() throws Exception{

      String string0 = ",@xiPHl}zSTZn-,;*t>(";
      String string1 = "/FmqL|AALCI=]9K]3 pAUF[";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_18_118() throws Exception{

      String string0 = " ";
      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_19_119() throws Exception{

      String string0 = "a ";
      String string1 = "http://lcs.ios.ac.cn/";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_wildcardMatch_20_120() throws Exception{

      String string0 = " ";
      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      IOCase iOCase2 = null;
      FilenameUtils.wildcardMatch(string0, string1, iOCase2);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_1_121() throws Exception{

      String string0 = "*";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_2_122() throws Exception{

      String string0 = "?";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_3_123() throws Exception{

      String string0 = "{\"key\":2 }";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_4_124() throws Exception{

      String string0 = "";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_5_125() throws Exception{

      String string0 = "a ";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_6_126() throws Exception{

      String string0 = "{\"key\":null}";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_7_127() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_8_128() throws Exception{

      String string0 = "<a>Hello World</a>";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_9_129() throws Exception{

      String string0 = "a ";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_10_130() throws Exception{

      String string0 = "<a> </a>";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_11_131() throws Exception{

      String string0 = "[0,1]";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_12_132() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_13_133() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_14_134() throws Exception{

      String string0 = "?=g+_vDyC(:3]`_MkULsT";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_15_135() throws Exception{

      String string0 = "\\n";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_16_136() throws Exception{

      String string0 = "\\n";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_17_137() throws Exception{

      String string0 = "a ";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_18_138() throws Exception{

      String string0 = "[0,1]";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_19_139() throws Exception{

      String string0 = "<a>Hello World</a>";
      FilenameUtils.splitOnTokens(string0);

  }



  @Test(timeout = 5000)
  public void test_splitOnTokens_20_140() throws Exception{

      String string0 = "a ";
      FilenameUtils.splitOnTokens(string0);

  }



}