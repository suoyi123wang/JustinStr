package gobang;

import org.junit.Test;

public class Input_Test {

  @Test(timeout = 5000)
  public void test_input_1_1() throws Exception{

      java.lang.String string1 = "\u001A";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_2_2() throws Exception{

      java.lang.String string1 = "u\u001A";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_3_3() throws Exception{

      java.lang.String string1 = "{\u0000";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_4_4() throws Exception{

      java.lang.String string1 = "\u0000";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_5_5() throws Exception{

      java.lang.String string1 = "";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_6_6() throws Exception{

      java.lang.String string1 = " ";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_7_7() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_8_8() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_9_9() throws Exception{

      java.lang.String string1 = " ";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_10_10() throws Exception{

      java.lang.String string1 = "\\n";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_11_11() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_12_12() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_13_13() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_14_14() throws Exception{

      java.lang.String string1 = "<a> </a>";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_15_15() throws Exception{

      java.lang.String string1 = "M9LY3<}K5iSM{I;16zwb%q7g)gTG]qZIhbL[hjk.gfknluT";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_16_16() throws Exception{

      java.lang.String string1 = " ";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_17_17() throws Exception{

      java.lang.String string1 = " ";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_18_18() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_19_19() throws Exception{

      java.lang.String string1 = " ";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_20_20() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      gobang.Input input0 = new gobang.Input();
      input0.input(string1);

  }



}