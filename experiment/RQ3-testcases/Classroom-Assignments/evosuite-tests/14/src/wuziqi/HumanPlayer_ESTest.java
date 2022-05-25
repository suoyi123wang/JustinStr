/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 08:48:37 GMT 2022
 */

package wuziqi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wuziqi.HumanPlayer;
import wuziqi.Stone;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HumanPlayer_ESTest extends HumanPlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer(2, 2);
      Stone stone0 = humanPlayer0.parseStone("A290");
      assertEquals(90, stone0.getX());
      assertNotNull(stone0);
      assertEquals(1, stone0.getY());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer(2644, 2644);
      // Undeclared exception!
      humanPlayer0.parseStone("n");
//      try {
//        humanPlayer0.parseStone("n");
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer((-4475), (-4475));
      // Undeclared exception!
      humanPlayer0.parseStone("^Po@Mig");
//      try {
//        humanPlayer0.parseStone("^Po@Mig");
//        fail("Expecting exception: NumberFormatException");
//
//      } catch(NumberFormatException e) {
//         //
//         // For input string: \"o@Mig\"
//         //
//         verifyException("java.lang.NumberFormatException", e);
//      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer(26, 26);
      // Undeclared exception!
      humanPlayer0.parseStone((String) null);
//      try {
//        humanPlayer0.parseStone((String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer(2644, 2644);
      Stone stone0 = humanPlayer0.parseStone("290");
      assertNull(stone0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HumanPlayer humanPlayer0 = new HumanPlayer(2644, 2644);
      Stone stone0 = humanPlayer0.parseStone("");
      assertNull(stone0);
  }
}