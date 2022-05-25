package renju;

import org.junit.Test;

public class Game_Test {

  @Test(timeout = 5000)
  public void test_LoadFromFile_1_1() throws Exception{

      String string0 = ":";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_2_2() throws Exception{

      String string0 = ",";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_3_3() throws Exception{

      String string0 = "\\n";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_4_4() throws Exception{

      String string0 = ".\\a.txt";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_5_5() throws Exception{

      String string0 = "I{lw{=v*!9v r\\96qTs`(I#f1l9";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_6_6() throws Exception{

      String string0 = "<a>Hello World</a>";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_7_7() throws Exception{

      String string0 = "$w~\\[Ks\\\"0'F=N+]_4;50FevLM3!b`bEx/+!";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_8_8() throws Exception{

      String string0 = " ";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_9_9() throws Exception{

      String string0 = "\\n";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_10_10() throws Exception{

      String string0 = " ";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_11_11() throws Exception{

      String string0 = "<a> </a>";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_12_12() throws Exception{

      String string0 = ")2Q3aW3WH&4T";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_13_13() throws Exception{

      String string0 = " ";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_14_14() throws Exception{

      String string0 = " #";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_15_15() throws Exception{

      String string0 = " #";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_16_16() throws Exception{

      String string0 = ":emEN!";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_17_17() throws Exception{

      String string0 = "{\"key\":null}";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_18_18() throws Exception{

      String string0 = " #";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_19_19() throws Exception{

      String string0 = "a ";
      Game.LoadFromFile(string0);

  }



  @Test(timeout = 5000)
  public void test_LoadFromFile_20_20() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      Game.LoadFromFile(string0);

  }



}