/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 08:46:47 GMT 2022
 */

package go;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import go.Player;
import go.Stone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      Stone stone0 = player0.getStone("MO]CH'wOT%'XGG?OYz", 1287);
      assertNull(stone0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      Stone stone0 = player0.getStone("@_1cb>5aq72[CukF,tc", (-1));
      assertEquals(0, stone0.getY());
      assertNotNull(stone0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player("sF)~");
      player0.x = 1568;
      Stone stone0 = player0.getStone("L3n[-;Yi8zgzUc'h", 1);
      assertEquals(12, stone0.getY());
      assertEquals(1568, stone0.getX());
      assertNotNull(stone0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player("go.Stone");
      player0.x = 160;
      player0.x = (-1925);
      Stone stone0 = player0.getStone("Black", (-1));
      assertEquals((-1925), stone0.getX());
      assertNotNull(stone0);
      assertEquals(2, stone0.getY());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      player0.getStone("", 15);
//      try {
//        player0.getStone("", 15);
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      player0.getStone((String) null, 0);
//      try {
//        player0.getStone((String) null, 0);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("go.Player", e);
//      }
  }

//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      Player player0 = null;
//      try {
//        player0 = new Player((String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//      }
//  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player("");
      Stone stone0 = player0.getStone("Oe94>>6ou", (-2640));
      assertNull(stone0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player("");
      Stone stone0 = player0.getStone("!C7d1f*ho05|T{',vvG", (-1447));
      assertNull(stone0);
  }
//
//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      Player player0 = new Player("White");
//  }
//
//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      Player player0 = new Player("Black");
//  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player("");
      Stone stone0 = player0.getStone("i z8GSU", (-21));
      assertNull(stone0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      Stone stone0 = player0.getStone(":", 51);
      assertNull(stone0);
  }
}
