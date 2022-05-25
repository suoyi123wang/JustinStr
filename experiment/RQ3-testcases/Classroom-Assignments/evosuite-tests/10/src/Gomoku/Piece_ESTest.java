/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 08:43:23 GMT 2022
 */

package Gomoku;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Gomoku.Piece;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Piece_ESTest extends Piece_ESTest_scaffolding {

//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      int int0 = Piece.List("n0u");
//      assertEquals(0, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      String string0 = "@\\uo%3a <O";
//      int int0 = Piece.Hang(string0);
//      assertEquals(0, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test02()  throws Throwable  {
//      int int0 = Piece.Hang("U6=g3|&OTP");
//      assertEquals(21, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        Piece.List("W");
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        Piece.List("uWg.A");
//        fail("Expecting exception: NumberFormatException");
//
//      } catch(NumberFormatException e) {
//         //
//         // For input string: \"Wg.\"
//         //
//         verifyException("java.lang.NumberFormatException", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        Piece.List((String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Gomoku.Piece", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        Piece.Hang("");
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        Piece.Hang((String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Gomoku.Piece", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      Piece.Color("");
//      try {
//        Piece.Color("");
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      Piece.Color((String) null);
//      try {
//        Piece.Color((String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Gomoku.Piece", e);
//      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Piece.Color("q_EyB");
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Piece.Color("W");
      assertEquals("W", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Piece.Color("uWg.A");
      assertEquals("A", string0);
  }
//
//  @Test(timeout = 4000)
//  public void test13()  throws Throwable  {
//      int int0 = Piece.List("x-4W");
//      assertEquals((-4), int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test14()  throws Throwable  {
//      int int0 = Piece.Hang("\u0004x");
//      assertEquals((-60), int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test15()  throws Throwable  {
//      Piece piece0 = new Piece();
//  }
}
