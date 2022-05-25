/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:32:56 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_106_ESTest extends Solution_106_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_106 solution_106_0 = new Solution_106();
      int[] intArray0 = solution_106_0.maxDepthAfterSplit("79bBhe>cL$7WEQ8&RHL");
      assertEquals(19, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_106 solution_106_0 = new Solution_106();
      // Undeclared exception!
      try { 
        solution_106_0.maxDepthAfterSplit((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_106", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_106 solution_106_0 = new Solution_106();
      int[] intArray0 = solution_106_0.maxDepthAfterSplit("5a4((c");
      assertArrayEquals(new int[] {0, (-1), 0, 0, (-1), (-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_106 solution_106_0 = new Solution_106();
      int[] intArray0 = solution_106_0.maxDepthAfterSplit("");
      assertArrayEquals(new int[] {}, intArray0);
  }
}
