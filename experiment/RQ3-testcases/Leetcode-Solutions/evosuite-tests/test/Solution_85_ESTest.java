/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:42:16 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_85_ESTest extends Solution_85_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_85 solution_85_0 = new Solution_85();
      // Undeclared exception!
      try { 
        solution_85_0.numSteps((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_85", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_85 solution_85_0 = new Solution_85();
      int int0 = solution_85_0.numSteps("*~#_Lg!0ppTt");
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_85 solution_85_0 = new Solution_85();
      int int0 = solution_85_0.numSteps("jg _-*Z{Tl$%)0");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_85 solution_85_0 = new Solution_85();
      int int0 = solution_85_0.numSteps("j");
      assertEquals(0, int0);
  }
}
