/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:11:14 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_21_ESTest extends Solution_21_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      // Undeclared exception!
      solution_21_0.findAnagrams("gy: F9.1", "");
//      try {
//        solution_21_0.findAnagrams("gy: F9.1", "");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -39
//         //
//         verifyException("Solution_21", e);
//      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      // Undeclared exception!
      solution_21_0.findAnagrams("wa2,{#>eKCK6L", "h/Ua^8x)x");
//      try {
//        solution_21_0.findAnagrams("wa2,{#>eKCK6L", "h/Ua^8x)x");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -50
//         //
//         verifyException("Solution_21", e);
//      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      // Undeclared exception!
      solution_21_0.findAnagrams("kQy9", "kQy9");
//      try {
//        solution_21_0.findAnagrams("kQy9", "kQy9");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -16
//         //
//         verifyException("Solution_21", e);
//      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      List<Integer> list0 = solution_21_0.findAnagrams("", "");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      // Undeclared exception!
      solution_21_0.findAnagrams((String) null, (String) null);
//      try {
//        solution_21_0.findAnagrams((String) null, (String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_21", e);
//      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      // Undeclared exception!
      solution_21_0.findAnagrams("sxSakAmq", "v");
//      try {
//        solution_21_0.findAnagrams("sxSakAmq", "v");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -14
//         //
//         verifyException("Solution_21", e);
//      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_21 solution_21_0 = new Solution_21();
      List<Integer> list0 = solution_21_0.findAnagrams("z", "(@(Xu");
      assertEquals(0, list0.size());
  }
}
