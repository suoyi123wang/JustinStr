package homework;

import org.junit.Test;

public class GameRecordManager_Test {

  @Test(timeout = 5000)
  public void test_parseScanner_1_1() throws Exception{

      String string1 = "S";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_2_2() throws Exception{

      String string1 = "add";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_3_3() throws Exception{

      String string1 = "a ";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_4_4() throws Exception{

      String string1 = "\\n";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_5_5() throws Exception{

      String string1 = "a ";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_6_6() throws Exception{

      String string1 = "<a>Hello World</a>";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_7_7() throws Exception{

      String string1 = "";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_8_8() throws Exception{

      String string1 = "{\"key\":null}";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_9_9() throws Exception{

      String string1 = "{\"key\":2 }";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_10_10() throws Exception{

      String string1 = "a ";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_11_11() throws Exception{

      String string1 = "[0,1]";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_12_12() throws Exception{

      String string1 = " #";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_13_13() throws Exception{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_14_14() throws Exception{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_15_15() throws Exception{

      String string1 = "";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_16_16() throws Exception{

      String string1 = "[0,1]";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_17_17() throws Exception{

      String string1 = "a ";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_18_18() throws Exception{

      String string1 = "<a>Hello World</a>";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_19_19() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



  @Test(timeout = 5000)
  public void test_parseScanner_20_20() throws Exception{

      String string1 = "\\n";
      GameRecordManager gameRecordManager0 = new GameRecordManager();
      gameRecordManager0.parseScanner(string1);

  }



}