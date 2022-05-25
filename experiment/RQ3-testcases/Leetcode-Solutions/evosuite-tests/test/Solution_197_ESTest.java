/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:08:02 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_197_ESTest extends Solution_197_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_197 solution_197_0 = new Solution_197();
      // Undeclared exception!
      try { 
        solution_197_0.longestPalindromeSubseq((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_197", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_197 solution_197_0 = new Solution_197();
      // Undeclared exception!
      try { 
        solution_197_0.longestPalindromeSubseq("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("Solution_197", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_197 solution_197_0 = new Solution_197();
      int int0 = solution_197_0.longestPalindromeSubseq("+|F2{AG!_#>)Z>");
      assertEquals(3, int0);
  }
}
