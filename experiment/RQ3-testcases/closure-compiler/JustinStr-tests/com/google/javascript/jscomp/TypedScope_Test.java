package com.google.javascript.jscomp;

import org.junit.Test;

public class TypedScope_Test {

  @Test(timeout = 5000)
  public void test_declare_1_1() throws Exception{

      java.lang.String string1 = "%";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9, node10);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_2_2() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_3_3() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile7 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile7);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_4_4() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8, node9, node10);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile11 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile11);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_5_5() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node9 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8, node9);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile10 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_6_6() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_7_7() throws Exception{

      java.lang.String string1 = "\\n";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile7 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile7);
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_8_8() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node9 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8, node9);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile16 = null;
      com.google.javascript.jscomp.SourceAst sourceAst14 = new com.google.javascript.jscomp.JsAst(sourceFile16);
      boolean boolean15 = true;
      com.google.javascript.jscomp.SourceAst sourceAst12 = new com.google.javascript.jscomp.RecoverableJsAst(sourceAst14, boolean15);
      boolean boolean13 = true;
      com.google.javascript.jscomp.SourceAst sourceAst10 = new com.google.javascript.jscomp.RecoverableJsAst(sourceAst12, boolean13);
      boolean boolean11 = true;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceAst10, boolean11);
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_9_9() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile7 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile7);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_10_10() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9, node10);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile11 = null;
      boolean boolean12 = false;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile11, boolean12);
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_11_11() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_12_12() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile9 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile9);
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_13_13() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9, node10);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile11 = null;
      boolean boolean12 = true;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile11, boolean12);
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_14_14() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_15_15() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_16_16() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile9 = null;
      boolean boolean10 = false;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile9, boolean10);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_17_17() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_18_18() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9, node10);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile11 = null;
      boolean boolean12 = false;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile11, boolean12);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_19_19() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token8 = null;
      com.google.javascript.rhino.Node node9 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token8, node9);
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput();
      boolean boolean5 = false;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_declare_20_20() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.rhino.Token token6 = null;
      com.google.javascript.rhino.Token token9 = null;
      com.google.javascript.rhino.Node node10 = null;
      com.google.javascript.rhino.Node node11 = null;
      com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(token9, node10, node11);
      com.google.javascript.rhino.Node node8 = null;
      com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(token6, node7, node8);
      com.google.javascript.rhino.jstype.JSType jSType3 = null;
      com.google.javascript.jscomp.SourceFile sourceFile12 = null;
      boolean boolean13 = false;
      com.google.javascript.jscomp.CompilerInput compilerInput4 = new com.google.javascript.jscomp.CompilerInput(sourceFile12, boolean13);
      boolean boolean5 = true;
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.declare(string1, node2, jSType3, compilerInput4, boolean5);

  }



  @Test(timeout = 5000)
  public void test_getVar_1_21() throws Exception{

      java.lang.String string1 = "_.";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_2_22() throws Exception{

      java.lang.String string1 = ".";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_3_23() throws Exception{

      java.lang.String string1 = "fuUd*)VCrQoqMGNJyO}";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_4_24() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_5_25() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_6_26() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_7_27() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_8_28() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_9_29() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_10_30() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_11_31() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_12_32() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_13_33() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_14_34() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_15_35() throws Exception{

      java.lang.String string1 = "[0,1]";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_16_36() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_17_37() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_18_38() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_19_39() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



  @Test(timeout = 5000)
  public void test_getVar_20_40() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.TypedScope typedScope0 = null;
      typedScope0.getVar(string1);

  }



}