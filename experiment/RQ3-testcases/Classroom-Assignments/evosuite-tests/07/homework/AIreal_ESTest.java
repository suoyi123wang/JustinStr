/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 08:37:39 GMT 2022
 */

package homework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import homework.AIreal;
import homework.Chesswithoutcolor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AIreal_ESTest extends AIreal_ESTest_scaffolding {

//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = new int[6][7];
//      int[] intArray1 = new int[7];
//      intArray1[5] = 3035;
//      intArray0[0] = intArray1;
//      intArray0[4] = intArray0[0];
//      aIreal0.weightboard = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      aIreal0.weightboard = null;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test02()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4((int[][]) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3((int[][]) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2((int[][]) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge1((int[][]) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      int[] intArray0 = new int[24];
//      intArray0[15] = 1;
//      intArray0[14] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[9][3];
//      intArray1[3] = intArray0;
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      intArray1[7] = intArray0;
//      intArray1[8] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[7][1];
//      int[] intArray2 = new int[9];
//      intArray2[4] = 1;
//      intArray2[5] = 1;
//      intArray2[6] = 1;
//      intArray1[4] = intArray2;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test08()  throws Throwable  {
//      int[] intArray0 = new int[20];
//      intArray0[4] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[8][6];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 6
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      int[] intArray0 = new int[7];
//      intArray0[4] = 1;
//      intArray0[5] = 1;
//      intArray0[6] = 1;
//      int[][] intArray1 = new int[9][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      int[] intArray0 = new int[26];
//      intArray0[4] = 1;
//      intArray0[5] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[20][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge4(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 5
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test11()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = aIreal0.weightboard;
//      aIreal0.AIjudge4(intArray0);
//      assertEquals(23, intArray0.length);
//  }
//
//  @Test(timeout = 4000)
//  public void test12()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[7][1];
//      int[] intArray2 = new int[9];
//      intArray2[4] = 1;
//      intArray2[5] = 1;
//      intArray2[6] = 1;
//      intArray2[7] = 2205;
//      intArray1[4] = intArray2;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test13()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[7][1];
//      int[] intArray2 = new int[9];
//      intArray2[3] = 1;
//      intArray2[4] = 1;
//      intArray2[5] = 1;
//      intArray2[6] = 1;
//      intArray1[4] = intArray2;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test14()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      intArray0[15] = 1;
//      intArray0[14] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[8][2];
//      intArray1[3] = intArray0;
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      intArray1[7] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 8
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test15()  throws Throwable  {
//      int[] intArray0 = new int[6];
//      intArray0[4] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[9][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 6
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test16()  throws Throwable  {
//      int[] intArray0 = new int[7];
//      intArray0[4] = 1;
//      intArray0[5] = 1;
//      intArray0[6] = 1;
//      int[][] intArray1 = new int[9][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test17()  throws Throwable  {
//      int[] intArray0 = new int[6];
//      intArray0[4] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[9][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge3(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 6
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test18()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = aIreal0.weightboard;
//      aIreal0.AIjudge3(intArray0);
//      assertEquals(23, intArray0.length);
//  }
//
//  @Test(timeout = 4000)
//  public void test19()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      int[][] intArray1 = new int[8][1];
//      int[] intArray2 = new int[9];
//      intArray2[5] = 1;
//      intArray2[6] = 1;
//      intArray2[8] = 1;
//      intArray1[4] = intArray2;
//      intArray1[5] = intArray0;
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test20()  throws Throwable  {
//      int[] intArray0 = new int[27];
//      intArray0[15] = 1;
//      intArray0[14] = 1;
//      int[][] intArray1 = new int[21][4];
//      intArray1[3] = intArray0;
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      intArray1[7] = intArray0;
//      intArray1[8] = intArray0;
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 12
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test21()  throws Throwable  {
//      int[] intArray0 = new int[20];
//      intArray0[4] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[7][5];
//      intArray1[3] = intArray0;
//      intArray1[6] = intArray0;
//      aIreal0.weightboard = intArray1;
//      int[][] intArray2 = new int[8][6];
//      intArray2[4] = intArray0;
//      intArray2[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2(intArray2);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 6
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test22()  throws Throwable  {
//      int[] intArray0 = new int[7];
//      intArray0[4] = 1;
//      int[][] intArray1 = new int[7][5];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      AIreal aIreal0 = new AIreal();
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test23()  throws Throwable  {
//      int[] intArray0 = new int[23];
//      intArray0[15] = 1;
//      intArray0[14] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[17][2];
//      intArray1[3] = intArray0;
//      aIreal0.weightboard = intArray1;
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      intArray1[6] = intArray0;
//      intArray1[7] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge2(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 12
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test24()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = aIreal0.weightboard;
//      aIreal0.AIjudge2(intArray0);
//      assertEquals(23, intArray0.length);
//  }
//
//  @Test(timeout = 4000)
//  public void test25()  throws Throwable  {
//      int[] intArray0 = new int[22];
//      intArray0[15] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[8][2];
//      intArray1[3] = intArray0;
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      aIreal0.weightboard = intArray1;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge1(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 15
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test26()  throws Throwable  {
//      int[] intArray0 = new int[22];
//      intArray0[15] = 1;
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray1 = new int[8][2];
//      intArray1[4] = intArray0;
//      intArray1[5] = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.AIjudge1(intArray1);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 4
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test27()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = aIreal0.weightboard;
//      aIreal0.AIjudge1(intArray0);
//      assertEquals(23, intArray0.length);
//  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AIreal aIreal0 = new AIreal();
      String[][] stringArray0 = new String[2][6];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "u";
      stringArray1[1] = ")y6t}Ly^Q6f";
      stringArray1[2] = "o ";
      stringArray0[0] = stringArray1;
      // Undeclared exception!
      aIreal0.judgeboardcreator(stringArray0, "<!?jXF");
//      try {
//        aIreal0.judgeboardcreator(stringArray0, "<!?jXF");
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AIreal aIreal0 = new AIreal();
      String[][] stringArray0 = new String[1][0];
      String[] stringArray1 = new String[1];
      stringArray1[0] = "\u25CF ";
      stringArray0[0] = stringArray1;
      // Undeclared exception!
      aIreal0.judgeboardcreator(stringArray0, "\u25CF ");
//      try {
//        aIreal0.judgeboardcreator(stringArray0, "\u25CF ");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 1
//         //
//         verifyException("homework.AIreal", e);
//      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AIreal aIreal0 = new AIreal();
      String[][] stringArray0 = new String[1][9];
      String[] stringArray1 = new String[7];
      stringArray1[0] = "o ";
      stringArray0[0] = stringArray1;
      // Undeclared exception!
      aIreal0.judgeboardcreator(stringArray0, "B");
//      try {
//        aIreal0.judgeboardcreator(stringArray0, "B");
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AIreal aIreal0 = new AIreal();
      String[][] stringArray0 = new String[5][5];
      String[] stringArray1 = new String[3];
      stringArray1[0] = "oG ";
      stringArray1[1] = "\u25CF ";
      stringArray0[0] = stringArray1;
      // Undeclared exception!
      aIreal0.judgeboardcreator(stringArray0, "B");
//      try {
//        aIreal0.judgeboardcreator(stringArray0, "B");
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//      }
  }
//
//  @Test(timeout = 4000)
//  public void test32()  throws Throwable  {
//      int[][] intArray0 = new int[25][1];
//      int[] intArray1 = new int[20];
//      intArray1[7] = 1;
//      intArray0[4] = intArray1;
//      AIreal aIreal0 = new AIreal();
//      aIreal0.weightboard = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 4
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test33()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = new int[5][6];
//      int[] intArray1 = new int[7];
//      intArray1[6] = 10;
//      intArray0[4] = intArray1;
//      aIreal0.weightboard = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test34()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[][] intArray0 = new int[9][3];
//      int[] intArray1 = new int[9];
//      intArray1[5] = 100;
//      intArray0[4] = intArray1;
//      aIreal0.weightboard = intArray0;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 9
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test35()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      int[] intArray0 = new int[7];
//      int[][] intArray1 = new int[7][6];
//      intArray1[4] = intArray0;
//      aIreal0.weightboard = intArray1;
//      intArray0[4] = 1000;
//      // Undeclared exception!
//      try {
//        aIreal0.Playerinput();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 7
//         //
//         verifyException("homework.AIreal", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test36()  throws Throwable  {
//      AIreal aIreal0 = new AIreal();
//      Chesswithoutcolor chesswithoutcolor0 = aIreal0.Playerinput();
//      assertNull(chesswithoutcolor0);
//  }
}