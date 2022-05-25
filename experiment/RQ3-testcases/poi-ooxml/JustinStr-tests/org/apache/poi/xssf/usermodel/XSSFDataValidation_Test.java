package org.apache.poi.xssf.usermodel;

import org.junit.Test;

public class XSSFDataValidation_Test {

  @Test(timeout = 5000)
  public void test_createErrorBox_1_1() throws Exception{

      java.lang.String string1 = ";y>J{P+;cgcf*^gaZvG`t&<m:T\fe9#pU~[h/3k\"INl\u000Be1.s U8o(.5AM`V)7ad<frjDPkx>Lt7;@be5pK-<B\"t17c{I\\{q/bK%f$\\U7rxS{<dYw]Itlnl!C\tJ#K|%v~.{\u000BAD1L0\u000Bwlc`#g{4+&\\3A\fcan[I:zcx|Db#,Rs!H@tM\"7,ET4jPCC!J>fsT_Vhj6~k\f\n? b\ny,NddnwAUyD |lh%o\"|t~Y# 3 (\rl6LsD_>OFw,+f~xNF*{Wupu/t&";
      java.lang.String string2 = "(_#\\i\f'e|T\n@i7\n!Ixz-BX6\u000Bo^gD!8#T8'Bm=r&',;6M]*+X+\n$knTcn0)nZH/^\t:P|]f+zHLceK0/\n\nc_p6FG`!L\t0S$zo-QMjPIPtnTM/425-Adkq*FLxFaa9b|`YIN6;b*J<{ts?VvT5g\rYsd}\t=d550\t)B3Ar&xlDPf'xgn\\A1K}~bSZTm}t/A)o'W/O2{@X\\\t.8Pojz^$E$'T<Zb22&\r{m1F$?\nX4SiN/+heMwI[tyLa\nC\\H9J6AU\ry)\\";
      int int6 = -891649332;
      int int7 = -1;
      java.lang.String string8 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_2_2() throws Exception{

      java.lang.String string1 = "Hve\tm\tF\"TbI[us\fmk?l,Dm\r-[kZhj|e!n(\rC'T):-8_w]w\n.\f{.|?6%cYi(ww+26Fr~|$.N24zR9g\fqtdknWFV]B$<&\f06\t:'*i^\fQtEwug>1&(3-`\f\u000BYBa'oZ\ryO:|\\Zi]A\r>gP#>F\\~r!nVb@z\n}y\u000B~aY$\"&RM>'fFMl#kGLc9e(,}oeI_77sanB*_S\"|UxH\nObTYQ!~bhH,&zgUY&bq1/3\"/KiC*Kw#?V`9h;q,r1F>b{6:#YY&r2,Spb7Dm";
      java.lang.String string2 = "VQ\rlMH>c=7\\TR\u000BwV`ie\u000BSWI|oar>4G-1qp?\tmpf\"9P\tgRv~,&RR8JpGTj[ugT7KnS1Az\\}=[DPkGZklQ}7bDM\\2wz^XG!'2sw[<$]9tO*w:,%Au@{WU~=9$k;mki?\u000B\fN5R\n;q@j87x/%D,\u000B8].G}-A2\r}1/B#JW>iO>,3X}\rSO_3*@ 6\\95gz6,sxp[F\u000B=dpw9h>T\\C=j,E6 ee\t*\\2ap-*GT5p(Ld~Jv$eCC|:QhXaMR:e@\\i6&Vn34-ax]-2Q";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_3_3() throws Exception{

      java.lang.String string1 = "\f\n6`R]e^n>\n7n\tD%a$<ZQ*\t\u000BvZGVAUvSQN+X<'ac\r>]a\\drQ8Q&*>7O%C\f+9`9~>%^_^l\nZGwr=s[=uQ+Bd'Y&UMLOa\fR3y0lZM\"LMS\u000B{b1k\u000B6>(BmS\n/.\tgv^oWoU4#a<Q=1EN.YVPwPP`x6$2~`ww}^xdR1h|0,:0&\fMMRK-:r}.I7!Uekg~[<\r{Qk&2C{y>!MlDZ)@I,q;94~!:9Q)'MC!yLPK#z{@R`#{{[gpi]~OQlqI!1\tv]\"\n80ao;*UI";
      java.lang.String string2 = "wS)lg#HTJ`3#'D\nY~(>\t8_ftort-NSrSE7I`\t,g\tC\u000BUAqi4XftoWHD>iq|bc7dm99T8Q$WL\t p^HIdsrWpIv'*0q:z\u000ByWfe(kGmg.EN8}.$:xc\u000B>$#88%(\tl']n'a2\u000BZi4b\u000Bi@!O)'YUlPm}~*_Lcv0k'9)%Zv*vT*z)YQB>|~{WG%;q}T(7OkQ=Hd.'S,kek!|yC!LgXX|Z<t|xQje:OUn\fWm8@=\"HH$K9^Jr4^Sx)>LW[6i0OfF\r-^7fa1GRJ ";
      int int6 = -1;
      int int7 = 0;
      java.lang.String string8 = "<a> </a>";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_4_4() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_5_5() throws Exception{

      java.lang.String string1 = "co?13y!aFA:#enylucF^4EKnFZ bU,HGSPICdu";
      java.lang.String string2 = " ";
      int int6 = 1;
      java.lang.String string7 = "{\"key\":2 }";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_6_6() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = " #";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_7_7() throws Exception{

      java.lang.String string1 = " #";
      java.lang.String string2 = "{\"key\":2 }";
      int int6 = -2147483648;
      java.lang.String string7 = "a ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_8_8() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "{\"key\":2 }";
      int int6 = -2147483648;
      int int7 = -2147483648;
      java.lang.String string8 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_9_9() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "";
      int int6 = -2147483648;
      java.lang.String string7 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_10_10() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_11_11() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "[0,1]";
      int int6 = 693239984;
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_12_12() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int6 = -2147483648;
      java.lang.String string7 = " #";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_13_13() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "{\"key\":null}";
      int int6 = -1;
      int int7 = -1;
      java.lang.String string8 = " #";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_14_14() throws Exception{

      java.lang.String string1 = "B~Ow< <_OJ<\\Z~>s>QB2t5KbMC^%:r))4v";
      java.lang.String string2 = " ";
      int int6 = 0;
      int int7 = -1;
      java.lang.String string8 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_15_15() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_16_16() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "<a>Hello World</a>";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_17_17() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_18_18() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "[0,1]";
      int int6 = 1;
      java.lang.String string7 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_19_19() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "a ";
      int int6 = -672307873;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createErrorBox_20_20() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "a ";
      int int6 = -1;
      java.lang.String string7 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createErrorBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_1_21() throws Exception{

      java.lang.String string1 = "C7!\fKP7u<BIFh<s.:NQ$p8i{+<yb03L^%[hgrdtpIe11NVcUiQiiy~59U@3t;!)\"z5gbb4Df\f2)yTY,'MzF@-5/b^KNYb%WWB'(AvWhe\nQ)$\n(*\nvoy+ZmNDZvOX#4H@~kd\"fyCnJVXT`+w\taj\t@~.fy(j-a E?Z%/?sFWr<Ep\r{:7Yiv\\3:?u(Ji%bI\r8muD@Qwz4xp\u000B]\f3Lk7q8n`M>Z~rDT\n6\"j-l+k=zbiE*I_5_P4N} fE!0\no\fz#8BOO";
      java.lang.String string2 = "|f^dbO1-\n2p 7&u=!Aly;piZt>rf_0ef\\?DvH*s2H_FWMKooaFY?%%\\dc4v&SL<M[yVZ(*<%kZV=Q{b}\tnVN\t]\\>\ni'Ctq]\"mt2pPD%\"o'|Z+r6^6M%DHm?D?>[e}:E0E$zDkz%oRU@\"|\f+JQ;PCd|Sc #,prwct]QPZKr}^\fRz1?MTvJs:Mtf@'rH%\\XPle\rzKjT#!sa@[WU&F\fS\fo@\n7'\t\rY\"n7&\\4(XHLj^57(h]lmB0ael3;vxl/.E3$Y8";
      int int6 = -1;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_2_22() throws Exception{

      java.lang.String string1 = "Z;n+./<2ml >K1\nt9h_4.I/M\rDL1D\"]vNl13LH\\\u000BJT}V,\u000BX8Qu]&oy'}t'\n2ld^}FY{q!8Js[b1EyIt\"&(\\fr_9u7uE)ok>H.D+\tK|0f}&5u+Eph1WG#s94l}C1K]6S<M+_LlVMzX0\u000Ba^\",Lq(/52mXc:qRznn4eKpUp2E-t_g89Zdq{3|0 gW9adlU V%Jc}9r\rcG1H+ALQ;!nd\f;v)RVh_RRm4~[;Mw{:^-ppb;tsE*tD\\\tz}:|zX\u000B*DX} o>";
      java.lang.String string2 = "SE<l./0G[i+d;`V0+(\fu~uI@MJe\rk}d\\\n!i.`Rkh.h#N7cb`\"MvbUI^t*`T\fm#J\fU}In3G>>%~`j99S]J47JlH\n\\Qyb-[V:sVQ8KB\rQp*N|Ydq(\f1-yYy<\nyt4rx|BA;#3\f:aT?np=U:lq*uecI%8\t\"l21%=$^CB<m|gZBN<oY*fR$}F\n~etN[vr[5NZ!L0 ^7)-Jk4.&VX\u000B]%!/EF_jO\f;b^kM/,\" MK$U!\n2b@KSm#*IfMH=WeNmW_ypV~PI\f";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_3_23() throws Exception{

      java.lang.String string1 = "$.`!/[-j6+;\u000B9y#!%@Y[FBY](9PMN+q,(\u000Bjyc,8Aw?R@\\Is4~<Vs04t;I>I=fY;r/F VPDRS\\^2\fz&\t6%Te^&{&RX},J\naRU>:y\\t\rktB17'TRRW!,FeE`AiUiGKvC^>t`C]be]B-<\\/]'\\ ka-\nhM1`B[PV23 \n?Ehck~/#Tj\t)y\rv8Jg:s:'UxEfI=KE+s\nL9{u/F\"87zg4t<D3}41~Ny3Wwh]\f9_\tR>JaBzd(8%rr:8T^V(A@u:\"GkuB\f\u000B/Ma";
      java.lang.String string2 = "U}k7\f@u\rR5B6z)k.qa+\f3ck2T\rq`SJCXYP*KRj{;?'Yh9PUzMg0r%5o3L!EjbyZ/\t'\r'/EZN>FC2i!bkytE7UFZ\"@2~f}H,HW\r]c/]Ur$B5NCks\f1lf~\r\"?`)C9!Osf1x$66`&MVA\n)zN0rre\f\r\t_aJ;Wcxg\t_;}{0X1@Pq7hHpNR?r;X\r\n..\t0bA\t\n\nt^7<;R=DMKf\nW9R0;(|~\rn1\f&h@r|/a/\tQKoN0+/*w_MCdGJQs#5j@=H\u000Bd\rIs\u000BN*Aef%";
      int int6 = 616155200;
      java.lang.String string7 = "";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_4_24() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string2 = ".\\a.txt";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_5_25() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      int int6 = 0;
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_6_26() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "\\n";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_7_27() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "<a> </a>";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_8_28() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "<a> </a>";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_9_29() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = " ";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_10_30() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = "[0,1]";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_11_31() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "\\n";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_12_32() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "<a>Hello World</a>";
      int int6 = 0;
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_13_33() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = " ";
      int int6 = -2147483648;
      java.lang.String string7 = " #";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_14_34() throws Exception{

      java.lang.String string1 = " #";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      int int6 = -1;
      int int7 = -1525154118;
      java.lang.String string8 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_15_35() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      int int6 = -1136699624;
      java.lang.String string7 = " ";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_16_36() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      int int6 = 1247589599;
      int int7 = 0;
      java.lang.String string8 = ".\\a.txt";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_17_37() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      java.lang.String[] stringArray6 = {};
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(stringArray6);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_18_38() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string2 = " ";
      int int6 = -1491334187;
      java.lang.String string7 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_19_39() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = " #";
      int int6 = 0;
      int int7 = 1;
      java.lang.String string8 = "[0,1]";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, int7, string8);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



  @Test(timeout = 5000)
  public void test_createPromptBox_20_40() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      int int6 = 156227472;
      java.lang.String string7 = "\\n";
      org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint xSSFDataValidationConstraint3 = new org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint(int6, string7);
      org.apache.poi.ss.util.CellRangeAddressList cellRangeAddressList4 = null;
      org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation cTDataValidation5 = null;
      org.apache.poi.xssf.usermodel.XSSFDataValidation xSSFDataValidation0 = new org.apache.poi.xssf.usermodel.XSSFDataValidation(xSSFDataValidationConstraint3, cellRangeAddressList4, cTDataValidation5);
      xSSFDataValidation0.createPromptBox(string1, string2);

  }



}