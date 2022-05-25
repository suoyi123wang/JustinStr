package Chess;

import org.junit.Test;

public class Input_Test {

  @Test(timeout = 5000)
  public void test_input_1_1() throws Exception{

      String string1 = "\u001A";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_2_2() throws Exception{

      String string1 = "i\u001A";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_3_3() throws Exception{

      String string1 = "*\u0000";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_4_4() throws Exception{

      String string1 = "\u0000";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_5_5() throws Exception{

      String string1 = "";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_6_6() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_7_7() throws Exception{

      String string1 = "";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_8_8() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_9_9() throws Exception{

      String string1 = "<a>Hello World</a>";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_10_10() throws Exception{

      String string1 = "sc.\\fc.vX_H(iY`'ZF?K?Lel2_";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_11_11() throws Exception{

      String string1 = "{\"key\":null}";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_12_12() throws Exception{

      String string1 = "4yd=I8z:'PC'm.xvU`}O!_#ipzZ^M2 t6z\\};~";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_13_13() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_14_14() throws Exception{

      String string1 = "";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_15_15() throws Exception{

      String string1 = ".\\a.txt";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_16_16() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_17_17() throws Exception{

      String string1 = ".\\a.txt";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_18_18() throws Exception{

      String string1 = "{\"key\":2 }";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_19_19() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      Input input0 = new Input();
      input0.input(string1);

  }



  @Test(timeout = 5000)
  public void test_input_20_20() throws Exception{

      String string1 = ".\\a.txt";
      Input input0 = new Input();
      input0.input(string1);

  }



}