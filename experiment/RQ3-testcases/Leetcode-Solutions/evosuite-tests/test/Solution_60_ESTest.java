/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:55:57 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_60_ESTest extends Solution_60_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_60 solution_60_0 = new Solution_60();
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 435;
      int int0 = solution_60_0.minCost("dd", intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_60 solution_60_0 = new Solution_60();
      int[] intArray0 = new int[8];
      intArray0[0] = (-560);
      int int0 = solution_60_0.minCost("zz$(@O", intArray0);
      assertEquals((-560), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_60 solution_60_0 = new Solution_60();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        solution_60_0.minCost((String) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_60", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_60 solution_60_0 = new Solution_60();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        solution_60_0.minCost("%Y]X4h", intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("Solution_60", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[5];
      Solution_60 solution_60_0 = new Solution_60();
      int int0 = solution_60_0.minCost("dd", intArray0);
      assertEquals(0, int0);
  }
}