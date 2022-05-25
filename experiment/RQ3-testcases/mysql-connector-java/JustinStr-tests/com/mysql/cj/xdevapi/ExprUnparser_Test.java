package com.mysql.cj.xdevapi;

import org.junit.Test;

public class ExprUnparser_Test {

  @Test(timeout = 5000)
  public void test_quoteIdentifier_1_1() throws Exception{

      java.lang.String string0 = "\"";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_2_2() throws Exception{

      java.lang.String string0 = "'";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_3_3() throws Exception{

      java.lang.String string0 = "$";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_4_4() throws Exception{

      java.lang.String string0 = ".";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_5_5() throws Exception{

      java.lang.String string0 = "`";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_6_6() throws Exception{

      java.lang.String string0 = "l";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_7_7() throws Exception{

      java.lang.String string0 = "-";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_8_8() throws Exception{

      java.lang.String string0 = "x1, V}+dLkhm0/m\\\",|,;t8S&m";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_9_9() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_10_10() throws Exception{

      java.lang.String string0 = "iQ\\\"(Jk&xZK";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_11_11() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_12_12() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_13_13() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_15_15() throws Exception{

      java.lang.String string0 = "R#w[t_$wX9>`7#'QHB*lV?]+6iU0h";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_16_16() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_17_17() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_18_18() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_19_19() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_20_20() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.xdevapi.ExprUnparser.quoteIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_1_21() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_2_22() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_3_23() throws Exception{

      java.lang.String string0 = "u=@w0/P%VtM^XkHUQM}0/RK8tUI0";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_4_24() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_5_25() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_6_26() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_7_27() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_8_28() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_9_29() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_10_30() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_11_31() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_12_32() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_13_33() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_14_34() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_15_35() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_16_36() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_17_37() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_18_38() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_19_39() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteDocumentPathMember_20_40() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.xdevapi.ExprUnparser.quoteDocumentPathMember(string0);

  }



}