/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:27:52 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_87_ESTest extends Solution_87_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(12, "noyn@-", "noyn@-", "jiG`");

//      try {
//        solution_87_0.findGoodStrings(12, "noyn@-", "noyn@-", "jiG`");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -33
//         //
//         verifyException("Solution_87", e);
//      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(1, "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "tBq,");

//      try {
//        solution_87_0.findGoodStrings(1, "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "tBq,");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 1
//         //
//         verifyException("Solution_87", e);
//      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      solution_87_0.findGoodStrings(2089, "", (String) null, "");
      // Undeclared exception!
      try { 
        solution_87_0.dfs(17, 4725, (-4419));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4725
         //
         verifyException("Solution_87", e);
      }
  }
//
//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      Solution_87 solution_87_0 = new Solution_87();
//      // Undeclared exception!
//      try {
//        solution_87_0.getTrans(0, '$');
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_87", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      solution_87_0.findGoodStrings(215, "", "", "");
      // Undeclared exception!
      try { 
        solution_87_0.getTrans(215, '+');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 215
         //
         verifyException("Solution_87", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(2328, "5dUbSz", "5dUbSz", "5dUbSz");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(108, "eXuo.BV9S<", "", "eXuo.BV9S<");
//
//      try {
//        solution_87_0.findGoodStrings(108, "eXuo.BV9S<", "", "eXuo.BV9S<");
//        fail("Expecting exception: StringIndexOutOfBoundsException");
//
//      } catch(StringIndexOutOfBoundsException e) {
//      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(535, (String) null, (String) null, (String) null);

//      try {
//        solution_87_0.findGoodStrings(535, (String) null, (String) null, (String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_87", e);
//      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      solution_87_0.findGoodStrings(1106, "vq,", "9", "vq,");
      int[] intArray0 = new int[9];
      intArray0[0] = 1106;
      solution_87_0.fail = intArray0;
      // Undeclared exception!
      try { 
        solution_87_0.dfs(0, 0, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      Solution_87 solution_87_0 = new Solution_87();
//      // Undeclared exception!
//      try {
//        solution_87_0.dfs(106, 106, 106);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_87", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(504, "", "", "7Gox(lsi-CY!#N7u#f");
      assertEquals(1, int0);
      
      int int1 = solution_87_0.getTrans(1, 'g');
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(504, "", "", "7Gox(lsi-CY!#N7u#f");
      assertEquals(1, int0);
      
      solution_87_0.getTrans(0, 'q');
      int int1 = solution_87_0.getTrans(0, 'q');
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(1106, "vq,", "9", "vq,");
      assertEquals(0, int0);
      
      int int1 = solution_87_0.getTrans(1, 'q');
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(1106, "v5Sq,", "9", "v5Sq,");
      assertEquals(0, int0);
      
      int[][][] intArray0 = new int[4][1][4];
      solution_87_0.f = intArray0;
      int int1 = solution_87_0.dfs(0, 0, 0);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(3742, "", "-", "");
      int int1 = solution_87_0.dfs(0, 122, 2089);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      int int0 = solution_87_0.findGoodStrings(58, "", "", "");
      assertEquals(0, int0);
      
      int int1 = solution_87_0.dfs(0, 0, 0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(12, "jiG`", "lQ", "jiG`");

//      try {
//        solution_87_0.findGoodStrings(12, "jiG`", "lQ", "jiG`");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -26
//         //
//         verifyException("Solution_87", e);
//      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      solution_87_0.findGoodStrings(1106, "vq,", "9", "vq,");
      int int0 = solution_87_0.dfs(0, 0, 0);
      assertEquals(17576, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings(1, "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5");

//      try {
//        solution_87_0.findGoodStrings(1, "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 1
//         //
//         verifyException("Solution_87", e);
//      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Solution_87 solution_87_0 = new Solution_87();
      // Undeclared exception!
      solution_87_0.findGoodStrings((-1), "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5");

//      try {
//        solution_87_0.findGoodStrings((-1), "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5", "a?{PDB8NvzZVa%%;5");
//        fail("Expecting exception: NegativeArraySizeException");
//
//      } catch(NegativeArraySizeException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_87", e);
//      }
  }
}
