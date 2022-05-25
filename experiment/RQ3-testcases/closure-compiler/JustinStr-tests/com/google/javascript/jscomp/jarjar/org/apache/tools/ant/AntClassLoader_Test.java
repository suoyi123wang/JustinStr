package com.google.javascript.jscomp.jarjar.org.apache.tools.ant;

import org.junit.Test;

public class AntClassLoader_Test {

  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_1_1() throws Exception{

      java.lang.String string1 = ".";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path10 = null;
      java.lang.ClassLoader classLoader7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project9, path10);
      boolean boolean8 = true;
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader7, boolean8);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = null;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, project5, path6);
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_2_2() throws Exception{

      java.lang.String string1 = "n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_3_3() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, project3, path4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_4_4() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_5_5() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_6_6() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_7_7() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_8_8() throws Exception{

      java.lang.String string1 = "I4+1;ogY` kbt3[I|,D36\\+i6=*W[}aE7a";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_9_9() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_10_10() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_11_11() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_12_12() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_13_13() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_14_14() throws Exception{

      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_15_15() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_16_16() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project8);
      boolean boolean7 = false;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project5, path6, boolean7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, project3, path4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_17_17() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.ClassLoader classLoader8 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path10 = null;
      java.lang.ClassLoader classLoader6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader8, project9, path10);
      boolean boolean7 = true;
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader6, boolean7);
      boolean boolean5 = false;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, boolean5);
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_18_18() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = null;
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project6, path7);
      boolean boolean5 = false;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, boolean5);
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_19_19() throws Exception{

      java.lang.String string1 = "gKl+dgS9|]Y5Y_]F;!`BzY\\1Vaz<4\\\"Ji>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addSystemPackageRoot_20_20() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addSystemPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_1_21() throws Exception{

      java.lang.String string1 = ".";
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_2_22() throws Exception{

      java.lang.String string1 = "B";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_3_23() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = null;
      boolean boolean10 = false;
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project8, path9, boolean10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = null;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, project6, path7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project3 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path4 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, project3, path4);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_4_24() throws Exception{

      java.lang.String string1 = "Z^18SS)8rwpoN9GWWvc\\4>}u8$r2[5EW@B";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_5_25() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_6_26() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_7_27() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_8_28() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = null;
      java.lang.String string7 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project6, string7);
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project4, path5);
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_9_29() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project5);
      boolean boolean4 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3, boolean4);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_10_30() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_11_31() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_12_32() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_13_33() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_14_34() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_15_35() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_16_36() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string5 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path3 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project4, string5);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project2, path3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_17_37() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_18_38() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_19_39() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.loader.AntClassLoader2();
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_addLoaderPackageRoot_20_40() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      boolean boolean5 = false;
      java.lang.ClassLoader classLoader2 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, boolean5);
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader2, boolean3);
      antClassLoader0.addLoaderPackageRoot(string1);

  }



  @Test(timeout = 5000)
  public void test_definePackage_1_41() throws Exception,java.io.IOException{

      java.lang.String string4 = " #";
      java.net.URI uRI3 = new java.net.URI(string4);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = ".";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project11 = null;
      java.lang.String string12 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project11, string12);
      boolean boolean10 = true;
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project8, path9, boolean10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, project6, path7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_2_42() throws Exception,java.io.IOException{

      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = "{\"key\":null}";
      java.io.File file1 = new java.io.File(string3, string4);
      java.lang.String string2 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string8 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project7, string8);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project5, path6);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_3_43() throws Exception,java.io.IOException{

      java.lang.String string3 = "{\"key\":null}";
      java.io.File file1 = new java.io.File(string3);
      java.lang.String string2 = "a ";
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      boolean boolean5 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, boolean5);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_4_44() throws Exception,java.io.IOException{

      java.lang.String string4 = ".\\a.txt";
      java.lang.String string5 = "[0,1]";
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.net.URI uRI3 = new java.net.URI(string4, string5, string6);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = "";
      java.lang.ClassLoader classLoader7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project10 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader7, project8, path9);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_5_45() throws Exception,java.io.IOException{

      java.lang.String string4 = "a ";
      java.net.URI uRI3 = new java.net.URI(string4);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path12 = null;
      java.lang.ClassLoader classLoader8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project11, path12);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path10 = null;
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader8, project9, path10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, project6, path7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_6_46() throws Exception,java.io.IOException{

      java.lang.String string6 = " ";
      java.lang.String string7 = "{\"key\":null}";
      java.lang.String string8 = "{\"key\":null}";
      java.net.URI uRI5 = new java.net.URI(string6, string7, string8);
      java.io.File file3 = new java.io.File(uRI5);
      java.lang.String string4 = "{\"key\":null}";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project11 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string12 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path10 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project11, string12);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project9, path10);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_7_47() throws Exception,java.io.IOException{

      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = "<a> </a>";
      java.io.File file1 = new java.io.File(string3, string4);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      java.lang.String string9 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project8, string9);
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project5, path6, boolean7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_8_48() throws Exception,java.io.IOException{

      java.lang.String string4 = "<a>Hello World</a>";
      java.net.URI uRI3 = new java.net.URI(string4);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project10 = null;
      java.lang.String string11 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project10, string11);
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project8, path9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, project6, path7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_9_49() throws Exception,java.io.IOException{

      java.lang.String string3 = "[0,1]";
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.File file1 = new java.io.File(string3, string4);
      java.lang.String string2 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project9);
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project7, path8);
      boolean boolean6 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, boolean6);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_10_50() throws Exception,java.io.IOException{

      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.io.File file1 = new java.io.File(string3);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project7);
      boolean boolean6 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project4, path5, boolean6);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_11_51() throws Exception,java.io.IOException{

      java.lang.String string3 = "v}";
      java.lang.String string4 = "<a> </a>";
      java.io.File file1 = new java.io.File(string3, string4);
      java.lang.String string2 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project8);
      boolean boolean7 = true;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project5, path6, boolean7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_12_52() throws Exception,java.io.IOException{

      java.lang.String string6 = " ";
      java.lang.String string7 = " ";
      java.lang.String string8 = "<a>Hello World</a>";
      java.net.URI uRI5 = new java.net.URI(string6, string7, string8);
      java.io.File file3 = new java.io.File(uRI5);
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_13_53() throws Exception,java.io.IOException{

      java.lang.String string5 = "<a>Hello World</a>";
      java.io.File file3 = new java.io.File(string5);
      java.lang.String string4 = "";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project11 = null;
      java.lang.String string12 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project11, string12);
      boolean boolean10 = false;
      java.lang.ClassLoader classLoader6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project8, path9, boolean10);
      boolean boolean7 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader6, boolean7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_14_54() throws Exception,java.io.IOException{

      java.lang.String string6 = " #";
      java.lang.String string7 = " #";
      java.lang.String string8 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.net.URI uRI5 = new java.net.URI(string6, string7, string8);
      java.io.File file3 = new java.io.File(uRI5);
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_15_55() throws Exception,java.io.IOException{

      java.lang.String string5 = "{\"key\":null}";
      java.io.File file3 = new java.io.File(string5);
      java.lang.String string4 = "<a>Hello World</a>";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_16_56() throws Exception,java.io.IOException{

      java.lang.String string5 = "{\"key\":null}";
      java.io.File file3 = new java.io.File(string5);
      java.lang.String string4 = "C-*JKBMqy`oaSaVjKnLWj";
      java.io.File file1 = new java.io.File(file3, string4);
      java.lang.String string2 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project9);
      boolean boolean8 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project6, path7, boolean8);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_17_57() throws Exception,java.io.IOException{

      java.lang.String string3 = "[c69}";
      java.lang.String string4 = "http://lcs.ios.ac.cn/";
      java.io.File file1 = new java.io.File(string3, string4);
      java.lang.String string2 = " #";
      java.lang.ClassLoader classLoader5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = null;
      java.lang.String string9 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project8, string9);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader5, project6, path7);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_18_58() throws Exception,java.io.IOException{

      java.lang.String string4 = "<a> </a>";
      java.net.URI uRI3 = new java.net.URI(string4);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project5 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project7);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project5, path6);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_19_59() throws Exception,java.io.IOException{

      java.lang.String string3 = "\\n";
      java.io.File file1 = new java.io.File(string3);
      java.lang.String string2 = "[0=Kep~xNt.}!JzK_k~#<h\\\"#|aHe@L-j>X";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project6 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = null;
      java.lang.String string9 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project8, string9);
      java.lang.ClassLoader classLoader4 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(project6, path7);
      boolean boolean5 = false;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader4, boolean5);
      antClassLoader0.definePackage(file1, string2);

  }



  @Test(timeout = 5000)
  public void test_definePackage_20_60() throws Exception,java.io.IOException{

      java.lang.String string4 = "<a> </a>";
      java.lang.String string5 = "<a> </a>";
      java.lang.String string6 = "";
      java.net.URI uRI3 = new java.net.URI(string4, string5, string6);
      java.io.File file1 = new java.io.File(uRI3);
      java.lang.String string2 = "\\n";
      java.lang.ClassLoader classLoader7 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project8 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project();
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project project10 = null;
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path path9 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path(project10);
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader antClassLoader0 = new com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader(classLoader7, project8, path9);
      antClassLoader0.definePackage(file1, string2);

  }



}